package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

@Entity
public class Projet {
    @Id
    private BigInteger id;

    private String name;

    private String description;

    @ManyToMany
    private Set<DeveloperMiage> developers;


}
