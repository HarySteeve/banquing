CREATE TABLE client(
   id INTEGER,
   nom VARCHAR(50),
   prenom VARCHAR(50),
   dateNaissance DATE,
   PRIMARY KEY(id)
);

CREATE TABLE compte(
   id INTEGER,
   idClient INTEGER NOT NULL,
   soldeInitial REAL,
   PRIMARY KEY(id),
   FOREIGN KEY(idClient) REFERENCES client(id)
);

CREATE TABLE debit(
   id INTEGER,
   idCompte INTEGER,
   description VARCHAR(50),
   montant REAL,
   dateModif TIMESTAMP,
   PRIMARY KEY(id),
   FOREIGN KEY(idCompte) REFERENCES compte(id)
);

CREATE TABLE credit(
   id INTEGER,
   idCompte INTEGER,
   description VARCHAR(50),
   montant REAL,
   dateModif TIMESTAMP,
   PRIMARY KEY(id),
   FOREIGN KEY(idCompte) REFERENCES compte(id)
);
