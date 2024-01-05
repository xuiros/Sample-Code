
import java.sql.*;
public class Registration extends javax.swing.JFrame {


    public Registration() {
        initComponents();
     
    }

    
    public void Connect(){
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        backGround = new javax.swing.JPanel();
        sName = new javax.swing.JLabel();
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
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        ref = new javax.swing.JRadioButton();
        inHouse = new javax.swing.JRadioButton();
        borrow = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        register = new javax.swing.JButton();
        pls = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backGround.setBackground(new java.awt.Color(255, 255, 255));

        sName.setText("Student's name");

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

        male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        others.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(others);
        others.setText("Others");
        others.setAlignmentY(0.0F);
        others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersActionPerformed(evt);
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

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout backGroundLayout = new javax.swing.GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(livraryMem))
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(section)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(register)
                .addGap(280, 280, 280))
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sCourse)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(access))
                        .addContainerGap(103, Short.MAX_VALUE))
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(backGroundLayout.createSequentialGroup()
                                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(all)
                                    .addComponent(nonFiction))
                                .addGap(139, 139, 139)
                                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fiction)
                                    .addComponent(magazine)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundLayout.createSequentialGroup()
                                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backGroundLayout.createSequentialGroup()
                                        .addComponent(male)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(backGroundLayout.createSequentialGroup()
                                        .addComponent(ref)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inHouse)))
                                .addGap(18, 18, 18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundLayout.createSequentialGroup()
                                .addComponent(borrow)
                                .addGap(92, 92, 92))
                            .addGroup(backGroundLayout.createSequentialGroup()
                                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(refRes)
                                    .addComponent(electronics))
                                .addContainerGap())))
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender)
                            .addGroup(backGroundLayout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(female)
                                .addGap(168, 168, 168)
                                .addComponent(others))
                            .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                                .addComponent(Rnumber)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        backGroundLayout.setVerticalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(livraryMem)
                .addGap(43, 43, 43)
                .addComponent(sName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Rnumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pls)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(gender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male)
                    .addComponent(female)
                    .addComponent(others))
                .addGap(2, 2, 2)
                .addComponent(access)
                .addGap(18, 18, 18)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inHouse)
                    .addComponent(ref)
                    .addComponent(borrow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(section)
                .addGap(18, 18, 18)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(all)
                    .addComponent(magazine)
                    .addComponent(electronics))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nonFiction)
                    .addComponent(fiction)
                    .addComponent(refRes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(register)
                .addGap(20, 20, 20))
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

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
         if(evt.getSource()==female){
    System.out.println("");
}  
    }//GEN-LAST:event_femaleActionPerformed

    private void electronicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electronicsActionPerformed
         if(evt.getSource()==electronics){
    System.out.println("");
}  
    }//GEN-LAST:event_electronicsActionPerformed

    private void inHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inHouseActionPerformed
    
     }//GEN-LAST:event_inHouseActionPerformed

    private void othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othersActionPerformed
       
    }//GEN-LAST:event_othersActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
     
    }//GEN-LAST:event_maleActionPerformed

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
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            //wont be able to enter a char
            txt2.setEditable(false);
            pls.setText("Please Enter a Number Only.");
        }else{
            txt2.setEditable(true);
        }
    }//GEN-LAST:event_txt2KeyPressed
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
    private javax.swing.JRadioButton female;
    private javax.swing.JRadioButton fiction;
    private javax.swing.JLabel gender;
    private javax.swing.JRadioButton inHouse;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel livraryMem;
    private javax.swing.JRadioButton magazine;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton nonFiction;
    private javax.swing.JRadioButton others;
    private javax.swing.JLabel pls;
    private javax.swing.JRadioButton ref;
    private javax.swing.JRadioButton refRes;
    private javax.swing.JButton register;
    private javax.swing.JLabel sCourse;
    private javax.swing.JLabel sName;
    private javax.swing.JLabel section;
    private javax.swing.JTextPane txt1;
    private javax.swing.JTextPane txt2;
    // End of variables declaration//GEN-END:variables
}
