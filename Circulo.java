public class Circulo implements FormaGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
     }

    public double calculaPerimetro() {
        return raio*3.14*2; 
    }
    public double calculaArea() {
        return (raio*raio)*3.14; 
    }

}