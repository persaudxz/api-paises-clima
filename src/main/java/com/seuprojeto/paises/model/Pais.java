package com.seuprojeto.paises.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pais {

    private String nomeComum;
    private String nomeOficial;
    private String capital;
    private String regiao;
    private String subRegiao;
    private long populacao;
    private double area;
    private String bandeira;

    @JsonProperty("name")
    private void unpackName(Map<String, Object> name) {
        this.nomeComum = (String) name.get("common");
        this.nomeOficial = (String) name.get("official");
    }

    @JsonProperty("capital")
    private void unpackCapital(List<String> capital) {
        if (capital != null && !capital.isEmpty()) {
            this.capital = capital.get(0);
        }
    }

    @JsonProperty("region")
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @JsonProperty("subregion")
    public void setSubRegiao(String subRegiao) {
        this.subRegiao = subRegiao;
    }

    @JsonProperty("population")
    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    @JsonProperty("area")
    public void setArea(double area) {
        this.area = area;
    }

    @JsonProperty("flags")
    private void unpackFlags(Map<String, Object> flags) {
        this.bandeira = (String) flags.get("png");
    }

    public String getNomeComum() { return nomeComum; }
    public String getNomeOficial() { return nomeOficial; }
    public String getCapital() { return capital; }
    public String getRegiao() { return regiao; }
    public String getSubRegiao() { return subRegiao; }
    public long getPopulacao() { return populacao; }
    public double getArea() { return area; }
    public String getBandeira() { return bandeira; }
}