package jaru.rh.Controlador;

import jaru.rh.modelo.Empleados;
import jaru.rh.servicio.IEmpleadoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rh-app")
@CrossOrigin("*")
public class Controlador {

    
    @Autowired
    private IEmpleadoServicio empleadoServicio;

    @GetMapping("/empleados")
    public List<Empleados> obtenerEmpleados() {
        var empleados = empleadoServicio.listarEmpleados();
        return empleados;
    }

}
