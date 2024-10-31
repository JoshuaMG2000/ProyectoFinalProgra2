package com.edu.netbeans.proyectoprograv2jdmg;

// Para leer archivos desde el sistema de archivos.
import com.github.burningwave.core.io.FileInputStream; 
// Mejora la eficiencia de lectura de archivos con un búfer.
import java.io.BufferedInputStream; 

// Permite al usuario seleccionar archivos/directorios.
import javax.swing.JFileChooser; 

// Para mostrar mensajes emergentes (alertas, confirmaciones, etc.).
import javax.swing.JOptionPane; 

// Maneja archivos y directorios.
import java.io.File; 

// Excepción lanzada por errores de entrada/salida.
import java.io.IOException; 

// Modelo de datos para JTable (manejo de filas y columnas). CRUD completo
import javax.swing.table.DefaultTableModel; 

// Para manejar archivos de audio, leer y escribir metadata de archivos de audio.
import org.jaudiotagger.audio.AudioFile; 

// Lee y escribe archivos de audio. Obtener acceso a los metadatos.
import org.jaudiotagger.audio.AudioFileIO; 

// Claves para etiquetas de archivos de audio (artista, álbum, etc.).
import org.jaudiotagger.tag.FieldKey; 

// Representa las etiquetas (metadata) de archivos de audio.
import org.jaudiotagger.tag.Tag; 

// Reproduce archivos MP3, la uso para reproducir lo de audio.
import javazoom.jl.player.Player; 

// Maneja metadatos de varios tipos de archivos. (lo uso para videos)
import org.apache.tika.metadata.Metadata; 

// Detecta el tipo de archivo y extrae contenido o metadata.
import org.apache.tika.parser.AutoDetectParser; 

// Manejador de contenido para parsing en formato SAX.Simple API for XML) normalmente para procesar el contenido durante el parsing.
import org.apache.tika.sax.BodyContentHandler; 

// Excepción para errores durante el análisis de archivos XML/SAX.
import org.xml.sax.SAXException; 

// Clase de la librería VLCJ, Componente para reproducir multimedia incrustado en una ventana.
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent; 


import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.exif.ExifIFD0Directory;
import java.awt.Image;
//import java.awt.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Josue David Martinez Galdámez
 */

//MI CLASE PRINCIPAL
public class ventanaPrincipal extends javax.swing.JFrame {

   private Player reproductorActual;
   private boolean enPausa = false;
   public  String RutaDeAcceso;
   private EmbeddedMediaPlayerComponent mediaPlayerComponent;
   
   //CONSTRUCTOR
    public ventanaPrincipal() {
        
        initComponents();
        
    tablaDatosMyV.getTableHeader().setReorderingAllowed(false);
    tablaDatosMyV.getTableHeader().setResizingAllowed(false);
    tablaDatosFotos.getTableHeader().setReorderingAllowed(false);
    tablaDatosFotos.getTableHeader().setResizingAllowed(false);
    botonVerImagen.setVisible(false);
    botonRegresarMusica.setVisible(false);
    botonReproducirMusica.setVisible(false);
    botonSiguienteMusica.setVisible(false);
    botonPausa.setVisible(false);
    botonReproducirVideo.setVisible(false);  
    menuOrdenarMyV.setVisible(false);
    menuOrdenarFotos.setVisible(false);

    }

