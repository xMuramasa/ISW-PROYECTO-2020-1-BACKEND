package com.proyecto.demo.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="medico")
@Entity
public class medico{
    @Id
    @GenericGenerator(name="incrementmedico", strategy="increment")
    @GeneratedValue(generator="incrementmedico")
    @Column(name="medicoId")
    int medicoId;
    
    @Column(name="nombres")
    String nombres;

    @Column(name="apellidos")
    String apellidos;

    @Column(name="rut")
    String rut;

    @Column(name="numero")
    String numero;

    @Column(name="cargo")
    String cargo;
    
    @Column(name="correo")
    String correo;

    @Column(name="Ocupado")
    Boolean ocupado;

    public medico(){

    }

    public int getId() {
        return this.medicoId;
    }

    public void setId(int id) {
        this.medicoId = id;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public boolean getOcupado(){
        return this.ocupado;
    }
    public void setOcupado(Boolean ocupado){
        this.ocupado = ocupado;
    }
}