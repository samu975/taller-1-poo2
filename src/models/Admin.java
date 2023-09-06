package models;

public class Admin extends Empleado {
    public Admin(String documento, String nombre, double sueldoHora, Empresa empresa) {
        super(documento, nombre, sueldoHora, empresa);
    }

    public String toString() {
        return "Administrador [documento=" + getDocumento() + ", nombre=" + getNombre() + ", sueldoHora=" + getSueldoHora() + "]";
    }
}
