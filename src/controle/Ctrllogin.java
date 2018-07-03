/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import modelagem1.Login;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Leonardo
 */
public class Ctrllogin {
 private ArrayList <Login> logins = new ArrayList();
    private int indice = 0;
    public void carregalogins(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("from Login");
        logins = (ArrayList<Login>) q.list();
        session.getTransaction().commit();   
}
     public Ctrllogin() {
        this.carregalogins();
    }
    public void avancar(){
        if (indice < (logins.size()-1)) indice++;
    }
    public void voltar(){
        if (indice>0) indice--;
    }
    public Login exibir(){
       return logins.get(indice);
    }
       
    
    public void adicionar(Login login){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(login);
        session.getTransaction().commit();
        this.carregalogins();
    }
    public void excluir(Login login){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(login );
        session.getTransaction().commit();
        this.carregalogins();  
    }
    

    public void editar(Login login){
     Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(login);
        session.getTransaction().commit();
        this.carregalogins();    
    }

   
}