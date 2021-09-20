package br.com.dwb;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
//import javax.swing.JFrame;

public class JogoCarro extends JFrame {

    JLabel lCarro1 = new JLabel(new ImageIcon("C:\\MeusProgramas\\IntellijIdeaProjects\\CarroMovimento\\FigurasCarro\\img1.jpg"));
    JLabel lCarro2 = new JLabel(new ImageIcon("C:\\MeusProgramas\\IntellijIdeaProjects\\CarroMovimento\\FigurasCarro\\img2.jpg"));
    JLabel lCarro3 = new JLabel(new ImageIcon("C:\\MeusProgramas\\IntellijIdeaProjects\\CarroMovimento\\FigurasCarro\\img3.jpg"));


    //private JLabel texto ;

    public JogoCarro() {

        editarJanela();
    }


    public void editarJanela() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Corrida de Carros");
        setSize(1400, 400);
        //setSize(800,800);
        //setLocationRelativeTo(this);
        setVisible(true);
        setLayout(null);
        lCarro1.setBounds(0, 0, 200, 100);
        lCarro2.setBounds(0, 100, 200, 100);
        lCarro3.setBounds(0, 200, 200, 100);
        add(lCarro1);
        //add(label1);
        add(lCarro2);
        add(lCarro3);
//        texto = new JLabel("Meu primeiro texto", SwingConstants.CENTER);//
//        texto.setHorizontalTextPosition( SwingConstants.CENTER );
//        texto.setVerticalTextPosition( SwingConstants.BOTTOM );
//        add(texto);
//
        JLabel chegada = new JLabel("Chegada");
        chegada.setBounds(1330, -90, 200, 200);
        add(chegada);

        JButton linha = new JButton();
        linha.setBounds(1360, 20, 10, 300);
        add(linha);

        JCheckBox go = new JCheckBox("Go!!!");
        go.setBounds(10, 330, 100, 20);
        add(go);

        JTextField texto = new JTextField();
        texto.setBounds(70, 330, 1100, 30);
        add(texto);

        JButton start = new JButton("START CARS");
        start.setBounds(1200, 330, 150, 30);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (go.isSelected()){
                    new Movimento().start();
                if (lCarro1.getX()<1150 || true) {
                    texto.setText("O Carro Futurama foi o vencedor");
                }
                else if (lCarro2.getX()<1150 || true) {
                    texto.setText("O Carro Gol vermelho foi o vencedor");
                } else {
                    texto.setText("O Carro Antigo foi o vencedor");
                }
            }else
                new JogoCarro();
            }
        });
        add(start);
    }


    public class Movimento extends Thread {
        public void run() {
            while (true) {
                try {
                    sleep(20);
                } catch (Exception erro) {
                }
                Random random = new Random();
                int velocidade1 = random.nextInt(20);
                int velocidade2 = random.nextInt(20);
                int velocidade3 = random.nextInt(20);
                if (lCarro1.getX() < 1150)
                    lCarro1.setBounds(lCarro1.getX() + velocidade1, 10, 200, 100);
                lCarro1.setText("O Carro Futurama foi o vencedor");
                if (lCarro2.getX() < 1150)
                    lCarro2.setBounds(lCarro2.getX() + velocidade2, 115, 200, 100);
                lCarro1.setText("O Carro Gol vermelho foi o vencedor");
                if (lCarro3.getX() < 1150)
                    lCarro3.setBounds(lCarro3.getX() + velocidade3, 220, 200, 100);
                lCarro1.setText("O Carro Antigo foi o vencedor");
            }
        }
    }


    public static void main(String[] args) {
        new JogoCarro();

    }
}
