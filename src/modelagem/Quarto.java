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
 * @author 102650
 */
@Entity
@Table(name = "quarto", catalog = "hotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Quarto.findAll", query = "SELECT q FROM Quarto q"),
    @NamedQuery(name = "Quarto.findByIdquarto", query = "SELECT q FROM Quarto q WHERE q.idquarto = :idquarto"),
    @NamedQuery(name = "Quarto.findByNumero", query = "SELECT q FROM Quarto q WHERE q.numero = :numero"),
    @NamedQuery(name = "Quarto.findByDescrisao", query = "SELECT q FROM Quarto q WHERE q.descrisao = :descrisao"),
    @NamedQuery(name = "Quarto.findByLocalizacao", query = "SELECT q FROM Quarto q WHERE q.localizacao = :localizacao"),
    @NamedQuery(name = "Quarto.findByPreco", query = "SELECT q FROM Quarto q WHERE q.preco = :preco")})
public class Quarto implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idquarto")
    private Integer idquarto;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "descrisao")
    private String descrisao;
    @Basic(optional = false)
    @Column(name = "localizacao")
    private String localizacao;
    @Basic(optional = false)
    @Column(name = "preco")
    private String preco;

    public Quarto() {
    }

    public Quarto(Integer idquarto) {
        this.idquarto = idquarto;
    }

    public Quarto(Integer idquarto, int numero, String descrisao, String localizacao, String preco) {
        this.idquarto = idquarto;
        this.numero = numero;
        this.descrisao = descrisao;
        this.localizacao = localizacao;
        this.preco = preco;
    }

    public Integer getIdquarto() {
        return idquarto;
    }

    public void setIdquarto(Integer idquarto) {
        Integer oldIdquarto = this.idquarto;
        this.idquarto = idquarto;
        changeSupport.firePropertyChange("idquarto", oldIdquarto, idquarto);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        int oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getDescrisao() {
        return descrisao;
    }

    public void setDescrisao(String descrisao) {
        String oldDescrisao = this.descrisao;
        this.descrisao = descrisao;
        changeSupport.firePropertyChange("descrisao", oldDescrisao, descrisao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        String oldLocalizacao = this.localizacao;
        this.localizacao = localizacao;
        changeSupport.firePropertyChange("localizacao", oldLocalizacao, localizacao);
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        String oldPreco = this.preco;
        this.preco = preco;
        changeSupport.firePropertyChange("preco", oldPreco, preco);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idquarto != null ? idquarto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quarto)) {
            return false;
        }
        Quarto other = (Quarto) object;
        if ((this.idquarto == null && other.idquarto != null) || (this.idquarto != null && !this.idquarto.equals(other.idquarto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.Quarto[ idquarto=" + idquarto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
