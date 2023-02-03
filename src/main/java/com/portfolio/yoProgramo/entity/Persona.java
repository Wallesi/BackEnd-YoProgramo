
package com.portfolio.yoProgramo.entity;


import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String titulo;
    
    @Lob
    @NotNull
    @Size(min = 1, max = 5000, message = "no cumple con la longitud")
    private String sobreMi;
    
    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String banner;
    
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String cv;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String email;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String ubicacion;
    
  


    public Persona() {
    }

    public Persona(String nombre, String apellido, String titulo, String sobreMi,String cv, String banner, String img, String email, String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.sobreMi = sobreMi;
        this.banner = banner;
        this.cv = cv;
        this.img = img;
        this.email = email;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
    
}
    

