package com.seuprojeto.paises.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seuprojeto.paises.model.Pais;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaisService {

    public Pais buscarPais(String nome) {
        try {
            String url = "https://restcountries.com/v3.1/name/" + nome;

            RestTemplate restTemplate = new RestTemplate();
            String json = restTemplate.getForObject(url, String.class);

            ObjectMapper mapper = new ObjectMapper();
            Pais[] paises = mapper.readValue(json, Pais[].class);

            if (paises.length > 0) {
                return paises[0];
            }

            return null;

        } catch (Exception e) {
            return null;
        }
    }
}