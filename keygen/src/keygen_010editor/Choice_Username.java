/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keygen_010editor;


import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author duytu
 */
public class Choice_Username extends javax.swing.JFrame {

    /**
     * Creates new form Choice_Username
     */
    public Choice_Username() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textDay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jlabel_password = new javax.swing.JTextField();
        textUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Keygen 010 Editor");

        jLabel2.setText("Number license");

        jLabel3.setText("Expiry day");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textDay, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setText("Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlabel_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlabel_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jlabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21)
                .addComponent(jlabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        textUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserActionPerformed(evt);
            }
        });

        jLabel1.setText("User name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String user = textUser.getText();
        user = user.toUpperCase();
        //ystem.out.printf("User name = %s \n",user);
        int license = Integer.parseInt(textDay.getText());
        
        int[] dword_EB6190 = {
    0x39CB44B8, 0x23754F67, 0x5F017211, 0x3EBB24DA, 0x351707C6                                    
   , 0x63F9774B , 0x17827288 , 0x0FE74821 , 0x5B5F670F , 0x48315AE8 
   , 0x785B7769 , 0x2B7A1547 , 0x38D11292 , 0x42A11B32 , 0x35332244 
   , 0x77437B60 , 0x1EAB3B10 , 0x53810000 , 0x1D0212AE , 0x6F0377A8 
   , 0x43C03092 , 0x2D3C0A8E , 0x62950CBF , 0x30F06FFA , 0x34F710E0 
   , 0x28F417FB , 0x350D2F95 , 0x5A361D5A , 0x15CC060B , 0x0AFD13CC 
   , 0x28603BCF , 0x3371066B , 0x30CD14E4 , 0x175D3A67 , 0x6DD66A13 
   , 0x2D3409F9 , 0x581E7B82 , 0x76526B99 , 0x5C8D5188 , 0x2C857971 
   , 0x15F51FC0 , 0x68CC0D11 , 0x49F55E5C , 0x275E4364 , 0x2D1E0DBC 
   , 0x4CEE7CE3 , 0x32555840 , 0x112E2E08 , 0x6978065A , 0x72921406 
   , 0x314578E7 , 0x175621B7 , 0x40771DBF , 0x3FC238D6 , 0x4A31128A 
   , 0x2DAD036E , 0x41A069D6 , 0x25400192 ,  0x0DD4667 , 0x6AFC1F4F 
   , 0x571040CE , 0x62FE66DF , 0x41DB4B3E , 0x3582231F , 0x55F6079A 
   , 0x1CA70644 , 0x1B1643D2 , 0x3F7228C9 , 0x5F141070 , 0x3E1474AB 
   , 0x444B256E , 0x537050D9 , 0x0F42094B , 0x2FD820E6 , 0x778B2E5E 
   , 0x71176D02 , 0x7FEA7A69 , 0x5BB54628 , 0x19BA6C71 , 0x39763A99 
   , 0x178D54CD , 0x1246E88 , 0x3313537E , 0x2B8E2D17 , 0x2A3D10BE 
   , 0x59D10582 , 0x37A163DB , 0x30D6489A , 0x6A215C46 , 0x0E1C7A76 
   , 0x1FC760E7 , 0x79B80C65 , 0x27F459B4 , 0x799A7326 , 0x50BA1782 
   ,  0x2A116D5C , 0x63866E1B , 0x3F920E3C , 0x55023490 , 0x55B56089 
   ,  0x2C391FD1 , 0x2F8035C2 , 0x64FD2B7A , 0x4CE8759A , 0x518504F0 
   ,  0x799501A8 , 0x3F5B2CAD , 0x38E60160 , 0x637641D8 , 0x33352A42 
   ,  0x51A22C19 ,  0x85C5851 ,  0x32917AB , 0x2B770AC7 , 0x30AC77B3 
   ,  0x2BEC1907 ,  0x35202D0 , 0x0FA933D3 , 0x61255DF3 , 0x22AD06BF 
   ,  0x58B86971 , 0x5FCA0DE5 , 0x700D6456 , 0x56A973DB , 0x5AB759FD 
   ,  0x330E0BE2 , 0x5B3C0DDD , 0x495D3C60 , 0x53BD59A6 , 0x4C5E6D91 
   ,  0x49D9318D , 0x103D5079 , 0x61CE42E3 , 0x7ED5121D , 0x14E160ED 
   ,  0x212D4EF2 , 0x270133F0 , 0x62435A96 , 0x1FA75E8B , 0x6F092FBE 
   ,  0x4A000D49 , 0x57AE1C70 ,   0x4E2477 , 0x561E7E72 , 0x468C0033 
   ,  0x5DCC2402 , 0x78507AC6 , 0x58AF24C7 , 0x0DF62D34 , 0x358A4708 
   ,  0x3CFB1E11 , 0x2B71451C , 0x77A75295 , 0x56890721 , 0x0FEF75F3 
   ,  0x120F24F1 , 0x1990AE7 , 0x339C4452 , 0x27A15B8E , 0x0BA7276D 
   ,  0x60DC1B7B , 0x4F4B7F82 , 0x67DB7007 , 0x4F4A57D9 , 0x621252E8 
   ,  0x20532CFC , 0x6A390306 , 0x18800423 , 0x19F3778A , 0x462316F0 
   ,  0x56AE0937 , 0x43C2675C , 0x65CA45FD , 0x0D604FF2 , 0x0BFD22CB 
   ,  0x3AFE643B , 0x3BF67FA6 , 0x44623579 , 0x184031F8 , 0x32174F97 
   ,  0x4C6A092A , 0x5FB50261 ,  0x1650174 , 0x33634AF1 , 0x712D18F4 
   ,  0x6E997169 , 0x5DAB7AFE , 0x7C2B2EE8 , 0x6EDB75B4 , 0x5F836FB6 
   ,  0x3C2A6DD6 , 0x292D05C2 , 0x52244DB , 0x149A5F4F , 0x5D486540 
   ,  0x331D15EA , 0x4F456920 , 0x483A699F , 0x3B450F05 , 0x3B207C6C 
   ,  0x749D70FE , 0x417461F6 , 0x62B031F1 , 0x2750577B , 0x29131533 
   ,  0x588C3808 , 0x1AEF3456 , 0x0F3C00EC , 0x7DA74742 , 0x4B797A6C 
   ,  0x5EBB3287 , 0x786558B8 ,  0x0ED4FF2 , 0x6269691E , 0x24A2255F 
   ,  0x62C11F7E , 0x2F8A7DCD , 0x643B17FE , 0x778318B8 , 0x253B60FE 
   ,  0x34BB63A3 , 0x5B03214F , 0x5F1571F4 , 0x1A316E9F , 0x7ACF2704 
   ,  0x28896838 , 0x18614677 , 0x1BF569EB , 0x0BA85EC9 , 0x6ACA6B46 
   ,  0x1E43422A , 0x514D5F0E , 0x413E018C , 0x307626E9 , 0x1ED1DFA 
   ,  0x49F46F5A , 0x461B642B , 0x7D7007F2 , 0x13652657 , 0x6B160BC5
   ,  0x65E04849, 0x1F526E1C, 0x5A0251B6, 0x2BD73F69, 0x2DBF7ACD 
   ,  0x51E63E80 , 0x5CF2670F , 0x21CD0A03 , 0x5CFF0261 , 0x33AE061E 
   ,  0x3BB6345F , 0x5D814A75 , 0x257B5DF4 , 0x0A5C2C5B , 0x16A45527 
   ,  0x16F23945};
            Date date2= jDateChooser2.getDate();
            Date date1 = java.util.Calendar.getInstance().getTime();
            Calendar c1 = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            
            c1.setTime(date1);
            c2.setTime(date2);
            
            int noDay = (int) ((c2.getTime().getTime() - c1.getTime().getTime())/86400000);
            int epoch = (int) (System.currentTimeMillis()/1000/86400);
            int exDay = noDay + epoch;
            
        int[] passwordFinal = new int[10];
        passwordFinal[3] = 0xAC;
        int password_4byte = 0;
        int a2 = 1;
        int a3 = exDay;
        int length_username;
        int count;
        int v9;
        int v10;
        int v12;
        int v16;
        int v17;
        int v18;
        int v19;
        int v11;
        int v13;
        int v15;
        
        char[] v8 = new char[20];
        length_username = user.length();
        
        if(length_username > 0)
        {
            v16 = license * 15;
            count = 0;
            
            v17 = 0;
            v18 = 0;
            v19 = 17 * a3;
            do
            {
                //System.out.println("-------------------------");
                v8[count] = user.charAt(count);
                //System.out.println(v8[count]);
                v15 = v19;
                //System.out.println(v15);
                v9 = password_4byte + dword_EB6190[v8[count]];
                //System.out.printf("v9 = %x\n",v9);
                if(a2 == 1 )
                {
                    v10 = dword_EB6190[(v8[count] + 47) & 0xff] * (v9 ^ dword_EB6190[(v8[count] + 13) & 0xff]);
                    //System.out.printf("v10 = %x \n",v10);
                    //printf("v10_1 = %x\n", v10);
                    v11 = v18;
                    //System.out.println("v11 = "+v11);
                }
                else
                {
                    v10 = dword_EB6190[(v8[count] + 23) & 0xff] * (v9 ^ dword_EB6190[(v8[count] + 63) & 0xff]);
                    //printf("v10_0 = %x\n", v10);
                    v11 = v17;
                }
                v19 += 9;
                //System.out.println(v19);
                ++count;
                v18 += 19;
                //System.out.println("v18 = " +v18);
                v17 += 7;
                //System.out.println("v17 = "+v17);
                v12 = dword_EB6190[v11] + v10;
               // System.out.printf("dwv11 = %x \n",dword_EB6190[v11]);
                //System.out.printf("v12 = %x \n",v12);
                v13 = v16 & 0xff;
                //System.out.printf("v13 = %x \n",v13);
                v16 += 13;
                //System.out.printf("v16 = %x\n" ,v16);
                password_4byte = (dword_EB6190[v13] + v12);
                //printf("%x\n", password_4byte);

                password_4byte += dword_EB6190[(v15) & 0xff];
                
            }while(count < length_username);
            //System.out.printf("Password 4 byte = %x\n",password_4byte);
            String str = "";
            for(int i=0;i <4; i++)
            {
                passwordFinal[i + 4] = password_4byte >> (i*8) & 0xff;
                //System.out.printf("Pass = %x\n",passwordFinal[i+4]); 
            }
            int processpass;
            processpass = ((((a3 * 0x11) ^ 0xff000000) ^ 0xffe53167) + 0x2c175) ^ 0x22c078 ^ 0x5b8c27 ;
            int process_license;
            process_license = (((license * 0xB ^ 0x3421) - 0x4D30) ^ 0x7892) & 0xffff;
            
            passwordFinal[0] = (processpass & 0xff) ^ passwordFinal[6];
            passwordFinal[8] = ((processpass >> 8) & 0xff) ^ passwordFinal[4];
            passwordFinal[9] = ((processpass >> 16) & 0xff) ^ passwordFinal[5];
            passwordFinal[2] = (process_license & 0xff) ^ passwordFinal[5];
            passwordFinal[1] = ((process_license >> 8) & 0xff) ^ passwordFinal[7];
            
            for(int i=0;i < 10;i++)
            {
                String s = Integer.toHexString(passwordFinal[i]);
                if(passwordFinal[i] < 16)
                {
                    
                    str = str.concat("0"+ s);
                    
                }
                else
                {
                    str = str.concat(s);
                }
               
            }
            str = str.toUpperCase();
            jlabel_password.setText(str);
            
            
            
            
            System.out.println("Done!!!");
        }
        //String pass;
        //ygen_010editor keygen = new Keygen_010editor(user,day);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUserActionPerformed

    private void jlabel_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlabel_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlabel_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Choice_Username.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Choice_Username.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Choice_Username.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Choice_Username.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Choice_Username jm=new Choice_Username();
            //ImageIcon king=new ImageIcon("C:\\Users\\PV\\Desktop\\DownloadFile\\icons8-unlock-24.png");
            //jm.setIconImage(king.getImage());
            jm.setLocationRelativeTo(null);
            jm.setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jlabel_password;
    private javax.swing.JTextField textDay;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
