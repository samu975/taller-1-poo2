package operaciones;

import models.Empleado;

import java.util.List;

public interface IOperacionEmpleado {
    void agregarEmpleado(Empleado e);
    Empleado buscarEmpleadoPorDocumento(String documento);
    double calcularSueldoEmpleado(String documento);

    List<Empleado> obtenerTodosLosEmpleados();
}