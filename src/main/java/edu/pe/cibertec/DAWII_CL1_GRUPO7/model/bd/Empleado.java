package edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "empleados")
@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idempleado;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "numerotelefono")
    private String  numerotelefono;
    @Column(name = "correoelectronico")
    private String correoelectronico;
    @ManyToOne
    @JoinColumn(name = "idtipoempleado")
    private TipoEmpleado tiposempleados;
}
