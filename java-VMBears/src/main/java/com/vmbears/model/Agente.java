package com.vmbears.model;

import com.vmbears.adapter.LocalDateAdapter;
import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;



public class Agente implements Serializable {
    @XmlElement(name = "codigo")
    public Long codigo;
    @XmlElement(name = "data")
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    public LocalDateTime data;

    @XmlElement(name="regiao")
    public List<Regiao> regiao;


}
