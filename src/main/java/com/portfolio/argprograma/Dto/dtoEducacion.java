/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.argprograma.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {

    @NotBlank
    private String imgEdu;
    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String descripcionEdu;
    @NotBlank
    private String yearsEdu;

    public dtoEducacion() {
    }

    public dtoEducacion(String imgEdu, String nombreEdu, String descripcionEdu, String yearsEdu) {
        this.imgEdu = imgEdu;
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
        this.yearsEdu = yearsEdu;
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
