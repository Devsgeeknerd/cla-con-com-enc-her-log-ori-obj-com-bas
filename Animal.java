package br.com.devsgeeknerd.zoologico.classes;

public abstract class Animal {
    private String nome;
    private String especie;
    private int idade;
    private boolean estaVivo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Boolean estaVivo() {
        return estaVivo;
    }

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.estaVivo = true;
    }

    public Animal(String nome) {
        this.nome = nome;
        this.estaVivo = true;
    }

    public abstract void emitirBarulho();

    public boolean ehAdulto() {
        if (estaVivo) {
            return idade >= 1;
        } else {
            return false;
        }
    }

    public void morrer() {
        this.estaVivo = false;
    }

}
