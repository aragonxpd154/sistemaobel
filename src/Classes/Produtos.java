
package Classes;

/**
 *
 * @author OBEL
 */
public class Produtos {
    private String codproduto;
    private String descricao;
    private int preco;
    private int taxa;
    private String observacao;

    public Produtos(String codproduto, String descricao, int preco, int taxa, String observacao) {
        this.codproduto = codproduto;
        this.descricao = descricao;
        this.preco = preco;
        this.taxa = taxa;
        this.observacao = observacao;
    }

    public String getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(String codproduto) {
        this.codproduto = codproduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    Object getIdcodproduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getcodproduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
}
