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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import javax.swing.ImageIcon;
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
    botonRegresarImagen.setVisible(false);
    botonVerImagen.setVisible(false);
    botonSiguienteImagen.setVisible(false);
    botonRegresarMusica.setVisible(false);
    botonReproducirMusica.setVisible(false);
    botonSiguienteMusica.setVisible(false);
    botonPausa.setVisible(false);
    botonReproducirVideo.setVisible(false);        
    }

    public Player getReproductorActual() {
        return reproductorActual;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Fondo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldMusica = new javax.swing.JTextField();
        textFieldVideo = new javax.swing.JTextField();
        textFieldTotal = new javax.swing.JTextField();
        textFieldFotos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonRegresarMusica = new javax.swing.JButton();
        botonReproducirMusica = new javax.swing.JButton();
        botonSiguienteMusica = new javax.swing.JButton();
        botonPausa = new javax.swing.JButton();
        botonRegresarImagen = new javax.swing.JButton();
        botonVerImagen = new javax.swing.JButton();
        botonSiguienteImagen = new javax.swing.JButton();
        botonReproducirVideo = new javax.swing.JButton();
        panelTablas = new javax.swing.JPanel();
        jScrollPaneMyV = new javax.swing.JScrollPane();
        tablaDatosMyV = new javax.swing.JTable();
        jScrollPaneFotos = new javax.swing.JScrollPane();
        tablaDatosFotos = new javax.swing.JTable();
        botonMusica = new javax.swing.JButton();
        botonVideo = new javax.swing.JButton();
        botonFotos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonAdmin = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        seleccionCarpeta = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();

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

        jPanel3.setBackground(new java.awt.Color(68, 169, 169));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Imágenes:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 80, -1));

        textFieldMusica.setEditable(false);
        textFieldMusica.setBackground(new java.awt.Color(0, 0, 0));
        textFieldMusica.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldMusica.setForeground(new java.awt.Color(255, 255, 255));
        textFieldMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMusicaActionPerformed(evt);
            }
        });
        jPanel3.add(textFieldMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 100, 30));

        textFieldVideo.setEditable(false);
        textFieldVideo.setBackground(new java.awt.Color(0, 0, 0));
        textFieldVideo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldVideo.setForeground(new java.awt.Color(255, 255, 255));
        textFieldVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldVideoActionPerformed(evt);
            }
        });
        jPanel3.add(textFieldVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, 30));

        textFieldTotal.setEditable(false);
        textFieldTotal.setBackground(new java.awt.Color(0, 0, 0));
        textFieldTotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldTotal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(textFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 99, -1));

        textFieldFotos.setEditable(false);
        textFieldFotos.setBackground(new java.awt.Color(0, 0, 0));
        textFieldFotos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        textFieldFotos.setForeground(new java.awt.Color(255, 255, 255));
        textFieldFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFotosActionPerformed(evt);
            }
        });
        jPanel3.add(textFieldFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 99, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ALMACENAMIENTO");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 20));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Musica:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Video:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 60, -1));

        Panel_Fondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 50, 220, 210));

        jPanel2.setBackground(new java.awt.Color(68, 169, 169));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(botonRegresarMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

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
        jPanel2.add(botonReproducirMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 40));

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
        jPanel2.add(botonSiguienteMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 40, 40));

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
        jPanel2.add(botonPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 50, 40));

        botonRegresarImagen.setBackground(new java.awt.Color(0, 102, 102));
        botonRegresarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/angulo-doble-izquierda.png"))); // NOI18N
        botonRegresarImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegresarImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresarImagen.setEnabled(false);
        jPanel2.add(botonRegresarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, 40));

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
        jPanel2.add(botonVerImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 60, 40));

        botonSiguienteImagen.setBackground(new java.awt.Color(0, 102, 102));
        botonSiguienteImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/un-paso-adelante.png"))); // NOI18N
        botonSiguienteImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSiguienteImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSiguienteImagen.setEnabled(false);
        botonSiguienteImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteImagenActionPerformed(evt);
            }
        });
        jPanel2.add(botonSiguienteImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 60, 40));

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
        jPanel2.add(botonReproducirVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 40));

        Panel_Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 630, 880, 40));

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
                false, true, true, true, true, true, true, true, true
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
            tablaDatosMyV.getColumnModel().getColumn(0).setMinWidth(400);
            tablaDatosMyV.getColumnModel().getColumn(0).setMaxWidth(400);
        }

        panelTablas.add(jScrollPaneMyV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 230));

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

        panelTablas.add(jScrollPaneFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 230));

        Panel_Fondo.add(panelTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 880, 250));

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
        Panel_Fondo.add(botonMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, -1));

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
        Panel_Fondo.add(botonVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 40));

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
        Panel_Fondo.add(botonFotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 40));

        jTextPane1.setBackground(new java.awt.Color(0, 102, 102));
        jTextPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPane1.setContentType("ACÁ IRA EL KARAOKE"); // NOI18N
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("ACÁ IRA LA LETRA DE LAS CANCIONES");
        jScrollPane3.setViewportView(jTextPane1);

        Panel_Fondo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 670, 220));

        jLabel4.setBackground(new java.awt.Color(255, 102, 51));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OPCIONES:");
        Panel_Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 30));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REPRODUCTOR MULTIMEDIA JOSH");
        Panel_Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 670, -1));

        botonAdmin.setBackground(new java.awt.Color(51, 51, 51));
        botonAdmin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        botonAdmin.setForeground(new java.awt.Color(255, 255, 255));
        botonAdmin.setText("VER DUPLICADOS");
        botonAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdminActionPerformed(evt);
            }
        });
        Panel_Fondo.add(botonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 350, 140, 30));

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 204));
        Panel_Fondo.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 880, 10));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setText("Ingresa tu búsqueda aquí");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Panel_Fondo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 570, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton1.setText("+ PLAYLIST");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 80, 30));

        jButton2.setBackground(new java.awt.Color(102, 0, 51));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton2.setText("OK");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 70, 30));

        jList2.setBackground(new java.awt.Color(0, 51, 51));
        jList2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Playlist1", "Playlist2", "Playlist3", "Playlist4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        Panel_Fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 170, 230));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton3.setText("VER MÁS PESADOS");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel_Fondo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 400, 140, 30));

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

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMusicaActionPerformed

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
       botonRegresarImagen.setVisible(false);
       botonSiguienteImagen.setVisible(false);
       botonVerImagen.setEnabled(false);
       botonRegresarImagen.setEnabled(false);
       botonSiguienteImagen.setEnabled(false);
               
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

