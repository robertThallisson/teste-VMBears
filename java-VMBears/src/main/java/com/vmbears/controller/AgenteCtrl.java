package com.vmbears.controller;


import com.vmbears.model.Agente;
import com.vmbears.model.Agentes;
import com.vmbears.model.Regiao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/agente")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class AgenteCtrl {

    @PostMapping
    public @ResponseBody ResponseEntity<List<Agentes>> lerXML(@RequestParam("files") List<MultipartFile> files) throws Exception {

        JAXBContext jaxbContext;

        jaxbContext = JAXBContext.newInstance(Agentes.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();


        ArrayList<Agentes> retorno = new ArrayList<>();
        for (MultipartFile file : files) {
            Agentes agentes = (Agentes) jaxbUnmarshaller.unmarshal(file.getInputStream());

            retorno.add(agentes);
            for (Agente agente : agentes.agente) {
                System.out.println(
                        "Agente codigo: " + agente.codigo + "\n" +
                                "Agente data: " + agente.data + "\n"
                );
                for (Regiao regiao: agente.regiao) {
                    System.out.println(
                            "região  sigla: " + regiao.sigla + "\n"
                    );

                    System.out.println("Geração");
                    for (Float valor: regiao.geracao.valor) {
                        System.out.println(valor);
                    }
                    System.out.println("Compra");
                    for (Float valor: regiao.compra.valor) {
                        System.out.println(valor);
                    }

                    System.out.println("Preco Médio");
                    for (Float valor: regiao.precoMedio.valor) {
                        System.out.println(valor);

                    }
                    regiao.precoMedio = null;                }

            }
        }


        return ResponseEntity.ok(retorno);

    }
}
