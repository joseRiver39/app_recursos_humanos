
package jaru.rh.servicio;

import jaru.rh.modelo.Empleados;
import java.util.List;


public interface IEmpleadoServicio {
 
    public List<Empleados> listarEmpleados();
    
    public Empleados buscarEmpleadoPorId(Integer idEmpleado);
    
    public Empleados guardarEmpleados(Empleados empleado);
    
    public void eliminarEmpleado(Empleados empleado);
    
}
