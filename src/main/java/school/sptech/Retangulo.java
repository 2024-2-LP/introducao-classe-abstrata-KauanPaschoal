package school.sptech;

public class Retangulo extends Figura{
    private Double base;
    private Double altura;

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override public Double calcularArea(){
            Double area = base * altura;
            return area;
    }

    @Override public String toString(){
        return "O retangulo tem area de " + calcularArea();
    }
}
