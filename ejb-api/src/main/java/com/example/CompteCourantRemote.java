package com.example;

import java.util.List;

import com.example.dto.DebitDTO;

import jakarta.ejb.Remote;
import com.example.dto.CreditDTO;

@Remote
public interface CompteCourantRemote {
    Float calculSolde(List<DebitDTO> debits, List<CreditDTO> credits);
}
