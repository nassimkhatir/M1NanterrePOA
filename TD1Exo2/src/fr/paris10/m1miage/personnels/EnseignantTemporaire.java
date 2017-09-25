package fr.paris10.m1miage.personnels;

import java.util.Date;

public abstract class EnseignantTemporaire extends Enseignant {


    public EnseignantTemporaire(String nom, String prenom, String id, CDD contrat) {
        super(nom, prenom, id, contrat);
    }

    public Date finContrat(){
        return ((CDD)contrat).getDateFinContrat();
    }

    public String toString() {
        return super.toString()+" "+"Salaire : "+this.getSalaire()+" Debut : "+this.getDebut()+" Fin : "+this.finContrat();
    }
}
