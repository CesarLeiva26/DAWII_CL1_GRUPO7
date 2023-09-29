package edu.pe.cibertec.DAWII_CL1_GRUPO7.service;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.TipoEmpleado;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.repository.TipoEmpleadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TipoEmpleadoService {

    public TipoEmpleadoRepository tipoEmpleadoRepository;

    public List<TipoEmpleado>tipoEmpleados(){
        return tipoEmpleadoRepository.findAll();
    }
}
