package com.lp1.cinemascopium;


import java.util.ArrayList;

/**
 * Classe que gerencia o formato da biblioteca
 */
public class Filmes {
    private ArrayList<String> Categorias = new ArrayList<>();
    private int Ano_Produção;
    private String País_Produção;
    private String Cidade_Produção;
    private String Estado_Produção;
    private int Ano_Lançamento;
    private String Pais_Lançamento;
    private String Cidade_Lançamento;
    private String Estado_Lançamento;
    private String Sinopse;
    private String Gênero;
    private String Prêmios;
    private ArrayList<String> Atores = new ArrayList<>();
    private String Direção;

    /* Construtor Padrão */
    public Filmes(ArrayList<String> categorias, int ano_Produção, String país_Produção, String cidade_Produção, String estado_Produção, int ano_Lançamento, String pais_Lançamento, String cidade_Lançamento, String estado_Lançamento, String sinopse, String gênero, String prêmios, ArrayList<String> atores, String direção) {
        Categorias = categorias;
        Ano_Produção = ano_Produção;
        País_Produção = país_Produção;
        Cidade_Produção = cidade_Produção;
        Estado_Produção = estado_Produção;
        Ano_Lançamento = ano_Lançamento;
        Pais_Lançamento = pais_Lançamento;
        Cidade_Lançamento = cidade_Lançamento;
        Estado_Produção = estado_Lançamento;
        Sinopse = sinopse;
        Gênero = gênero;
        Prêmios = prêmios;
        Atores = atores;
        Direção = direção;
    }

    public ArrayList<String> getCategorias() {
        return Categorias;
    }

    public void setCategorias(ArrayList<String> categorias) {
        Categorias = categorias;
    }

    public int getAno_Produção() {
        return Ano_Produção;
    }

    public void setAno_Produção(int ano_Produção) {
        Ano_Produção = ano_Produção;
    }

    public String getPaís_Produção() {
        return País_Produção;
    }

    public void setPaís_Produção(String país_Produção) {
        País_Produção = país_Produção;
    }

    public String getCidade_Produção() {
        return Cidade_Produção;
    }

    public void setCidade_Produção(String cidade_Produção) {
        Cidade_Produção = cidade_Produção;
    }

    public String getEstado_Produção() {
        return Estado_Produção;
    }

    public void setEstado_Produção(String estado_Produção) {
        Estado_Produção = estado_Produção;
    }

    public String getSinopse() {
        return Sinopse;
    }

    public void setSinopse(String sinopse) {
        Sinopse = sinopse;
    }

    public String getGênero() {
        return Gênero;
    }

    public void setGênero(String gênero) {
        Gênero = gênero;
    }

    public String getPrêmios() {
        return Prêmios;
    }

    public void setPrêmios(String prêmios) {
        Prêmios = prêmios;
    }

    public ArrayList<String> getAtores() {
        return Atores;
    }

    public void setAtores(ArrayList<String> atores) {
        Atores = atores;
    }

    public String getDireção() {
        return Direção;
    }

    public void setDireção(String direção) {
        Direção = direção;
    }

    public int getAno_Lançamento() {
        return Ano_Lançamento;
    }

    public void setAno_Lançamento(int ano_Lançamento) {
        Ano_Lançamento = ano_Lançamento;
    }

    public String getPais_Lançamento() {
        return Pais_Lançamento;
    }

    public void setPais_Lançamento(String pais_Lançamento) {
        Pais_Lançamento = pais_Lançamento;
    }

    public String getCidade_Lançamento() {
        return Cidade_Lançamento;
    }

    public void setCidade_Lançamento(String cidade_Lançamento) {
        Cidade_Lançamento = cidade_Lançamento;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "Categoria: " + Categorias +
                ", Ano de Produção:" + Ano_Produção +
                ", País de Produção:'" + País_Produção + '\'' +
                ", Cidade de Produção:'" + Cidade_Produção + '\'' +
                ", Estado de Produção:'" + Estado_Produção + '\'' +
                ", Ano de Lançamento:" + Ano_Lançamento +
                ", País de Lançamento:" + Pais_Lançamento + '\'' +
                ", Cidade de Lançamento:" + Cidade_Lançamento + '\'' +
                ", Estado de Produção:'" + Estado_Lançamento + '\'' +
                ", Sinopse:'" + Sinopse + '\'' +
                ", Gênero:'" + Gênero + '\'' +
                ", Prêmios:'" + Prêmios + '\'' +
                ", Atores:" + Atores +
                ", Direção:'" + Direção + '\'' +
                '}';
    }
}
