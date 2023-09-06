package models;

public class Desarrollador extends Empleado{
    public Desarrollador(String documento, String nombre, double sueldoHora, Empresa empresa) {
        super(documento, nombre, sueldoHora, empresa);
    }
    @Override
    public String toString() {
        return "Desarrollador [documento=" + getDocumento() + ", nombre=" + getNombre() + ", sueldoHora=" + getSueldoHora() + "]";
    }
}
