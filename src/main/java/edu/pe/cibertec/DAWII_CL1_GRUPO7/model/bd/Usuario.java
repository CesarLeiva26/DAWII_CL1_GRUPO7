package edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "usuarios")
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;

    @Column(name = "nombreusuario")
    private String nombreusuario;

    @Column(name = "contra")
    private String contra;

    @ManyToOne
    @JoinColumn(name = "idempleado")
    private Empleado empleado;
}