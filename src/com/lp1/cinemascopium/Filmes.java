package com.lp1.cinemascopium;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gerencia o formato da biblioteca
 */
public class Filmes {
    private String Nome;
    private List<String> Categorias = new ArrayList<>();
    private int Ano_Prod;
    private String País_Prod;
    private String Cidade_Prod;
    private String Estado_Prod;
    private int Ano_Lançamento;
    private String Pais_Lançamento;
    private String Sinopse;
    private String Gênero;
    private String Prêmios;
    private List<String> Atores = new ArrayList<>();
    private String Direção;
    private String Classificação_Etaria;
    private Path Poster;


    /**
     * Utilizamos a interface List para flexibilizar a implementação e permitir modificações caso necessário
     * utilizando path para viabilizar o uso de Posters para os filmes
     */

    // Construtor padrão //
    public Filmes(String nome, List<String> categorias, int ano_Prod, String país_Prod, String cidade_Prod, String estado_Prod, int ano_Lançamento, String pais_Lançamento, String sinopse, String gênero, String prêmios, List<String> atores, String direção, String classificação_Etaria, Path poster) {
        Nome = nome;
        Categorias = categorias;
        Ano_Prod = ano_Prod;
        País_Prod = país_Prod;
        Cidade_Prod = cidade_Prod;
        Estado_Prod = estado_Prod;
        Ano_Lançamento = ano_Lançamento;
        Pais_Lançamento = pais_Lançamento;
        Sinopse = sinopse;
        Gênero = gênero;
        Prêmios = prêmios;
        Atores = atores;
        Direção = direção;
        Classificação_Etaria = classificação_Etaria;
        Poster = poster;
    }


    //Getters e Setters


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public List<String> getCategorias() {
        return Categorias;
    }

    public void setCategorias(List<String> categorias) {
        Categorias = categorias;
    }

    public int getAno_Prod() {
        return Ano_Prod;
    }

    public void setAno_Prod(int ano_Prod) {
        Ano_Prod = ano_Prod;
    }

    public String getPaís_Prod() {
        return País_Prod;
    }

    public void setPaís_Prod(String país_Prod) {
        País_Prod = país_Prod;
    }

    public String getCidade_Prod() {
        return Cidade_Prod;
    }

    public void setCidade_Prod(String cidade_Prod) {
        Cidade_Prod = cidade_Prod;
    }

    public String getEstado_Prod() {
        return Estado_Prod;
    }

    public void setEstado_Prod(String estado_Prod) {
        Estado_Prod = estado_Prod;
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

    public List<String> getAtores() {
        return Atores;
    }

    public void setAtores(List<String> atores) {
        Atores = atores;
    }

    public String getDireção() {
        return Direção;
    }

    public void setDireção(String direção) {
        Direção = direção;
    }

    public String getClassificação_Etaria() {
        return Classificação_Etaria;
    }

    public void setClassificação_Etaria(String classificação_Etaria) {
        Classificação_Etaria = classificação_Etaria;
    }

    public Path getPoster() {
        return Poster;
    }

    public void setPoster(Path poster) {
        Poster = poster;
    }

    // ToString - Listagem em Texto


    @Override
    public String toString() {
        return "Filmes{" +
                "Nome='" + Nome + '\'' +
                ", Categorias=" + Categorias +
                ", Produção - Ano:" + Ano_Prod +
                ", País:'" + País_Prod + '\'' +
                ", Cidade:'" + Cidade_Prod + '\'' +
                ", Estado:'" + Estado_Prod + '\'' +
                ", Lançamento - Ano:" + Ano_Lançamento +
                ", Pais:'" + Pais_Lançamento + '\'' +
                ", Sinopse:'" + Sinopse + '\'' +
                ", Gênero:'" + Gênero + '\'' +
                ", Prêmios:'" + Prêmios + '\'' +
                ", Elenco" + Atores +
                ", Direção:'" + Direção + '\'' +
                ", Classificação Etária:'" + Classificação_Etaria + '\'' +
                '}';
    }
}