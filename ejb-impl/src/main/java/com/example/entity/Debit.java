package com.example.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "debit")
public class Debit {
    public Debit(Integer id, String description, Float montant, Date dateModif, Compte compte) {
        this.id = id;
        this.description = description;
        this.montant = montant;
        this.dateModif = dateModif;
        this.compte = compte;
    }
    public Debit() {}
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private Float montant;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModif;

    @ManyToOne
    @JoinColumn(name = "idCompte", nullable = false)
    private Compte compte;

    // --- Getters et setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Float getMontant() {
        return montant;
    }
    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public Date getDateModif() {
        return dateModif;
    }
    public void setDateModif(Date dateModif) {
        this.dateModif = dateModif;
    }

    public Compte getCompte() {
        return compte;
    }
    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    @Override
    public String toString() {
        return "Debit [id=" + id + ", description=" + description + ", montant=" + montant + ", dateModif=" + dateModif
                + ", compte=" + compte + "]";
    }
}
