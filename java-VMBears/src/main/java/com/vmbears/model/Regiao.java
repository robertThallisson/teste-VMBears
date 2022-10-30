package com.vmbears.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.io.Serializable;


public class Regiao implements Serializable {

    @XmlAttribute(name = "sigla")
    public String sigla;

    @XmlElement(name = "geracao")
    public Geracao geracao;
    @XmlElement(name = "compra")
    public Compra compra;
    @XmlElement(name = "precoMedio")
    public PrecoMedio precoMedio;
}
