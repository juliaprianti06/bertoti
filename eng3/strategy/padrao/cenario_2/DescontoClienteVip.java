package cenario_2;
public class DescontoClienteVip implements Desconto{
    private static final double PERCENTUAL = 0.20;

    @Override
    public double aplicar(double valorTotal) {
        return valorTotal * (1 - PERCENTUAL);
    }
}