package com.example;

import java.util.List;
import java.util.stream.Collectors;

import com.example.dto.CreditDTO;
import com.example.entity.Credit;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class CreditBean implements CreditRemote {
    @PersistenceContext(unitName = "courantPU")
    private EntityManager em;

    @Override
    public List<CreditDTO> getAllcreditsByIdCompte(Integer idCompte) {
        List<Credit> credits = em.createQuery(
            "SELECT c FROM Credit c WHERE c.compte.id = :idCompte", Credit.class)
            .setParameter("idCompte", idCompte)
            .getResultList();

        return credits.stream()
                .map(c -> new CreditDTO(
                    c.getId(),
                    c.getDescription(),
                    c.getMontant(),
                    c.getDateModif()
                ))
                .collect(Collectors.toList());
    }
}
