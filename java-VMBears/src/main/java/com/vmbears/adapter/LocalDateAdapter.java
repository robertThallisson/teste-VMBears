package com.vmbears.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDateTime> {
    public LocalDateTime unmarshal(String v) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        return LocalDateTime.parse(v.substring(0,16), formatter) ;
    }

    public String marshal(LocalDateTime v) throws Exception {
        return v.toString();
    }
}
