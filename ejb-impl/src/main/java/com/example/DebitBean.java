package com.example;

import java.util.List;
import java.util.stream.Collectors;

import com.example.dto.DebitDTO;
import com.example.entity.Debit;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class DebitBean implements DebitRemote {
    @PersistenceContext(name = "courantPU")
    private EntityManager em;

    @Override
    public List<DebitDTO> getAllDebitsbyIdCompte(Integer idCompte) {
        List<Debit> debits = em.createQuery(
            "SELECT d FROM Debit d WHERE d.compte.id = :idCompte", Debit.class)
            .setParameter("idCompte", idCompte)
            .getResultList();

        return debits.stream()
                .map(d -> new DebitDTO(
                    d.getId(),
                    d.getDescription(),
                    d.getMontant(),
                    d.getDateModif()
                ))
                .collect(Collectors.toList());
    }
}
