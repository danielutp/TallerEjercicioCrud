package com.crud.democrud.repositories;
import com.crud.democrud.models.RolesUsuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends CrudRepository<RolesUsuario, Long> {

}