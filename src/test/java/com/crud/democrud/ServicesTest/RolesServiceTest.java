package com.crud.democrud.ServicesTest;
import com.crud.democrud.models.RolesUsuario;
import com.crud.democrud.repositories.RolesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static  org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class RolesServiceTest {
    @Autowired
    RolesRepository rolesRepository;

    @Test
    public void testListarRoles(){
        List<RolesUsuario> rolesModelList=(List<RolesUsuario>) rolesRepository.findAll();
        assertThat(rolesModelList).size().isGreaterThan(0);
    }
}
