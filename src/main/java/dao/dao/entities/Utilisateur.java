package dao.dao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Utilisateur implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id ;
    private String nom;
    private String prenom ;
    private Date date ;
    private String ntel ;
    private  String email;
    private String mot_passe;
    private String skypeId;
    private String image;
    @OneToMany(mappedBy ="utilisateur" )
    private Collection<Pointage> pointage ;
    @ManyToMany
    private Demande_congé demande_congé;
    @OneToMany
    private Role role ;
    @OneToMany
    private Collection<Demande_user> demande_user;




}
