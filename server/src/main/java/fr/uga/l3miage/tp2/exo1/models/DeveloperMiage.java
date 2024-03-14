package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class DeveloperMiage {
    @Id
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "fisrt_name")
    private String firstName;

    private String email;

    @ManyToMany(mappedBy = "developers")
    private Set<Projet> projets;

}
