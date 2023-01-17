/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.argprograma.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String imgEdu;
    private String nombreEdu;
    private String descripcionEdu;
    private String yearsEdu;

    public Educacion() {
    }

    public Educacion(String imgEdu, String nombreEdu, String descripcionEdu, String yearsEdu) {
        this.imgEdu = imgEdu;
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.yearsEdu = yearsEdu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getDescripcionEdu() {
        return descripcionEdu;
    }

    public void setDescripcionEdu(String descripcionEdu) {
        this.descripcionEdu = descripcionEdu;
    }

    public String getYearsEdu() {
        return yearsEdu;
    }

    public void setYearsEdu(String yearsEdu) {
        this.yearsEdu = yearsEdu;
    }

    
    
    
}