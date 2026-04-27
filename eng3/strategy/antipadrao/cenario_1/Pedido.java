package cenario_1;

public class Pedido {
    private double peso;
    private double distancia;
    private String tipoFrete; 

    public Pedido(double peso, double distancia, String tipoFrete) {
        this.peso = peso;
        this.distancia = distancia;
        this.tipoFrete = tipoFrete;
    }

    public double calcularFrete() {
        if (tipoFrete.equals("correios")) {
            return peso * 1.5 + distancia * 0.10;
        } else if (tipoFrete.equals("fedex")) {
            return peso * 2.0 + distancia * 0.15;
        } else if (tipoFrete.equals("retirada")) {
            return 0.0;
        } else {
            throw new IllegalArgumentException("Transportadora desconhecida: " + tipoFrete);
        }
    }
}