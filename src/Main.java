import java.util.List;
import java.util.Scanner;
import models.*;
import operaciones.*;

public class Main {
    public static void main(String[] args) {
        IOperacionEmpleado operEmpleado = new OperacionEmpleado();
        IOperacionEmpresa operEmpresa = new OperacionEmpresa();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Agregar Empresa");
            System.out.println("2. Agregar Empleado");
            System.out.println("3. Consultar Empleados");
            System.out.println("4. Consultar Empresas");
            System.out.println("5. Buscar Empleado por Documento");
            System.out.println("6. Buscar Empresa por NIT");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();

                    System.out.print("Ingrese el NIT de la empresa: ");
                    String nit = scanner.nextLine();

                    System.out.print("Ingrese el nombre de la empresa: ");
                    String nombreEmpresa = scanner.nextLine();

                    System.out.print("Ingrese la dirección de la empresa: ");
                    String direccion = scanner.nextLine();

                    System.out.print("Ingrese la ciudad de la empresa: ");
                    String ciudad = scanner.nextLine();

                    Empresa nuevaEmpresa = new Empresa(nit, nombreEmpresa, direccion, ciudad);

                    operEmpresa.agregarEmpresa(nuevaEmpresa);

                    System.out.println("Empresa " + nombreEmpresa + " añadida exitosamente!");
                    break;


                case 2:
                    scanner.nextLine();
                    System.out.print("Ingrese nombre del empleado: ");
                    String nombreEmpleado = scanner.nextLine();
                    System.out.print("Ingrese documento del empleado: ");
                    String documento = scanner.nextLine();

                    System.out.println("Elija el tipo de empleado:");
                    System.out.println("1. Desarrollador");
                    System.out.println("2. Gestor de Proyectos");
                    System.out.println("3. Administrador");
                    int eleccion = scanner.nextInt();

                    Empleado empleado = null;
                    switch(eleccion) {
                        case 1:
                            empleado = new Desarrollador(documento, nombreEmpleado, 0, new Empresa("", "", "", ""));
                            break;
                        case 2:
                            empleado = new GestorProyectos(documento, nombreEmpleado, 0, new Empresa("", "", "", ""), "");
                            break;
                        case 3:
                            empleado = new Admin(documento, nombreEmpleado, 0, new Empresa("", "", "", ""));
                            break;
                        default:
                            System.out.println("Elección no válida.");
                            break;
                    }

                    if (empleado != null) {
                        operEmpleado.agregarEmpleado(empleado);
                        System.out.println("Empleado agregado exitosamente!");
                    }
                    break;


                case 3:
                    System.out.println("Listado de Empleados:");
                    for (Empleado emp : operEmpleado.obtenerTodosLosEmpleados()) {
                        System.out.println(emp.toString());
                    }
                    break;

                case 4:
                    List<Empresa> listaEmpresas = operEmpresa.obtenerTodasLasEmpresas();
                    if(listaEmpresas.isEmpty()) {
                        System.out.println("No hay empresas registradas.");
                    } else {
                        System.out.println("Listado de Empresas:");
                        for (Empresa emp : listaEmpresas) {
                            System.out.println(emp.toString());
                        }
                    }
                    break;

                case 5:
                    scanner.nextLine();
                    System.out.print("Ingrese el documento del empleado a buscar: ");
                    String docBuscar = scanner.nextLine();
                    Empleado empBuscado = operEmpleado.buscarEmpleadoPorDocumento(docBuscar);
                    if (empBuscado != null) {
                        System.out.println("Empleado encontrado: " + empBuscado.toString());
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 6:
                    scanner.nextLine();
                    System.out.print("Ingrese el NIT de la empresa a buscar: ");
                    String nitBuscar = scanner.nextLine();
                    Empresa empresaBuscada = operEmpresa.buscarEmpresaPorNit(nitBuscar);
                    if (empresaBuscada != null) {
                        System.out.println("Empresa encontrada: " + empresaBuscada.toString());
                    } else {
                        System.out.println("Empresa no encontrada.");
                    }
                    break;

                case 7:
                    System.out.println("Adiós!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 7);
    }
}
