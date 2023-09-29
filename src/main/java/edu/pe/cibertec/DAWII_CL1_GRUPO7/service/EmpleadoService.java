package edu.pe.cibertec.DAWII_CL1_GRUPO7.service;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Empleado;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.TipoEmpleado;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request.EmpleadoRequest;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.response.ResultadoResponse;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.repository.EmpleadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmpleadoService {

    public EmpleadoRepository empleadoRepository;

    public List<Empleado> listarEmpleados(){
        return empleadoRepository.findAll();
    }

    public ResultadoResponse guardarEmpleados(EmpleadoRequest empleado) {
        String mensaje = "Empleado registrado correctamente";
        Boolean respuesta = true;
        try {
            Empleado objEmpleado = new Empleado();
            if (empleado.getIdempleado() > 0){
                objEmpleado.setIdempleado(empleado.getIdempleado());
            }
            objEmpleado.setNombre(empleado.getNombre());
            objEmpleado.setNumerotelefono(empleado.getNumerotelefono());
            objEmpleado.setCorreoelectronico(empleado.getCorreoelectronico());
            TipoEmpleado tipoEmpleado = new TipoEmpleado();
            tipoEmpleado.setIdtipoempleado(empleado.getIdtipoempleado());
            objEmpleado.setTiposempleados(tipoEmpleado);
            empleadoRepository.save(objEmpleado);
        }
        catch (Exception e){
            mensaje = "Empleado no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}