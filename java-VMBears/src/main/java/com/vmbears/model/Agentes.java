package com.vmbears.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name="agentes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Agentes  implements Serializable {
    public List<Agente> agente;
}
