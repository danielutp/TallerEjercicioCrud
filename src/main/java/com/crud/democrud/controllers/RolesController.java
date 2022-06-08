package com.crud.democrud.controllers;
import com.crud.democrud.models.RolesUsuario;
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.services.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    RolesService rolesService;

    @GetMapping()
    public ArrayList<RolesUsuario> obtenerRoles() {
        return rolesService.obtenerRoles();
    }

    @PostMapping(path = "/{id}")
    public RolesUsuario guardarRoles(@RequestBody RolesUsuario roles, UsuarioModel usuario) {
        roles.setUsuarioModel(usuario);
        return this.rolesService.guardarRoles(roles, usuario);
    }
}