package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;


@Entity
public class Commande extends Entity_ {
    @Id
    Date date;
    double montantTotal;
    @ManyToOne
    Client client;
    @OneToMany(mappedBy = "commande")
    Set<Produit> produits;
}