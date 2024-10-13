package tn.esprit.foyyer.service;

import tn.esprit.foyyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer ajouterFoyer(Foyer foyer );
    Foyer modifierFoyer(Foyer foyer );
    Foyer modifierFoyeParIdr(Long idFoyer );
    List<Foyer> afficherTout();
    Foyer  chercherParId(Long idFoyer);
    Boolean supprimerFoyer(Foyer foyer);
    Boolean supprimerFoyerParId(Long idFoyer);
}
