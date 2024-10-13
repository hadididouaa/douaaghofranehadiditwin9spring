package tn.esprit.foyyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyyer.entity.Foyer;

@Repository
public interface IFoyerRepo extends JpaRepository<Foyer,Long> {
}
