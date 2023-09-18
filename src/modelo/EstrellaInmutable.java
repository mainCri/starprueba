package modelo;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class EstrellaInmutable {
    Image imagen;
    int width;
    int height;
    
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public EstrellaInmutable(String imagen) {
        this.width = 20;
        this.height = 20;
        File file = new File(imagen);
        try {
            this.imagen = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Image getImagen() {
        return imagen;
    }
}