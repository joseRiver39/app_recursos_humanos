package jaru.rh.servicio;

import jaru.rh.modelo.Empleados;
import jaru.rh.repositorio.EmpleadoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServicio implements IEmpleadoServicio{

    @Autowired
    private  EmpleadoRepositorio empleadoRepositorio;
    
    @Override
    public List<Empleados> listarEmpleados() {
        return  empleadoRepositorio.findAll();
    }

    @Override
    public Empleados buscarEmpleadoPorId(Integer idEmpleado) {
     
     Empleados empleado = empleadoRepositorio.findById(idEmpleado).orElse(null);
     return  empleado;
    }

    @Override
    public Empleados guardarEmpleados(Empleados empleado) {
         return empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleados empleado) {
      empleadoRepositorio.delete(empleado);
    }
    
}
