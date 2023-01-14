public class Cerchio extends Forma {

    private double raggio;
    
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    public double area() {
        return raggio * raggio * Math.PI;
    }

    @Override
    public String toString() {
        return "Cerchio [raggio=" + raggio + "]";
    }

    @Override
    public double perimetro() {
        return extracted();
    }


    private double extracted() {
        return 2*raggio*Math.PI;
    }
}
