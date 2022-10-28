package com.practica01.services;

import com.practica01.dao.EstadoDao;
import com.practica01.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceImpl implements EstadoService {

    @Autowired
    private EstadoDao estadoDao;

    //metodos para hacer un CRUD
    //CREATE READ UPDATE DELETE
    @Override
    @Transactional(readOnly = true)
    public List<Estado> getEstado() {
        return (List<Estado>) estadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)//mientras tenga el readonly no modifica en la BD
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estado estado) { //insertar o actualizar
        estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void delete(Estado estado) {
        estadoDao.delete(estado);
    }

}
