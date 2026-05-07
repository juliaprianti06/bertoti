package cenario_1;
public class Main{
    public static void main(String[] args) {
        Loja loja = new Loja();
        
        loja.setPagamento(new CartaoCredito());
        loja.finalizarCompra(100);

        loja.setPagamento(new Pix());
        loja.finalizarCompra(200);

        loja.setPagamento(new Boleto());
        loja.finalizarCompra(300);
        
    }
}