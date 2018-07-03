/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelagem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Dirceu
 */
@Entity
@Table(name = "consumo", catalog = "hotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Consumo.findAll", query = "SELECT c FROM Consumo c"),
    @NamedQuery(name = "Consumo.findByIdconsumo", query = "SELECT c FROM Consumo c WHERE c.idconsumo = :idconsumo"),
    @NamedQuery(name = "Consumo.findByIdhospedagem", query = "SELECT c FROM Consumo c WHERE c.idhospedagem = :idhospedagem"),
    @NamedQuery(name = "Consumo.findByNomeproduto", query = "SELECT c FROM Consumo c WHERE c.nomeproduto = :nomeproduto"),
    @NamedQuery(name = "Consumo.findByPreco", query = "SELECT c FROM Consumo c WHERE c.preco = :preco"),
    @NamedQuery(name = "Consumo.findByQuantidade", query = "SELECT c FROM Consumo c WHERE c.quantidade = :quantidade"),
    @NamedQuery(name = "Consumo.findByNome", query = "SELECT c FROM Consumo c WHERE c.nome = :nome"),
    @NamedQuery(name = "Consumo.findByDia", query = "SELECT c FROM Consumo c WHERE c.dia = :dia"),
    @NamedQuery(name = "Consumo.findByMes", query = "SELECT c FROM Consumo c WHERE c.mes = :mes"),
    @NamedQuery(name = "Consumo.findByAno", query = "SELECT c FROM Consumo c WHERE c.ano = :ano")})
public class Consumo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconsumo")
    private Integer idconsumo;
    @Column(name = "idhospedagem")
    private Integer idhospedagem;
    @Column(name = "nomeproduto")
    private String nomeproduto;
    @Column(name = "preco")
    private String preco;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dia")
    private String dia;
    @Column(name = "mes")
    private String mes;
    @Column(name = "ano")
    private String ano;

    public Consumo() {
    }

    public Consumo(Integer idconsumo) {
        this.idconsumo = idconsumo;
    }

    public Integer getIdconsumo() {
        return idconsumo;
    }

    public void setIdconsumo(Integer idconsumo) {
        Integer oldIdconsumo = this.idconsumo;
        this.idconsumo = idconsumo;
        changeSupport.firePropertyChange("idconsumo", oldIdconsumo, idconsumo);
    }

    public Integer getIdhospedagem() {
        return idhospedagem;
    }

    public void setIdhospedagem(Integer idhospedagem) {
        Integer oldIdhospedagem = this.idhospedagem;
        this.idhospedagem = idhospedagem;
        changeSupport.firePropertyChange("idhospedagem", oldIdhospedagem, idhospedagem);
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        String oldNomeproduto = this.nomeproduto;
        this.nomeproduto = nomeproduto;
        changeSupport.firePropertyChange("nomeproduto", oldNomeproduto, nomeproduto);
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        String oldPreco = this.preco;
        this.preco = preco;
        changeSupport.firePropertyChange("preco", oldPreco, preco);
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        Integer oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        String oldDia = this.dia;
        this.dia = dia;
        changeSupport.firePropertyChange("dia", oldDia, dia);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        String oldMes = this.mes;
        this.mes = mes;
        changeSupport.firePropertyChange("mes", oldMes, mes);
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        String oldAno = this.ano;
        this.ano = ano;
        changeSupport.firePropertyChange("ano", oldAno, ano);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconsumo != null ? idconsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consumo)) {
            return false;
        }
        Consumo other = (Consumo) object;
        if ((this.idconsumo == null && other.idconsumo != null) || (this.idconsumo != null && !this.idconsumo.equals(other.idconsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.Consumo[ idconsumo=" + idconsumo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
