/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.mysql.jdbc.Connection;
import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Dirceu
 */
public class NewMasterReserva extends JPanel {
    
    public NewMasterReserva() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }
TelaHospedagem janela2= new TelaHospedagem();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("hotel?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Reserva r");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        nomeLabel = new javax.swing.JLabel();
        idquartoLabel = new javax.swing.JLabel();
        qtpessoasLabel = new javax.swing.JLabel();
        dataentradaLabel = new javax.swing.JLabel();
        datasaidaLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        nquartoField = new javax.swing.JTextField();
        qtpessoasField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dataentradaField = new javax.swing.JFormattedTextField();
        datasaidaField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idreserva}"));
        columnBinding.setColumnName("Idreserva");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nquarto}"));
        columnBinding.setColumnName("Quarto");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${qtpessoas}"));
        columnBinding.setColumnName("Qtpessoas");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataentrada}"));
        columnBinding.setColumnName("Dataentrada");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${datasaida}"));
        columnBinding.setColumnName("Datasaida");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);

        add(masterScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 790, 240));

        nomeLabel.setText("Nome:");
        add(nomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        idquartoLabel.setText("Quarto:");
        add(idquartoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        qtpessoasLabel.setText("Qtpessoas:");
        add(qtpessoasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, 20));

        dataentradaLabel.setText("Dataentrada:");
        add(dataentradaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 20));

        datasaidaLabel.setText("Datasaida:");
        add(datasaidaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 20));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), nomeField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nomeField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        nomeField.addMouseListener(formListener);
        add(nomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 340, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nquarto}"), nquartoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nquartoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        nquartoField.addFocusListener(formListener);
        nquartoField.addMouseListener(formListener);
        add(nquartoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.qtpessoas}"), qtpessoasField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), qtpessoasField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        qtpessoasField.addMouseListener(formListener);
        add(qtpessoasField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 130, -1));

        saveButton.setBackground(new java.awt.Color(153, 255, 255));
        saveButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/filesave.png"))); // NOI18N
        saveButton.setText("Salvar");
        saveButton.addActionListener(formListener);
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 140, 30));

        refreshButton.setBackground(new java.awt.Color(153, 255, 255));
        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/reload.png"))); // NOI18N
        refreshButton.setText("Atualizar");
        refreshButton.addActionListener(formListener);
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 140, 30));

        newButton.setBackground(new java.awt.Color(153, 255, 255));
        newButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/edit_add.png"))); // NOI18N
        newButton.setText("Novo");
        newButton.addActionListener(formListener);
        add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 140, 30));

        deleteButton.setBackground(new java.awt.Color(153, 255, 255));
        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/cancel.png"))); // NOI18N
        deleteButton.setText("Excluir");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 140, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/application_view_columns.png"))); // NOI18N
        jButton1.setText("ListaReserva");
        jButton1.addActionListener(formListener);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 140, 30));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/redo.png"))); // NOI18N
        jButton2.setText("Hospedar");
        jButton2.addActionListener(formListener);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 140, 30));

        try {
            dataentradaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataentrada}"), dataentradaField, org.jdesktop.beansbinding.BeanProperty.create("value"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement !=null}"), dataentradaField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(dataentradaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 110, -1));

        try {
            datasaidaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.datasaida}"), datasaidaField, org.jdesktop.beansbinding.BeanProperty.create("value"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement !=null}"), datasaidaField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(datasaidaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/fd.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.FocusListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == saveButton) {
                NewMasterReserva.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                NewMasterReserva.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                NewMasterReserva.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                NewMasterReserva.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                NewMasterReserva.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                NewMasterReserva.this.jButton2ActionPerformed(evt);
            }
        }

        public void focusGained(java.awt.event.FocusEvent evt) {
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            if (evt.getSource() == nquartoField) {
                NewMasterReserva.this.nquartoFieldFocusLost(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == nomeField) {
                NewMasterReserva.this.nomeFieldMouseClicked(evt);
            }
            else if (evt.getSource() == nquartoField) {
                NewMasterReserva.this.nquartoFieldMouseClicked(evt);
            }
            else if (evt.getSource() == qtpessoasField) {
                NewMasterReserva.this.qtpessoasFieldMouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }
    }// </editor-fold>//GEN-END:initComponents

    

    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<modelagem.Reserva> toRemove = new ArrayList<modelagem.Reserva>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            modelagem.Reserva r = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(r);
            entityManager.remove(r);
            javax.swing.JOptionPane.showMessageDialog(null, "Para excluir selecione Salvar");
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        modelagem.Reserva r = new modelagem.Reserva();
        entityManager.persist(r);
        list.add(r);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
if(nomeField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Nome campo obrigatório","",2);
    return;
}if(nquartoField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Quarto campo obrigatório","",2);
    return;
}if(dataentradaField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Dataentrada campo obrigatório","",2);
    return;
}if(datasaidaField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Datasaida campo obrigatório","",2);
    return;}
if(qtpessoasField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Pessoas campo obrigatório","",2);
    return;}
try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
              javax.swing.JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<modelagem.Reserva> merged = new ArrayList<modelagem.Reserva>(list.size());
            for (modelagem.Reserva r : list) {
                merged.add(entityManager.merge(r));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaReserva form= new ListaReserva();
        form.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if(!nomeField.getText().isEmpty()){
       
       if(janela2==null){
          
 janela2= new TelaHospedagem();
              
           janela2.setVisible(true);
             
       }else{
        
           janela2.setVisible(true);
             
       }
      janela2.enviaNome(this, nomeField.getText() );
      }       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nquartoFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nquartoFieldMouseClicked
     try {
              //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
 
            //Abrindo a conexão
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
            
            //Executa a query de seleção
          
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("select * from quarto ");
              ResultSet rs = st.getResultSet();
              
              JPopupMenu popup1 = new JPopupMenu();
               JPopupMenu popup2 = new JPopupMenu();
                 JPopupMenu popup3 = new JPopupMenu();
                   JPopupMenu popup4 = new JPopupMenu();
                    JPopupMenu popup5 = new JPopupMenu();
                     JPopupMenu popup6 = new JPopupMenu();
                      JPopupMenu popup7 = new JPopupMenu();
                       JPopupMenu popup8 = new JPopupMenu();
                        JPopupMenu popup9 = new JPopupMenu();
                         JPopupMenu popup10 = new JPopupMenu();
   
                while (rs.next()){
         
                 // Especifica os dados em ordena.
                 JMenuItem item = new JMenuItem (rs.getString("numero"));
        item.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
             nquartoField.setText(((JMenuItem) e.getSource()).getText());
                   
            }
      
        });  // Especifica os dados em ordena.
                 JMenuItem item1 = new JMenuItem (rs.getString("descrisao"));
        item1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
           
                   
            }
      
        });
           
            
       
                //Adiciona item ao jText
              popup1.add(item);
              popup2.add(item);
              popup3.add(item);
              popup4.add(item);
               popup5.add(item);
              popup6.add(item);
              popup7.add(item);
              popup8.add(item);
               popup9.add(item);
              popup10.add(item);
              
               popup1.add(item1);
              popup2.add(item1);
              popup3.add(item1);
              popup4.add(item1);
               popup5.add(item1);
              popup6.add(item1);
              popup7.add(item1);
              popup8.add(item1);
               popup9.add(item1);
              popup10.add(item1);
                //Mostra na Tela
              popup1.show(nquartoField, 0, 30);
              popup2.show(nquartoField, 0, 30);
              popup3.show(nquartoField, 0, 30);
              popup4.show(nquartoField, 0, 30);
              popup5.show(nquartoField, 0, 30);
              popup6.show(nquartoField, 0, 30);
              popup7.show(nquartoField, 0, 30);
              popup8.show(nquartoField, 0, 30);
              popup9.show(nquartoField, 0, 30);
              popup10.show(nquartoField, 0, 30);
           
    
                }
             
                
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(nquartoField, e);
        }//Fim try
    }//GEN-LAST:event_nquartoFieldMouseClicked

    private void nomeFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeFieldMouseClicked
         try {
              //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
 
            //Abrindo a conexão
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
            
            //Executa a query de seleção
          
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("select * from candidato ");
              ResultSet rs = st.getResultSet();
              
               JPopupMenu popup1 = new JPopupMenu();
               JPopupMenu popup2 = new JPopupMenu();
               JPopupMenu popup3 = new JPopupMenu();
               JPopupMenu popup4 = new JPopupMenu();
               JPopupMenu popup5 = new JPopupMenu();
               JPopupMenu popup6 = new JPopupMenu();
               JPopupMenu popup7 = new JPopupMenu();
               JPopupMenu popup8 = new JPopupMenu();
               JPopupMenu popup9 = new JPopupMenu();
               JPopupMenu popup10 = new JPopupMenu();
   
                while (rs.next()){
         
                 // Especifica os dados em ordena.
                 JMenuItem item = new JMenuItem (rs.getString("nome"));
        item.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
         nomeField.setText(((JMenuItem) e.getSource()).getText());
                   
            }
      
        });
           
            
        
                //Adiciona item ao jText
              popup1.add(item);
              popup2.add(item);
              popup3.add(item);
              popup4.add(item);
               popup5.add(item);
              popup6.add(item);
              popup7.add(item);
              popup8.add(item);
               popup9.add(item);
              popup10.add(item);
              
                //Mostra na Tela
              popup1.show(nomeField, 0, 30);
              popup2.show(nomeField, 0, 30);
              popup3.show(nomeField, 0, 30);
              popup4.show(nomeField, 0, 30);
              popup5.show(nomeField, 0, 30);
              popup6.show(nomeField, 0, 30);
              popup7.show(nomeField, 0, 30);
              popup8.show(nomeField, 0, 30);
              popup9.show(nomeField, 0, 30);
              popup10.show(nomeField, 0, 30);
           
    
                }
             
                
           
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(nomeField, e);
        }//Fim try 
    }//GEN-LAST:event_nomeFieldMouseClicked

    private void qtpessoasFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qtpessoasFieldMouseClicked
      //cria o primeiro item do menu e atribui uma ação pra ele
        JMenuItem item1 = new JMenuItem("1");
        item1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                qtpessoasField.setText("1");
            }
        });

        //cria o segundo item do menu e atribui uma ação pra ele
        JMenuItem item2 = new JMenuItem("2");
        item2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               qtpessoasField.setText("2");
            }
        });

        //cria o terceiro item do menu e atribui uma ação pra ele
        JMenuItem item3 = new JMenuItem("3");
        item3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                qtpessoasField.setText("3");
            }
        });
         JMenuItem item4 = new JMenuItem("4");
        item4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                qtpessoasField.setText("4");
            }
        });
         JMenuItem item5 = new JMenuItem("5");
        item5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                qtpessoasField.setText("5");
            }
        });
         JMenuItem item6 = new JMenuItem("6");
        item6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                qtpessoasField.setText("6");
            }
        });


        //cria o menu popup e adiciona os 3 itens
        JPopupMenu popup = new JPopupMenu();
        popup.add(item1);
        popup.add(item2);
        popup.add(item3);
        popup.add(item4);
        popup.add(item5);
        popup.add(item6);

        //mostra na tela
        popup.show(qtpessoasField, 0, 30);
    }//GEN-LAST:event_qtpessoasFieldMouseClicked

    private void nquartoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nquartoFieldFocusLost
             try {
              //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
 
            //Abrindo a conexão
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
            
            //Executa a query de seleção
          
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("SELECT  *FROM hospedagem ORDER BY datasaida DESC");
              ResultSet rs = st.getResultSet();
        
                while (rs.next()){
        if(nquartoField.getText().equals(rs.getString("nquarto"))){
     javax.swing.JOptionPane.showMessageDialog(null, "Quarto "+(rs.getString("nquarto"))+" Ultima hospedagem:"+"\n"+
             "Data Entrada: "+(rs.getString("dataentrada"))+"\n"+"Data Saida: "+(rs.getString("datasaida")),"",0);
     return;
        }
                }
         } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(nquartoField, e);
        }//Fim try
    }//GEN-LAST:event_nquartoFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField dataentradaField;
    private javax.swing.JLabel dataentradaLabel;
    private javax.swing.JFormattedTextField datasaidaField;
    private javax.swing.JLabel datasaidaLabel;
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel idquartoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private java.util.List<modelagem.Reserva> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nquartoField;
    private javax.swing.JTextField qtpessoasField;
    private javax.swing.JLabel qtpessoasLabel;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewMasterReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMasterReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMasterReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMasterReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new NewMasterReserva());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setTitle("Cadastro Reserva");
                frame.setResizable(false);
                frame.setIconImage(new ImageIcon(getClass(). getResource("ScreenHunter_06 Aug. 19 17.25.gif")).getImage());
            frame.setLocationRelativeTo(null);
            }
        });
    }
    
}
