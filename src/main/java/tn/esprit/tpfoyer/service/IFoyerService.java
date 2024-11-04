package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyer();
    public Foyer retrieveFoyer(Long FoyerId);
    public Foyer addFoyer(Foyer f);
    public void removeFoyer(Long FoyerId);
    public Foyer modifyFoyer(Foyer foyer);
}
