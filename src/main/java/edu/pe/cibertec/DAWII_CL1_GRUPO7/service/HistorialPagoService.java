package edu.pe.cibertec.DAWII_CL1_GRUPO7.service;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.HistorialPago;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.repository.HistorialPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialPagoService {

    @Autowired
    private HistorialPagoRepository historialPagoRepository;

    public List<HistorialPago> listar() {
        return historialPagoRepository.findAll();
    }

    public HistorialPago registrar(HistorialPago historialPago) {
        return historialPagoRepository.save(historialPago);
    }
}
