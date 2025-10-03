package com.example;

import java.util.List;

import com.example.dto.CreditDTO;

import jakarta.ejb.Remote;

@Remote
public interface CreditRemote {
    List<CreditDTO> getAllcreditsByIdCompte(Integer idCompte);
}
