package com.vmbears.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.io.Serializable;
import java.util.List;


public class PrecoMedio implements Serializable {

    @XmlElement(name = "valor")
    public List<Float> valor;
}
