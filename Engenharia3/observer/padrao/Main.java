package padrao;

public class Main {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarObserver(new EmailEstoque());
        estoque.adicionarObserver(new SistemaEstoque());
        estoque.adicionarObserver(new PainelAdminEstoque());

        estoque.setQuantidade("Teclado", 3);  
        estoque.setQuantidade("Mouse", 20); 
    }
    
}
