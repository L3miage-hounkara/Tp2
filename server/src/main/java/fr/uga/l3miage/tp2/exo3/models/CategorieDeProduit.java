package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;


@Entity
public class CategorieDeProduit extends nEntity {
    @Id
    long id;
    @ManyToMany(mappedBy = "categories")
    Set<Produit> produits;
}