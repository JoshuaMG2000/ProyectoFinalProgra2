# Manual Técnico Del Proyecto Final de Progra 2 "REPRODUCTOR MULTIMEDIA JOSH"

## Tabla de Contenidos
1. [Introducción](#introducción)
2. [Propósito del Proyecto](#propósito-del-proyecto)
3. [Requisitos Previos del Sistema](#requisitos-previos-del-sistema)
   - [1. Entorno de Desarrollo](#1-entorno-de-desarrollo)
   - [2. Software Adicional](#2-software-adicional)
   - [3. Sistema Operativo Compatible](#3-sistema-operativo-compatible)
   - [4. Espacio en Disco](#4-espacio-en-disco)
   - [5. Librerías Externas Utilizadas](#5-librerías-externas-utilizadas)
     - [Manejo de Archivos y Entradas](#manejo-de-archivos-y-entradas)
     - [Interfaz Gráfica de Usuario (GUI) y Tablas de Datos](#interfaz-gráfica-de-usuario-gui-y-tablas-de-datos)
     - [Manejo de Archivos de Audio](#manejo-de-archivos-de-audio)
     - [Manejo de Archivos de Video](#manejo-de-archivos-de-video)
     - [Manejo de Archivos de Imágenes y Metadatos](#manejo-de-archivos-de-imágenes-y-metadatos)
     - [Manejo y Formateo de Rutas y Archivos](#manejo-y-formateo-de-rutas-y-archivos)
     - [Manejo de Estructuras de Datos y Expresiones Regulares](#manejo-de-estructuras-de-datos-y-expresiones-regulares)
4. [Utilización del Programa](#utilización-del-programa)
   - [Pasos para Ejecutar el Proyecto en NetBeans](#pasos-para-ejecutar-el-proyecto-en-netbeans)
5. [Funciones Principales](#funciones-principales)
   - [Método `seleccionCarpetaActionPerformed`](#método-seleccioncarpetaactionperformed)
     - [Descripción General](#descripción-general)
     - [Pasos Detallados](#pasos-detallados)
     - [Importancia del Método](#importancia-del-método)
   - [Funciones para Calcular el Peso de Archivos](#funciones-para-calcular-el-peso-de-archivos)
     - [Explicación General de `calcularPesoMP3`](#explicación-general-de-calcularpesomp3)
6. [Explicación de los Métodos de Búsqueda de Archivos](#explicación-de-los-métodos-de-búsqueda-de-archivos)



## Introducción
Este repositorio contiene el código fuente del proyecto **Reproductor de Archivos Multimedia JOSH**. Este proyecto ha sido desarrollado con fines educativos para ser ejecutado en **NetBeans IDE 22**.Este proyecto tiene como objetivo desarrollar una aplicación completa en Java que facilite la gestión, visualización y reproducción de archivos multimedia en distintos formatos (audio, video e imagen). La 
aplicación se presenta en una interfaz gráfica amigable y permite al usuario ordenar e identificar 
archivos duplicados, y obtener estadísticas detalladas sobre el almacenamiento ocupado en cada tipo 
de archivo. Además, la aplicación integra funcionalidad de reproducción de archivos de música y video,
así mismo visualizar imágenes brindando una experiencia integral de gestión multimedia desde una 
única plataforma.

## Propósito del Proyecto
La aplicación fue diseñada para simplificar la gestión de grandes colecciones de archivos multimedia, 
permitiendo al usuario visualizar los archivos con su metadata detallada, reproducir contenido 
multimedia, y eliminar duplicados para optimizar el espacio de almacenamiento. Su uso está orientado 
a cualquier usuario que busque mejorar la organización y administración de sus archivos de audio, video 
e imagen de forma rápida y eficiente, mediante una plataforma accesible y profesional.

## Requisitos Previos del Sistema

Para un funcionamiento óptimo de esta aplicación, asegúrate de cumplir con los siguientes requisitos:

### 1. Entorno de Desarrollo

- **Java Development Kit (JDK):** Versión 22 o superior.
  - La aplicación está desarrollada en Java, por lo que se necesita JDK 22 o una versión superior para compilar y ejecutar el código.

- **NetBeans IDE:** Versión 22 o superior.
  - Se recomienda NetBeans 22 para una compatibilidad total y una experiencia de desarrollo fluida.

### 2. Software Adicional

- **VLC Media Player:** Versión 4.7.1
  - Requerido para la reproducción de archivos de video. La aplicación utiliza la biblioteca VLCJ para integrar las funciones de VLC en el reproductor multimedia.
  - Instala VLC en la ruta predeterminada `C:\Program Files\VideoLAN` para que la biblioteca pueda detectar y utilizar VLC de forma automática.

### 3. Sistema Operativo Compatible

- **Windows, macOS, o Linux** con soporte para la versión de Java instalada.
  - La aplicación ha sido probada en estos sistemas operativos, siempre que tengan instalado Java y VLC.

### 4. Espacio en Disco

- **Al menos 500 MB de espacio libre en disco** para la ejecución de la aplicación y almacenamiento temporal de archivos.

### 5. Librerías Externas Utilizadas

Para el correcto funcionamiento de esta aplicación, es necesario incluir las siguientes librerías externas. Estas se encuentran referenciadas en el código y gestionan diversas funcionalidades clave en el programa:

#### Manejo de Archivos y Entradas
- `com.github.burningwave.core.io.FileInputStream`: para leer archivos desde el sistema de archivos.
- `java.io.BufferedInputStream`: mejora la eficiencia de lectura de archivos.
- `java.io.File`: para manejo de archivos y directorios en el sistema.
- `java.io.IOException`: gestiona errores de entrada/salida.

#### Interfaz Gráfica de Usuario (GUI) y Tablas de Datos
- `javax.swing.JFileChooser`: permite seleccionar archivos o carpetas.
- `javax.swing.JOptionPane`: para mostrar mensajes emergentes de alerta o confirmación.
- `javax.swing.table.DefaultTableModel`: modelo de datos para gestionar filas y columnas en tablas (JTable).
- `javax.swing.table.TableRowSorter`: organiza las filas de una tabla según criterios de orden.
- `javax.swing.ImageIcon`: representa iconos de imagen en la GUI.
- `javax.swing.JTextField`: campo de texto para entrada de datos.

#### Manejo de Archivos de Audio
- `org.jaudiotagger.audio.*`: lectura y manipulación de metadatos de archivos de audio.
- `javazoom.jl.player.Player`: para reproducción de archivos MP3.

#### Manejo de Archivos de Video
- `org.apache.tika.*`: extrae metadatos de archivos y detecta tipos de archivos.
- `uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent`: permite la integración de VLC para la reproducción multimedia.

#### Manejo de Archivos de Imágenes y Metadatos
- `com.drew.imaging.*`: lectura de metadatos de archivos de imagen.
- `com.drew.metadata.exif.ExifIFD0Directory`: accede a datos EXIF en imágenes.
- `java.awt.Image`: manipulación y procesamiento de imágenes.

#### Manejo y Formateo de Rutas y Archivos
- `java.nio.file.*`: realiza operaciones de sistema de archivos y rutas.
- `java.nio.file.attribute.BasicFileAttributes`: obtiene atributos básicos de archivos.

#### Manejo de Estructuras de Datos y Expresiones Regulares
- `java.util.*`: listas, conjuntos y colecciones.
- `java.util.regex.*`: manejo de patrones de expresiones regulares.

Asegúrate de que todas estas dependencias estén incluidas y configuradas correctamente en tu entorno de NetBeans para evitar errores de compilación y ejecución.

## Utilización del Programa

Este software está diseñado para demostración en un entorno educativo, por lo tanto, no es un programa instalable ni está destinado a distribución comercial. A continuación, se detallan los pasos necesarios para ejecutar el proyecto en NetBeans, cumpliendo los requisitos previos antes mencionados, solamente con uno adicional que sería Clonar o descargar el repositorio, para trabajarlo localmente en tu computadora.

### Pasos para Ejecutar el Proyecto en NetBeans

1. **Abrir NetBeans IDE**  
   Abre NetBeans IDE 22 en tu equipo.

2. **Clonar el Repositorio**
   - Puedes clonar el repositorio directamente en NetBeans o desde la terminal:
     ```bash
     git clone [https://github.com/JoshuaMG2000/ProyectoFinalProgra2.git]
     ```
   - Alternativamente, descarga el archivo ZIP del repositorio y extrae los archivos en tu equipo.

3. **Importar el Proyecto en NetBeans**
   - En NetBeans, ve a `Archivo > Abrir Proyecto`.
   - Navega hasta la ubicación del proyecto clonado o descomprimido.
   - Selecciona la carpeta del proyecto y haz clic en `Abrir Proyecto`.

4. **Verificar Configuración de Dependencias**
   - Asegúrate de que no haya errores de dependencias en la ventana `Proyectos`.
   - Verifica que la configuración del JDK sea la correcta en `Propiedades del Proyecto > Compilación > Versión de Fuente`.

5. **Compilar y Ejecutar el Proyecto**
   - Haz clic derecho en el proyecto y selecciona `Limpiar y Construir`.
   - Una vez compilado, selecciona `Ejecutar > Ejecutar Proyecto` o haz clic en el botón `Play` en la barra de herramientas.
   - NetBeans ejecutará la aplicación en la ventana de salida integrada.

6. **Uso de Funcionalidades**
   - Al iniciar la aplicación, podrás interactuar con las funcionalidades del reproductor multimedia, para saber como utilizarlo dejo acá mismo en el repositorio el MANUAL DE USUARIO en formato PDF.
   - Puedes detener la ejecución en cualquier momento con el botón `Stop` en la barra de herramientas.

7. **Finalizar la Ejecución**
   - Para finalizar la ejecución, simplemente detén el proyecto desde NetBeans o cierra el IDE. No se requiere instalación ni eliminación adicional, ya que el proyecto no guarda archivos en el sistema.

# Funciones Principales
## Método `seleccionCarpetaActionPerformed`

Este método es fundamental en la aplicación, ya que permite seleccionar la **ruta de acceso** (directorio de trabajo) y recopilar los **datos de almacenaje** y **cantidad de archivos** en esa ruta. A continuación se explican los pasos clave de este método.

### Descripción General

El método `seleccionCarpetaActionPerformed` es un evento que se activa cuando el usuario selecciona una carpeta. Una vez que se selecciona, el programa identifica y calcula el tamaño total y la cantidad de archivos específicos (MP3, MP4, imágenes) presentes en la carpeta.

### Pasos Detallados

1. **Seleccionar la Carpeta**
   - Se utiliza `JFileChooser` para crear un selector de carpetas, configurado para aceptar solo directorios:
     ```java
     JFileChooser selectorCarpeta = new JFileChooser();
     selectorCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
     ```
   - El selector muestra un diálogo para que el usuario elija una carpeta, y el resultado se almacena en `resultado`.

2. **Verificar la Selección del Usuario**
   - Si el usuario selecciona una carpeta, el programa obtiene la ruta de la carpeta elegida, la almacena en la variable `RutaDeAcceso`, y la muestra en la interfaz:
     ```java
     if (resultado == JFileChooser.APPROVE_OPTION) {
         File carpetaSeleccionada = selectorCarpeta.getSelectedFile();
         RutaDeAcceso = carpetaSeleccionada.getAbsolutePath();
         mostrarRuta.setText(RutaDeAcceso);
     }
     ```

3. **Declaración de Contadores para Archivos**
   - Se declaran contadores para los diferentes tipos de archivos:
     ```java
     int[] cantidadMP3 = {0};
     int[] cantidadMP4 = {0};
     int[] cantidadImagenes = {0};
     ```
   - Estos contadores se utilizan para registrar la cantidad de archivos de cada tipo en la carpeta seleccionada.

4. **Cálculo del Tamaño y Cantidad de Archivos**
   - Se invocan tres funciones para calcular el tamaño total y la cantidad de archivos de cada tipo en la carpeta:
     ```java
     double totalSizeGBMP3 = calcularPesoMP3(new File(RutaDeAcceso), cantidadMP3);
     double totalSizeGBMP4 = calcularPesoMP4(new File(RutaDeAcceso), cantidadMP4);
     double totalSizeGBImagenes = calcularPesoImagenes(new File(RutaDeAcceso), cantidadImagenes);
     ```
   - Estas funciones recorren la carpeta y suman el tamaño de los archivos (en GB) de cada tipo.

5. **Mostrar el Tamaño Total por Tipo de Archivo**
   - Los tamaños calculados para cada tipo de archivo se muestran en los campos de texto correspondientes en la interfaz:
     ```java
     textFieldMusicaPeso.setText(String.format("%.2f GB", totalSizeGBMP3));
     textFieldVideoPeso.setText(String.format("%.2f GB", totalSizeGBMP4));
     textFieldFotosPeso.setText(String.format("%.2f GB", totalSizeGBImagenes));
     ```

6. **Cálculo del Tamaño y Cantidad Totales**
   - El tamaño total (suma de todos los archivos) se calcula y muestra en el campo correspondiente:
     ```java
     double totalSizeGBTotal = totalSizeGBMP3 + totalSizeGBMP4 + totalSizeGBImagenes;
     textFieldPesoTotal.setText(String.format("%.2f GB", totalSizeGBTotal));
     ```
   - También se muestra la cantidad total de archivos de todos los tipos:
     ```java
     int cantidadTotal = cantidadMP3[0] + cantidadMP4[0] + cantidadImagenes[0];
     textFieldCantidadTotal.setText(String.valueOf(cantidadTotal));
     ```

### Importancia del Método
Este método es esencial para la funcionalidad de la aplicación porque:
- **Establece la Ruta de Acceso**: El directorio seleccionado es donde el programa buscará los archivos.
- **Calcula y Muestra el Tamaño**: Permite que el usuario visualice el tamaño total de los archivos por tipo (MP3, MP4, imágenes) en gigabytes.
- **Cuenta los Archivos por Tipo**: Facilita el análisis de la cantidad de archivos de cada tipo en la carpeta seleccionada.

## Funciones para Calcular el Peso de Archivos

Las funciones `calcularPesoMP3`, `calcularPesoMP4`, y `calcularPesoImagenes` están diseñadas para recorrer una carpeta y calcular el tamaño total de archivos específicos en gigabytes (GB). Cada función se enfoca en diferentes tipos de archivos:

- **calcularPesoMP3**: Archivos `.mp3`
- **calcularPesoMP4**: Archivos de video, tales como `.mp4`, `.mkv`, `.flv`
- **calcularPesoImagenes**: Archivos de imagen en formatos `.jpg` y `.png`

### Explicación General de `calcularPesoMP3`

La función `calcularPesoMP3` toma como parámetros:
- Un objeto `File` que representa la carpeta a analizar (`carpeta`).
- Un arreglo `cantidad` que actúa como contador de archivos encontrados.

El proceso general de la función es el siguiente:

1. **Inicialización del Tamaño Total**  
   Se inicializa `totalSizeGB` en `0.0` para acumular el tamaño total de archivos `.mp3` encontrados.

   ```java
   double totalSizeGB = 0.0;

2. **Verificación del Tipo de Archivo**
  La función verifica que el File recibido (carpeta) sea un directorio. Si es así, obtiene todos los archivos y subdirectorios dentro de él.
   ```java
    if (carpeta.isDirectory()) {
    File[] archivos = carpeta.listFiles();
    // Validación adicional de contenido
    }
3. **Recorrido de Archivos y Subdirectorios**
    Para cada archivo dentro de archivos:
  - Si es un archivo .mp3, el tamaño del archivo se convierte de bytes a GB y se suma a totalSizeGB.
  - Además, el contador cantidad[0] se incrementa para contar el archivo.
    ```java
    if (archivo.isFile() && archivo.getName().toLowerCase().endsWith(".mp3")) {
    totalSizeGB += archivo.length() / (1024.0 * 1024.0 * 1024.0);
    cantidad[0]++;
    }
4. **Recursividad para Subdirectorios**
    Si se encuentra un subdirectorio, se llama recursivamente a calcularPesoMP3 para incluir el peso y cantidad de archivos en subcarpetas.
    ```java
    else if (archivo.isDirectory()) {
    totalSizeGB += calcularPesoMP3(archivo, cantidad);
    }
5. **Retorno del Tamaño Total**
    Finalmente, la función retorna el tamaño total en GB de todos los archivos .mp3 encontrados.
    ```java
     return totalSizeGB;

## Funciones calcularPesoMP4 y calcularPesoImagenes
Las funciones **calcularPesoMP4** y **calcularPesoImagenes** siguen la misma lógica descrita para **calcularPesoMP3**. Sin embargo, la diferencia radica en los formatos de archivo que buscan:
 - **calcularPesoMP4:** Busca archivos con extensiones .mp4, .mkv, y .flv.
 - **calcularPesoImagenes:** Busca archivos de imagen con extensiones .jpg y .png.
Estas funciones permiten calcular el tamaño y la cantidad de archivos de diferentes tipos de manera eficiente, asegurando un análisis completo de la carpeta seleccionada.

## Explicación detallada de los Métodos de Búsqueda de Archivos

### 1. Método `buscarArchivosMP3`
Este método es el más completo y avanzado de los tres. Se encarga de buscar archivos MP3 en un directorio especificado, procesando tanto archivos como subdirectorios de manera **recursiva** y extrayendo metadatos detallados utilizando la librería externa **jaudiotagger**.

**Funcionamiento:**
- Recibe un `File` (directorio) y un `DefaultTableModel` como parámetros.
- Recorre recursivamente los archivos y subdirectorios.
- Filtra archivos con la extensión `.mp3` y utiliza la librería **jaudiotagger** para leer metadatos.
- Obtiene y muestra información como el nombre del archivo, artista, álbum, género, duración, año de publicación, y tamaño en MB.
- Agrega una fila de datos al modelo de tabla con esta información.

**Detalles del proceso:**
- Verifica si el archivo es un directorio y llama recursivamente al método.
- Procesa archivos `.mp3` y captura posibles excepciones en la lectura de metadatos.

### 2. Método `buscarArchivosMP4`
Este método es similar al de `buscarArchivosMP3` pero está diseñado para manejar archivos de video con extensiones `.mp4` y `.mkv`. Utiliza la biblioteca **Apache Tika** para la detección y extracción de metadatos.

**Diferencias y funcionamiento:**
- Utiliza **Apache Tika** en lugar de **jaudiotagger**.
- Extrae información como nombre del archivo, extensión, artista, álbum, género, duración, y año de publicación.
- Convierte la duración de milisegundos a segundos si es necesario.
- Maneja posibles errores de entrada/salida y análisis con un bloque `try-catch`.

### 3. Método `buscarArchivosImagen`
Este método se centra en la búsqueda y procesamiento de imágenes con extensiones `.jpg` y `.png`, y utiliza la librería **Metadata Extractor** para extraer metadatos específicos de las imágenes.

**Diferencias y funcionamiento:**
- Se enfoca en obtener metadatos de imágenes como la fecha de creación y modificación, además de detalles del dispositivo y modelo de la cámara.
- Usa **Metadata Extractor** para recorrer y extraer metadatos EXIF.
- Agrega información a la tabla como nombre, extensión, ruta completa, tamaño en MB, fechas y detalles del dispositivo.
- Puede imprimir todos los metadatos para depuración (opcional).

**Diferencias principales entre los métodos:**
- **Librerías utilizadas**: `buscarArchivosMP3` usa **jaudiotagger**, `buscarArchivosMP4` usa **Apache Tika**, y `buscarArchivosImagen` emplea **Metadata Extractor**.
- **Tipos de archivos procesados**: Cada método se especializa en un tipo específico (audio, video, imagen).
- **Información extraída**: Los métodos obtienen distintos metadatos específicos para cada tipo de archivo.

### Resumen
El método `buscarArchivosMP3` es el más completo debido al nivel de detalle en los metadatos procesados y la complejidad de la información manejada. Los métodos `buscarArchivosMP4` y `buscarArchivosImagen` se diferencian principalmente en las bibliotecas y los tipos de metadatos que manejan, enfocándose en sus tipos de archivo respectivos.









