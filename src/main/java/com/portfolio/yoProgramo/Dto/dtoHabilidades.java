package com.portfolio.yoProgramo.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHabilidades {
    
    @NotBlank
    private String img;
    @NotBlank
    private String name;
    @NotBlank
    private String progreso;

    public dtoHabilidades() {
    }

    public dtoHabilidades(String img, String name, String progreso) {
        this.img = img;
        this.name = name;
        this.progreso = progreso;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgreso() {
        return progreso;
    }

    public void setProgreso(String progreso) {
        this.progreso = progreso;
    }

    
  
    
    

}
