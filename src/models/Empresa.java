package models;

public class Empresa {
    private String nit;
    private String nombre;
    private String dirección;
    private String ciudad;
    public Empresa(String nit, String nombre, String dirección, String ciudad) {
        this.nit = nit;
        this.nombre = nombre;
        this.dirección = dirección;
        this.ciudad = ciudad;
    }


    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String toString() {
        return "Empresa [nit=" + getNit() + ", nombre=" + getNombre() + ", dirección=" + getDirección() + ", ciudad=" + getCiudad() + "]";
    }


}
