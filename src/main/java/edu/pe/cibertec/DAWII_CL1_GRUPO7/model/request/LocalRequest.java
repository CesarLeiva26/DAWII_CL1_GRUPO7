package edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LocalRequest {

    private Integer idlocal;
    private String nombrelocal;
    private String direccionlocal;
    private String ciudadlocal;
    private String codigopostal;
    private String telefonolocal;
}
