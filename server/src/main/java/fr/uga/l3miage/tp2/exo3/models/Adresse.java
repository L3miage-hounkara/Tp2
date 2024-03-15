package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adresse extends Entity_ {
    @Id
    String rue;
    String numero;
    String codePostal;
    String ville;
}