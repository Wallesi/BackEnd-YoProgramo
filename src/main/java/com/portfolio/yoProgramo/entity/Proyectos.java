
package com.portfolio.yoProgramo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String img;
    @NotNull
    private String titulo;
    @NotNull
    private String descripcion;
    @NotNull
    private String web;
    @NotNull
    private String git;

    public Proyectos() {
    }

    public Proyectos(String img, String titulo, String descripcion, String web, String git) {
        this.img = img;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.web = web;
        this.git = git;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }

   
    
    
    
}
