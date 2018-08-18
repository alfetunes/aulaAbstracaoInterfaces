public class Quadrado implements FormaGeometrica{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
     }

    public double calculaPerimetro() {
        return (lado*4); 
    }

    public double calculaArea() {
        return (lado*lado); 
    }

}