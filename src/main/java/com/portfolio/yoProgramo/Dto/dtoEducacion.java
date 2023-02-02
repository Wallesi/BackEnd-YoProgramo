
package com.portfolio.yoProgramo.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String institucionE;
    @NotBlank
    private String tituloE;
    @NotBlank
    private String inicioE;
    @NotBlank
    private String finalE;
    
    
    //constructor

    public dtoEducacion() {
    }

    public dtoEducacion(String institucionE, String tituloE, String inicioE, String finalE) {
        this.institucionE = institucionE;
        this.tituloE = tituloE;
        this.inicioE = inicioE;
        this.finalE = finalE;
    }
    //Getters and setters 

    public String getInstitucionE() {
        return institucionE;
    }

    public void setInstitucionE(String institucionE) {
        this.institucionE = institucionE;
    }

    public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }

    public String getInicioE() {
        return inicioE;
    }

    public void setInicioE(String inicioE) {
        this.inicioE = inicioE;
    }

    public String getFinalE() {
        return finalE;
    }

    public void setFinalE(String finalE) {
        this.finalE = finalE;
    }

    
    
}
