package dao;

import dao.dao.entities.Demande_congé;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface Demande_congéRepository extends JpaRepository <Demande_congé, Long>{

}
