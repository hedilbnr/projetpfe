package dao;

import dao.dao.entities.Demande_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface Demande_userRepository extends JpaRepository <Demande_user, Long>{

}
