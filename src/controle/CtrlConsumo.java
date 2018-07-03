package controle;

import java.util.ArrayList;
import modelagem1.Consumo;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Leonardo
 */
public class CtrlConsumo {
 private ArrayList <Consumo>consumos = new ArrayList();
    private int indice = 0;
    public void carregaconsumos(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("from Consumo");
       consumos = (ArrayList<Consumo>) q.list();
        session.getTransaction().commit();   
}
     public CtrlConsumo() {
        this.carregaconsumos();
    }
    public void avancar(){
        if (indice < (consumos.size()-1)) indice++;
    }
    public void voltar(){
        if (indice>0) indice--;
    }
    public Consumo exibir(){
       return consumos.get(indice='*');
    }
       
    
    public void adicionar(Consumo consumo){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(consumo);
        session.getTransaction().commit();
        this.carregaconsumos();
    }
    public void excluir(Consumo consumo){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(consumo);
        session.getTransaction().commit();
        this.carregaconsumos();  
    }
    

    public void editar(Consumo consumo){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(consumo);
        session.getTransaction().commit();
        this.carregaconsumos();    
    }
}