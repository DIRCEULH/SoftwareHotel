package modelagem1;
// Generated 12/10/2015 11:51:43 by Hibernate Tools 4.3.1



/**
 * Reserva generated by hbm2java
 */
public class Reserva  implements java.io.Serializable {


     private int idreserva;
     private String nome;
     private int nquarto;
     private String dataentrada;
     private String datasaida;
     private int qtpessoas;

    public Reserva() {
    }
   public Reserva(String nome, int qtpessoas, int nquarto, String dataentrada, String datasaida) {
    this.idreserva=idreserva;
      this.nome = nome;
       this.nquarto = nquarto;
       this.dataentrada = dataentrada;
       this.datasaida = datasaida;
       this.qtpessoas = qtpessoas;
    }

  
   
    public Integer getIdreserva() {
        return this.idreserva;
    }
    
    public void setIdreserva(Integer idreserva) {
        this.idreserva = idreserva;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNquarto() {
        return this.nquarto;
    }
    
    public void setNquarto(int nquarto) {
        this.nquarto = nquarto;
    }
    public String getDataentrada() {
        return this.dataentrada;
    }
    
    public void setDataentrada(String dataentrada) {
        this.dataentrada = dataentrada;
    }
    public String getDatasaida() {
        return this.datasaida;
    }
    
    public void setDatasaida(String datasaida) {
        this.datasaida = datasaida;
    }
    public int getQtpessoas() {
        return this.qtpessoas;
    }
    
    public void setQtpessoas(int qtpessoas) {
        this.qtpessoas = qtpessoas;
    }




}


