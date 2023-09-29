package edu.pe.cibertec.DAWII_CL1_GRUPO7.repository;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.HistorialPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialPagoRepository extends JpaRepository<HistorialPago,Integer>{
}
