

package visao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import visao.Menu;

/**
 *
 * @author Dirceu
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        this.setIconImage(new ImageIcon(getClass(). getResource("ScreenHunter_06 Aug. 19 17.25.gif")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSair = new javax.swing.JButton();
        jEntrar = new javax.swing.JButton();
        jSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/ScreenHunter_71 Aug. 18 22.00.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 240));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("USUARIO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));
        getContentPane().add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 240, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("SENHA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jSair.setBackground(new java.awt.Color(102, 102, 102));
        jSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSair.setForeground(new java.awt.Color(255, 255, 255));
        jSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/cancel.png"))); // NOI18N
        jSair.setText("SAIR");
        jSair.setBorder(null);
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        jSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSairKeyPressed(evt);
            }
        });
        getContentPane().add(jSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 110, 50));

        jEntrar.setBackground(new java.awt.Color(102, 102, 102));
        jEntrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/ok.png"))); // NOI18N
        jEntrar.setText("ENTRAR");
        jEntrar.setBorder(null);
        jEntrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jEntrarFocusLost(evt);
            }
        });
        jEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEntrarMouseClicked(evt);
            }
        });
        jEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntrarActionPerformed(evt);
            }
        });
        jEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(jEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 110, 50));

        jSenha.setText("jPasswordField1");
        getContentPane().add(jSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 240, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Esqueceu a senha?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/fd.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntrarActionPerformed
  try {
              //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
 
            //Abrindo a conexão
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
            
            //Executa a query de seleção
          
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("select  *from login");
              ResultSet rs = st.getResultSet();
        
                while (rs.next()){
        
        

  if(jUsuario.getText().equals(rs.getString("usuario"))&&jSenha.getText().equals(rs.getString("senha"))){

   new Menu().setVisible(true);
                this.dispose();  
      return;
   }
   else{
 
 javax.swing.JOptionPane.showMessageDialog(null, " Login Incorreto!"+ "\n" +" Acesso Negado!","",2);  
  return;
  }  
                
  }
     
                
  }catch (SQLException | ClassNotFoundException e) {
            javax.swing.JOptionPane.showMessageDialog(jEntrar, e);
        }//Fim try
 
    
 
    }//GEN-LAST:event_jEntrarActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
            System.exit(0);
    }//GEN-LAST:event_jSairActionPerformed

    private void jEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEntrarKeyPressed
      try {
              //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
 
            //Abrindo a conexão
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "root");
            
            //Executa a query de seleção
          
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("select  *from login");
              ResultSet rs = st.getResultSet();
        
                while (rs.next()){
        
        

  if(jUsuario.getText().equals(rs.getString("usuario"))&&jSenha.getText().equals(rs.getString("senha"))){

   new Menu().setVisible(true);
                this.dispose();  
      return;
   }
   else{
 
 javax.swing.JOptionPane.showMessageDialog(null, " Login Incorreto!"+ "\n" +" Acesso Negado!");  
  return;
  }  
                
  }
     
                
  }catch (SQLException | ClassNotFoundException e) {
            javax.swing.JOptionPane.showMessageDialog(jEntrar, e);
        }//Fim try 
                    
    }//GEN-LAST:event_jEntrarKeyPressed

    private void jSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSairKeyPressed
        System.exit(0);
    }//GEN-LAST:event_jSairKeyPressed

    private void jEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEntrarMouseClicked
        
    }//GEN-LAST:event_jEntrarMouseClicked

    private void jEntrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jEntrarFocusLost
     
    }//GEN-LAST:event_jEntrarFocusLost

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       RecuperaSenha form=  new RecuperaSenha();
       form.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jSair;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JTextField jUsuario;
    // End of variables declaration//GEN-END:variables
 
}