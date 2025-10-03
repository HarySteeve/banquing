package com.example.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ClientDTO implements Serializable {
    private Integer id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private List<CompteDTO> comptes;

    public ClientDTO(Integer id, String nom, String prenom, Date dateNaissance, List<CompteDTO> comptes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.comptes = comptes;
    }

    public ClientDTO() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public List<CompteDTO> getComptes() {
        return comptes;
    }

    public void setComptes(List<CompteDTO> comptes) {
        this.comptes = comptes;
    }
}