    public Player getReproductorActual() {
        return reproductorActual;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Fondo = new javax.swing.JPanel();
        panelAlmacenamiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldMusicaPeso = new javax.swing.JTextField();
        textFieldVideoPeso = new javax.swing.JTextField();
        textFieldPesoTotal = new javax.swing.JTextField();
        textFieldFotosPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textFieldMusicaCantidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        textFieldVideoCantidad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        textFieldFotosCantidad = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        textFieldCantidadTotal = new javax.swing.JTextField();
        PanelBarraBotones = new javax.swing.JPanel();
        botonRegresarMusica = new javax.swing.JButton();
        botonReproducirMusica = new javax.swing.JButton();
        botonSiguienteMusica = new javax.swing.JButton();
        botonPausa = new javax.swing.JButton();
        botonVerImagen = new javax.swing.JButton();
        botonReproducirVideo = new javax.swing.JButton();
        panelTablas = new javax.swing.JPanel();
        jScrollPaneMyV = new javax.swing.JScrollPane();
        tablaDatosMyV = new javax.swing.JTable();
        jScrollPaneFotos = new javax.swing.JScrollPane();
        tablaDatosFotos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        botonVerDuplicados = new javax.swing.JButton();
        jTextFieldBusqueda = new javax.swing.JTextField();
        panelAlmacenamientoDuplicados = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        textFieldTotalCantidad = new javax.swing.JTextField();
        tamañoDuplicadosVideo = new javax.swing.JTextField();
        textFieldTotalDuplicados = new javax.swing.JTextField();
        tamañoDuplicadosImagenes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tamañoDuplicadosMusica = new javax.swing.JTextField();
        cantidadDuplicadosMusica = new javax.swing.JTextField();
        cantidadDuplicadosVideo = new javax.swing.JTextField();
        cantidadDuplicadosImagenes = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        botonMusica = new javax.swing.JButton();
        botonVideo = new javax.swing.JButton();
        botonFotos = new javax.swing.JButton();
        botonVerTotal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        seleccionCarpeta = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        menuOrdenarMyV = new javax.swing.JMenu();
        ordenXnombre = new javax.swing.JMenuItem();
        ordenarXartista = new javax.swing.JMenuItem();
        ordenarXalbum = new javax.swing.JMenuItem();
        ordenarXgenero = new javax.swing.JMenuItem();
        ordenarXduracion = new javax.swing.JMenuItem();
        ordenarXaño = new javax.swing.JMenuItem();
        ordenarXtamaño = new javax.swing.JMenuItem();
        menuOrdenarFotos = new javax.swing.JMenu();
        ordenarFotosXnombre = new javax.swing.JMenuItem();
        ordenarFotosXFecha = new javax.swing.JMenuItem();
        ordenarFotosXfechaModif = new javax.swing.JMenuItem();
        ordenarFotosXtamaño = new javax.swing.JMenuItem();
        ordenarFotosXdispositivo = new javax.swing.JMenuItem();
        ordenarFotosXmodelo = new javax.swing.JMenuItem();
        menuVerDuplicados = new javax.swing.JMenu();
        itemVerDuplicadosVideosYMusica = new javax.swing.JMenuItem();
        itemVerDuplicadosFotos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REPRODUCTOR DE MEDIOS");
        setBackground(new java.awt.Color(153, 0, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Fondo.setBackground(new java.awt.Color(0, 153, 153));
        Panel_Fondo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Panel_FondoComponentShown(evt);
            }
        });
        Panel_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAlmacenamiento.setBackground(new java.awt.Color(68, 169, 169));
        panelAlmacenamiento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAlmacenamiento.setAutoscrolls(true);
        panelAlmacenamiento.setEnabled(false);
        panelAlmacenamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Imágenes:");
        panelAlmacenamiento.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, -1));

        textFieldMusicaPeso.setEditable(false);
        textFieldMusicaPeso.setBackground(new java.awt.Color(0, 0, 0));
        textFieldMusicaPeso.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldMusicaPeso.setForeground(new java.awt.Color(255, 255, 255));
        textFieldMusicaPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMusicaPesoActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldMusicaPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 100, 30));

        textFieldVideoPeso.setEditable(false);
        textFieldVideoPeso.setBackground(new java.awt.Color(0, 0, 0));
        textFieldVideoPeso.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldVideoPeso.setForeground(new java.awt.Color(255, 255, 255));
        textFieldVideoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldVideoPesoActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldVideoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 30));

        textFieldPesoTotal.setEditable(false);
        textFieldPesoTotal.setBackground(new java.awt.Color(0, 0, 0));
        textFieldPesoTotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldPesoTotal.setForeground(new java.awt.Color(255, 255, 255));
        panelAlmacenamiento.add(textFieldPesoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 100, -1));

        textFieldFotosPeso.setEditable(false);
        textFieldFotosPeso.setBackground(new java.awt.Color(0, 0, 0));
        textFieldFotosPeso.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldFotosPeso.setForeground(new java.awt.Color(255, 255, 255));
        textFieldFotosPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFotosPesoActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldFotosPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 100, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("ALMACENAMIENTO GENERAL");
        panelAlmacenamiento.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad:");
        panelAlmacenamiento.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Video:");
        panelAlmacenamiento.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Musica:");
        panelAlmacenamiento.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, -1));

        textFieldMusicaCantidad.setEditable(false);
        textFieldMusicaCantidad.setBackground(new java.awt.Color(0, 0, 0));
        textFieldMusicaCantidad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldMusicaCantidad.setForeground(new java.awt.Color(255, 255, 255));
        textFieldMusicaCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMusicaCantidadActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldMusicaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 100, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator1.setEnabled(false);
        jSeparator1.setOpaque(true);
        panelAlmacenamiento.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 10));

        textFieldVideoCantidad.setEditable(false);
        textFieldVideoCantidad.setBackground(new java.awt.Color(0, 0, 0));
        textFieldVideoCantidad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldVideoCantidad.setForeground(new java.awt.Color(255, 255, 255));
        textFieldVideoCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldVideoCantidadActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldVideoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 100, 30));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cantidad:");
        panelAlmacenamiento.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator2.setEnabled(false);
        jSeparator2.setOpaque(true);
        panelAlmacenamiento.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 10));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total Peso:");
        panelAlmacenamiento.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 90, 30));

        textFieldFotosCantidad.setEditable(false);
        textFieldFotosCantidad.setBackground(new java.awt.Color(0, 0, 0));
        textFieldFotosCantidad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldFotosCantidad.setForeground(new java.awt.Color(255, 255, 255));
        textFieldFotosCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFotosCantidadActionPerformed(evt);
            }
        });
        panelAlmacenamiento.add(textFieldFotosCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 100, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSeparator3.setEnabled(false);
        jSeparator3.setOpaque(true);
        panelAlmacenamiento.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 250, 10));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cantidad:");
        panelAlmacenamiento.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 30));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cant. Total:");
        panelAlmacenamiento.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, 30));

        textFieldCantidadTotal.setEditable(false);
        textFieldCantidadTotal.setBackground(new java.awt.Color(0, 0, 0));
        textFieldCantidadTotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldCantidadTotal.setForeground(new java.awt.Color(255, 255, 255));
        panelAlmacenamiento.add(textFieldCantidadTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 100, -1));

        Panel_Fondo.add(panelAlmacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 230, 360));

        PanelBarraBotones.setBackground(new java.awt.Color(68, 169, 169));
        PanelBarraBotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelBarraBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRegresarMusica.setBackground(new java.awt.Color(0, 102, 102));
        botonRegresarMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/paso-atras.png"))); // NOI18N
        botonRegresarMusica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegresarMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresarMusica.setEnabled(false);
        botonRegresarMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarMusicaActionPerformed(evt);
            }
        });
        PanelBarraBotones.add(botonRegresarMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        botonReproducirMusica.setBackground(new java.awt.Color(0, 102, 102));
        botonReproducirMusica.setForeground(new java.awt.Color(255, 255, 255));
        botonReproducirMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tocar.png"))); // NOI18N
        botonReproducirMusica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonReproducirMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonReproducirMusica.setEnabled(false);
        botonReproducirMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproducirMusicaActionPerformed(evt);
            }
        });
        PanelBarraBotones.add(botonReproducirMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 50, 40));

        botonSiguienteMusica.setBackground(new java.awt.Color(0, 102, 102));
        botonSiguienteMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/un-paso-adelante.png"))); // NOI18N
        botonSiguienteMusica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSiguienteMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSiguienteMusica.setEnabled(false);
        botonSiguienteMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteMusicaActionPerformed(evt);
            }
        });
        PanelBarraBotones.add(botonSiguienteMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 40));

        botonPausa.setBackground(new java.awt.Color(0, 102, 102));
        botonPausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/circulo-de-pausa.png"))); // NOI18N
        botonPausa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonPausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPausa.setEnabled(false);
        botonPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPausaActionPerformed(evt);
            }
        });
        PanelBarraBotones.add(botonPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 50, 40));

        botonVerImagen.setBackground(new java.awt.Color(0, 102, 102));
        botonVerImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/verImagen.png"))); // NOI18N
        botonVerImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVerImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerImagen.setEnabled(false);
        botonVerImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerImagenActionPerformed(evt);
            }
        });
        PanelBarraBotones.add(botonVerImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 40));

        botonReproducirVideo.setBackground(new java.awt.Color(0, 51, 51));
        botonReproducirVideo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonReproducirVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/play1.png"))); // NOI18N
        botonReproducirVideo.setToolTipText("");
        botonReproducirVideo.setEnabled(false);
        botonReproducirVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReproducirVideoActionPerformed(evt);
            }
        });
        PanelBarraBotones.add(botonReproducirVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 40));

        Panel_Fondo.add(PanelBarraBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 1320, 40));

        panelTablas.setBackground(new java.awt.Color(0, 102, 102));
        panelTablas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelTablas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneMyV.setBackground(new java.awt.Color(0, 51, 51));

        tablaDatosMyV.setBackground(new java.awt.Color(68, 169, 169));
        tablaDatosMyV.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaDatosMyV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaDatosMyV.setForeground(new java.awt.Color(255, 255, 255));
        tablaDatosMyV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Ext.", "Artista", "Álbum", "Género", "Duración", "Año", "Ruta", "Tamaño"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatosMyV.setFocusable(false);
        tablaDatosMyV.setGridColor(new java.awt.Color(255, 255, 255));
        tablaDatosMyV.setSelectionBackground(new java.awt.Color(0, 51, 51));
        tablaDatosMyV.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaDatosMyV.setShowGrid(true);
        jScrollPaneMyV.setViewportView(tablaDatosMyV);
        if (tablaDatosMyV.getColumnModel().getColumnCount() > 0) {
            tablaDatosMyV.getColumnModel().getColumn(0).setMinWidth(300);
            tablaDatosMyV.getColumnModel().getColumn(0).setMaxWidth(400);
            tablaDatosMyV.getColumnModel().getColumn(7).setMinWidth(200);
            tablaDatosMyV.getColumnModel().getColumn(7).setMaxWidth(300);
        }

        panelTablas.add(jScrollPaneMyV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1300, 190));

        jScrollPaneFotos.setBackground(new java.awt.Color(102, 0, 0));

        tablaDatosFotos.setBackground(new java.awt.Color(68, 169, 169));
        tablaDatosFotos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.yellow, null, null));
        tablaDatosFotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Extensión", "Ruta", "Fecha Creación", "Fecha Modif", "Tamaño", "Dispositivo", "Modelo Disp."
            }
        ));
        tablaDatosFotos.setFocusable(false);
        tablaDatosFotos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaDatosFotos.setSelectionBackground(new java.awt.Color(0, 51, 51));
        tablaDatosFotos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaDatosFotos.setShowGrid(true);
        jScrollPaneFotos.setViewportView(tablaDatosFotos);

        panelTablas.add(jScrollPaneFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1300, 190));

        Panel_Fondo.add(panelTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 1320, 230));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REPRODUCTOR MULTIMEDIA JOSH");
        Panel_Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 790, 40));

        botonVerDuplicados.setBackground(new java.awt.Color(51, 51, 51));
        botonVerDuplicados.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botonVerDuplicados.setForeground(new java.awt.Color(255, 255, 255));
        botonVerDuplicados.setText("VER DUPLICADOS");
        botonVerDuplicados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVerDuplicados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVerDuplicados.setEnabled(false);
        botonVerDuplicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDuplicadosActionPerformed(evt);
            }
        });
        Panel_Fondo.add(botonVerDuplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 50, 30));

        jTextFieldBusqueda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldBusqueda.setText("Ingresa tu búsqueda aquí");
        jTextFieldBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusquedaActionPerformed(evt);
            }
        });
        Panel_Fondo.add(jTextFieldBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 660, 30));

        panelAlmacenamientoDuplicados.setBackground(new java.awt.Color(51, 51, 51));
        panelAlmacenamientoDuplicados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAlmacenamientoDuplicados.setAutoscrolls(true);
        panelAlmacenamientoDuplicados.setEnabled(false);
        panelAlmacenamientoDuplicados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fotos:");
        panelAlmacenamientoDuplicados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, -1));

        textFieldTotalCantidad.setEditable(false);
        textFieldTotalCantidad.setBackground(new java.awt.Color(0, 0, 0));
        textFieldTotalCantidad.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldTotalCantidad.setForeground(new java.awt.Color(255, 255, 255));
        textFieldTotalCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTotalCantidadActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(textFieldTotalCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 50, 30));

        tamañoDuplicadosVideo.setEditable(false);
        tamañoDuplicadosVideo.setBackground(new java.awt.Color(0, 0, 0));
        tamañoDuplicadosVideo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tamañoDuplicadosVideo.setForeground(new java.awt.Color(255, 255, 255));
        panelAlmacenamientoDuplicados.add(tamañoDuplicadosVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 100, 30));

        textFieldTotalDuplicados.setEditable(false);
        textFieldTotalDuplicados.setBackground(new java.awt.Color(0, 0, 0));
        textFieldTotalDuplicados.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldTotalDuplicados.setForeground(new java.awt.Color(255, 255, 255));
        panelAlmacenamientoDuplicados.add(textFieldTotalDuplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 100, 30));

        tamañoDuplicadosImagenes.setEditable(false);
        tamañoDuplicadosImagenes.setBackground(new java.awt.Color(0, 0, 0));
        tamañoDuplicadosImagenes.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tamañoDuplicadosImagenes.setForeground(new java.awt.Color(255, 255, 255));
        tamañoDuplicadosImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoDuplicadosImagenesActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(tamañoDuplicadosImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CANTIDAD");
        panelAlmacenamientoDuplicados.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 80, 20));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Totales:");
        panelAlmacenamientoDuplicados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Música:");
        panelAlmacenamientoDuplicados.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Video:");
        panelAlmacenamientoDuplicados.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 50, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TAMAÑO");
        panelAlmacenamientoDuplicados.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 70, 20));

        tamañoDuplicadosMusica.setEditable(false);
        tamañoDuplicadosMusica.setBackground(new java.awt.Color(0, 0, 0));
        tamañoDuplicadosMusica.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tamañoDuplicadosMusica.setForeground(new java.awt.Color(255, 255, 255));
        tamañoDuplicadosMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoDuplicadosMusicaActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(tamañoDuplicadosMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 100, 30));

        cantidadDuplicadosMusica.setEditable(false);
        cantidadDuplicadosMusica.setBackground(new java.awt.Color(0, 0, 0));
        cantidadDuplicadosMusica.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cantidadDuplicadosMusica.setForeground(new java.awt.Color(255, 255, 255));
        cantidadDuplicadosMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadDuplicadosMusicaActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(cantidadDuplicadosMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, 30));

        cantidadDuplicadosVideo.setEditable(false);
        cantidadDuplicadosVideo.setBackground(new java.awt.Color(0, 0, 0));
        cantidadDuplicadosVideo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cantidadDuplicadosVideo.setForeground(new java.awt.Color(255, 255, 255));
        cantidadDuplicadosVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadDuplicadosVideoActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(cantidadDuplicadosVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 50, 30));

        cantidadDuplicadosImagenes.setEditable(false);
        cantidadDuplicadosImagenes.setBackground(new java.awt.Color(0, 0, 0));
        cantidadDuplicadosImagenes.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        cantidadDuplicadosImagenes.setForeground(new java.awt.Color(255, 255, 255));
        cantidadDuplicadosImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadDuplicadosImagenesActionPerformed(evt);
            }
        });
        panelAlmacenamientoDuplicados.add(cantidadDuplicadosImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 50, 30));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 102));
        jLabel15.setText("ALMACENAMIENTO DUPLICADOS");
        panelAlmacenamientoDuplicados.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Panel_Fondo.add(panelAlmacenamientoDuplicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 240));

        botonMusica.setBackground(new java.awt.Color(0, 102, 102));
        botonMusica.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonMusica.setForeground(new java.awt.Color(255, 255, 255));
        botonMusica.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue\\OneDrive - Universidad Mariano Gálvez\\4. CUARTO SEMESTRE\\PROGRAMACION II\\Proyecto_PrograV3\\src\\main\\resources\\iconos\\musica-alternativa.png")); // NOI18N
        botonMusica.setText("MUSICA");
        botonMusica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMusicaActionPerformed(evt);
            }
        });
        Panel_Fondo.add(botonMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, 40));

        botonVideo.setBackground(new java.awt.Color(0, 102, 102));
        botonVideo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonVideo.setForeground(new java.awt.Color(255, 255, 255));
        botonVideo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue\\OneDrive - Universidad Mariano Gálvez\\4. CUARTO SEMESTRE\\PROGRAMACION II\\Proyecto_PrograV3\\src\\main\\resources\\iconos\\videocamara.png")); // NOI18N
        botonVideo.setText("VIDEO");
        botonVideo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVideoActionPerformed(evt);
            }
        });
        Panel_Fondo.add(botonVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 110, 40));

        botonFotos.setBackground(new java.awt.Color(0, 102, 102));
        botonFotos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonFotos.setForeground(new java.awt.Color(255, 255, 255));
        botonFotos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue\\OneDrive - Universidad Mariano Gálvez\\4. CUARTO SEMESTRE\\PROGRAMACION II\\Proyecto_PrograV3\\src\\main\\resources\\iconos\\FOTOS.png")); // NOI18N
        botonFotos.setText("FOTOS");
        botonFotos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonFotos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFotosActionPerformed(evt);
            }
        });
        Panel_Fondo.add(botonFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 110, 40));

        botonVerTotal.setBackground(new java.awt.Color(0, 102, 102));
        botonVerTotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonVerTotal.setText("VER TOTAL");
        botonVerTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonVerTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerTotalActionPerformed(evt);
            }
        });
        Panel_Fondo.add(botonVerTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Josue\\OneDrive - Universidad Mariano Gálvez\\4. CUARTO SEMESTRE\\PROGRAMACION II\\Proyecto_PrograV3\\src\\main\\resources\\fondos\\paletota.jpg")); // NOI18N
        jLabel3.setInheritsPopupMenu(false);
        Panel_Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -520, 1830, 1640));

        getContentPane().add(Panel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, -1, 670));

        Archivo.setText("Archivo");

        seleccionCarpeta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        seleccionCarpeta.setText("Seleccionar Carpeta");
        seleccionCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionCarpetaActionPerformed(evt);
            }
        });
        Archivo.add(seleccionCarpeta);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        Archivo.add(salir);

        jMenuBar1.add(Archivo);

        menuOrdenarMyV.setText("Ordenar MyV");

        ordenXnombre.setText("Por Nombre A-Z");
        ordenXnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenXnombreActionPerformed(evt);
            }
        });
        menuOrdenarMyV.add(ordenXnombre);

        ordenarXartista.setText("Por Artista A-Z");
        ordenarXartista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXartistaActionPerformed(evt);
            }
        });
        menuOrdenarMyV.add(ordenarXartista);

        ordenarXalbum.setText("Por Álbum A-Z");
        ordenarXalbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXalbumActionPerformed(evt);
            }
        });
        menuOrdenarMyV.add(ordenarXalbum);

        ordenarXgenero.setText("Por Género A-Z");
        ordenarXgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXgeneroActionPerformed(evt);
            }
        });
        menuOrdenarMyV.add(ordenarXgenero);

        ordenarXduracion.setText("Por Duración A-Z");
        ordenarXduracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXduracionActionPerformed(evt);
            }
        });
        menuOrdenarMyV.add(ordenarXduracion);

        ordenarXaño.setText("Por Año A-Z");
        ordenarXaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXañoActionPerformed(evt);
            }
        });
        menuOrdenarMyV.add(ordenarXaño);

        ordenarXtamaño.setText("Por Tamaño A-Z");
        ordenarXtamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarXtamañoActionPerformed(evt);
            }
        });
        menuOrdenarMyV.add(ordenarXtamaño);

        jMenuBar1.add(menuOrdenarMyV);

        menuOrdenarFotos.setText("Ordenar Fotos");

        ordenarFotosXnombre.setText("Por Nombre A-Z");
        ordenarFotosXnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarFotosXnombreActionPerformed(evt);
            }
        });
        menuOrdenarFotos.add(ordenarFotosXnombre);

        ordenarFotosXFecha.setText("Por Fecha Creación");
        ordenarFotosXFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarFotosXFechaActionPerformed(evt);
            }
        });
        menuOrdenarFotos.add(ordenarFotosXFecha);

        ordenarFotosXfechaModif.setText("Por Fecha Modificación");
        ordenarFotosXfechaModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarFotosXfechaModifActionPerformed(evt);
            }
        });
        menuOrdenarFotos.add(ordenarFotosXfechaModif);

        ordenarFotosXtamaño.setText("Por Tamaño");
        ordenarFotosXtamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarFotosXtamañoActionPerformed(evt);
            }
        });
        menuOrdenarFotos.add(ordenarFotosXtamaño);

        ordenarFotosXdispositivo.setText("Por Dispositivo");
        ordenarFotosXdispositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarFotosXdispositivoActionPerformed(evt);
            }
        });
        menuOrdenarFotos.add(ordenarFotosXdispositivo);

        ordenarFotosXmodelo.setText("Por Modelo Disp.");
        ordenarFotosXmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarFotosXmodeloActionPerformed(evt);
            }
        });
        menuOrdenarFotos.add(ordenarFotosXmodelo);

        jMenuBar1.add(menuOrdenarFotos);

        menuVerDuplicados.setText("Ver Duplicados");

        itemVerDuplicadosVideosYMusica.setText("Musica & Videos");
        itemVerDuplicadosVideosYMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerDuplicadosVideosYMusicaActionPerformed(evt);
            }
        });
        menuVerDuplicados.add(itemVerDuplicadosVideosYMusica);

        itemVerDuplicadosFotos.setText("Fotos");
        itemVerDuplicadosFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerDuplicadosFotosActionPerformed(evt);
            }
        });
        menuVerDuplicados.add(itemVerDuplicadosFotos);

        jMenuBar1.add(menuVerDuplicados);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMusicaActionPerformed
        menuOrdenarMyV.setVisible(true);
        menuOrdenarFotos.setVisible(false);

        
       //TABLA FOTOS - OCULTAR
       jScrollPaneFotos.setVisible(false);
       tablaDatosFotos.setVisible(false);
       
       //TABLA MUSICA Y VIDEOS - VER
       jScrollPaneMyV.setVisible(true);
       tablaDatosMyV.setVisible(true);
       
       
       //BOTONES MUSICA - OCULTAR E INACTIVAR ---**
       botonRegresarMusica.setEnabled(true);
       botonReproducirMusica.setEnabled(true);
       botonSiguienteMusica.setEnabled(true);
       botonPausa.setEnabled(true);
       botonRegresarMusica.setVisible(true);
       botonReproducirMusica.setVisible(true);
       botonSiguienteMusica.setVisible(true);
       botonPausa.setVisible(true);
       
       //BOTONES FOTOS - OCULTAR E INACTIVAR
       botonVerImagen.setVisible(false);
       botonVerImagen.setEnabled(false);
               
       //BOTON VIDEO - OCULTAR E INACTIVAR
       botonReproducirVideo.setVisible(false);
       botonReproducirVideo.setEnabled(false);
       
       
    // Verifica si la ruta de acceso está vacía o no ha sido seleccionada   
    if (RutaDeAcceso == null || RutaDeAcceso.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona primero una carpeta.");
        return;
    }
    
    // Crear el modelo de tabla y limpiar cualquier dato previo
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel(); //obtener el modelo de datos de la Jtable
    modeloTabla.setRowCount(0); // Limpiar datos existentes

    // Llamar al método para buscar archivos .mp3
    buscarArchivosMP3(new File(RutaDeAcceso), modeloTabla);
}

