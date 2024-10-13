package tn.esprit.foyyer.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyyer.entity.Foyer;
import tn.esprit.foyyer.service.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer-rest")
public class FoyerRestController {

    private final IFoyerService foyerService;

    // CREATE : Ajouter un nouveau foyer
    @PostMapping("/foyer")
    public Foyer ajouterFoyer(@RequestBody Foyer foyer) {
        return foyerService.ajouterFoyer(foyer);
    }

    // READ : Afficher tous les foyers
    @GetMapping("/foyer")
    public List<Foyer> afficherTousLesFoyers() {
        return foyerService.afficherTout();
    }

    // READ : Chercher un foyer par ID
    @GetMapping("/foyer/{id}")
    public Foyer chercherFoyer(@PathVariable Long id) {
        return foyerService.chercherParId(id);
    }

    // UPDATE : Modifier un foyer par ID
    @PutMapping("/foyer/{id}")
    public Foyer modifierFoyer(@PathVariable Long id, @RequestBody Foyer foyer) {
        foyer.setIdFoyer(id);  // On s'assure que l'ID est bien attribué
        return foyerService.modifierFoyer(foyer);
    }

    // DELETE : Supprimer un foyer par ID
    @DeleteMapping("/foyer/{id}")
    public Boolean supprimerFoyerParId(@PathVariable Long id) {
        return foyerService.supprimerFoyerParId(id);
    }

    // DELETE : Supprimer un foyer par Objet
    @DeleteMapping("/foyer")
    public Boolean supprimerFoyer(@RequestBody Foyer foyer) {
        return foyerService.supprimerFoyer(foyer);
    }
}
