
package com.edu.netbeans.proyectoprograv2jdmg;

import javax.swing.ImageIcon;


public class JFrameFotos extends javax.swing.JFrame {

    public JFrameFotos() {
        initComponents();
        
    }
        public void setImageIcon(ImageIcon icon) {
        labelParaFotos.setIcon(icon);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelParaFotos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelParaFotos.setBackground(new java.awt.Color(204, 204, 204));
        labelParaFotos.setOpaque(true);
        getContentPane().add(labelParaFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 21, 900, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelParaFotos;
    // End of variables declaration//GEN-END:variables
}