private double calcularPesoMP3(File carpeta,int[] cantidad) {
double totalSizeGB = 0.0; // Inicializa el tamaño total en GB

    // Verifica si la ruta es un directorio
    if (carpeta.isDirectory()) {
        // Obtiene una lista de todos los archivos y subdirectorios en la carpeta
        File[] archivos = carpeta.listFiles();
        if (archivos != null) {
            // Recorre cada archivo en la carpeta
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp3")) { // Verifica si es un archivo .mp3
                    // Suma el tamaño del archivo en GB al total
                    totalSizeGB += archivo.length() / (1024.0 * 1024.0 * 1024.0);
                    cantidad[0]++; // Incrementa el contador de archivos .mp3
                } else if (archivo.isDirectory()) {
                    // Llama recursivamente a la misma función para procesar subdirectorios
                    totalSizeGB += calcularPesoMP3(archivo, cantidad);
                }
            }
        }
    }
    return totalSizeGB; // Devuelve el tamaño total en GB
}

private double calcularPesoMP4(File carpeta, int[] cantidad) {
double totalSizeGB = 0.0; // Inicializa el tamaño total en GB

    // Verifica si la ruta es un directorio
    if (carpeta.isDirectory()) {
        // Obtiene una lista de todos los archivos y subdirectorios en la carpeta
        File[] archivos = carpeta.listFiles();
        if (archivos != null) {
            // Recorre cada archivo en la carpeta
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp4")) { // Verifica si es un archivo .mp4
                    // Suma el tamaño del archivo en GB al total
                    totalSizeGB += archivo.length() / (1024.0 * 1024.0 * 1024.0);
                    cantidad[0]++; // Incrementa el contador de archivos .mp4
                } else if (archivo.isDirectory()) {
                    // Llama recursivamente a la misma función para procesar subdirectorios
                    totalSizeGB += calcularPesoMP4(archivo, cantidad);
                }
            }
        }
    }
    return totalSizeGB; // Devuelve el tamaño total en GB
}
    
