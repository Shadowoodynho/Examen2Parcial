package hn.lenguajes0.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes0.demo.Entities.Clientes;
import hn.lenguajes0.demo.Services.Impl.ClienteServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/clientes/")
public class ClienteController {

    @Autowired
    private ClienteServicesImpl clienteServicesImpl;

    @PostMapping("crear")
    public Clientes crearCliente(@RequestBody Clientes cliente) {
        return this.clienteServicesImpl.crearCliente(cliente);
    }

    @GetMapping("todos")
    public List<Clientes> obtenerTodosLosClientes() {
        return this.clienteServicesImpl.obtenerTodosLosClientes();
    }

    @GetMapping("porId")
    public Clientes getCliente(@RequestParam(name = "codigoCliente") String dni) {
        return this.clienteServicesImpl.buscarClientesPorDni(dni);
    }
}