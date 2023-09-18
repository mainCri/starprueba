package controlador;

import java.util.List;

import modelo.EstrellaMutable;
import vista.Espacio;

public class Controlador {
    private List<EstrellaMutable> estrellas;
    private Espacio espacio;

    public Controlador(List<EstrellaMutable> estrellas, Espacio espacio) {
        this.estrellas = estrellas;
        this.espacio = espacio;
    }

        

    private void moverEstrellas(int deltaX, int deltaY) {
        for (EstrellaMutable estrella : estrellas) {
            int newX = estrella.getX() + deltaX;
            int newY = estrella.getY() + deltaY;

            if (newX >= 0 && newX <= espacio.getHeight()  &&
                newY >= 0 && newY <= espacio.getWidth() ) {
                estrella.setX(newX);
                estrella.setY(newY);
            }
        }
    }
}


