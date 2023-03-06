package dao.dao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Demande_user {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id ;
    boolean reponse;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Demande_user demande_user;
}