private double calcularPesoImagenes(File carpeta,int[] cantidad) {
double totalSizeGB = 0.0; // Inicializa el tamaño total en GB

    // Verifica si la ruta es un directorio
    if (carpeta.isDirectory()) {
        // Obtiene una lista de todos los archivos y subdirectorios en la carpeta
        File[] archivos = carpeta.listFiles();
        if (archivos != null) {
            // Recorre cada archivo en la carpeta
            for (File archivo : archivos) {
                // Verifica si el archivo tiene extensión .jpg o .png
                if (archivo.isFile() && (archivo.getName().toLowerCase().endsWith(".jpg") || archivo.getName().toLowerCase().endsWith(".png"))) {
                    // Suma el tamaño del archivo en GB al total
                    totalSizeGB += archivo.length() / (1024.0 * 1024.0 * 1024.0);
                    cantidad[0]++; // Incrementa el contador de archivos de imagen (.jpg, .png)
                } else if (archivo.isDirectory()) {
                    // Llama recursivamente a la misma función para procesar subdirectorios
                    totalSizeGB += calcularPesoImagenes(archivo, cantidad);
                }
            }
        }
    }
    return totalSizeGB; // Devuelve el tamaño total en GB
}


private void buscarArchivosMP3(File directorio, DefaultTableModel modeloTabla) {
    // Obtener la lista de archivos y directorios dentro del directorio proporcionado
    File[] archivos = directorio.listFiles();

    // Verificar que la carpeta no esté vacía
    if (archivos != null) {
        // Recorrer todos los archivos y carpetas
        for (File archivo : archivos) {
            // Si es un directorio, buscar archivos MP3 de manera recursiva
            if (archivo.isDirectory()) {
                buscarArchivosMP3(archivo, modeloTabla);
            } 
            // Si es un archivo MP3, procesarlo
            else if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp3")) {
                try {
                    // Leer el archivo de audio utilizando la librería jaudiotagger (librería externa)
                    AudioFile audioFile = AudioFileIO.read(archivo);
                    
                    // Obtener los metadatos (tags) del archivo
                    Tag tag = audioFile.getTag();

                    // Asignar los valores de los metadatos (o "Desconocido" si no están disponibles)
                    String nombre = archivo.getName();
                    String artista = tag != null ? tag.getFirst(FieldKey.ARTIST) : "Desconocido";
                    String album = tag != null ? tag.getFirst(FieldKey.ALBUM) : "Desconocido";
                    String genero = tag != null ? tag.getFirst(FieldKey.GENRE) : "Desconocido";
                    String duracion = audioFile.getAudioHeader().getTrackLength() + " segundos";
                    String año = tag != null ? tag.getFirst(FieldKey.YEAR) : "Desconocido";
                    
                    double tamañoMB= archivo.length()/(1024.0*1024.0);

                    // Crear una fila de datos para agregarla al modelo de tabla
                    Object[] fila = {
                        nombre,             // Nombre del archivo
                        "mp3",              // Extensión del archivo
                        artista,            // Artista
                        album,              // Álbum
                        genero,             // Género
                        duracion,           // Duración en segundos
                        año,                // Año de publicación
                        archivo.getAbsolutePath(),  // Ruta completa del archivo
                        String.format("%.2f MB", tamañoMB)    // Tamaño del archivo en MB
                    };

                    // Agregar la fila al modelo de la tabla
                    modeloTabla.addRow(fila);
                } catch (Exception e) {
                    // Manejar cualquier error que ocurra al leer los metadatos
                    System.err.println("Error al leer metadatos de " + archivo.getName() + ": " + e.getMessage());
                }
            }
        }
    }
    }//GEN-LAST:event_botonMusicaActionPerformed

public void buscarArchivosMP4(File directorio, DefaultTableModel modeloTabla) {
// Obtener la lista de archivos y directorios dentro del directorio proporcionado
    File[] archivos = directorio.listFiles();

    // Verificar que el directorio no esté vacío
    if (archivos != null) {
        // Recorrer todos los archivos y carpetas
        for (File archivo : archivos) {
            // Si es un directorio, buscar archivos MP4 de manera recursiva
            if (archivo.isDirectory()) {
                buscarArchivosMP4(archivo, modeloTabla);
            } 
            // Si es un archivo MP4, procesarlo
            else if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp4")) {
                // Abrir un FileInputStream para leer el archivo
                try (FileInputStream inputStream = new FileInputStream(archivo)) {
                    // Crear un manejador para manejar el contenido
                    BodyContentHandler handler = new BodyContentHandler();
                    // Crear un objeto Metadata para almacenar los metadatos
                    Metadata metadata = new Metadata();
                    // Crear un parser para detectar el tipo de archivo
                    AutoDetectParser parser = new AutoDetectParser();

                    // Analizar el archivo usando el parser de Tika
                    parser.parse(inputStream, handler, metadata);

                    // Obtener los metadatos necesarios
                    String nombre = archivo.getName();  // Nombre del archivo
                    String extension = "mp4";            // Extensión del archivo
                    // Obtener el artista, o "Desconocido" si no está disponible
                    String artista = metadata.get("xmpDM:artist") != null ? metadata.get("xmpDM:artist") : "Desconocido";
                    // Obtener el álbum, o "Desconocido" si no está disponible
                    String album = metadata.get("xmpDM:album") != null ? metadata.get("xmpDM:album") : "Desconocido";
                    // Obtener el género, o "Desconocido" si no está disponible
                    String genero = metadata.get("xmpDM:genre") != null ? metadata.get("xmpDM:genre") : "Desconocido";
                    // Obtener la duración en segundos, o "Desconocido" si no está disponible
                    String duracion = metadata.get("xmpDM:duration") != null ? 
                        (Double.parseDouble(metadata.get("xmpDM:duration")) / 1000) + " segundos" : "Desconocido";
                    // Obtener el año de lanzamiento, o "Desconocido" si no está disponible
                    String año = metadata.get("xmpDM:releaseDate") != null ? metadata.get("xmpDM:releaseDate") : "Desconocido";
                    String ruta = archivo.getAbsolutePath(); // Ruta completa del archivo
                                       
                    double tamañoMB = archivo.length() / (1024.0 * 1024.0); // Conversión a MB
                    // Al agregar la fila:


                    // Crear una fila con los datos obtenidos
                    Object[] fila = {
                        nombre,        // Nombre del archivo
                        extension,     // Extensión del archivo
                        artista,       // Artista
                        album,         // Álbum
                        genero,        // Género
                        duracion,      // Duración en segundos
                        año,           // Año de publicación
                        ruta,          // Ruta completa del archivo
                        String.format("%.2f MB", tamañoMB)       // Tamaño del archivo en bytes
                    };

                    // Añadir la fila al modelo de la tabla
                    modeloTabla.addRow(fila);
                } catch (IOException | SAXException | org.apache.tika.exception.TikaException e) {
                    // Manejar cualquier error que ocurra al leer los metadatos
                    System.err.println("Error al leer metadatos de " + archivo.getName() + ": " + e.getMessage());
                }
            }
        }
    }
}

