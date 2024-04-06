package hn.lenguajes0.demo.Entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuentas")
@Data
public class Cuentas {

    @Id
    @Column(name = "numerocuenta")
    private String numeroCuenta;

    @Column(name = "saldo")
    private double saldo;

    @Column(name = "fechaapertura")
    private Date fechaApertura;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "sobregiro")
    private boolean sobregiro;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "numerocuenta", referencedColumnName = "numerocuenta")
    private List<Movimientos> movimientos;

}
