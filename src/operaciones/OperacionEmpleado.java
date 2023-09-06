package operaciones;

import models.Empleado;

import java.util.ArrayList;
import java.util.List;

public class OperacionEmpleado implements IOperacionEmpleado {
    private List<Empleado> empleados = new ArrayList<>();
    @Override
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    @Override
    public Empleado buscarEmpleadoPorDocumento(String documento) {
        for (Empleado emp : empleados) {
            if (emp.getDocumento().equals(documento)) {
                return emp;
            }
        }
        return null;
    }

    @Override
    public double calcularSueldoEmpleado(String documento) {
        Empleado emp = buscarEmpleadoPorDocumento(documento);
        if (emp != null) {
            return emp.getSueldoHora() * 40;
        }
        return 0;
    }

    @Override
    public List<Empleado> obtenerTodosLosEmpleados() {
        return empleados;
    }
}
