package tn.esprit.foyyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyyer.entity.Foyer;
import tn.esprit.foyyer.repository.IFoyerRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class FoyerServiceImpl implements IFoyerService{
    IFoyerRepo foyerRepo;
    @Override
    public Foyer ajouterFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);

    }

    @Override
    public Foyer modifierFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer modifierFoyeParIdr(Long idFoyer) {
        Foyer existingFoyer = foyerRepo.findById(idFoyer).orElse(null);
        if (existingFoyer != null) {
            // Perform update operations on the existing foyer.
            // Save the updated entity.
            return foyerRepo.save(existingFoyer);
        }
        return null;
    }

    @Override
    public Boolean supprimerFoyer(Foyer foyer) {
        if (foyer != null) {
            foyerRepo.delete(foyer);
            return true;
        }
        return false;
    }

    @Override
    public Boolean supprimerFoyerParId(Long idFoyer) {
        Foyer foyer = foyerRepo.findById(idFoyer).orElse(null);
        if (foyer != null) {
            foyerRepo.deleteById(idFoyer);
            return true;
        }
        return false;

    }

    @Override
    public Foyer chercherParId(Long idFoyer) {
        return foyerRepo.findById(idFoyer).orElse(null);
    }

    @Override
    public List<Foyer> afficherTout() {
        return foyerRepo.findAll();
    }
}
