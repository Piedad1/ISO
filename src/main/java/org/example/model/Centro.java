package org.example.model;

public class Centro {

    private String nombre;

    private String localizacion;

    private String attribute;

    public Centro() {
    }

    public Centro(String nombre, String localizacion, String attribute) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.attribute = attribute;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
