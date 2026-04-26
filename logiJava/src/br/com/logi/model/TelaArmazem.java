package br.com.logi.model;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class TelaArmazem extends JFrame {

    //Criando o construtor da tela do armazem
    public TelaArmazem(Armazem armazem) {
        setTitle("Sistema de Armazém");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mostrarGrid(armazem);

        setVisible(true);
    }
        //metodo pra mostrar a grid do armazem
        private void mostrarGrid(Armazem armazem){
        int linhas = armazem.getLinhas();
        int colunas = armazem.getColunas();

        setLayout(new java.awt.GridLayout(linhas, colunas));

        for(int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                Setor setor = armazem.getSetor(i, j);
                JButton botao = new JButton(setor.getNome());
                botao.addActionListener(e -> JOptionPane.showMessageDialog(null, "Nome: " + setor.getNome() + "\nLinha: " + setor.getLinha() + "\nColuna: " + setor.getColuna() + "\nCapacidade: " + setor.getCapacidade()));
                add(botao);
                };

            }
        }
}
