package com.epst.epst.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // <--- THIS is it
public class Utilisateur {
    public Utilisateur(
             Long id,
             String nom,
             String postnom,
             String prenom,
             String numero,
             String email,
             String adresse,
             int role,
             String matricule,
             String id_statut,
             String date_de_naissance,
             String mdp
            
        ){
        this.adresse = adresse;
        this.date_de_naissance = date_de_naissance;
        this.id = id;
        this.email = email;
        this.id_statut = id_statut;
        this.matricule = matricule;
        this.nom = nom;
        this.numero = numero;
        this.postnom = postnom;
        this.role = role;
        this.prenom = prenom;
        this.mdp = mdp;
    }

    public Long id;

    public String nom;

    public String postnom;

    public String prenom;

    public String date_de_naissance;

    public String numero;

    public String email;

    public String adresse;

    public int role;

    public String matricule;

    public String id_statut;

    public String mdp;
}
