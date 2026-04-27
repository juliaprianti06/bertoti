package cenario_2;
public class DescontoBlackFriday implements Desconto {
    private static final double PERCENTUAL = 0.50;

    @Override
    public double aplicar(double valorTotal) {
        return valorTotal * (1 - PERCENTUAL);
    }
}