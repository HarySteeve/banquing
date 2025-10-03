CREATE TABLE client(
   id INTEGER,
   nom VARCHAR(50),
   prenom VARCHAR(50),
   dateNaissance DATE,
   PRIMARY KEY(id)
);

CREATE TABLE interetAnnuel(
   id VARCHAR(50),
   taux REAL,
   dateModif DATE,
   PRIMARY KEY(id)
);

CREATE TABLE compte(
   id INTEGER,
   idClient INTEGER,
   PRIMARY KEY(id),
   FOREIGN KEY(idClient) REFERENCES client(id)
);

CREATE TABLE pret(
   id VARCHAR(50) ,
   idInteret INTEGER,
   duree INTEGER,
   description VARCHAR(50),
   idCompte INTEGER,
   pretInitial DOUBLE PRECISION,
   PRIMARY KEY(id),
   FOREIGN KEY(idCompte) REFERENCES compte(id),
   FOREIGN KEY(idInteret) REFERENCES interetAnnuel(id)
);

CREATE TABLE debit(
   id INTEGER,
   description VARCHAR(50),
   montant REAL,
   dateModif TIMESTAMP,
   idPret INTEGER,
   PRIMARY KEY(id),
   FOREIGN KEY(idPret) REFERENCES pret(id)
);

CREATE TABLE credit(
   id INTEGER,
   description VARCHAR(50),
   montant REAL,
   dateModif TIMESTAMP,
   idPret INTEGER,
   PRIMARY KEY(id),
   FOREIGN KEY(idPret) REFERENCES pret(id)
);
