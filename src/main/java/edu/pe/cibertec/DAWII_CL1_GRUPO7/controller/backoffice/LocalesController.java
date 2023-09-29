package edu.pe.cibertec.DAWII_CL1_GRUPO7.controller.backoffice;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Locales;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request.LocalRequest;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.response.ResultadoResponse;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.service.LocalesService;
import lombok.AllArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/locales")
public class LocalesController {

    private LocalesService localesService;

    @GetMapping("")
    public String frmLocales(Model model){
        model.addAttribute("listaLocales", localesService.listarLocales());
        return "backoffice/locales/frmLocales";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Local> listarLocales(){
        return localesService.listarLocales();
    }


    @PostMapping("/guardar")
    @ResponseBody
    public ResultadoResponse guardarLocales(@RequestBody LocalRequest localRequest){
        return localesService.guardarLocales(LocalRequest);
    }

}
