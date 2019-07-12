
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enseignant complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="enseignant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idEnseignant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enseignant", propOrder = { "adresse", "email", "idEnseignant", "nom", "prenom" })
public class Enseignant {

    protected String adresse;
    protected String email;
    protected String idEnseignant;
    protected String nom;
    protected String prenom;

    /**
     * Gets the value of the adresse property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Sets the value of the adresse property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdresse(String value) {
        this.adresse = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the idEnseignant property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdEnseignant() {
        return idEnseignant;
    }

    /**
     * Sets the value of the idEnseignant property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdEnseignant(String value) {
        this.idEnseignant = value;
    }

    /**
     * Gets the value of the nom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the prenom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets the value of the prenom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

}
