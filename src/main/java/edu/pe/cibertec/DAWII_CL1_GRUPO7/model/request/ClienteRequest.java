package edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ClienteRequest {


    private Integer idcliente;
    private String nombre;
    private String direccion;
    private String numerotelefono;
    private String correoelectronico;
    private Date fechapago;
    private Double montopagado;
    private String metodopago;
    private String estadopago;


}
