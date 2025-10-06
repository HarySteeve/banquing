package com.example.dto;

import java.io.Serializable;
import java.util.Date;


public class DebitDTO implements Serializable {
    private Integer id;
    private String description;
    private Float montant;
    private Date dateModif;
    private CompteDTO compte;

    // --- Constructors ---
    public DebitDTO(Integer id, String description, Float montant, Date dateModif, CompteDTO compte) {
        this.id = id;
        this.description = description;
        this.montant = montant;
        this.dateModif = dateModif;
        this.compte = compte;
    }

    public DebitDTO(Integer id, String description, Float montant, Date dateModif) {
        this.id = id;
        this.description = description;
        this.montant = montant;
        this.dateModif = dateModif;
    }

    public DebitDTO() {}
    // --- && ---

    // --- Getters and Setters ---
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Float getMontant() { return montant; }
    public void setMontant(Float montant) { this.montant = montant; }

    public Date getDateModif() { return dateModif; }
    public void setDateModif(Date dateModif) { this.dateModif = dateModif; }

    public CompteDTO getCompte() { return compte; }
    public void setCompte(CompteDTO compte) { this.compte = compte; }
}
