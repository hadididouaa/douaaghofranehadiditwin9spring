package tn.esprit.foyyer.entity;



import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Length;
import org.hibernate.annotations.Columns;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloc {
    @Id//besion de gestion de valeurs
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//i=i+1
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO YAANI VA DELIGUER CET TACHE LELE SUBORDONNER MTE3OU ELI HOUWA ORM ELI HOUWA HIBERNATE
    // @Column(length = 5)
    Long idBloc;
    Long capaciteBloc;
    @NonNull
    String nomBloc ;
    @ManyToOne
    @JoinColumn(name = "foyer_id")  // Foreign key column in Bloc table
    private Foyer foyer;
    // One-to-Many relationship with Chambre
    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private Set<Chambre> chambres;
}
