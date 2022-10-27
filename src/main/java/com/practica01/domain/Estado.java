package com.practica01.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    
    private String nombreEstado;
    private String capital;
    private int poblacion;
    private int cantidadCostas;

    public Estado(Long idEstado, String nombreEstado, String capital, int poblacion, int cantidadCostas) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.cantidadCostas = cantidadCostas;
    }
    
    public Estado(){
        
    }
}
