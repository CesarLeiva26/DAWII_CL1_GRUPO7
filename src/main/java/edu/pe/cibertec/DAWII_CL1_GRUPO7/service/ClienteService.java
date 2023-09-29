package edu.pe.cibertec.DAWII_CL1_GRUPO7.service;

import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.Cliente;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd.HistorialPago;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.model.request.ClienteRequest;
import edu.pe.cibertec.DAWII_CL1_GRUPO7.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {


    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private HistorialPagoService historialPagoService;



    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }


    @Transactional
    public Boolean guadarCliente(ClienteRequest clienteRequest){
        Cliente cliente = new Cliente();
        cliente.setNombre(clienteRequest.getNombre());
        cliente.setDireccion(clienteRequest.getDireccion());
        cliente.setNumerotelefono(clienteRequest.getNumerotelefono());
        cliente.setCorreoelectronico(clienteRequest.getCorreoelectronico());
        Cliente nuevocliente = clienteRepository.save(cliente);
        HistorialPago historialPago = new HistorialPago();
        historialPago.setFechapago(clienteRequest.getFechapago());
        historialPago.setMetodopago(clienteRequest.getMetodopago());
        historialPago.setMontopagado(clienteRequest.getMontopagado());
        historialPago.setEstadopago(clienteRequest.getEstadopago());
        historialPago.setCliente(cliente);
        historialPagoService.registrar(historialPago);

        return nuevocliente.getIdcliente()>0;


    }

    public Cliente eliminar(Integer id) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if (cliente != null) {
            clienteRepository.delete(cliente);
        }
        return cliente;
    }



}