public void buscarArchivosImagen(File directorio, DefaultTableModel modeloTabla) {
    File[] archivos = directorio.listFiles();

    if (archivos != null) {
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                buscarArchivosImagen(archivo, modeloTabla);
            } else if (archivo.isFile() && (archivo.getName().toLowerCase().endsWith(".jpg") || archivo.getName().toLowerCase().endsWith(".png"))) {
                try {
                    // Extraer la metadata de la imagen
                    com.drew.metadata.Metadata metadata = ImageMetadataReader.readMetadata(archivo);

                    // Información básica del archivo
                    String nombre = archivo.getName();
                    String extension = nombre.substring(nombre.lastIndexOf(".") + 1);
                    String ruta = archivo.getAbsolutePath();
                    double tamañoMB = archivo.length() / (1024.0 * 1024.0); // Convertir a MB
                    Path filePath = archivo.toPath();
                    BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
                    String fechaCreacion = attr.creationTime().toString();
                    String fechaModificacion = attr.lastModifiedTime().toString();

                    // Información del dispositivo y modelo (si está disponible)
                    String dispositivo = "Desconocido";
                    String modelo = "Desconocido";
                    
                    for (Directory directory : metadata.getDirectories()) {
                        for (com.drew.metadata.Tag tag : directory.getTags()) {
                            // Imprimir todos los metadatos (opcional, para depuración)
                            System.out.println(tag);

                            // Buscar campos específicos
                            if (directory.containsTag(ExifIFD0Directory.TAG_MAKE)) {
                                dispositivo = directory.getString(ExifIFD0Directory.TAG_MAKE); // Marca del dispositivo
                            }
                            if (directory.containsTag(ExifIFD0Directory.TAG_MODEL)) {
                                modelo = directory.getString(ExifIFD0Directory.TAG_MODEL); // Modelo del dispositivo
                            }
                        }
                    }

                    // Crear fila para la tabla
                    Object[] fila = {
                        nombre,
                        extension,
                        ruta,
                        fechaCreacion,
                        fechaModificacion,
                        String.format("%.2f MB", tamañoMB),
                        dispositivo,
                        modelo
                    };

                    // Añadir la fila a la tabla
                    modeloTabla.addRow(fila);

                } catch (ImageProcessingException | IOException e) {
                      e.printStackTrace();
                }
            }
        }
    }
}
    private void textFieldMusicaPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMusicaPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMusicaPesoActionPerformed

    private void seleccionCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionCarpetaActionPerformed
    // Crear un JFileChooser para seleccionar una carpeta
    JFileChooser selectorCarpeta = new JFileChooser();
    selectorCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Solo permite seleccionar directorios

    int resultado = selectorCarpeta.showOpenDialog(this); // Muestra el diálogo para seleccionar una carpeta

      // Verificar si el usuario seleccionó una carpeta
    if (resultado == JFileChooser.APPROVE_OPTION) {
        // Obtener la carpeta seleccionada
        File carpetaSeleccionada = selectorCarpeta.getSelectedFile();
        RutaDeAcceso = carpetaSeleccionada.getAbsolutePath(); // Almacenar la ruta de la carpeta en la variable global
        JOptionPane.showMessageDialog(this, "Carpeta seleccionada: " + RutaDeAcceso);
    } else {
        JOptionPane.showMessageDialog(this, "No se seleccionó ninguna carpeta.");
        return;
    }

    // Declarar contadores para la cantidad de archivos de cada tipo
    int[] cantidadMP3 = {0};
    int[] cantidadMP4 = {0};
    int[] cantidadImagenes = {0};

    // Calcular el peso y la cantidad de archivos de cada tipo
    double totalSizeGBMP3 = calcularPesoMP3(new File(RutaDeAcceso), cantidadMP3);
    double totalSizeGBMP4 = calcularPesoMP4(new File(RutaDeAcceso), cantidadMP4);
    double totalSizeGBImagenes = calcularPesoImagenes(new File(RutaDeAcceso), cantidadImagenes);

    // Mostrar el tamaño total en los JTextFields correspondientes
    textFieldMusicaPeso.setText(String.format("%.2f GB", totalSizeGBMP3));
    textFieldVideoPeso.setText(String.format("%.2f GB", totalSizeGBMP4));
    textFieldFotosPeso.setText(String.format("%.2f GB", totalSizeGBImagenes));

    // Calcular y mostrar el peso total de todos los archivos
    double totalSizeGBTotal = totalSizeGBMP3 + totalSizeGBMP4 + totalSizeGBImagenes;
    textFieldPesoTotal.setText(String.format("%.2f GB", totalSizeGBTotal));

    // Mostrar la cantidad de archivos en los JTextFields correspondientes
    textFieldMusicaCantidad.setText(String.valueOf(cantidadMP3[0]));
    textFieldVideoCantidad.setText(String.valueOf(cantidadMP4[0]));
    textFieldFotosCantidad.setText(String.valueOf(cantidadImagenes[0]));

    // Mostrar la cantidad total de archivos en el JTextField
    int cantidadTotal = cantidadMP3[0] + cantidadMP4[0] + cantidadImagenes[0];
    textFieldCantidadTotal.setText(String.valueOf(cantidadTotal));
    }//GEN-LAST:event_seleccionCarpetaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
       

    private void botonReproducirMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReproducirMusicaActionPerformed

        // Obtener el índice de la fila seleccionada en el JTable
        int filaSeleccionada = tablaDatosMyV.getSelectedRow();

        // Verificar si hay una fila seleccionada
        if (filaSeleccionada != -1) {
            // Obtener la ruta del archivo de la columna correspondiente
            String rutaArchivo = (String) tablaDatosMyV.getValueAt(filaSeleccionada, 7); //Ruta está en la columna 7, (índice basado en 0)

            // Comprobar si es un archivo .mp3
            if (rutaArchivo.toLowerCase().endsWith(".mp3")) {
                try {
                    // Si hay un reproductor en uso, detenerlo
                    if (reproductorActual != null) {
                        reproductorActual.close(); // Detener el reproductor anterior
                    }

                    // Crear un nuevo reproductor
                    FileInputStream fis = new FileInputStream(rutaArchivo);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    reproductorActual = new Player(bis); // Nueva instancia del reproductor

                    // Ejecutar el reproductor en un hilo separado para no bloquear la interfaz gráfica
                    new Thread(() -> {
                        try {
                            reproductorActual.play(); // Reproducir la canción
                        } catch (Exception e) {
                            System.out.println("Error al reproducir el archivo: " + e.getMessage());
                        }
                    }).start();
                } catch (Exception e) {
                    // Mostrar mensaje de error si hay un problema al crear o reproducir el reproductor
                    JOptionPane.showMessageDialog(this, "Error al reproducir la canción: " + e.getMessage());
                }
            } else {
                // Mostrar mensaje si el archivo no es compatible
                JOptionPane.showMessageDialog(this, "El archivo seleccionado no es un archivo de audio compatible.");
            }
        } else {
             // Mensaje si no se seleccionó ninguna canción
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una canción de la lista.");
        }

    }//GEN-LAST:event_botonReproducirMusicaActionPerformed

    private void botonSiguienteMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteMusicaActionPerformed
     // Obtener el índice de la fila seleccionada en el JTable
    int filaSeleccionada = tablaDatosMyV.getSelectedRow();

    // Verificar si hay una fila seleccionada
    if (filaSeleccionada != -1) {
        // Calcular el índice de la siguiente canción
        int siguienteIndice = filaSeleccionada + 1;

        // Verificar si el siguiente índice está dentro del rango
        if (siguienteIndice < tablaDatosMyV.getRowCount()) {
            // Seleccionar la siguiente canción
            tablaDatosMyV.setRowSelectionInterval(siguienteIndice, siguienteIndice);
            String rutaArchivo = (String) tablaDatosMyV.getValueAt(siguienteIndice, 7); // Asumiendo que la ruta está en la columna 7

            // Comprobar si es un archivo .mp3
            if (rutaArchivo.toLowerCase().endsWith(".mp3")) {
                try {
                    // Si hay un reproductor en uso, detenerlo
                    if (reproductorActual != null) {
                        reproductorActual.close(); // Detener el reproductor anterior
                    }

                    // Crear un nuevo reproductor para la siguiente canción
                    FileInputStream fis = new FileInputStream(rutaArchivo);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    reproductorActual = new Player(bis); // Nueva instancia del reproductor

                    // Ejecutar el reproductor en un hilo separado para no bloquear la interfaz gráfica
                    new Thread(() -> {
                        try {
                            reproductorActual.play(); // Reproducir la canción
                        } catch (Exception e) {
                            System.out.println("Error al reproducir el archivo: " + e.getMessage());
                        }
                    }).start();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al reproducir la canción: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "El archivo seleccionado no es un archivo de audio compatible.");
            }
        } else {
            // Si ya está en la última canción, mostrar un mensaje
            JOptionPane.showMessageDialog(this, "Ya estás en la última canción.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una canción de la lista primero.");
    }
    }//GEN-LAST:event_botonSiguienteMusicaActionPerformed

    private void botonRegresarMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarMusicaActionPerformed
    // Obtener el índice de la fila seleccionada en el JTable
    int filaSeleccionada = tablaDatosMyV.getSelectedRow();

    // Verificar si hay una fila seleccionada
    if (filaSeleccionada != -1) {
        // Calcular el índice de la canción anterior
        int anteriorIndice = filaSeleccionada - 1;

        // Verificar si el índice anterior está dentro del rango
        if (anteriorIndice >= 0) {
            // Seleccionar la canción anterior
            tablaDatosMyV.setRowSelectionInterval(anteriorIndice, anteriorIndice);
            String rutaArchivo = (String) tablaDatosMyV.getValueAt(anteriorIndice, 7); // Asumiendo que la ruta está en la columna 7

            // Comprobar si es un archivo .mp3
            if (rutaArchivo.toLowerCase().endsWith(".mp3")) {
                try {
                    // Si hay un reproductor en uso, detenerlo
                    if (reproductorActual != null) {
                        reproductorActual.close(); // Detener el reproductor anterior
                    }

                    // Crear un nuevo reproductor para la canción anterior
                    FileInputStream fis = new FileInputStream(rutaArchivo);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    reproductorActual = new Player(bis); // Nueva instancia del reproductor

                    // Ejecutar el reproductor en un hilo separado para no bloquear la interfaz gráfica
                    new Thread(() -> {
                        try {
                            reproductorActual.play(); // Reproducir la canción
                        } catch (Exception e) {
                            System.out.println("Error al reproducir el archivo: " + e.getMessage());
                        }
                    }).start();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error al reproducir la canción: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "El archivo seleccionado no es un archivo de audio compatible.");
            }
        } else {
            // Si ya estás en la primera canción, mostrar un mensaje
            JOptionPane.showMessageDialog(this, "Ya estás en la primera canción.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una canción de la lista primero.");
    }  
    }//GEN-LAST:event_botonRegresarMusicaActionPerformed

    private void textFieldFotosPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFotosPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFotosPesoActionPerformed

    private void Panel_FondoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Panel_FondoComponentShown
    }//GEN-LAST:event_Panel_FondoComponentShown

    private void botonFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFotosActionPerformed
        menuOrdenarMyV.setVisible(false);
        menuOrdenarFotos.setVisible(true);
        
    // Verificar si el reproductor actual no es null y está en uso antes de cerrarlo
    if (reproductorActual != null) {
        reproductorActual.close(); // Detiene el reproductor si está activo
        reproductorActual = null; // Lo resetea a null después de cerrarlo
    }

    // Verificar si la ruta de acceso está vacía
    if (RutaDeAcceso == null || RutaDeAcceso.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona primero una carpeta.");
        return;
    }
        
       jScrollPaneFotos.setVisible(true);
       tablaDatosFotos.setVisible(true);
       
       jScrollPaneMyV.setVisible(false);
       tablaDatosMyV.setVisible(false);
       botonRegresarMusica.setEnabled(false);
       botonReproducirMusica.setEnabled(false);
       botonSiguienteMusica.setEnabled(false);
       botonPausa.setEnabled(false);
       botonRegresarMusica.setVisible(false);
       botonReproducirMusica.setVisible(false);
       botonSiguienteMusica.setVisible(false);
       botonPausa.setVisible(false);
       botonVerImagen.setVisible(true);
       botonVerImagen.setEnabled(true);
       botonReproducirVideo.setVisible(false);
       botonReproducirVideo.setEnabled(false);
       
    // Crear el modelo de tabla para las imágenes y limpiar los datos previos
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();
    modeloTabla.setRowCount(0); // Limpiar datos existentes

    // Llamar al método para buscar imágenes
    File directorioSeleccionado = new File(RutaDeAcceso);
      buscarArchivosImagen(directorioSeleccionado, modeloTabla);
       
       
       
    }//GEN-LAST:event_botonFotosActionPerformed

    private void botonVerDuplicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDuplicadosActionPerformed
        if (reproductorActual != null) {
        reproductorActual.close(); 
        }
        ventanaDuplicados duplicados = new ventanaDuplicados(this); 
        duplicados.setVisible(true); // Muestra la ventana de duplicados
        this.setVisible(false); // Oculta la ventana principal
    }//GEN-LAST:event_botonVerDuplicadosActionPerformed

    private void botonVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVideoActionPerformed
        menuOrdenarMyV.setVisible(true);
        menuOrdenarFotos.setVisible(false);
