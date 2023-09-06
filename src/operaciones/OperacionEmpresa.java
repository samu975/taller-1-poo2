package operaciones;

import models.Empresa;

import java.util.List;
import java.util.ArrayList;


public class OperacionEmpresa implements IOperacionEmpresa {
    private List<Empresa> empresas = new ArrayList<>();


    @Override
    public void agregarEmpresa(Empresa e) {
        empresas.add(e);
    }

    @Override
    public Empresa buscarEmpresaPorNit(String nit) {
        for (Empresa empresa : empresas) {
            if (empresa.getNit().equals(nit)) {
                return empresa;
            }
        }
        return null;
    }

    @Override
    public List<Empresa> obtenerTodasLasEmpresas() {
        return empresas;
    }

}