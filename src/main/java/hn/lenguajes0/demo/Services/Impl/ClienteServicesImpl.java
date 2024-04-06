package hn.lenguajes0.demo.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes0.demo.Entities.Clientes;
import hn.lenguajes0.demo.Repositories.ClientesRepository;
import hn.lenguajes0.demo.Services.ClienteServices;

@Service
public class ClienteServicesImpl implements ClienteServices {

    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public Clientes crearCliente(Clientes cliente) {
        if (this.clientesRepository.existsById(cliente.getDni())) {
            return null;
        }
        return this.clientesRepository.save(cliente);
    }

    @Override
    public List<Clientes> obtenerTodosLosClientes() {
        return (List<Clientes>) this.clientesRepository.findAll();
    }

    @Override
    public Clientes buscarClientesPorDni(String dni) {
        return this.clientesRepository.findById(dni).get();
    }

}