private double calcularPesoMP3(File carpeta) {
    double totalSizeGB = 0.0;
    //Metodo Recursivo
    // Verifica si la ruta es un directorio
    if (carpeta.isDirectory()) {
        File[] archivos = carpeta.listFiles(); //Obtener un arreglo de File con todos los archivos y subdirectorios que contiene la carpeta.
        if (archivos != null) {
            //recorrer cada archivo de la carpeta
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp3")) { //verificar extensión de archivo.
                    // Sumar el tamaño del archivo en GB
                    totalSizeGB += archivo.length() / (1024.0 * 1024.0 * 1024.0); // Convertir a GB División de Bytes / 1024^3 (bytes → kilobytes → megabytes → gigabytes).
                } else if (archivo.isDirectory()) {
                    // Llamar recursivamente a la misma función para subdirectorios
                    totalSizeGB += calcularPesoMP3(archivo);
                }
            }
        }
    }
    return totalSizeGB;
}

private double calcularPesoMP4(File carpeta) {
    //Lo mismo que MP3 pero con MP4.
    double totalSizeGB = 0.0;

    // Verifica si la ruta es un directorio
    if (carpeta.isDirectory()) {
        File[] archivos = carpeta.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp4")) {
                    // Sumar el tamaño del archivo en GB
                    totalSizeGB += archivo.length() / (1024.0 * 1024.0 * 1024.0); // Convertir a GB
                } else if (archivo.isDirectory()) {
                    // Llamar recursivamente a la misma función para subdirectorios
                    totalSizeGB += calcularPesoMP4(archivo);
                }
            }
        }
    }
    return totalSizeGB;
}
    
