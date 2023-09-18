package modelo;

public class EstrellaMutable {
    private int x;
    private int y;
    private EstrellaInmutable inmutable;

    public EstrellaMutable(int x, int y, EstrellaInmutable inmutable) {
        this.x = x;
        this.y = y;
        this.inmutable = inmutable;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public EstrellaInmutable getInmutable() {
        return inmutable;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

