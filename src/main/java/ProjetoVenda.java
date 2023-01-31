import entity.Produto;

public class ProjetoVenda {
    public static void main(String[] args) {
        System.out.println("hello world!");
        Produto produto = new Produto();
        produto.setNomeProduto("Coca cola");
        produto.setPeso(500.0);
        produto.setUnidade("Fardo");
        produto.setVlrVendas(20.0);
        produto.setVlrCusto(5.0);
        produto.setQuantEstoque(20.0);
    }