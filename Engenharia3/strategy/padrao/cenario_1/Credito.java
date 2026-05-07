package cenario_1;
public class Credito implements Pagamento{
    @Override
    public void pagar(double valor){
        System.out.println("O pagamento do valor é de R$ " + valor + "no Cartão de Crédito");
    }
}