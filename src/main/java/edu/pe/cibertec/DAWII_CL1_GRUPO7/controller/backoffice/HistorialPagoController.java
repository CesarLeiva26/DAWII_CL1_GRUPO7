package edu.pe.cibertec.DAWII_CL1_GRUPO7.controller.backoffice;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.HistorialPago;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.response.ResultadoResponse;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.service.HistorialPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/historialpago")
public class HistorialPagoController {

    @Autowired
    private HistorialPagoService historialPagoService;

    @GetMapping("/listarhistorialpago")
    @ResponseBody
    private List<HistorialPago> listarhistorialpago(){
        return historialPagoService.listar();
    }



}
