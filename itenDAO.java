/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao_ti2.pkg0;


public class itenDAO{

    private long id;
    private String nome;
    private String descricao;
    private String categoria;
    private String BP; 
    private String local;
    private String data_criacao;
    private String id_movi;
    private String movimentacao_nome;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public String getMovimentacao_nome() {
        return movimentacao_nome;
    }

    public void setMovimentacao_nome(String movimentacao_nome) {
        this.movimentacao_nome = movimentacao_nome;
    }

    
    
    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getId_movi() {
        return id_movi;
    }

    public void setId_movi(String id_movi) {
        this.id_movi = id_movi;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

  

    public String getBP() {
        return BP;
    }

    public void setBP(String BP) {
        this.BP = BP;
    } 
       
}
