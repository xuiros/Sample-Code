
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Scanner;
public class Registration extends javax.swing.JFrame {

Scanner sc = new Scanner(System.in);

    public Registration() {
        initComponents();
     
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        backGround = new javax.swing.JPanel();
        fName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextPane();
        sCourse = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextPane();
        Rnumber = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        section = new javax.swing.JLabel();
        livraryMem = new javax.swing.JLabel();
        access = new javax.swing.JLabel();
        all = new javax.swing.JRadioButton();
        magazine = new javax.swing.JRadioButton();
        fiction = new javax.swing.JRadioButton();
        electronics = new javax.swing.JRadioButton();
        nonFiction = new javax.swing.JRadioButton();
        refRes = new javax.swing.JRadioButton();
        ref = new javax.swing.JRadioButton();
        inHouse = new javax.swing.JRadioButton();
        borrow = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        register = new javax.swing.JButton();
        pls = new javax.swing.JLabel();
        gendeR = new javax.swing.JComboBox<>();
        mName = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tx = new javax.swing.JTextPane();
        l1 = new javax.swing.JLabel();
        pls2 = new javax.swing.JLabel();
        pls3 = new javax.swing.JLabel();
        pls4 = new javax.swing.JLabel();
        pls5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backGround.setBackground(new java.awt.Color(255, 255, 255));

        fName.setText("First Name");

        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txt1);

