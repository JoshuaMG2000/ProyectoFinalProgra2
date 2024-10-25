
package com.edu.netbeans.proyectoprograv2jdmg;

import javax.swing.ImageIcon;


public class JFrameFotos extends javax.swing.JFrame {
     private ventanaPrincipal ventanaPrincipal; // Instancia de ventanaPrincipal
    //Se modifica el constructor para que acepte la instancia de ventanaPrincipal y mantener los datos cargados
    public JFrameFotos(ventanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal; //Guarda la referencia
        initComponents();
        
    }
        public void setImageIcon(ImageIcon icon) {
        labelParaFotos.setIcon(icon);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelParaFotos = new javax.swing.JLabel();
        botonRegresarFotos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelParaFotos.setBackground(new java.awt.Color(204, 204, 204));
        labelParaFotos.setOpaque(true);
        getContentPane().add(labelParaFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 21, 900, 490));

        botonRegresarFotos.setText("regresar");
        botonRegresarFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarFotosActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 150, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarFotosActionPerformed
       if (ventanaPrincipal.getReproductorActual() != null) {
        ventanaPrincipal.getReproductorActual().close(); // Detener el reproductor de audio
    }
         // Cierra el JFrameFotos y se libera de la memoria
    this.dispose(); 
     ventanaPrincipal.setVisible(true); 
    }//GEN-LAST:event_botonRegresarFotosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresarFotos;
    private javax.swing.JLabel labelParaFotos;
    // End of variables declaration//GEN-END:variables
}

