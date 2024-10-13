package tn.esprit.foyyer.entity;



import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Length;
import org.hibernate.annotations.Columns;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Universite {
    @Id//besion de gestion de valeurs
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//i=i+1
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO YAANI VA DELIGUER CET TACHE LELE SUBORDONNER MTE3OU ELI HOUWA ORM ELI HOUWA HIBERNATE
    // @Column(length = 5)
    Long idUniversite;

    @NonNull
    String nomUniversite ;
    String adresse ;
    @OneToOne(mappedBy = "universite", cascade = CascadeType.ALL)
    private Foyer foyer;
}
