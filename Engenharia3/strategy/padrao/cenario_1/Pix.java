package cenario_1;
public class Pix implements Pagamento{
    @Override
    public void pagar(double valor){
        System.out.println("O pagamento será de R$ " + valor + "no Pix");
    }
}