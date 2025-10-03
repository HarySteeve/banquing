package com.example.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "compte")
public class Compte {
    public Compte(Integer id, Float soldeInitial, Client client, List<Debit> debits, List<Credit> credits) {
        this.id = id;
        this.soldeInitial = soldeInitial;
        this.client = client;
        this.debits = debits;
        this.credits = credits;
    }
    public Compte() {}
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Float soldeInitial;

    @ManyToOne
    @JoinColumn(name = "idClient", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "compte", cascade = CascadeType.ALL)
    private List<Debit> debits;

    @OneToMany(mappedBy = "compte", cascade = CascadeType.ALL)
    private List<Credit> credits;

    // --- Getters et setters ---
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Float getSoldeInitial() {
        return soldeInitial;
    }
    public void setSoldeInitial(Float soldeInitial) {
        this.soldeInitial = soldeInitial;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public List<Debit> getDebits() {
        return debits;
    }
    public void setDebits(List<Debit> debits) {
        this.debits = debits;
    }

    public List<Credit> getCredits() {
        return credits;
    }
    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Compte [id=" + id + ", soldeInitial=" + soldeInitial + ", client=" + client + ", debits=" + debits
                + ", credits=" + credits + "]";
    }
}
