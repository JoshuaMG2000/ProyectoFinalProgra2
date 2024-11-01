package com.edu.netbeans.proyectoprograv2jdmg;

import javax.swing.JOptionPane;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;



public class JFrameVideos extends javax.swing.JFrame {
    private EmbeddedMediaPlayerComponent mediaPlayerComponent;
    private ventanaPrincipal ventanaPrincipal; // Instancia de ventanaPrincipal
    
 // Constructor que recibe la instancia de ventanaPrincipal
     public JFrameVideos(ventanaPrincipal ventanaPrincipal) {
        initComponents();
        
        this.ventanaPrincipal = ventanaPrincipal; // Asignar la instancia

        // Inicializa el componente del reproductor de video
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        // Añade el reproductor al panel de video
        JpanelVideo.setLayout(new java.awt.BorderLayout());
        JpanelVideo.add(mediaPlayerComponent, java.awt.BorderLayout.CENTER);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelVideo = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        JpanelVideo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegresar.setBackground(new java.awt.Color(0, 102, 102));
        botonRegresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rebobinar.png"))); // NOI18N
        botonRegresar.setText("REGRESAR");
        botonRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(JpanelVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 1197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JpanelVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // Detener el video actual y cerrar el reproductor
    if (mediaPlayerComponent != null && mediaPlayerComponent.mediaPlayer() != null) {
        mediaPlayerComponent.mediaPlayer().controls().stop(); // Detener el video
    }

    // Cerrar el reproductor actual si está en uso
    if (ventanaPrincipal.getReproductorActual() != null) {
        ventanaPrincipal.getReproductorActual().close(); // Detener el reproductor de audio
    }

    this.dispose(); // Cerrar JFrameVideos
    ventanaPrincipal.setVisible(true); // Mostrar ventana principal
    }//GEN-LAST:event_botonRegresarActionPerformed
    
    public void metodPlayVideo(String rutaArchivo) {                                               
        if (rutaArchivo.toLowerCase().endsWith(".mp4") || rutaArchivo.toLowerCase().endsWith(".flv")|| rutaArchivo.toLowerCase().endsWith(".mkv")) {
            mediaPlayerComponent.mediaPlayer().media().play(rutaArchivo);
        } else {
            JOptionPane.showMessageDialog(this, "El archivo seleccionado no es un archivo de video compatible.");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelVideo;
    private javax.swing.JButton botonRegresar;
    // End of variables declaration//GEN-END:variables
}
