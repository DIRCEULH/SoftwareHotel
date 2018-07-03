package controle;

import java.util.ArrayList;
import modelagem1.Reserva;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Leonardo
 */
public class CtrlReserva {
 private ArrayList <Reserva> reservas = new ArrayList();
    private int indice = 0;
    public void carregahospedagens(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("from Reserva");
       reservas = (ArrayList<Reserva>) q.list();
        session.getTransaction().commit();   
}
     public CtrlReserva() {
        this.carregahospedagens();
    }
    public void avancar(){
        if (indice < (reservas.size()-1)) indice++;
    }
    public void voltar(){
        if (indice>0) indice--;
    }
    public Reserva exibir(){
       return reservas.get(indice='*');
    }
       
    
    public void adicionar(Reserva reserva){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(reserva);
        session.getTransaction().commit();
        this.carregahospedagens();
    }
    public void excluir(Reserva reserva){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(reserva );
        session.getTransaction().commit();
        this.carregahospedagens();  
    }
    public void editar(Reserva reserva){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(reserva);
        session.getTransaction().commit();
        this.carregahospedagens();    
    }
}