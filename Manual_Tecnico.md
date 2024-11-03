# Manual Técnico Del Proyecto Final de Progra 2 "REPRODUCTOR MULTIMEDIA JOSH"

## Tabla de Contenidos
1. [Introducción](#introducción)
2. [Propósito del Proyecto](#propósito-del-proyecto)
3. [Requisitos Previos del Sistema](#requisitos-previos-del-sistema)
4. [Utilización del Programa](#utilizacion-del-programa)
5. [Configuración Inicial](#configuración-inicial)
6. [Descripción de Funcionalidades](#descripción-de-funcionalidades)
7. [Solución de Problemas Comunes](#solución-de-problemas-comunes)
8. [Mantenimiento y Actualización](#mantenimiento-y-actualización)
9. [Anexos y Documentación Adicional](#anexos-y-documentación-adicional)
10. [Contacto y Soporte Técnico](#contacto-y-soporte-técnico)

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


