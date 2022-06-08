package com.crud.democrud.repositories;
import com.crud.democrud.models.RolesUsuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface RolesRepository extends CrudRepository<RolesUsuario, Long> {
    public abstract ArrayList<RolesUsuario> findByPrioridad(Integer prioridad);

}