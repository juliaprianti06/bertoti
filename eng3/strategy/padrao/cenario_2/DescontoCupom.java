package cenario_2;
public class DescontoCupom implements Desconto {
    private double valorCupom;

    public DescontoCupom(double valorCupom) {
        this.valorCupom = valorCupom;
    }

    @Override
    public double aplicar(double valorTotal) {
        return Math.max(0, valorTotal - valorCupom);
    }
}