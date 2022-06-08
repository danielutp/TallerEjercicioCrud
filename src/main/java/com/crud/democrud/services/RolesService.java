package com.crud.democrud.services;
import com.crud.democrud.models.RolesUsuario;
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class RolesService {
    @Autowired
    RolesRepository rolesRepository;

    public ArrayList<RolesUsuario> obtenerRoles(){return (ArrayList<RolesUsuario>) rolesRepository.findAll();
    }

    public RolesUsuario guardarRoles(RolesUsuario roles, UsuarioModel usuario){
        return rolesRepository.save(roles);
    }
}