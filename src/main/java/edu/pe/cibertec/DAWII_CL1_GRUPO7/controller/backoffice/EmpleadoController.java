package edu.pe.cibertec.DAWII_CL1_GRUPO7.controller.backoffice;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Empleado;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request.EmpleadoRequest;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.response.ResultadoResponse;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.service.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/empleado")
public class EmpleadoController {

    private EmpleadoService empleadoService;

    @GetMapping("")
    public String frmEmpleado(Model model){
        model.addAttribute("listaEmpleado", empleadoService.listarEmpleados());
        return "backoffice/empleado/frmEmpleado";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Empleado> listarEmpleados(){
        return empleadoService.listarEmpleados();
    }


    @PostMapping("/guardar")
    @ResponseBody
    public ResultadoResponse guardarEmpleados(@RequestBody EmpleadoRequest empleadoRequest){
        return empleadoService.guardarEmpleados(empleadoRequest);
    }
}
