package hn.lenguajes0.demo.Entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "movimientos")
@Data
public class Movimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimiento")
    private int idMovimiento;

    @Column(name = "tipomovimiento")
    private String tipoMovimiento;

    @Column(name = "monto")
    private double monto;

    @Column(name = "fechamovimiento")
    private Date fechaMovimiento;

}
