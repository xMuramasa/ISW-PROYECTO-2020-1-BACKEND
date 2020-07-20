package com.proyecto.demo.api.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "recuperacion")
@Entity
public class recuperacion {
    @Id
    @GenericGenerator(name = "incrementrelpab", strategy = "increment")
    @GeneratedValue(generator = "incrementrelpab")
    @Column(name = "id")
    long id;

    @Column(name = "id_recuperacion")
    long id_recuperacion;

    @OneToMany(mappedBy = "id_medico")
    private Set<medico> medico;

    public recuperacion() {

    }

    public recuperacion(long id, long id_recuperacion, Set<medico> medico) {
        this.id = id;
        this.id_recuperacion = id_recuperacion;
        this.medico = medico;

    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdrecuperacion() {
        return this.id_recuperacion;
    }

    public void setIdrecuperacion(long id_recuperacion) {
        this.id_recuperacion = id_recuperacion;
    }

    public Set<medico> getMedico() {
        return this.medico;
    }

    public void setMedico(Set<medico> medico) {
        this.medico = medico;
    }

}