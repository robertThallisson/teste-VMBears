package com.vmbears.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.util.List;


public class Compra implements Serializable {
    @XmlElement(name = "valor")
    public List<Float> valor;
}