// Cerrar el reproductor actual antes de cambiar a la sección de video
    if (reproductorActual != null) {
        reproductorActual.close(); 
    }

    // Verificar si la ruta de acceso está vacía
    if (RutaDeAcceso == null || RutaDeAcceso.isEmpty()) {
        // Mostrar un mensaje de advertencia si no se ha seleccionado ninguna carpeta
        JOptionPane.showMessageDialog(this, "Por favor, selecciona primero una carpeta.");
        return; // Terminar la ejecución si no hay carpeta seleccionada
    }

    // OCULTAR TABLA DATOS FOTOS
    jScrollPaneFotos.setVisible(false); 
    tablaDatosFotos.setVisible(false);  
    
    // MOSTRAR TABLA DE VIDEOS Y MUSICA
    jScrollPaneMyV.setVisible(true);    
    tablaDatosMyV.setVisible(true);     

    // Ocultar botones de música
    botonRegresarMusica.setVisible(false); 
    botonReproducirMusica.setVisible(false); 
    botonSiguienteMusica.setVisible(false); 
    
    // Ocultar botones de fotos
    botonPausa.setVisible(false);          
    botonVerImagen.setVisible(false);      

    
    // Mostrar y habilitar el botón de reproducir video
    botonReproducirVideo.setVisible(true); 
    botonReproducirVideo.setEnabled(true); 

    // Crear el modelo de tabla para la sección de videos y limpiar datos previos
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    modeloTabla.setRowCount(0); // Limpiar datos existentes en la tabla de videos

    // Llamar al método para buscar archivos .mp4 en la carpeta seleccionada
    buscarArchivosMP4(new File(RutaDeAcceso), modeloTabla); // Iniciar búsqueda de archivos MP4
    }//GEN-LAST:event_botonVideoActionPerformed

    private void jTextFieldBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusquedaActionPerformed
    


    
    private void botonPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPausaActionPerformed
