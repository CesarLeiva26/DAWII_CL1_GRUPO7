package edu.pe.cibertec.DAWII_CL1_GRUPO7.service;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Empleado;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Usuario;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request.UsuarioRequest;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.response.ResultadoResponse;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class UsuarioService {

    public UsuarioRepository usuarioRepository;


    public List<Usuario>listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public ResultadoResponse guardarUsuarios(UsuarioRequest usuario) {
        String mensaje = "Usuario registrado correctamente";
        Boolean respuesta = true;
        try {
            Usuario objUsuario = new Usuario();
            if (usuario.getIdusuario() != null && usuario.getIdusuario() > 0) {
                objUsuario.setIdusuario(usuario.getIdusuario());
            }
            objUsuario.setNombreusuario(usuario.getNombreusuario());
            objUsuario.setContra(usuario.getContra());
            Empleado empleado = new Empleado();
            empleado.setIdempleado(usuario.getIdempleado());
            objUsuario.setEmpleado(empleado);
            usuarioRepository.save(objUsuario);
        } catch (Exception e) {
            mensaje = "Usuario no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}