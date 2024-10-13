package tn.esprit.foyyer.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Length;
import org.hibernate.annotations.Columns;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foyer {
    @Id//besion de gestion de valeurs
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//i=i+1
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO YAANI VA DELIGUER CET TACHE LELE SUBORDONNER MTE3OU ELI HOUWA ORM ELI HOUWA HIBERNATE
    // @Column(length = 5)
    Long idFoyer;
    Long capaciteFoyer;
    @NonNull
    String nomFoyer ;
    @OneToOne
    @JoinColumn(name = "universite_id")  // Foreign key column in Foyer table
    private Universite universite;
    // One-to-Many relationship with Bloc
    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bloc> blocs;
}
