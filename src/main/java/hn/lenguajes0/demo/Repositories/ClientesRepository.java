package hn.lenguajes0.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

import hn.lenguajes0.demo.Entities.Clientes;

public interface ClientesRepository extends CrudRepository<Clientes, String> {

}
