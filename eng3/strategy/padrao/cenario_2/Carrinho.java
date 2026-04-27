package cenario_2;

public class Carrinho {
    private List<Double> itens = new ArrayList<>();
    private Desconto desconto;

    public Carrinho(Desconto desconto) {
        this.desconto = desconto;
    }

    public void adicionarItem(double preco) {
        itens.add(preco);
    }

    public double calcularTotal() {
        double subtotal = itens.stream().mapToDouble(Double::doubleValue).sum();
        return desconto.aplicar(subtotal);
    }
}