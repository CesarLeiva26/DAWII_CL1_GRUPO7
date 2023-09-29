package edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "locales")
@Entity

public class Locales {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer idlocal;
    @Column(name = "nombre")
    private String nombrelocal;
    @Column(name = "direccion")
    private String direccionlocal;
    @Column(name = "ciudadlocal")
    private String ciudadlocal;
    @Column(name = "codigopostal")
    private String codigopostal;
    @Column(name = "telefonolocal")
    private String telefonolocal;
    @ManyToOne
    @JoinColumn(name = "idempleado")
    private Empleado empleado;

}
