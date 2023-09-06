package operaciones;

import models.Empresa;

import java.util.List;

public interface IOperacionEmpresa {
    void agregarEmpresa(Empresa e);
    Empresa buscarEmpresaPorNit(String nit);

    List<Empresa> obtenerTodasLasEmpresas();
}
