package edu.pe.cibertec.DAWII_CL1_GRUPO7.controller.backoffice;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Usuario;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request.UsuarioRequest;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.response.ResultadoResponse;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    @GetMapping("")
    public String frmUsuario(Model model) {
        model.addAttribute("listaUsuarios", usuarioService.listarUsuarios());
        return "backoffice/usuario/frmUsuario";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @PostMapping("/guardar")
    @ResponseBody
    public ResultadoResponse guardarUsuarios(@RequestBody UsuarioRequest usuarioRequest) {
        return usuarioService.guardarUsuarios(usuarioRequest);
    }
}