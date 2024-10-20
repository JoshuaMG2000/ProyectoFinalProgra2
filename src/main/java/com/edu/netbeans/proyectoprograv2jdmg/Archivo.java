
package com.edu.netbeans.proyectoprograv2jdmg;

import java.io.File;

/**
 *
 * @author Josue
 */
public class Archivo {
    //ATRIBUTOS
    private String nombreArchivo;
    private String extension;
    private String artista;
    private String album;
    private String genero;
    private String duracion;
    private String anio;
    private String ruta;
    private long tamaño;
    
    
    //CONSTRUCTOR
       public Archivo(String nombreArchivo, String extension, String artista, String album, String genero, String duracion, String anio, String ruta, long tamaño) {
        this.nombreArchivo = nombreArchivo;
        this.extension = extension;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.duracion = duracion;
        this.anio = anio;
        this.ruta = ruta;
        this.tamaño = tamaño;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public long getTamaño() {
        return tamaño;
    }

    public void setTamaño(long tamaño) {
        this.tamaño = tamaño;
    }
    

/*public static double calcularPesoMP3(String ruta) {
    File folder = new File(ruta);
    long totalSizeBytes = 0; // Usar long para evitar problemas de overflow

    // Verifica si la ruta es un directorio
    if (folder.isDirectory()) {
        File[] archivos = folder.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp3")) {
                    // Sumar el tamaño del archivo en bytes
                    totalSizeBytes += archivo.length();
                } else if (archivo.isDirectory()) {
                    // Llamar recursivamente a la misma función para subdirectorios
                    totalSizeBytes += calcularPesoMP3(archivo.getAbsolutePath());
                }
            }
        }
    }
    return totalSizeBytes / (1024.0 * 1024.0 * 1024.0); // Convertir a GB al final
    
}*/
    
}   

 
