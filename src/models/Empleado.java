package models;

public abstract class Empleado {
    protected String documento;
    protected String nombre;

    public Empleado(String documento, String nombre, double sueldoHora, Empresa empresa) {
        this.documento = documento;
        this.nombre = nombre;
        this.sueldoHora = sueldoHora;
        this.empresa = empresa;
    }

    protected double sueldoHora;
    private Empresa empresa;
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString(){
        return "Empleado [documento=" + documento + ", nombre=" + nombre + ", sueldoHora=" + sueldoHora + "]";
    }
}
