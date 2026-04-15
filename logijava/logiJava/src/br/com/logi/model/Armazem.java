package br.com.logi.model;

public class Armazem {
    private Setor [][] setores;

    //criando o construtor do armazem
    public Armazem(int linhas, int colunas) {
        setores = new Setor[linhas][colunas];

        // preenchendo a matriz dos setores
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                setores[i][j] = new Setor("Setor " + i + "-" + j, i, j, 10);
            }
        }
    }

    //criando getter do setor pra ver setor x
    public Setor getSetor(int linha, int coluna) {
        return setores[linha][coluna];
    }

    //mostrando mapa de setores
    public void mostrarSetores() {
        for (int i = 0; i < setores.length; i++) {
            for (int j = 0; j < setores[i].length; j++) {
                System.out.println(setores[i][j]);
            }
        }
    }

}
