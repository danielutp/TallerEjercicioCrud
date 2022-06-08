package com.crud.democrud.models;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class UsuarioModel {

    /**
     * Identificador de la tupla
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    /**
     * Número de teléfono
     */
    private String nombre;

    /**
     * Correo electronico
     */
    private String email;

    /**
     * Numero de prioridad
     */
    private Integer prioridad;


    /**
     * Constructor de UsuarioModel
     */
    public UsuarioModel(String nombre, String email, Integer prioridad) {
        this.nombre = nombre;
        this.email = email;
        this.prioridad = prioridad;
    }

    /**
     * Constructor de UsuarioModel
     */
    public UsuarioModel() {
    }

    /**
     * Punto de enlace entre la entidad del UsuarioModel y RolesUsuario (un usuario puede tener muchos números roles)
     */
    @OneToMany(
            fetch = FetchType.EAGER,
            targetEntity = RolesUsuario.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "usuarioModel"
    )
    @JsonManagedReference
    private List<UsuarioModel> roles = new ArrayList<>();
}

