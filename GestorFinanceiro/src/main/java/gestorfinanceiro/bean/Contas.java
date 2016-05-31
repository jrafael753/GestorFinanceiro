package gestorfinanceiro.bean;

import java.util.Date;

public class Contas {
    private String id;
    private String grupoId;
    private String descricao,detalhes;
    private String tipo;
    private boolean situacao;//kitado ou em aberto
    private Date dataPagamento,dataVencimento;
    private double valorDoc,valorPago;

    public String getId() {
        return id;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(String grupoId) {
        this.grupoId = grupoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValorDoc() {
        return valorDoc;
    }

    public void setValorDoc(double valorDoc) {
        this.valorDoc = valorDoc;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "Contas{" + "id=" + id + ", grupoId=" + grupoId + ", descricao=" + descricao + ", tipo=" + tipo + ", situacao=" + situacao + ", dataPagamento=" + dataPagamento + ", dataVencimento=" + dataVencimento + ", valorDoc=" + valorDoc + ", valorPago=" + valorPago + '}';
    }
    
    
}
