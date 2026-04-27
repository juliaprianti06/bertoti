package cenario_1;
public class Loja{
    private Pagamento pagamento;

    public void setPagamento( Pagamento pagamento){
        this.pagamento = pagamento;
    }

    public void finalizarCompra(double valor){
        pagamento.pagar(valor);

    }
}