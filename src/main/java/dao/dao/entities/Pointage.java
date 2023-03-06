package dao.dao.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Pointage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Date sate;
    private Date heure1;
    private Date heure2;
    int nb_sortie;
    @ManyToOne
    private Utilisateur utilisateur;





}