        sCourse.setText("Course");

        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txt2);

        Rnumber.setText("Registration Number");

        gender.setText("Gender");

        section.setText("What section of the library would you like access to?");

        livraryMem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        livraryMem.setForeground(new java.awt.Color(0, 0, 0));
        livraryMem.setText("Library Mebership Form");

        access.setText("What sectionof library would you like to access?");

        all.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(all);
        all.setText("All");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        magazine.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(magazine);
        magazine.setText("Magazines");
        magazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magazineActionPerformed(evt);
            }
        });

        fiction.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(fiction);
        fiction.setText("Fiction");
        fiction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fictionActionPerformed(evt);
            }
        });

        electronics.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(electronics);
        electronics.setText("Electronics");
        electronics.setAlignmentY(0.0F);
        electronics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electronicsActionPerformed(evt);
            }
        });

        nonFiction.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(nonFiction);
        nonFiction.setText("Non- Fiction");
        nonFiction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonFictionActionPerformed(evt);
            }
        });

        refRes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(refRes);
        refRes.setText("Research and Reference");
        refRes.setAlignmentY(0.0F);
        refRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refResActionPerformed(evt);
            }
        });

        ref.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(ref);
        ref.setText("Reference");
        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });

        inHouse.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(inHouse);
        inHouse.setText("In- house");
        inHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inHouseActionPerformed(evt);
            }
        });

        borrow.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(borrow);
        borrow.setText("Borrowing");
        borrow.setAlignmentY(0.0F);
        borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachelor of Science in Information Technology (BSIT)", "Bachelor of Science in Hospitality Management (BSHM)", "Bachelor of Science in Information Science(BSIS)", "Bachelor of Science in Business Administration (BSBA)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        pls.setBackground(new java.awt.Color(255, 51, 51));
        pls.setForeground(new java.awt.Color(255, 0, 0));

        gendeR.setBackground(new java.awt.Color(255, 255, 255));
        gendeR.setForeground(new java.awt.Color(0, 0, 0));
        gendeR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Gay", "Lesbian" }));
        gendeR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendeRActionPerformed(evt);
            }
        });

        mName.setText("Middle Name");

        lName.setText("Last Name");

        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyPressed(evt);
            }
        });

        tx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tx);

        pls2.setForeground(new java.awt.Color(255, 0, 0));
        pls2.setText("jLabel1");

        pls3.setForeground(new java.awt.Color(255, 0, 0));
        pls3.setText("jLabel1");

        pls4.setForeground(new java.awt.Color(255, 0, 0));
        pls4.setText("jLabel1");

        pls5.setForeground(new java.awt.Color(255, 0, 0));
        pls5.setText("jLabel1");

        javax.swing.GroupLayout backGroundLayout = new javax.swing.GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(all)
                            .addComponent(nonFiction))
                        .addGap(139, 139, 139)
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backGroundLayout.createSequentialGroup()
                                .addComponent(magazine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(borrow)
                                    .addComponent(electronics))
                                .addGap(74, 74, 74))
                            .addGroup(backGroundLayout.createSequentialGroup()
                                .addComponent(fiction)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backGroundLayout.createSequentialGroup()
                                .addComponent(ref)
                                .addGap(152, 152, 152)
                                .addComponent(inHouse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refRes))
                            .addComponent(section))
                        .addContainerGap())
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pls5)
                            .addComponent(sCourse)
                            .addComponent(access)
                            .addComponent(l1)
                            .addComponent(gendeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender)
                            .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(backGroundLayout.createSequentialGroup()
                                    .addComponent(Rnumber)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(backGroundLayout.createSequentialGroup()
                                    .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(fName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                        .addComponent(pls2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(107, 107, 107)
                                    .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backGroundLayout.createSequentialGroup()
                                            .addComponent(mName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(backGroundLayout.createSequentialGroup()
                                            .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pls3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)))
                                    .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pls4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                                    .addGap(36, 36, 36)))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE))))
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(livraryMem))
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(register)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backGroundLayout.setVerticalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(livraryMem)
                .addGap(21, 21, 21)
                .addComponent(l1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fName)
                        .addComponent(mName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addComponent(txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pls2)
                    .addComponent(pls3)
                    .addComponent(pls4))
                .addGap(22, 22, 22)
                .addComponent(sCourse)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(pls)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Rnumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pls5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(gender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gendeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(access)
                        .addGap(18, 18, 18)
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ref)
                            .addComponent(inHouse)
                            .addComponent(refRes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nonFiction)
                            .addComponent(magazine)
                            .addComponent(electronics))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(all)
                            .addComponent(fiction)
                            .addComponent(borrow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(register)
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nonFictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonFictionActionPerformed
          if(evt.getSource()==nonFiction){
    System.out.println("");
}  
    }//GEN-LAST:event_nonFictionActionPerformed

    private void refResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refResActionPerformed

    private void electronicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electronicsActionPerformed
         if(evt.getSource()==electronics){
    System.out.println("");
}  
    }//GEN-LAST:event_electronicsActionPerformed

    private void inHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inHouseActionPerformed
    
     }//GEN-LAST:event_inHouseActionPerformed

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        
    }//GEN-LAST:event_refActionPerformed

    private void borrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowActionPerformed
        
    }//GEN-LAST:event_borrowActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        
    }//GEN-LAST:event_allActionPerformed

    private void magazineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magazineActionPerformed
        
    }//GEN-LAST:event_magazineActionPerformed

    private void fictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fictionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fictionActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
      
    }//GEN-LAST:event_registerActionPerformed

    private void txt2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txt2.requestFocus();
        }
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            //wont be able to enter a char
            txt2.setEditable(false);
            pls5.setText("Please Enter a Number Only.");
        }else{
            txt2.setEditable(true);
        }
    }//GEN-LAST:event_txt2KeyPressed

    private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
      //wont be able to enter a number
        char c  = evt.getKeyChar();
       if(Character.isLetter(c)){
           txt1.setEditable(true);
    }
       else{
           txt1.setEditable(false);
           pls2.setText("Please enter a Character.");
       }
        
    
      
    }//GEN-LAST:event_txt1KeyPressed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyPressed
        //wont be able to enter a number
        char c  = evt.getKeyChar();
       if(Character.isLetter(c)){
           txt1.setEditable(true);
    }
       else{
           txt1.setEditable(false);
           pls3.setText("Please enter a Character.");
       }
    }//GEN-LAST:event_txtKeyPressed

    private void txKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txKeyPressed
        // wont be able to enter a number
        char c  = evt.getKeyChar();
       if(Character.isLetter(c)){
           txt1.setEditable(true);
    }
       else{
           txt1.setEditable(false);
           pls4.setText("Please enter a Character.");
       }
    }//GEN-LAST:event_txKeyPressed

    private void gendeRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendeRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendeRActionPerformed
public void actionPerformed(java.awt.event.ActionEvent evt){
  
}
    
    public static void main(String args[]) {
     

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Rnumber;
    private javax.swing.JLabel access;
    private javax.swing.JRadioButton all;
    private javax.swing.JPanel backGround;
    private javax.swing.JRadioButton borrow;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton electronics;
    private javax.swing.JLabel fName;
    private javax.swing.JRadioButton fiction;
    private javax.swing.JComboBox<String> gendeR;
    private javax.swing.JLabel gender;
    private javax.swing.JRadioButton inHouse;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel livraryMem;
    private javax.swing.JLabel mName;
    private javax.swing.JRadioButton magazine;
    private javax.swing.JRadioButton nonFiction;
    private javax.swing.JLabel pls;
    private javax.swing.JLabel pls2;
    private javax.swing.JLabel pls3;
    private javax.swing.JLabel pls4;
    private javax.swing.JLabel pls5;
    private javax.swing.JRadioButton ref;
    private javax.swing.JRadioButton refRes;
    private javax.swing.JButton register;
    private javax.swing.JLabel sCourse;
    private javax.swing.JLabel section;
    private javax.swing.JTextPane tx;
    private javax.swing.JTextField txt;
    private javax.swing.JTextPane txt1;
    private javax.swing.JTextPane txt2;
    // End of variables declaration//GEN-END:variables
}
