
package jaru.rh.repositorio;

import jaru.rh.modelo.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleados, Integer>{

   
    
}
