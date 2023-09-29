package edu.pe.cibertec.DAWII_CL1_GRUPO7.controller;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Cliente;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request.ClienteRequest;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.response.ResultadoResponse;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.service.ClienteService;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.service.HistorialPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @Autowired
    private HistorialPagoService historialPagoService;

    @GetMapping("/listarclientes")
    public String listadototal(Model model){
        model.addAttribute("listadocliente", clienteService.listarClientes());
        model.addAttribute("listadohistorialpago", historialPagoService.listar());
        return "clientes";
    }


    @GetMapping("/frmcliente")
    @ResponseBody
    public String frmcliente(){
        return "cliente/frmcliente";
    }

    @GetMapping("/listarcliente")
    @ResponseBody
    public List<Cliente> listarcliente(){
        return clienteService.listarClientes();
    }

    @PostMapping("/guardarcliente")
    @ResponseBody
    public ResultadoResponse guardarcliente(@RequestBody ClienteRequest clienteRequest){
        String mensaje = "";
        Boolean respuesta;
        respuesta = clienteService.guadarCliente(clienteRequest);
        mensaje = respuesta ? "Se guardo correctamente" : "No se guardo correctamente";
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}
