package cenario_1;
public class Boleto implements Pagamento{
    @Override
    public void pagar(double valor){
        System.out.println("O pagamento é no valor de R$ " + valor + "no boleto");
    }
}