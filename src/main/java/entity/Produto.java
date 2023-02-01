package entity;

public class Produto {

    private Double quantEstoque;
    private Double vlrVendas;
    private Double vlrCusto;
    private String nomeProduto;
    private String unidade;
    private Double peso;

    public Double getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(Double quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public Double getVlrVendas() {
        return vlrVendas;
    }

    public void setVlrVendas(Double vlrVendas) {
        this.vlrVendas = vlrVendas;
    }

    public Double getVlrCusto() {
        return vlrCusto;
    }

    public void setVlrCusto(Double vlrCusto) {
        this.vlrCusto = vlrCusto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "quantEstoque=" + quantEstoque +
                ", vlrVendas=" + vlrVendas +
                ", vlrCusto=" + vlrCusto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", unidade='" + unidade + '\'' +
                ", peso=" + peso +
                '}';
    }
}
