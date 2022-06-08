package com.crud.democrud.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class RolesUsuario {

    /**
     * Identificador de la tupla
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    /**
     * Punto de enlace con la entidad UsuarioModel (un usuario puede tener muchos roles)
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "roles_usuario_id", nullable = false)
    @JsonBackReference
    private UsuarioModel usuarioModel;

    /**
     * Nombre del rol
     */
    @Column(nullable = false, length = 30)
    private String nombreRol;

}