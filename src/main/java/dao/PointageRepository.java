package dao;

import dao.dao.entities.Pointage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface PointageRepository extends JpaRepository <Pointage, Long>{
    
}
