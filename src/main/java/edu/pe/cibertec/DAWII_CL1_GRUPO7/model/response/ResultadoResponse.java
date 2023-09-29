package edu.pe.cibertec.DAWII_CL1_GRUPO7.model.response;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadoResponse {
    private String mensaje;
    private Boolean respuesta;
}
