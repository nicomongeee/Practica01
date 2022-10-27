package com.practica01.services;

import com.practica01.domain.Estado;
import java.util.List;

public interface EstadoService {
    
    public List<Estado> getEstado();
    
    public Estado getEstado(Estado estado);
    
    public void save(Estado estado);
    
    public void delete(Estado estado);
}