// Comprobar si el reproductor está activo
    if (reproductorActual != null) {
        try {
            if (enPausa) {
                // Si está en pausa, continuar la reproducción
                reproductorActual.play(); // Reanudar la reproducción
                enPausa = false; // Actualizar el estado a "no en pausa"
            } else {
                // Si no está en pausa, pausar la reproducción
                reproductorActual.close(); // Detener el reproductor (esto simula la pausa)
                enPausa = true; // Actualizar el estado a "en pausa"
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al pausar o continuar la canción: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "No hay canción reproduciéndose.");
    }
    }//GEN-LAST:event_botonPausaActionPerformed

    private void textFieldVideoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldVideoPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldVideoPesoActionPerformed

    private void botonReproducirVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReproducirVideoActionPerformed
    int filaSeleccionada = tablaDatosMyV.getSelectedRow();
    if (filaSeleccionada != -1) {
        String rutaArchivo = (String) tablaDatosMyV.getValueAt(filaSeleccionada, 7); // Asumiendo que la ruta está en la columna 7
        
        // Crear una instancia de JFrameVideos y pasar la referencia de ventanaPrincipal
        JFrameVideos ventanaVideos = new JFrameVideos(this); // Asegúrate de pasar la instancia actual
        ventanaVideos.metodPlayVideo(rutaArchivo); // Llamar al método para reproducir el video
        ventanaVideos.setVisible(true); // Mostrar la ventana
        this.setVisible(false); // Ocultar la ventana principal
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un video de la lista.");
    }
    }//GEN-LAST:event_botonReproducirVideoActionPerformed

    private void botonVerImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerImagenActionPerformed
  // Obtener la fila seleccionada
    int filaSeleccionada = tablaDatosFotos.getSelectedRow();
    if (filaSeleccionada != -1) { // Verificar si hay una fila seleccionada
        // Obtener la ruta de la imagen desde la columna correspondiente
        String rutaImagen = tablaDatosFotos.getValueAt(filaSeleccionada, 2).toString(); //Se encuentra en la columna 2 la ruta
        
        // Crear el ImageIcon original
        ImageIcon imagenOriginal = new ImageIcon(rutaImagen);
        
        // Escalar la imagen al tamaño deseado
        int ancho = 900; // Ancho fijo
        int alto = 668;  // Alto fijo
        Image imagenEscalada = imagenOriginal.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        
        // Crear un nuevo ImageIcon a partir de la imagen escalada
        ImageIcon iconoImagenEscalada = new ImageIcon(imagenEscalada);
        
        // Abrir el JFrameFotos y pasarle la instancia de ventanaPrincipal
        JFrameFotos ventanaFotos = new JFrameFotos(this); 
        ventanaFotos.setImageIcon(iconoImagenEscalada); // Configura la imagen escalada en el JLabel
        ventanaFotos.setVisible(true); // Muestra la ventana de fotos
        this.setVisible(false); // Oculta la ventana principal
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila.");
    }
    }//GEN-LAST:event_botonVerImagenActionPerformed

   
    
    private void textFieldTotalCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTotalCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTotalCantidadActionPerformed

    private void tamañoDuplicadosImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoDuplicadosImagenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañoDuplicadosImagenesActionPerformed

    private void tamañoDuplicadosMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoDuplicadosMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañoDuplicadosMusicaActionPerformed

    private void cantidadDuplicadosMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDuplicadosMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadDuplicadosMusicaActionPerformed

    private void cantidadDuplicadosVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDuplicadosVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadDuplicadosVideoActionPerformed

    private void cantidadDuplicadosImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDuplicadosImagenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadDuplicadosImagenesActionPerformed

    private void textFieldMusicaCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMusicaCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMusicaCantidadActionPerformed

    private void textFieldVideoCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldVideoCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldVideoCantidadActionPerformed

    private void textFieldFotosCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFotosCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFotosCantidadActionPerformed

    private void ordenXnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenXnombreActionPerformed
    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // Establecer el criterio de ordenación en la columna de "Nombre" (índice 0)
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(0, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenXnombreActionPerformed

    private void ordenarXartistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXartistaActionPerformed
          // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "Artista Indice 2"
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(2, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXartistaActionPerformed

    private void ordenarXalbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXalbumActionPerformed
         // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "Album Indice 3"
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(3, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXalbumActionPerformed

    private void ordenarXgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXgeneroActionPerformed
    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "Genero Indice 4"
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(4, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXgeneroActionPerformed

    private void ordenarXduracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXduracionActionPerformed
    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "duracion Indice 5"
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(5, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXduracionActionPerformed

    private void ordenarXañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXañoActionPerformed
        // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "Año Indice 6"
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(6, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXañoActionPerformed

    private void ordenarXtamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarXtamañoActionPerformed
    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosMyV.setRowSorter(sorter);
    
    // "Tamaño Indice 8 "
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(8, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    }//GEN-LAST:event_ordenarXtamañoActionPerformed

    private void ordenarFotosXnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarFotosXnombreActionPerformed
    // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosFotos.setRowSorter(sorter);
    
    // Establecer el criterio de ordenación en la columna
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(0, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
       
    }//GEN-LAST:event_ordenarFotosXnombreActionPerformed

    private void ordenarFotosXFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarFotosXFechaActionPerformed
         // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosFotos.setRowSorter(sorter);
    
    // Establecer el criterio de ordenación en la columna
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(3, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
     
    }//GEN-LAST:event_ordenarFotosXFechaActionPerformed

    private void ordenarFotosXfechaModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarFotosXfechaModifActionPerformed
         // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosFotos.setRowSorter(sorter);
    
    // Establecer el criterio de ordenación en la columna
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(4, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
     
    }//GEN-LAST:event_ordenarFotosXfechaModifActionPerformed

    private void ordenarFotosXtamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarFotosXtamañoActionPerformed
         // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosFotos.setRowSorter(sorter);
    
    // Establecer el criterio de ordenación en la columna
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(5, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    
    }//GEN-LAST:event_ordenarFotosXtamañoActionPerformed

    private void ordenarFotosXdispositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarFotosXdispositivoActionPerformed
             // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosFotos.setRowSorter(sorter);
    
    // Establecer el criterio de ordenación en la columna
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(6, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    
    }//GEN-LAST:event_ordenarFotosXdispositivoActionPerformed

    private void ordenarFotosXmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarFotosXmodeloActionPerformed
              // Obtener el modelo de la tabla
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();
    
    // Crear un TableRowSorter para el modelo
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
    
    // Configurar el sorter en la tabla correspondiente
    tablaDatosFotos.setRowSorter(sorter);
    
    // Establecer el criterio de ordenación en la columna
    sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(7, SortOrder.ASCENDING)));
    
    // Ordenar la tabla
    sorter.sort();
    
    }//GEN-LAST:event_ordenarFotosXmodeloActionPerformed

    private String obtenerNombreBase(String nombreArchivo) {
    // Expresión regular para detectar "(n)", "- copia", "- Copy" o similares al final del nombre, y extensiones .mp3, .mp4, .jpg, y .png
    String regex = "^(.*?)(\\s*(\\(\\d+\\)|-\\s*[Cc]opia|-\\s*[Cc]opy))?\\s*(\\.mp3|\\.mp4|\\.jpg|\\.png)?$";
    
    /* Explicación detallada de la expresión regular:
       ^(.*?):         Captura el nombre principal del archivo de forma no codiciosa (.*?), sin incluir ningún sufijo o extensión.
       (\\s*(\\(\\d+\\)|-\\s*[Cc]opia|-\\s*[Cc]opy))?:   Esta es la parte que captura y omite los sufijos:
                         \\s*:       Permite un espacio opcional antes del sufijo.
                         (\\(\\d+\\)):   Detecta números entre paréntesis, como (1), (2), etc.
                         |-\\s*[Cc]opia y |-\\s*[Cc]opy:   Detecta sufijos "- copia" o "- Copy", sin distinguir mayúsculas o minúsculas en la palabra.
       (\\.mp3|\\.mp4|\\.jpg|\\.png)?$:   Detecta extensiones al final del nombre (.mp3, .mp4, .jpg, .png) si están presentes.
       
       Al usar matcher.group(1).trim(), el método extrae el nombre principal del archivo sin sufijos ni extensiones.
       Si no hay coincidencia, el método devuelve el nombre original del archivo.
    */
    
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(nombreArchivo);
    
    if (matcher.matches()) {
        // Retorna solo el grupo sin el número en paréntesis o sufijo
        return matcher.group(1).trim();
    }
    
    return nombreArchivo;
}
    
    private List<Object[]> buscarDuplicados(DefaultTableModel modeloTabla) {
    List<Object[]> duplicados = new ArrayList<>();
    Set<String> nombresEncontrados = new HashSet<>();
    Set<String> nombresDuplicados = new HashSet<>();

    for (int i = 0; i < modeloTabla.getRowCount(); i++) {
        String nombreArchivoOriginal = modeloTabla.getValueAt(i, 0).toString();
        String nombreArchivo = obtenerNombreBase(nombreArchivoOriginal); // Obtener nombre base

        if (nombresEncontrados.contains(nombreArchivo)) {
            nombresDuplicados.add(nombreArchivo);
        } else {
            nombresEncontrados.add(nombreArchivo);
        }
    }

    for (int i = 0; i < modeloTabla.getRowCount(); i++) {
        String nombreArchivoOriginal = modeloTabla.getValueAt(i, 0).toString();
        String nombreArchivo = obtenerNombreBase(nombreArchivoOriginal);

        if (nombresDuplicados.contains(nombreArchivo)) {
            Object[] fila = new Object[modeloTabla.getColumnCount()];
            for (int j = 0; j < modeloTabla.getColumnCount(); j++) {
                fila[j] = modeloTabla.getValueAt(i, j);
            }
            duplicados.add(fila);
        }
    }

    return duplicados;
}

    /*
private void sumarTamañoArchivos(DefaultTableModel modeloTabla, int columnaTamaño, int columnaExtension, JTextField textFieldTamañoTotal) {
    double tamañoTotalMB = 0;
    List<String> extensionesPermitidas = Arrays.asList("mp3", "mp4", "jpg", "png");

    for (int i = 0; i < modeloTabla.getRowCount(); i++) {
        // Verifica si la extensión está en la lista de extensiones permitidas
        String extension = ((String) modeloTabla.getValueAt(i, columnaExtension)).toLowerCase();

        if (extensionesPermitidas.contains(extension)) {
            Object valor = modeloTabla.getValueAt(i, columnaTamaño);

            if (valor instanceof String) {
                // Eliminar " MB" y convertir a double
                String tamañoStr = ((String) valor).replace(" MB", "").trim();
                
                try {
                    tamañoTotalMB += Double.parseDouble(tamañoStr);
                } catch (NumberFormatException e) {
                    System.err.println("Error al convertir el tamaño: " + e.getMessage());
                }
            } else if (valor instanceof Long) {
                // Convertir de bytes a MB y sumar
                tamañoTotalMB += (Long) valor / (1024.0 * 1024.0);
            }
        }
    }
    
    // Mostrar el tamaño total en MB en el JTextField
    textFieldTamañoTotal.setText(String.format("%.2f MB", tamañoTotalMB));
}*/

    
    private void sumarTamañoArchivos(DefaultTableModel modeloTabla, int columnaTamaño, int columnaExtension, JTextField textFieldTamañoTotal, String extensionFiltrada) {
    double tamañoTotalMB = 0;

    for (int i = 0; i < modeloTabla.getRowCount(); i++) {
        // Obtén la extensión del archivo y verifica si coincide con la extensión especificada
        String extension = ((String) modeloTabla.getValueAt(i, columnaExtension)).toLowerCase();

        if (extension.equals(extensionFiltrada)) {
            Object valorTamaño = modeloTabla.getValueAt(i, columnaTamaño);

            // Verifica y convierte el valor de tamaño
            if (valorTamaño instanceof String) {
                String tamañoStr = ((String) valorTamaño).replace(" MB", "").trim();
                try {
                    tamañoTotalMB += Double.parseDouble(tamañoStr);
                } catch (NumberFormatException e) {
                    System.err.println("Error al convertir el tamaño: " + e.getMessage());
                }
            } else if (valorTamaño instanceof Long) {
                tamañoTotalMB += (Long) valorTamaño / (1024.0 * 1024.0); // Convierte bytes a MB
            }
        }
    }
    
    // Actualiza el JTextField solo si el tamaño total es mayor a 0
    if (tamañoTotalMB > 0) {
        textFieldTamañoTotal.setText(String.format("%.2f MB", tamañoTotalMB));
    }
}
    
private void contarFilas(DefaultTableModel modeloTabla, int columnaExtension, JTextField textFieldCantidad, String extensionFiltrada) {
    int cantidadFilas = 0;

    for (int i = 0; i < modeloTabla.getRowCount(); i++) {
        // Obtén la extensión del archivo y verifica si coincide con la extensión especificada
        String extension = ((String) modeloTabla.getValueAt(i, columnaExtension)).toLowerCase();

        if (extension.equals(extensionFiltrada)) {
            cantidadFilas++; // Cuenta solo si la extensión coincide
        }
    }
    if (cantidadFilas > 0) {
        textFieldCantidad.setText(String.valueOf(cantidadFilas));
    }
}
    
    private void itemVerDuplicadosVideosYMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerDuplicadosVideosYMusicaActionPerformed
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    
    List<Object[]> filasDuplicadas = buscarDuplicados(modeloTabla);
    
    modeloTabla.setRowCount(0);
    
    for (Object[] fila : filasDuplicadas) {
        modeloTabla.addRow(fila); // Volver a agregar cada fila duplicada
    }
    
    //VIDEOS
    // Llama a los métodos para mostrar la cantidad de filas y tamaño total en JTextFields
    contarFilas(modeloTabla, 1,cantidadDuplicadosVideo,"mp4"); // Reemplaza por el JTextField adecuado
   sumarTamañoArchivos(modeloTabla, 8, 1, tamañoDuplicadosVideo, "mp4"); // Columna 8 para el tamaño, columna 1 para la extensión
   
   //MUSICA
   contarFilas(modeloTabla, 1,cantidadDuplicadosMusica,"mp3"); // Reemplaza por el JTextField adecuado
    sumarTamañoArchivos(modeloTabla, 8, 1, tamañoDuplicadosMusica, "mp3"); // Columna 8 para el tamaño, columna 1 para la extensión
    
    if (filasDuplicadas.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontraron archivos duplicados.");
    }
    }//GEN-LAST:event_itemVerDuplicadosVideosYMusicaActionPerformed

    private void itemVerDuplicadosFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerDuplicadosFotosActionPerformed
       DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();
    
    List<Object[]> filasDuplicadas = buscarDuplicados(modeloTabla);
    
    modeloTabla.setRowCount(0);
    
    for (Object[] fila : filasDuplicadas) {
        modeloTabla.addRow(fila); // Volver a agregar cada fila duplicada
    }
    
    // Llama a los métodos para mostrar la cantidad de filas y tamaño total en JTextFields
    contarFilas(modeloTabla,1, cantidadDuplicadosImagenes,"jpg"); // Reemplaza por el JTextField adecuado
    sumarTamañoArchivos(modeloTabla, 5, 1,tamañoDuplicadosImagenes,"jpg"); // Columna 8 para el tamaño, JTextField correspondiente
    
    if (filasDuplicadas.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontraron archivos duplicados.");
    }
    }//GEN-LAST:event_itemVerDuplicadosFotosActionPerformed

    private void botonVerTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerTotalActionPerformed
    try {
        // Convertir las cantidades en los JTextFields a double
        double cantidadMusica = Double.parseDouble(cantidadDuplicadosMusica.getText());
        double cantidadVideos = Double.parseDouble(cantidadDuplicadosVideo.getText());
        double cantidadFotos = Double.parseDouble(cantidadDuplicadosImagenes.getText());
        double totalCantidad = cantidadMusica + cantidadVideos + cantidadFotos;
        
        // Eliminar " MB" de los JTextFields de tamaño de duplicados antes de la conversión
        double duplicadosMusica = Double.parseDouble(tamañoDuplicadosMusica.getText().replace(" MB", "").trim());
        double duplicadosVideo = Double.parseDouble(tamañoDuplicadosVideo.getText().replace(" MB", "").trim());
        double duplicadosFotos = Double.parseDouble(tamañoDuplicadosImagenes.getText().replace(" MB", "").trim());
        double totalDuplicadosMB = duplicadosMusica + duplicadosVideo + duplicadosFotos;

        textFieldTotalCantidad.setText(String.format("%.2f", totalCantidad)); // Cantidad total de archivos
        textFieldTotalDuplicados.setText(String.format("%.2f MB", totalDuplicadosMB)); // Tamaño total de duplicados en MB
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error al convertir valores: Verifique el contenido de los campos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_botonVerTotalActionPerformed


    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JPanel PanelBarraBotones;
    private javax.swing.JPanel Panel_Fondo;
    private javax.swing.JButton botonFotos;
    private javax.swing.JButton botonMusica;
    private javax.swing.JButton botonPausa;
    private javax.swing.JButton botonRegresarMusica;
    private javax.swing.JButton botonReproducirMusica;
    private javax.swing.JButton botonReproducirVideo;
    private javax.swing.JButton botonSiguienteMusica;
    private javax.swing.JButton botonVerDuplicados;
    private javax.swing.JButton botonVerImagen;
    private javax.swing.JButton botonVerTotal;
    private javax.swing.JButton botonVideo;
    private javax.swing.JTextField cantidadDuplicadosImagenes;
    private javax.swing.JTextField cantidadDuplicadosMusica;
    private javax.swing.JTextField cantidadDuplicadosVideo;
    private javax.swing.JMenuItem itemVerDuplicadosFotos;
    private javax.swing.JMenuItem itemVerDuplicadosVideosYMusica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPaneFotos;
    private javax.swing.JScrollPane jScrollPaneMyV;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JMenu menuOrdenarFotos;
    private javax.swing.JMenu menuOrdenarMyV;
    private javax.swing.JMenu menuVerDuplicados;
    private javax.swing.JMenuItem ordenXnombre;
    private javax.swing.JMenuItem ordenarFotosXFecha;
    private javax.swing.JMenuItem ordenarFotosXdispositivo;
    private javax.swing.JMenuItem ordenarFotosXfechaModif;
    private javax.swing.JMenuItem ordenarFotosXmodelo;
    private javax.swing.JMenuItem ordenarFotosXnombre;
    private javax.swing.JMenuItem ordenarFotosXtamaño;
    private javax.swing.JMenuItem ordenarXalbum;
    private javax.swing.JMenuItem ordenarXartista;
    private javax.swing.JMenuItem ordenarXaño;
    private javax.swing.JMenuItem ordenarXduracion;
    private javax.swing.JMenuItem ordenarXgenero;
    private javax.swing.JMenuItem ordenarXtamaño;
    private javax.swing.JPanel panelAlmacenamiento;
    private javax.swing.JPanel panelAlmacenamientoDuplicados;
    private javax.swing.JPanel panelTablas;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem seleccionCarpeta;
    private javax.swing.JTable tablaDatosFotos;
    private javax.swing.JTable tablaDatosMyV;
    private javax.swing.JTextField tamañoDuplicadosImagenes;
    private javax.swing.JTextField tamañoDuplicadosMusica;
    private javax.swing.JTextField tamañoDuplicadosVideo;
    private javax.swing.JTextField textFieldCantidadTotal;
    private javax.swing.JTextField textFieldFotosCantidad;
    private javax.swing.JTextField textFieldFotosPeso;
    private javax.swing.JTextField textFieldMusicaCantidad;
    private javax.swing.JTextField textFieldMusicaPeso;
    private javax.swing.JTextField textFieldPesoTotal;
    private javax.swing.JTextField textFieldTotalCantidad;
    private javax.swing.JTextField textFieldTotalDuplicados;
    private javax.swing.JTextField textFieldVideoCantidad;
    private javax.swing.JTextField textFieldVideoPeso;
    // End of variables declaration//GEN-END:variables



}

