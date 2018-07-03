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
@Table(name = "reserva", catalog = "hotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findByIdreserva", query = "SELECT r FROM Reserva r WHERE r.idreserva = :idreserva"),
    @NamedQuery(name = "Reserva.findByNome", query = "SELECT r FROM Reserva r WHERE r.nome = :nome"),
    @NamedQuery(name = "Reserva.findByNquarto", query = "SELECT r FROM Reserva r WHERE r.nquarto = :nquarto"),
    @NamedQuery(name = "Reserva.findByDataentrada", query = "SELECT r FROM Reserva r WHERE r.dataentrada = :dataentrada"),
    @NamedQuery(name = "Reserva.findByDatasaida", query = "SELECT r FROM Reserva r WHERE r.datasaida = :datasaida"),
    @NamedQuery(name = "Reserva.findByQtpessoas", query = "SELECT r FROM Reserva r WHERE r.qtpessoas = :qtpessoas")})
public class Reserva implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreserva")
    private Integer idreserva;
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "nquarto")
    private Integer nquarto;
    @Column(name = "dataentrada")
    private String dataentrada;
    @Column(name = "datasaida")
    private String datasaida;
    @Column(name = "qtpessoas")
    private Integer qtpessoas;

    public Reserva() {
    }

    public Reserva(Integer idreserva) {
        this.idreserva = idreserva;
    }

    public Integer getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Integer idreserva) {
        Integer oldIdreserva = this.idreserva;
        this.idreserva = idreserva;
        changeSupport.firePropertyChange("idreserva", oldIdreserva, idreserva);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    

    public Integer getNquarto() {
        return nquarto;
    }

    public void setNquarto(Integer nquarto) {
        Integer oldNquarto = this.nquarto;
        this.nquarto = nquarto;
        changeSupport.firePropertyChange("nquarto", oldNquarto, nquarto);
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

    public Integer getQtpessoas() {
        return qtpessoas;
    }

    public void setQtpessoas(Integer qtpessoas) {
        Integer oldQtpessoas = this.qtpessoas;
        this.qtpessoas = qtpessoas;
        changeSupport.firePropertyChange("qtpessoas", oldQtpessoas, qtpessoas);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreserva != null ? idreserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.idreserva == null && other.idreserva != null) || (this.idreserva != null && !this.idreserva.equals(other.idreserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "visao.Reserva[ idreserva=" + idreserva + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
