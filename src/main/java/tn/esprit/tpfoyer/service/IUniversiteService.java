package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversite();
    public Universite retrieveUniversite(Long UniversiteId);
    public Universite addUniversite(Universite u);
    public void removeUniversite(Long UniversiteId);
    public Universite modifyUniversite(Universite universite);
}
