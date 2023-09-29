package edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request;

import lombok.Data;

@Data
public class UsuarioRequest {


    private Integer idusuario;
    private String nombreusuario;
    private String contra;
    private Integer idempleado;
}