package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;


@Entity
public class Produit extends nEntity {
    @Id
    double prix;
    int quantite;
    @ManyToOne
    Commande commande;
    @ManyToMany
    Set<CategorieDeProduit> categories;
}