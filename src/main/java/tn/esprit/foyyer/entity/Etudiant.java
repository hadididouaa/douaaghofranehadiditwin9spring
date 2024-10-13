package tn.esprit.foyyer.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Length;
import org.hibernate.annotations.Columns;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class Etudiant {
    @Id//besion de gestion de valeurs
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//i=i+1
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO YAANI VA DELIGUER CET TACHE LELE SUBORDONNER MTE3OU ELI HOUWA ORM ELI HOUWA HIBERNATE
    // @Column(length = 5)
    Long idEtudiant;
    @NonNull
    Long cin;
    String nomEt ;

    String ecole ;
    @DateTimeFormat(pattern="dd/MM/yyyy")//pattern yaani namat haja tetaawed dima regular expressions
    LocalDate dateNaissance ;
    // Many-to-Many relationship with Reservation
    @ManyToMany
    @JoinTable(
            name = "etudiant_reservation",
            joinColumns = @JoinColumn(name = "etudiant_id"),
            inverseJoinColumns = @JoinColumn(name = "reservation_id")
    )
    private Set<Reservation> reservations;


}
