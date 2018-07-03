/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import com.mysql.jdbc.Connection;
import java.awt.EventQueue;
import java.beans.Beans;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 102650
 */
public class NewMasterDetailForm extends JPanel {
    
    public NewMasterDetailForm() {
        initComponents();
       

    
          
       
     if (!Beans.isDesignTime()) {
        
            entityManager.getTransaction().begin();
     }
       
    }
TelaHospedagem janela2= new TelaHospedagem();
TelaReserva janela3= new TelaReserva();
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Candidato c");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        nomeLabel = new javax.swing.JLabel();
        rgLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        telefoneLabel = new javax.swing.JLabel();
        ruaLabel = new javax.swing.JLabel();
        bairroLabel = new javax.swing.JLabel();
        cidadeLabel = new javax.swing.JLabel();
        estadoLabel = new javax.swing.JLabel();
        nLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        rgField = new javax.swing.JTextField();
        cpfField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        ruaField = new javax.swing.JTextField();
        bairroField = new javax.swing.JTextField();
        cidadeField = new javax.swing.JTextField();
        estadoField = new javax.swing.JTextField();
        nField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        telefoneField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        setBackground(new java.awt.Color(153, 255, 255));
        setFocusTraversalPolicyProvider(true);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rg}"));
        columnBinding.setColumnName("Rg");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rua}"));
        columnBinding.setColumnName("Rua");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bairro}"));
        columnBinding.setColumnName("Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidade}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estado}"));
        columnBinding.setColumnName("Estado");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${n}"));
        columnBinding.setColumnName("N");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        masterScrollPane.setViewportView(masterTable);

        add(masterScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 790, 210));

        nomeLabel.setText("Nome:");
        add(nomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        rgLabel.setText("Rg:");
        add(rgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        cpfLabel.setText("Cpf:");
        add(cpfLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, 20));

        emailLabel.setText("Email:");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        telefoneLabel.setText("Telefone:");
        add(telefoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 20));

        ruaLabel.setText("Rua:");
        add(ruaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        bairroLabel.setText("Bairro:");
        add(bairroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        cidadeLabel.setText("Cidade:");
        add(cidadeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 20));

        estadoLabel.setText("Estado:");
        add(estadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 50, 20));

        nLabel.setText("Numero:");
        add(nLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, 20));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), nomeField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nomeField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(nomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 380, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.rg}"), rgField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), rgField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(rgField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 170, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cpf}"), cpfField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), cpfField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        cpfField.addFocusListener(formListener);
        add(cpfField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 170, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.email}"), emailField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), emailField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        emailField.addFocusListener(formListener);
        add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 190, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.rua}"), ruaField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), ruaField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(ruaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 263, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bairro}"), bairroField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), bairroField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        bairroField.addActionListener(formListener);
        add(bairroField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 380, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cidade}"), cidadeField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), cidadeField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(cidadeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 263, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.estado}"), estadoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), estadoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(estadoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 60, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.n}"), nField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(nField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 60, -1));

        saveButton.setBackground(new java.awt.Color(153, 255, 255));
        saveButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/filesave.png"))); // NOI18N
        saveButton.setText("Salvar");
        saveButton.addActionListener(formListener);
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 170, 30));

        refreshButton.setBackground(new java.awt.Color(153, 255, 255));
        refreshButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/reload.png"))); // NOI18N
        refreshButton.setText("Atualizar");
        refreshButton.addActionListener(formListener);
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 170, 30));

        newButton.setBackground(new java.awt.Color(153, 255, 255));
        newButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/edit_add.png"))); // NOI18N
        newButton.setText("Novo");
        newButton.addActionListener(formListener);
        add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 170, 30));

        deleteButton.setBackground(new java.awt.Color(153, 255, 255));
        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/cancel.png"))); // NOI18N
        deleteButton.setText("Excluir");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 170, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/application_view_columns.png"))); // NOI18N
        jButton1.setText("Lista Cliente BD");
        jButton1.addActionListener(formListener);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 170, 30));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/redo.png"))); // NOI18N
        jButton2.setText("Hospedar");
        jButton2.addActionListener(formListener);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 170, 30));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/redo.png"))); // NOI18N
        jButton3.setText("Reservar");
        jButton3.addActionListener(formListener);
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 170, 30));

        try {
            telefoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefone}"), telefoneField, org.jdesktop.beansbinding.BeanProperty.create("value"));
        binding.setSourceUnreadableValue(null);
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement !=null}"), telefoneField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        add(telefoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/fd.jpg"))); // NOI18N
        jLabel1.setText("jLabel2");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 490));

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.FocusListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == bairroField) {
                NewMasterDetailForm.this.bairroFieldActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                NewMasterDetailForm.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                NewMasterDetailForm.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                NewMasterDetailForm.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                NewMasterDetailForm.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                NewMasterDetailForm.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                NewMasterDetailForm.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton3) {
                NewMasterDetailForm.this.jButton3ActionPerformed(evt);
            }
        }

        public void focusGained(java.awt.event.FocusEvent evt) {
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            if (evt.getSource() == cpfField) {
                NewMasterDetailForm.this.cpfFieldFocusLost(evt);
            }
            else if (evt.getSource() == emailField) {
                NewMasterDetailForm.this.emailFieldFocusLost(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents
 private static boolean validaCPF(String cpf) { 
      boolean ret = false; 
      String base = "000000000"; 
      String digitos = "00"; 
      if (cpf.length() <= 11) { 
         if (cpf.length() < 11) { 
            cpf = base.substring(0, 11 - cpf.length()) + cpf; 
            base = cpf.substring(0, 9); 
         } 
         base = cpf.substring(0, 9); 
         digitos = cpf.substring(9, 11); 
         int soma = 0, mult = 11; 
         int[] var = new int[11]; 
         // Recebe os nśmeros e realiza a multiplicaēćo e soma. 
         for (int i = 0; i < 9; i++) { 
            var[i] = Integer.parseInt("" + cpf.charAt(i)); 
            if (i < 9) 
               soma += (var[i] * --mult); 
         } 
         // Cria o primeiro dķgito verificador. 
         int resto = soma % 11; 
         if (resto < 2) { 
            var[9] = 0; 
         } else { 
            var[9] = 11 - resto; 
         } 
         // Reinicia os valores. 
         soma = 0; 
         mult = 11; 
         // Realiza a multiplicaēćo e soma do segundo dķgito. 
         for (int i = 0; i < 10; i++) 
            soma += var[i] * mult--; 
         // Cria o segundo dķgito verificador. 
         resto = soma % 11; 
         if (resto < 2) { 
            var[10] = 0; 
         } else { 
            var[10] = 11 - resto; 
         } 
         if ((digitos.substring(0, 1).equalsIgnoreCase(new Integer(var[9]) 
               .toString())) 
               && (digitos.substring(1, 2).equalsIgnoreCase(new Integer( 
                     var[10]).toString()))) { 
            ret = true; 
         } 
      }
 
      return ret; 
   }


   

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
        List<modelagem.Candidato> toRemove = new ArrayList<modelagem.Candidato>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            modelagem.Candidato c = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(c);
            entityManager.remove(c);
            javax.swing.JOptionPane.showMessageDialog(null, "Para excluir selecione Salvar");
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        modelagem.Candidato c = new modelagem.Candidato();
        entityManager.persist(c);
        list.add(c);
        int row = list.size() - 1;
      masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(nomeField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Nome campo obrigatório","",2);
    return;
}if(emailField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Email campo obrigatório","",2);
    return;
}if(ruaField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Rua campo obrigatório","",2);
    return;
}if(telefoneField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Telefone campo obrigatório","",2);
    return;
}if(bairroField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Bairro campo obrigatório","",2);
    return;
}if(cidadeField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Cidade campo obrigatório","",2);
    return;
}if(estadoField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Nome campo obrigatório","",2);
    return;
}if(nField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Nome campo obrigatório","",2);
    return;
}if(rgField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Rg campo obrigatório","",2);
    return;
}if(cpfField.getText().equals("")){
    javax.swing.JOptionPane.showMessageDialog(null, "Cpf campo obrigatório","",2);
    return;}
        
        
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
            
              javax.swing.JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<modelagem.Candidato> merged = new ArrayList<modelagem.Candidato>(list.size());
            for (modelagem.Candidato c : list) {
                merged.add(entityManager.merge(c));
              
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    ListaCandidato frame= new ListaCandidato();
    frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bairroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 if(!nomeField.getText().isEmpty()){
       
       if(janela2==null){
          
 janela2= new TelaHospedagem();
              
           janela2.setVisible(true);
             
       }else{
        
           janela2.setVisible(true);
             
       }
      janela2.enviaPalavra(this, nomeField.getText() );
      }       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if(!nomeField.getText().isEmpty()){
       
       if(janela3==null){
          
 janela3= new TelaReserva();
              
           janela3.setVisible(true);
             
       }else{
        
           janela3.setVisible(true);
             
       }
      janela3.enviaPalavra(this, nomeField.getText() );
      } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cpfFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfFieldFocusLost
      String cpf = cpfField.getText(); 
if(! validaCPF(cpf)){ //Chame o método da classe que valida o CPF. 
         javax.swing.JOptionPane.showMessageDialog(null, "Cpf Invalido");
         return;
}
    }//GEN-LAST:event_cpfFieldFocusLost

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
       if ((emailField.getText().contains("@")) &&
(emailField.getText().contains(".")) &&
(!emailField.getText().contains(" "))) {

String usuario = new String(emailField.getText().substring(0,
emailField.getText().lastIndexOf('@')));

            String dominio = new String(emailField.getText().substring(emailField.getText().lastIndexOf
('@') + 1, emailField.getText().length()));

            if ((usuario.length() >=1) && (!usuario.contains("@")) &&
(dominio.contains(".")) && (!dominio.contains("@")) && (dominio.indexOf(".") >=
1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) {

              jLabel1.setText("");

            } else {
javax.swing.JOptionPane.showMessageDialog(null, "E-mail Inválido");
                  

                emailField.requestFocus();

            }

        } else {
javax.swing.JOptionPane.showMessageDialog(null, "E-mail Inválido");
           

          emailField.requestFocus();

        }


    }//GEN-LAST:event_emailFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroField;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JTextField cidadeField;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField cpfField;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField estadoField;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private java.util.List<modelagem.Candidato> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JTextField nField;
    private javax.swing.JLabel nLabel;
    private javax.swing.JButton newButton;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField rgField;
    private javax.swing.JLabel rgLabel;
    private javax.swing.JTextField ruaField;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JFormattedTextField telefoneField;
    private javax.swing.JLabel telefoneLabel;
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
            java.util.logging.Logger.getLogger(NewMasterDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMasterDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMasterDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMasterDetailForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new NewMasterDetailForm());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setTitle("Cadastro Cliente");
                frame.setResizable(false);
                frame.setIconImage(new ImageIcon(getClass(). getResource("ScreenHunter_06 Aug. 19 17.25.gif")).getImage());
           
                frame.setLocationRelativeTo(null);
            }
        });
    }
    
}
