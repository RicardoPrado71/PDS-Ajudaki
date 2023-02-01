import entity.Produto;

import java.util.ArrayList;
import java.util.List;

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
        //----------------------------------------------
        Produto produto2 = new Produto();
        produto2.setNomeProduto("Coca cola Zero");
        produto2.setPeso(400.0);
        produto2.setUnidade("Fardo");
        produto2.setVlrVendas(22.0);
        produto2.setVlrCusto(6.0);
        produto2.setQuantEstoque(15.0);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(produto2);

        //System.out.println(produto);
        //System.out.println(produto2);

        System.out.println(produtos);



    }
}