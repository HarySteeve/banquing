-- 1) Insérer un client
INSERT INTO client (id, nom, prenom, dateNaissance)
VALUES (1, 'Rakoto', 'Jean', '1995-04-12');

-- 2) Insérer un compte lié au client id=1
INSERT INTO compte (id, idClient, soldeInitial)
VALUES (100, 1, 5000.00);

-- 3) Insérer 4 crédits liés au compte id=100
INSERT INTO credit (id, idCompte, description, montant, dateModif)
VALUES 
    (1000, 100, 'Crédit salaire', 1200.00, '2025-09-01 08:30:00'),
    (1001, 100, 'Crédit remboursement prêt', 800.00, '2025-09-05 14:15:00'),
    (1002, 100, 'Crédit virement ami', 500.00, '2025-09-10 10:45:00'),
    (1003, 100, 'Crédit cash dépôt guichet', 2000.00, '2025-09-20 16:00:00');

-- 4) Insérer 5 débits liés au compte id=100
INSERT INTO debit (id, idCompte, description, montant, dateModif)
VALUES
    (2000, 100, 'Achat supermarché', 300.00, '2025-09-02 11:20:00'),
    (2001, 100, 'Paiement facture électricité', 150.00, '2025-09-07 09:45:00'),
    (2002, 100, 'Retrait DAB', 500.00, '2025-09-12 15:30:00'),
    (2003, 100, 'Achat essence', 200.00, '2025-09-18 18:10:00'),
    (2004, 100, 'Paiement internet', 100.00, '2025-09-25 08:00:00');

