package com.capgemini.Springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.servlet.FilterConfig;
import java.time.LocalDateTime;

@Entity
public class Schip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String model;
    int lengte;
    int aantalPassagiers;
    LocalDateTime bouwdatum;
    String naam;
    int topSnelheid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        this.aantalPassagiers = aantalPassagiers;
    }

    public LocalDateTime getBouwdatum() {
        return bouwdatum;
    }

    public void setBouwdatum(LocalDateTime bouwdatum) {
        this.bouwdatum = bouwdatum;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getTopSnelheid() {
        return topSnelheid;
    }

    public void setTopSnelheid(int topSnelheid) {
        this.topSnelheid = topSnelheid;
    }
}