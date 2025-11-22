package com.mycompany.imagemcarregar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import javax.swing.JPanel;

public class PainelDegrade extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Cores do degradê
        Color corTopo = new Color(45, 45, 45);   // Cinza escuro
        Color corBase = new Color(25, 25, 25);   // Preto suave

        // Desenha o degradê vertical
        int largura = getWidth();
        int altura = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, corTopo, 0, altura, corBase);

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, largura, altura);
    }
}
