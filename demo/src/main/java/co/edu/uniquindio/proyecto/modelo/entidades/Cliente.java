package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String cedula;
    private String nombre;
    private String email;
    //private String telefono;

    @ElementCollection
   // private List<String> telefono;
    private Map<String,String> telefono;
    public Cliente(){
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cedula, cliente.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }
}
