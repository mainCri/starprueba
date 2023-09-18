import java.util.ArrayList;
import java.util.List;

import controlador.Controlador;
import modelo.EstrellaInmutable;
import modelo.EstrellaMutable;
import vista.Espacio;

public class Laucher {
    public static void main(String[] args) {
        // Crear una lista para almacenar las estrellas
        List<EstrellaMutable> estrellas = new ArrayList<>();

        // Crear instancias de EstrellaInmutable con imágenes
        EstrellaInmutable imagenEstrella1 = new EstrellaInmutable("src\\pngegg.png");
        // Agregar más instancias de EstrellaInmutable según sea necesario

        // Número de estrellas a crear
        int numeroDeEstrellas = 10000; // Cambia este número según tus necesidades

        // Crear miles de instancias de EstrellaMutable y agregarlas a la lista
        for (int i = 0; i < numeroDeEstrellas; i++) {
            int x = (int) (Math.random() * 2000); // Coordenada X aleatoria
            int y = (int) (Math.random() * 1500); // Coordenada Y aleatoria
            EstrellaInmutable imagen = imagenEstrella1;
            

            EstrellaMutable estrella = new EstrellaMutable(x, y, imagen);
            estrellas.add(estrella);
        }

        // Crear la instancia de Espacio y Controlador
        Espacio espacio = new Espacio(estrellas);
        Controlador controlador = new Controlador(estrellas, espacio);
    }
}
