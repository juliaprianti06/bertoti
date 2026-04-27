package cenario_2;
public class Compra{
    private List<Double> itens = new ArrayList<>();
    private String tipoDesconto;
    private double valorCupom;

    public Compra(String tipoDesconto, double valorCupom) {
        this.tipoDesconto = tipoDesconto;
        this.valorCupom = valorCupom;
    }

    public void adicionarItem(double preco) {
        itens.add(preco);
    }

    public double calcularTotal() {
        double subtotal = itens.stream().mapToDouble(Double::doubleValue).sum();

        if (tipoDesconto.equals("nenhum")) {
            return subtotal;
        } else if (tipoDesconto.equals("vip")) {
            return subtotal * 0.80;
        } else if (tipoDesconto.equals("cupom")) {
            return Math.max(0, subtotal - valorCupom);
        } else if (tipoDesconto.equals("blackfriday")) {
            return subtotal * 0.50;
        } else {
            throw new IllegalArgumentException("Desconto desconhecido: " + tipoDesconto);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Compra c1 = new Compra("vip", 0);
        c1.adicionarItem(100.0);
        c1.adicionarItem(50.0);
        System.out.println("VIP: R$" + c1.calcularTotal());

    
        Compra c2 = new Compra("cupom", 30.0);
        c2.adicionarItem(100.0);
        c2.adicionarItem(50.0);
        System.out.println("Cupom: R$" + c2.calcularTotal());
    }
}