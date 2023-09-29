package edu.pe.cibertec.DAWII_CL1_GRUPO7.controller.backoffice;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.TipoEmpleado;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.service.TipoEmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/tipoempleado")

public class TipoEmpleadoController {

    @Autowired
    private TipoEmpleadoService tipoempleadoService;

    @GetMapping("/listar")
    @ResponseBody
    public List<TipoEmpleado> listarTipoEmpleados(){
        return tipoempleadoService.tipoEmpleados();
    }
}
