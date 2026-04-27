package cenario_2;

public class SemDesconto implements Desconto {
    @Override
    public double aplicar(double valorTotal) {
        return valorTotal;
    }
}