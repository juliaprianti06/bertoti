public class Main {
    public static void main(String[] args) {
        Carrinho c1 = new Carrinho(new SemDesconto());
        c1.adicionarItem(100.0);
        c1.adicionarItem(50.0);
        System.out.println("Sem desconto:   R$" + c1.calcularTotal()); 

        Carrinho c2 = new Carrinho(new DescontoClienteVip());
        c2.adicionarItem(100.0);
        c2.adicionarItem(50.0);
        System.out.println("Cliente VIP:    R$" + c2.calcularTotal()); 

        Carrinho c3 = new Carrinho(new DescontoCupom(30.0));
        c3.adicionarItem(100.0);
        c3.adicionarItem(50.0);
        System.out.println("Cupom R$30:     R$" + c3.calcularTotal()); 

        Carrinho c4 = new Carrinho(new DescontoBlackFriday());
        c4.adicionarItem(100.0);
        c4.adicionarItem(50.0);
        System.out.println("Black Friday:   R$" + c4.calcularTotal()); 
    }
}