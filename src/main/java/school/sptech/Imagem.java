package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double soma = 0.0;
        Double area = 0.0;
        for (Figura figura : figuras) {
            area = figura.calcularArea();
            soma += area;
        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        Double area = 0.0;
        List<Figura> figuraMaior = new ArrayList<>();
        for (Figura figura : figuras) {
            area = figura.calcularArea();
            if (area > 20){
                figuraMaior.add(figura);
            }

        }
        return figuraMaior;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> FigurasQuadrado = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado){
                FigurasQuadrado.add(figura);
            }
        }
        return FigurasQuadrado;


    }
}
