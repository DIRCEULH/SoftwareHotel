package controle;

import java.util.ArrayList;
import modelagem1.Hospedagem;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Leonardo
 */
public class CtrlHospedagem {
 private ArrayList <Hospedagem> hospedagens = new ArrayList();
    private int indice = 0;
    public void carregahospedagens(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery(" FROM Hospedagem  ");
        hospedagens = (ArrayList<Hospedagem>) q.list();
        session.getTransaction().commit();   
}
     public CtrlHospedagem() {
        this.carregahospedagens();
    }
    public void avancar(){
        if (indice < (hospedagens.size()-1)) indice++;
    }
    public void voltar(){
        if (indice>0) indice--;
    }
    public Hospedagem exibir(){
      return  hospedagens.get(Integer.MAX_VALUE);
    }
       
    
    public void adicionar(Hospedagem hospedagem){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(hospedagem);
        session.getTransaction().commit();
        this.carregahospedagens();
           
    }
    public void excluir(Hospedagem hospedagem){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(hospedagem );
        session.getTransaction().commit();
        this.carregahospedagens();  
    }
    public void editar(Hospedagem hospedagem){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(hospedagem);
        session.getTransaction().commit();
        this.carregahospedagens();    
    }
}