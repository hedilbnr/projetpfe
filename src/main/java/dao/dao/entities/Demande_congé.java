package dao.dao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Demande_congé {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id ;
    private Date date_debut1 ;
    private Date date_fin1 ;
    boolean etat;
    private Date date_debut2;
    private Date  date_fin2;
    String type ;
    @ManyToMany
    private Collection<Utilisateur> utilisateur ;
    @OneToMany
    private  Collection<Demande_user>demande_user;


}
