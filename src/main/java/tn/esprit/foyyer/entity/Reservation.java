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
public class Reservation {
    @Id//besion de gestion de valeurs
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//i=i+1

    Long idReservation;
    @NonNull
    String nom ;
    String prenom ;
    @DateTimeFormat(pattern="dd/MM/yyyy")//pattern yaani namat haja tetaawed dima regular expressions
    LocalDate anneeUniversitaire ;
    // @Enumerated(EnumType.STRING)//user(1,douaa,hadidi,28-07-2001,Etudiant)
   Boolean estValide ;
    // Many-to-Many relationship with Etudiant
    @ManyToMany(mappedBy = "reservations")
    private Set<Etudiant> etudiants;
    // Many-to-One relationship with Chambre

}
