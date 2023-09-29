package edu.pe.cibertec.DAWII_CL1_GRUPO7.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tiposempleados")
@Entity

public class TipoEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipoempleado;
    @Column(name = "nombretipoempleado")
    private String nombretipoempleado;
}
