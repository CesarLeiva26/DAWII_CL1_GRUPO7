package edu.pe.cibertec.DAWII_CL1_GRUPO7.service;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Empleado;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.repository.EmpleadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmpleadoService {

    public EmpleadoRepository empleadoRepository;

    public List<Empleado> empleados(){
        return empleadoRepository.findAll();
    }

}
