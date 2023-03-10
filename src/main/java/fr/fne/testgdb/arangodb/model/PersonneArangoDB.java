package fr.fne.testgdb.arangodb.model;

import com.arangodb.springframework.annotation.ArangoId;
import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.Relations;
import org.springframework.data.annotation.Id;

import java.util.Collection;
import java.util.Objects;

@Document("personne")
public class PersonneArangoDB {

    @Id
    private String id;

    @ArangoId
    private String arangoId;

    @Relations(edges = PersonneLink.class, lazy = true)
    private Collection<PersonneArangoDB> personneArangoDBS;

    private String nom;
    private String prenom;
    private String isni;
    private String dateDeNaissance;
    private String dateDeDeces;
    private String urlPerenne;
    private String noteBibliographique;
    private String langue;
    private String activite;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArangoId() {
        return arangoId;
    }

    public void setArangoId(String arangoId) {
        this.arangoId = arangoId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getIsni() {
        return isni;
    }

    public void setIsni(String isni) {
        this.isni = isni;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getDateDeDeces() {
        return dateDeDeces;
    }

    public void setDateDeDeces(String dateDeDeces) {
        this.dateDeDeces = dateDeDeces;
    }

    public String getUrlPerenne() {
        return urlPerenne;
    }

    public void setUrlPerenne(String urlPerenne) {
        this.urlPerenne = urlPerenne;
    }

    public String getNoteBibliographique() {
        return noteBibliographique;
    }

    public void setNoteBibliographique(String noteBibliographique) {
        this.noteBibliographique = noteBibliographique;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonneArangoDB personneArangoDB = (PersonneArangoDB) o;
        return Objects.equals(id, personneArangoDB.id) && Objects.equals(arangoId, personneArangoDB.arangoId) && Objects.equals(nom, personneArangoDB.nom) && Objects.equals(prenom, personneArangoDB.prenom) && Objects.equals(isni, personneArangoDB.isni) && Objects.equals(dateDeNaissance, personneArangoDB.dateDeNaissance) && Objects.equals(dateDeDeces, personneArangoDB.dateDeDeces) && Objects.equals(urlPerenne, personneArangoDB.urlPerenne) && Objects.equals(noteBibliographique, personneArangoDB.noteBibliographique) && Objects.equals(langue, personneArangoDB.langue) && Objects.equals(activite, personneArangoDB.activite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, arangoId, nom, prenom, isni, dateDeNaissance, dateDeDeces, urlPerenne, noteBibliographique, langue, activite);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id='" + id + '\'' +
                ", arangoId='" + arangoId + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", isni='" + isni + '\'' +
                ", dateDeNaissance='" + dateDeNaissance + '\'' +
                ", dateDeDeces='" + dateDeDeces + '\'' +
                ", urlPerenne='" + urlPerenne + '\'' +
                ", noteBibliographique='" + noteBibliographique + '\'' +
                ", langue='" + langue + '\'' +
                ", activite='" + activite + '\'' +
                '}';
    }
}
