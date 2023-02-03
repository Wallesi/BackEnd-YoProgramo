
package com.portfolio.yoProgramo.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencialab {
    
    @NotBlank
    private String puesto;
    @NotBlank
    private String empresa;
    @NotBlank
    private String comienzo;
    @NotBlank
    private String finalizo;
    @NotBlank
    private String tareas;

    public dtoExperiencialab() {
    }

    public dtoExperiencialab(String puesto, String empresa, String comienzo, String finalizo, String tareas) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.comienzo = comienzo;
        this.finalizo = finalizo;
        this.tareas = tareas;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getComienzo() {
        return comienzo;
    }

    public void setComienzo(String comienzo) {
        this.comienzo = comienzo;
    }

    public String getFinalizo() {
        return finalizo;
    }

    public void setFinalizo(String finalizo) {
        this.finalizo = finalizo;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }
    
    
}
