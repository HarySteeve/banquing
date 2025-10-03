package com.example;

import java.util.List;

import com.example.dto.DebitDTO;

import jakarta.ejb.Remote;

@Remote
public interface DebitRemote {
    List<DebitDTO> getAllDebitsbyIdCompte(Integer idCompte);    
}
