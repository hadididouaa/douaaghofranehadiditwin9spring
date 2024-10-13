package tn.esprit.foyyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chambre {
    @Id//besion de gestion de valeurs
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//i=i+1
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO YAANI VA DELIGUER CET TACHE LELE SUBORDONNER MTE3OU ELI HOUWA ORM ELI HOUWA HIBERNATE
    // @Column(length = 5)
    Long idChambre;
    Long numeroChambre;
    @Enumerated(EnumType.ORDINAL)//user(1,douaa,hadidi,28-07-2001,0)//tekhedh index tel que index mtaa awel haja aal isar hiya 0
    TypeChambre typeC ;
    // Many-to-One relationship with Bloc (weaker entity)
    @ManyToOne
    @JoinColumn(name = "bloc_id")  // Foreign key column in Chambre table
    private Bloc bloc;
    // One-to-Many relationship with Reservation
    @OneToMany
    private Set<Reservation> reservations;
}
