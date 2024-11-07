package school.sptech;

public class Circulo extends Figura{

    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override public Double calcularArea(){
        Double area = Math.PI * (raio * raio);
        return area;
    }

    @Override public String toString(){
        return "O circulo tem area de " + calcularArea();
    }
}