private double calcularPesoImagenes(File carpeta) {
    double totalSizeGB = 0.0;

    // Verifica si la ruta es un directorio
    if (carpeta.isDirectory()) {
        File[] archivos = carpeta.listFiles(); // Obtiene un arreglo de File con todos los archivos y subdirectorios que contiene la carpeta.
        if (archivos != null) {
            // Recorre cada archivo de la carpeta
            for (File archivo : archivos) {
                if (archivo.isFile() && (archivo.getName().toLowerCase().endsWith(".jpg") || archivo.getName().toLowerCase().endsWith(".png"))) { // Verifica las extensiones de imagen
                    // Sumar el tamaño del archivo en GB
                    totalSizeGB += archivo.length() / (1024.0 * 1024.0 * 1024.0); // Convertir a GB
                } else if (archivo.isDirectory()) {
                    // Llamar recursivamente a la misma función para subdirectorios
                    totalSizeGB += calcularPesoImagenes(archivo);
                }
            }
        }
    }
    return totalSizeGB;
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
                        archivo.length()    // Tamaño del archivo en bytes
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
                    long tamaño = archivo.length();           // Tamaño del archivo en bytes

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
                        tamaño         // Tamaño del archivo en bytes
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
                    long tamaño = archivo.length(); // En bytes
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
                        tamaño / (1024 * 1024) + " MB", // Tamaño en MB
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
    private void textFieldMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMusicaActionPerformed

    private void seleccionCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionCarpetaActionPerformed
    // Clase de Swing que proporciona un diálogo para seleccionar archivos y directorios.
    JFileChooser selectorCarpeta = new JFileChooser(); 
    selectorCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //Mostrar solo directorios, evitando que el usuario seleccione archivos.
    
    // Mostrar el diálogo para seleccionar la carpeta
    int resultado = selectorCarpeta.showOpenDialog(this); //y guarda resultado de la selección
    
    // Verificar si el usuario seleccionó una carpeta
    if (resultado == JFileChooser.APPROVE_OPTION) {
        // Obtener la carpeta seleccionada
        File carpetaSeleccionada = selectorCarpeta.getSelectedFile();
        
        // Almacenar la ruta de la carpeta en la variable global
        RutaDeAcceso = carpetaSeleccionada.getAbsolutePath();
        
        // Mostrar un mensaje al usuario con la ruta seleccionada
        JOptionPane.showMessageDialog(this, "Carpeta seleccionada: " + RutaDeAcceso);
    } else {
        // El usuario no seleccionó ninguna carpeta
        JOptionPane.showMessageDialog(this, "No se seleccionó ninguna carpeta.");
    }
    
    // Calcular el peso total de archivos .mp3 en la carpeta seleccionada
    double totalSizeGB = calcularPesoMP3(new File(RutaDeAcceso));
    // Mostrar el peso total en el JTextField
    textFieldMusica.setText(String.format("%.2f GB", totalSizeGB));
    
    // Calcular el peso total de archivos .mp4 en la carpeta seleccionada
    double totalSizeGBmp4 = calcularPesoMP4(new File(RutaDeAcceso));
    // Mostrar el peso total en el JTextField
    textFieldVideo.setText(String.format("%.2f GB", totalSizeGBmp4));
    
        // Calcular el peso total de archivos de imagen en la carpeta seleccionada
    double totalSizeGBJPEG = calcularPesoImagenes(new File(RutaDeAcceso));
    // Mostrar el peso total en el JTextField
    textFieldFotos.setText(String.format("%.2f GB", totalSizeGBJPEG));
    
    
    //TOTAL DE PESO
    // Calcular el peso total
    double totalSizeGBTotal = totalSizeGB + totalSizeGBmp4 + totalSizeGBJPEG;
    // Mostrar el peso total en el JTextField total
    textFieldTotal.setText(String.format("%.2f GB", totalSizeGBTotal));
    
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

    private void textFieldFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFotosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFotosActionPerformed

    private void Panel_FondoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Panel_FondoComponentShown
    }//GEN-LAST:event_Panel_FondoComponentShown

    private void botonFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFotosActionPerformed
       
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
       botonRegresarImagen.setVisible(true);
       botonSiguienteImagen.setVisible(true);
       botonVerImagen.setEnabled(true);
       botonRegresarImagen.setEnabled(true);
       botonSiguienteImagen.setEnabled(true);
       botonReproducirVideo.setVisible(false);
       botonReproducirVideo.setEnabled(false);
       
    // Crear el modelo de tabla para las imágenes y limpiar los datos previos
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosFotos.getModel();
    modeloTabla.setRowCount(0); // Limpiar datos existentes

    // Llamar al método para buscar imágenes
    File directorioSeleccionado = new File(RutaDeAcceso);
      buscarArchivosImagen(directorioSeleccionado, modeloTabla);
       
       
       
    }//GEN-LAST:event_botonFotosActionPerformed

    private void botonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdminActionPerformed
        ventanaAdministrar Jframe2 = new ventanaAdministrar();
        Jframe2.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonAdminActionPerformed

    private void botonVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVideoActionPerformed
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
    botonRegresarImagen.setVisible(false); 
    botonSiguienteImagen.setVisible(false); 
    
    // Mostrar y habilitar el botón de reproducir video
    botonReproducirVideo.setVisible(true); 
    botonReproducirVideo.setEnabled(true); 

    // Crear el modelo de tabla para la sección de videos y limpiar datos previos
    DefaultTableModel modeloTabla = (DefaultTableModel) tablaDatosMyV.getModel();
    modeloTabla.setRowCount(0); // Limpiar datos existentes en la tabla de videos

    // Llamar al método para buscar archivos .mp4 en la carpeta seleccionada
    buscarArchivosMP4(new File(RutaDeAcceso), modeloTabla); // Iniciar búsqueda de archivos MP4
    }//GEN-LAST:event_botonVideoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    


    
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

    private void botonSiguienteImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSiguienteImagenActionPerformed

    private void textFieldVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldVideoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldVideoActionPerformed

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
        String rutaImagen = tablaDatosFotos.getValueAt(filaSeleccionada, 2).toString(); // Suponiendo que la ruta está en la columna 3
        
        // Crear el ImageIcon
        ImageIcon imagenOriginal = new ImageIcon(rutaImagen);
        
        // Abrir el JFrameFotos
        JFrameFotos jFrameFotos = new JFrameFotos();
        
        // Escalar la imagen al tamaño deseado
        int ancho = 900; // Puedes establecer un ancho fijo
        int alto = 668;  // Puedes establecer un alto fijo
        Image imagenEscalada = imagenOriginal.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        
        // Asignar la imagen escalada al JLabel usando el método
        jFrameFotos.setImageIcon(new ImageIcon(imagenEscalada));
        
        // Hacer visible el JFrameFotos
        jFrameFotos.pack(); // Ajustar el tamaño de la ventana
        jFrameFotos.setVisible(true);
        
        // Cerrar el JFrame actual
        this.dispose(); // Esto cerrará ventanaPrincipal
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila.");
    }
    }//GEN-LAST:event_botonVerImagenActionPerformed


    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JPanel Panel_Fondo;
    private javax.swing.JButton botonAdmin;
    private javax.swing.JButton botonFotos;
    private javax.swing.JButton botonMusica;
    private javax.swing.JButton botonPausa;
    private javax.swing.JButton botonRegresarImagen;
    private javax.swing.JButton botonRegresarMusica;
    private javax.swing.JButton botonReproducirMusica;
    private javax.swing.JButton botonReproducirVideo;
    private javax.swing.JButton botonSiguienteImagen;
    private javax.swing.JButton botonSiguienteMusica;
    private javax.swing.JButton botonVerImagen;
    private javax.swing.JButton botonVideo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneFotos;
    private javax.swing.JScrollPane jScrollPaneMyV;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel panelTablas;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem seleccionCarpeta;
    private javax.swing.JTable tablaDatosFotos;
    private javax.swing.JTable tablaDatosMyV;
    private javax.swing.JTextField textFieldFotos;
    private javax.swing.JTextField textFieldMusica;
    private javax.swing.JTextField textFieldTotal;
    private javax.swing.JTextField textFieldVideo;
    // End of variables declaration//GEN-END:variables



}

