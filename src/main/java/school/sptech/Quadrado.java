package school.sptech;

public class Quadrado extends Figura {
    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea(){
        Double area = lado * lado;
        return area;
    }

    @Override public String toString(){
        return "O quadrado tem area de " + calcularArea();
    }
}
