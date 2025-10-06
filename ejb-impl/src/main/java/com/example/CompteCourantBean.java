package com.example;

import java.util.List;

import com.example.dto.CreditDTO;
import com.example.dto.DebitDTO;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class CompteCourantBean implements CompteCourantRemote {
    @PersistenceContext(name = "courantPU")
    private EntityManager em;

    @Override
    public Float calculSolde(List<DebitDTO> debits, List<CreditDTO> credits) {
        Float totalDebits = 0.0f;
        Float totalCredits = 0.0f;

        // --- Calcul total debit et credit
        for (DebitDTO debit : debits) {
            totalDebits += debit.getMontant();
        }
        for (CreditDTO credit : credits) {
            totalCredits += credit.getMontant();
        }

        Float solde = totalCredits - totalDebits;
        return solde;   
    }
}
