package edu.pe.cibertec.DAWII_CL1_GRUPO7.service;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Empleado;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Locales;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.TipoEmpleado;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request.EmpleadoRequest;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request.LocalRequest;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.response.ResultadoResponse;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.repository.LocalesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@AllArgsConstructor
@Service
public class LocalesService {

    public LocalesRepository localesRepository;

    public List<Locales> listarLocales(){
        return localesRepository.findAll();
    }

    public ResultadoResponse guardarLocales(LocalRequest locales) {
        String mensaje = "Local registrado correctamente";
        Boolean respuesta = true;
        try {
            Locales objLocal = new Locales();
            if (locales.getIdlocal() > 0){
                objLocal.setIdlocal(Locales.getIdlocal());
            }
            objLocal.setNombrelocal(locales.getNombrelocal());
            objLocal.setDireccionlocal(locales.getNombrelocal());
            objLocal.setCiudadlocal(locales.getCiudadlocal());
            objLocal.setCodigopostal(locales.getCodigopostal());
            objLocal.setTelefonolocal(locales.getTelefonolocal());localesRepository.save(objLocal);
        }
        catch (Exception e){
            mensaje = "local no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }

}
