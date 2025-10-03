package com.example.dto;

import java.io.Serializable;
import java.util.List;

public class CompteDTO implements Serializable {
    private Integer id;
    private Float soldeInitial;
    private ClientDTO client;
    private List<DebitDTO> debits;
    private List<CreditDTO> credits;

    public CompteDTO(Integer id, Float soldeInitial, ClientDTO client, List<DebitDTO> debits, List<CreditDTO> credits) {
        this.id = id;
        this.soldeInitial = soldeInitial;
        this.client = client;
        this.debits = debits;
        this.credits = credits;
    }

    public CompteDTO() {}

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

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public List<DebitDTO> getDebits() {
        return debits;
    }

    public void setDebits(List<DebitDTO> debits) {
        this.debits = debits;
    }

    public List<CreditDTO> getCredits() {
        return credits;
    }

    public void setCredits(List<CreditDTO> credits) {
        this.credits = credits;
    }
}
