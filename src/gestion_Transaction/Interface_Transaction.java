/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_Transaction;

import gestion_CarteBancaire.Menu;
import gestion_CarteBancaire.infos_carte;
import gestionbancaires.client;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zakaria Nabil
 */
public class Interface_Transaction extends javax.swing.JFrame {
    
static List <transaction>l=new ArrayList<transaction>();
    DefaultTableModel ml=new DefaultTableModel();
    String [] col={"De","Numéro De Compte","A ","Numéro De Compte","Montant","Le"};
    public Interface_Transaction() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_emetteur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_numcompte = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nom2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_numcompte2 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        txt_montant = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        datetransaction = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(876, 430));
        setMinimumSize(new java.awt.Dimension(876, 430));
        setPreferredSize(new java.awt.Dimension(876, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion Transaction");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 850, 100);

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel2.setText("Nom De L'Émetteur :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 140, 150, 30);

        txt_emetteur.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel1.add(txt_emetteur);
        txt_emetteur.setBounds(10, 170, 140, 40);

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel3.setText("Son Numéro De Compte :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 220, 180, 30);

        try {
            txt_numcompte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txt_numcompte);
        txt_numcompte.setBounds(10, 250, 140, 40);

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel4.setText("Nom Du Récepteur :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(680, 140, 140, 20);

        txt_nom2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel1.add(txt_nom2);
        txt_nom2.setBounds(680, 160, 140, 40);

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel5.setText("Son Numéro De Compte : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(680, 214, 180, 20);

        try {
            txt_numcompte2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txt_numcompte2);
        txt_numcompte2.setBounds(680, 240, 140, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_Transaction/icons8-dollars-américain-70.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 140, 100, 80);

        txt_montant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_montant.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(txt_montant);
        txt_montant.setBounds(360, 270, 150, 40);

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Montant");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 240, 100, 20);

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel7.setText("DHS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 270, 40, 40);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jButton2.setText("Afficher Les Transactions");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 360, 880, 70);
        jPanel1.add(datetransaction);
        datetransaction.setBounds(10, 320, 150, 30);

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel8.setText("Date De Transaction : ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 300, 180, 20);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestionbancaires/icons8-accueil-30.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(0, 0, 50, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Listes_transactions it = new Listes_transactions();
      it.setVisible(true);
      this.dispose();
              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            SimpleDateFormat df=new SimpleDateFormat("MMM d, yyyy");        
            String nomemeteur = this.txt_emetteur.getText();
          
            String numcompte1 = this.txt_numcompte.getText();
            
            String nomrecepteur = this.txt_nom2.getText();
          
            String numcompte2 = this.txt_numcompte2.getText();
            
         
            double montant =Double.parseDouble(this.txt_montant.getText());
      
            Date datetransaction = this.datetransaction.getDate();
         
      
        if(this.txt_emetteur.getText().equals("")||this.txt_numcompte.getText().equals("")||this.txt_nom2.getText().equals("")||this.txt_numcompte2.getText().equals("")||this.datetransaction.getDate()==null||this.txt_montant.getText()==null)

        { JOptionPane.showMessageDialog(this,"Veuillez Remplir Tous Les Champs","Erreur Lors De La Saisie",JOptionPane.ERROR_MESSAGE);}

       
      
        
   
    transaction e =null;
     
        
         {
             e=new transaction(nomemeteur,numcompte1,nomrecepteur,numcompte2,montant,datetransaction);
            l.add(e);
            ml.addRow(new Object[]{e.getNomemeteur(),e.getNumcompte1(),e.getNomrecepteur(),e.getNumcompte2(),e.getMontant(),df.format(e.getDatetransaction())});
         }///Liste Des Transactions
      //// Save
          FileOutputStream f=null;
        ObjectOutputStream ff=null;
    
        

        try
        {
            f=new FileOutputStream ("Liste Des Transactions.txt");
            ff= new ObjectOutputStream(f);
            ff.writeObject(l);
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        finally
        {
            try {
                 
                ff.close();
                 
           }catch (IOException ex) {
            }
        }
      recu rc = new recu();
      rc.setVisible(true);
      this.dispose();
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface_Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.toedter.calendar.JDateChooser datetransaction;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField txt_emetteur;
    public static javax.swing.JTextField txt_montant;
    public static javax.swing.JTextField txt_nom2;
    public static javax.swing.JFormattedTextField txt_numcompte;
    public static javax.swing.JFormattedTextField txt_numcompte2;
    // End of variables declaration//GEN-END:variables
}
