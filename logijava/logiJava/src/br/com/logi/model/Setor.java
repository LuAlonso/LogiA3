package br.com.logi.model;

public class Setor {
    //settando atributos
    private String nome;
    private int capacidade;
    private int coluna;
    private int linha;
    
    //criando construtor
    public Setor(String nome, int linha, int coluna, int capacidade){
        this.nome = nome;
        this.linha = linha;;
        this.coluna = coluna;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    //metodo toString pra entender oq é o setor e capacidade
    @Override
    public String toString(){
        return "setor: " + nome + " (" + linha + "," + coluna + ") | capacidade: " + capacidade;
    }

}
