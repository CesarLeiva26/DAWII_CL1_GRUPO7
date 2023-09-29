package edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request;
import lombok.Data;
@Data
public class EmpleadoRequest {

     private Integer idempleado;
     private String nombre;
     private String  numerotelefono;
     private String correoelectronico;
     private Integer idtipoempleado;
}
