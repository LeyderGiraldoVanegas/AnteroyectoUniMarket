package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@ToString
@Entity
public class Prestamo {
    @Id
    private String codigo;

    private Date fechaPretamo;
    private Date fechaDevolicion;
}
