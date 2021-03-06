/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir1;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jacqu
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboSexe = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        sldNbAnnees = new javax.swing.JSlider();
        lblPrime = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnCalculer = new javax.swing.JButton();
        lblResultat = new javax.swing.JLabel();
        btnPrime = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        sldNbJours = new javax.swing.JSlider();
        jLabel11 = new javax.swing.JLabel();
        cboCategories = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cboEtats = new javax.swing.JComboBox<>();
        rbOui = new javax.swing.JRadioButton();
        rbNon = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPrix = new javax.swing.JTextField();
        lblRemboursement = new javax.swing.JLabel();
        btnRemboursement = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtEntier = new javax.swing.JTextField();
        btnBinaire = new javax.swing.JButton();
        lblBinaire = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Devoir n°1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Exercice n°1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Exercice n°4");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("Exercice n°3");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Exercice n°2");

        jLabel6.setText("Votre âge");

        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("Votre sexe");

        cboSexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femme", "Homme" }));

        jLabel8.setText("Nombre d'années");

        sldNbAnnees.setMajorTickSpacing(1);
        sldNbAnnees.setMaximum(10);
        sldNbAnnees.setMinimum(1);
        sldNbAnnees.setMinorTickSpacing(1);
        sldNbAnnees.setPaintLabels(true);
        sldNbAnnees.setPaintTicks(true);
        sldNbAnnees.setToolTipText("");

        lblPrime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        jLabel9.setText("Votre nombre");

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalculer.setText("Calculer");
        btnCalculer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalculerMouseClicked(evt);
            }
        });

        lblResultat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        btnPrime.setText("Prime");
        btnPrime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrimeMouseClicked(evt);
            }
        });

        jLabel10.setText("Nombre de jours");

        sldNbJours.setMajorTickSpacing(1);
        sldNbJours.setMaximum(10);
        sldNbJours.setMinimum(1);
        sldNbJours.setMinorTickSpacing(1);
        sldNbJours.setPaintLabels(true);
        sldNbJours.setPaintTicks(true);
        sldNbJours.setValue(1);

        jLabel11.setText("Catégorie");

        cboCategories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livres", "Jouets" }));

        jLabel12.setText("Etats");

        cboEtats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Occasion", "Abimé", "Très abimé", "Neuf" }));

        buttonGroup1.add(rbOui);
        rbOui.setText("Oui");

        buttonGroup1.add(rbNon);
        rbNon.setText("Non");

        jLabel13.setText("Etes-vous membre ?");

        jLabel14.setText("Prix de l'achat");

        lblRemboursement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRemboursement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        btnRemboursement.setText("Remboursement");
        btnRemboursement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemboursementMouseClicked(evt);
            }
        });

        jLabel15.setText("Votre entier");

        txtEntier.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBinaire.setText("Binaire");
        btnBinaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBinaireMouseClicked(evt);
            }
        });

        lblBinaire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBinaire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbOui)
                                    .addComponent(rbNon))
                                .addGap(45, 45, 45)
                                .addComponent(btnRemboursement, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 353, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sldNbAnnees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sldNbJours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRemboursement, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboEtats, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(308, 308, 308)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblBinaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtEntier, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnBinaire, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(btnCalculer))
                                .addComponent(lblResultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboSexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(sldNbAnnees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCalculer))
                                .addGap(11, 11, 11)
                                .addComponent(lblResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sldNbJours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtEntier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBinaire)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(cboCategories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cboEtats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblBinaire, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbOui)
                                .addGap(0, 0, 0)
                                .addComponent(rbNon))
                            .addComponent(btnRemboursement, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel14))
                            .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(lblRemboursement, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel10)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrimeMouseClicked
        // Exercice n°1
                lblPrime.setText("");
        int i=22;
        if(txtAge.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this,"entrer un age");
        }
        else if(sldNbAnnees.getValue()>5){
            
                lblPrime.setText("vous ne payes pas la surprime");
            }
            if((cboSexe.getSelectedItem().toString().compareTo("femme")==0) && (sldNbAnnees.getValue() > 20)&&(sldNbAnnees.getValue() < 30) &&(sldNbAnnees.getValue() < 5 ) ){
                 
                lblPrime.setText("vous devez payez la prime");
                
            }
            
            if((cboSexe.getSelectedItem().toString().compareTo("homme")==0) && (Integer.parseInt(txtAge.getText().toString())> i) && (sldNbAnnees.getValue() < 5) ){
//                 
                lblPrime.setText("vous devez payez la prime");
                
            }
      
        
           
        // A vous de jouer
        
    }//GEN-LAST:event_btnPrimeMouseClicked

    private void btnCalculerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculerMouseClicked
        // Exercice n°2
         
        if(txtNombre.getText().compareTo("")==0){
          JOptionPane.showMessageDialog(this,"entrer un nombre");
        }
        else{
         
        lblResultat.setText("");
        for(int i=1;i<Integer.parseInt(txtNombre.getText());i++){
            
          for(int j=2;j<Integer.parseInt(txtNombre.getText());j++){
            
            double c =1/j*i;
          lblResultat.setText(lblResultat.getText()+c +1);
          }
        }    
           
        // A vous de jouer
        }
    }//GEN-LAST:event_btnCalculerMouseClicked

    private void btnRemboursementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemboursementMouseClicked
        // Exercice n°3
        int l= 30;
        int j = 50;
        if(txtPrix.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this,"saisir un prix.");
        }
        else if(sldNbJours.getValue()>7){
            lblRemboursement.setText("aucun remboursement");
        
        lblRemboursement.setText("");
        if(sldNbJours.getValue()<7){
                int i=Integer.parseInt(txtPrix.getText());
            if(Integer.parseInt(txtPrix.getText()) > 30 && cboCategories.getSelectedItem()=="livres") {
               i=30;
            }
             if(Integer.parseInt(txtPrix.getText()) > 50 && cboCategories.getSelectedItem()=="jouets") {
                i=50;
            }
            
              if(rbNon.isSelected()){
                    
                if(cboCategories.getSelectedItem()=="livres"){
                    txtPrix.setText(String.valueOf(i*0.8));
                    lblRemboursement.setText("on rembourse");
                }
              if(cboCategories.getSelectedItem()=="jouets"){
                txtPrix.setText(String.valueOf(i*0.8));
                lblRemboursement.setText("on rembourse");
                }
             }
            if(cboEtats.getSelectedItem()=="occasion"||cboEtats.getSelectedItem()=="abimé"){
                if(cboCategories.getSelectedItem()=="jouets"){
                txtPrix.setText(String.valueOf(i*0.7));
                lblRemboursement.setText("on rembourse");
            }
              if(cboCategories.getSelectedItem()=="livres"){
                txtPrix.setText(String.valueOf(i*0.7));
                lblRemboursement.setText("on rembourse");
            }
            }
              else{
                if(cboCategories.getSelectedItem()=="jouets"){
                    txtPrix.setText(String.valueOf(j*0.9));
                    lblRemboursement.setText("on rembourse");
                    }
                if(cboCategories.getSelectedItem()=="livres"){
                    txtPrix.setText(String.valueOf(l*0.9));
                    lblRemboursement.setText("on rembourse"); 
                    }      
                }  
        }
        }    
         
             
        // A vous de jouer
        
    }//GEN-LAST:event_btnRemboursementMouseClicked

    private void btnBinaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBinaireMouseClicked
        // Exercice n°4
        if(txtEntier.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(this,"mettre un chiffre");
        }
        else{
        int i =Integer.parseInt(txtEntier.getText());
        
        int q=i/2;
        int r =i%2;
        while(q !=0){
           
            
              q=i/2;      
              r =i%2;
              DefaultTableModel dtm =new DefaultTableModel();
              Vector v;
              v= new Vector();
              v.add(r);
              
              
           lblBinaire.setText(String.valueOf(r));
        }  
                
       
        // A vous de jouer
        }
    }//GEN-LAST:event_btnBinaireMouseClicked

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinaire;
    private javax.swing.JButton btnCalculer;
    private javax.swing.JButton btnPrime;
    private javax.swing.JButton btnRemboursement;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboCategories;
    private javax.swing.JComboBox<String> cboEtats;
    private javax.swing.JComboBox<String> cboSexe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBinaire;
    private javax.swing.JLabel lblPrime;
    private javax.swing.JLabel lblRemboursement;
    private javax.swing.JLabel lblResultat;
    private javax.swing.JRadioButton rbNon;
    private javax.swing.JRadioButton rbOui;
    private javax.swing.JSlider sldNbAnnees;
    private javax.swing.JSlider sldNbJours;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEntier;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrix;
    // End of variables declaration//GEN-END:variables
}
