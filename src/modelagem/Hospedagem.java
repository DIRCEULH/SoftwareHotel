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
@Table(name = "hospedagem", catalog = "hotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Hospedagem.findAll", query = "SELECT h FROM Hospedagem h"),
    @NamedQuery(name = "Hospedagem.findByIdhospedagem", query = "SELECT h FROM Hospedagem h WHERE h.idhospedagem = :idhospedagem"),
    @NamedQuery(name = "Hospedagem.findByNome", query = "SELECT h FROM Hospedagem h WHERE h.nome = :nome"),
    @NamedQuery(name = "Hospedagem.findByNquarto", query = "SELECT h FROM Hospedagem h WHERE h.nquarto = :nquarto"),
    @NamedQuery(name = "Hospedagem.findByQtpessoas", query = "SELECT h FROM Hospedagem h WHERE h.qtpessoas = :qtpessoas"),
    @NamedQuery(name = "Hospedagem.findByDataentrada", query = "SELECT h FROM Hospedagem h WHERE h.dataentrada = :dataentrada"),
    @NamedQuery(name = "Hospedagem.findByDatasaida", query = "SELECT h FROM Hospedagem h WHERE h.datasaida = :datasaida"),
    @NamedQuery(name = "Hospedagem.findByPreco", query = "SELECT h FROM Hospedagem h WHERE h.preco = :preco")})
public class Hospedagem implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhospedagem")
    private Integer idhospedagem;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "nquarto")
    private int nquarto;
    @Basic(optional = false)
    @Column(name = "qtpessoas")
    private int qtpessoas;
    @Basic(optional = false)
    @Column(name = "dataentrada")
    private String dataentrada;
    @Basic(optional = false)
    @Column(name = "datasaida")
    private String datasaida;
    @Basic(optional = false)
    @Column(name = "preco")
    private String preco;

    public Hospedagem() {
    }

    public Hospedagem(Integer idhospedagem) {
        this.idhospedagem = idhospedagem;
    }

    public Hospedagem(Integer idhospedagem, String nome, int idquarto, int qtpessoas, String dataentrada, String datasaida, String preco) {
        this.idhospedagem = idhospedagem;
        this.nome = nome;
        this.nquarto = nquarto;
        this.qtpessoas = qtpessoas;
        this.dataentrada = dataentrada;
        this.datasaida = datasaida;
        this.preco = preco;
    }

    public Integer getIdhospedagem() {
        return idhospedagem;
    }

    public void setIdhospedagem(Integer idhospedagem) {
        Integer oldIdhospedagem = this.idhospedagem;
        this.idhospedagem = idhospedagem;
        changeSupport.firePropertyChange("idhospedagem", oldIdhospedagem, idhospedagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public int getNquarto() {
        return nquarto;
    }

    public void setNquarto(int nquarto) {
        int oldNquarto = this.nquarto;
        this.nquarto = nquarto;
        changeSupport.firePropertyChange("nquarto", oldNquarto, nquarto);
    }

    public int getQtpessoas() {
        return qtpessoas;
    }

    public void setQtpessoas(int qtpessoas) {
        int oldQtpessoas = this.qtpessoas;
        this.qtpessoas = qtpessoas;
        changeSupport.firePropertyChange("qtpessoas", oldQtpessoas, qtpessoas);
    }

    public String getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(String dataentrada) {
        String oldDataentrada = this.dataentrada;
        this.dataentrada = dataentrada;
        changeSupport.firePropertyChange("dataentrada", oldDataentrada, dataentrada);
    }

    public String getDatasaida() {
        return datasaida;
    }

    public void setDatasaida(String datasaida) {
        String oldDatasaida = this.datasaida;
        this.datasaida = datasaida;
        changeSupport.firePropertyChange("datasaida", oldDatasaida, datasaida);
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
        hash += (idhospedagem != null ? idhospedagem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospedagem)) {
            return false;
        }
        Hospedagem other = (Hospedagem) object;
        if ((this.idhospedagem == null && other.idhospedagem != null) || (this.idhospedagem != null && !this.idhospedagem.equals(other.idhospedagem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.Hospedagem[ idhospedagem=" + idhospedagem + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
