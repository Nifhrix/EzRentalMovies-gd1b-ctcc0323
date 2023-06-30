

package ezrental;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Rentmov extends javax.swing.JFrame {

    
    public Rentmov() {
        initComponents();
        Connect();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    //Connection to database
    public void Connect(){
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   //driver used
            con = DriverManager.getConnection("jdbc:mysql://localhost/rentlog", "root", "");   //code to connect
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginRent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginRent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Loginbtn = new javax.swing.JButton();
        Aboutbtn = new javax.swing.JButton();
        Exitbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        movie1 = new javax.swing.JRadioButton();
        movie2 = new javax.swing.JRadioButton();
        movie3 = new javax.swing.JRadioButton();
        movie4 = new javax.swing.JRadioButton();
        movie5 = new javax.swing.JRadioButton();
        movie6 = new javax.swing.JRadioButton();
        movie7 = new javax.swing.JRadioButton();
        movie8 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        movie9 = new javax.swing.JRadioButton();
        movie10 = new javax.swing.JRadioButton();
        movie11 = new javax.swing.JRadioButton();
        movie12 = new javax.swing.JRadioButton();
        movie13 = new javax.swing.JRadioButton();
        movie14 = new javax.swing.JRadioButton();
        movie15 = new javax.swing.JRadioButton();
        movie16 = new javax.swing.JRadioButton();
        Selectbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Rental");
        setBackground(new java.awt.Color(102, 102, 102));
        setName("Entry"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText(" EzRental Movies ");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 153, 153)));

        Loginbtn.setBackground(new java.awt.Color(0, 153, 153));
        Loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Loginbtn.setForeground(new java.awt.Color(0, 51, 51));
        Loginbtn.setText("Login");
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });

        Aboutbtn.setBackground(new java.awt.Color(0, 153, 153));
        Aboutbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Aboutbtn.setForeground(new java.awt.Color(0, 51, 51));
        Aboutbtn.setText("About");
        Aboutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutbtnActionPerformed(evt);
            }
        });

        Exitbtn.setBackground(new java.awt.Color(0, 153, 153));
        Exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Exitbtn.setForeground(new java.awt.Color(0, 51, 51));
        Exitbtn.setText("Exit");
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Easy Rent on EzRental! Guaranteed official CDs for rent, no piracy! ");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        buttonGroup1.add(movie1);
        movie1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie1.setForeground(new java.awt.Color(0, 51, 51));
        movie1.setText("The Human Centipede");

        buttonGroup1.add(movie2);
        movie2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie2.setForeground(new java.awt.Color(0, 51, 51));
        movie2.setText("Your Name");

        buttonGroup1.add(movie3);
        movie3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie3.setForeground(new java.awt.Color(0, 51, 51));
        movie3.setText("Kung Fu Panda 2");

        buttonGroup1.add(movie4);
        movie4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie4.setForeground(new java.awt.Color(0, 51, 51));
        movie4.setText("The Hustle");

        buttonGroup1.add(movie5);
        movie5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie5.setForeground(new java.awt.Color(0, 51, 51));
        movie5.setText("Avengers: Endgame");

        buttonGroup1.add(movie6);
        movie6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie6.setForeground(new java.awt.Color(0, 51, 51));
        movie6.setText("Frozen 2");

        buttonGroup1.add(movie7);
        movie7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie7.setForeground(new java.awt.Color(0, 51, 51));
        movie7.setText("The Scorpion King");

        buttonGroup1.add(movie8);
        movie8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie8.setForeground(new java.awt.Color(0, 51, 51));
        movie8.setText("The Three Idiots");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Available Movies This Week");

        buttonGroup1.add(movie9);
        movie9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie9.setForeground(new java.awt.Color(0, 51, 51));
        movie9.setText("UP");

        buttonGroup1.add(movie10);
        movie10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie10.setForeground(new java.awt.Color(0, 51, 51));
        movie10.setText("Scary Movie 2");

        buttonGroup1.add(movie11);
        movie11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie11.setForeground(new java.awt.Color(0, 51, 51));
        movie11.setText("A Dog's Purpose");

        buttonGroup1.add(movie12);
        movie12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie12.setForeground(new java.awt.Color(0, 51, 51));
        movie12.setText("Now You See Me 2");

        buttonGroup1.add(movie13);
        movie13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie13.setForeground(new java.awt.Color(0, 51, 51));
        movie13.setText("Resident Evil 2");

        buttonGroup1.add(movie14);
        movie14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie14.setForeground(new java.awt.Color(0, 51, 51));
        movie14.setText("Pitch Perfect");

        buttonGroup1.add(movie15);
        movie15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie15.setForeground(new java.awt.Color(0, 51, 51));
        movie15.setText("Mission Impossible");

        buttonGroup1.add(movie16);
        movie16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        movie16.setForeground(new java.awt.Color(0, 51, 51));
        movie16.setText("Dr. Strange");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movie1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(movie4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(movie2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(movie3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(movie5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(movie8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(movie6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(movie7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(movie12, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addGap(81, 81, 81)
                                        .addComponent(movie16, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(movie10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(movie14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(77, 77, 77))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(movie11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(movie15, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(movie9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(movie13, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movie1)
                    .addComponent(movie5)
                    .addComponent(movie9)
                    .addComponent(movie13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movie2)
                    .addComponent(movie6)
                    .addComponent(movie10)
                    .addComponent(movie14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movie3)
                    .addComponent(movie7)
                    .addComponent(movie11)
                    .addComponent(movie15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movie4)
                    .addComponent(movie8)
                    .addComponent(movie12)
                    .addComponent(movie16))
                .addGap(18, 18, 18))
        );

        Selectbtn.setBackground(new java.awt.Color(0, 153, 153));
        Selectbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Selectbtn.setForeground(new java.awt.Color(0, 51, 51));
        Selectbtn.setText("Select");
        Selectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectbtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Disclaimer:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Movies in the rent options can change in time, if the movie you are looking for is not on the options, please wait until it is available.");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("If you want to suggest a movie to be added to the list of selections you may visit our social media in \"About\" Button, message us, and wait for our response or announcements");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("regarding the next available movies.");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Warning:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("The customer is held liable to the damages that the item may sustain during the renting period in which they have it in their possession.");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("An equitable amount of compensation shall be paid in accordance to the damages sustained of the item.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Selectbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(87, 87, 87)
                                .addComponent(Loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(Aboutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aboutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Selectbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    
    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitbtnActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        this.dispose();
        new LoginRent().setVisible(true);
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void AboutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutbtnActionPerformed
        this.setVisible(false);
        new About().setVisible(true);
    }//GEN-LAST:event_AboutbtnActionPerformed

    private void SelectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectbtnActionPerformed
        JPanel panel = new JPanel();
        JButton yesbtn = new JButton("Yes");
        JButton nobtn = new JButton("No");
        panel.add(yesbtn);
        panel.add(nobtn);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal1 = Calendar.getInstance();
        
//        Thread.sleep(5000);
//        
        Calendar cal2 = Calendar.getInstance();
        cal2.add(Calendar.DAY_OF_MONTH, 2);
        String date1 = sdf.format(cal2.getTime());
        
        Calendar cal3 = Calendar.getInstance();
        cal3.add(Calendar.DAY_OF_MONTH, 3);
        String date2 = sdf.format(cal3.getTime());
        
        int moviepr1 = 250;
        int moviepr2 = 150;
        
        
        
        if(movie1.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'The Human Centipede'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'The Human Centipede' can be rented for a total of 2 days and 1 night." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date1 + "." + " \n\nPlease pay a total amount of Php " + moviepr1 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        
        if(movie2.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'Your Name'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'Your Name' can be rented for a total of 3 days and 2 nights." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date2 + "." + " \n\nPlease pay a total amount of Php " + moviepr2 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
            
        if(movie3.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'Kung Fu Panda 2'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'Kung Fu Panda 2' can be rented for a total of 2 days and 1 night." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date1 + "." + " \n\nPlease pay a total amount of Php " + moviepr1 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        if(movie4.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'The Hustle'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'The Hustle' can be rented for a total of 3 days and 2 nights." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date2 + "." + " \n\nPlease pay a total amount of Php " + moviepr2 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        
        if(movie5.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'Avengers: Endgame'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'Avengers: Endgame' can be rented for a total of 2 days and 1 night." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date1 + "." + " \n\nPlease pay a total amount of Php " + moviepr1 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        
        if(movie6.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'Frozen 2'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'Frozen 2' can be rented for a total of 3 days and 2 nights." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date2 + "." + " \n\nPlease pay a total amount of Php " + moviepr2 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
            
        if(movie7.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'The Scorpion King'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'The Scorpion King' can be rented for a total of 2 days and 1 night." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date1 + "." + " \n\nPlease pay a total amount of Php " + moviepr1 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        if(movie8.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'The Three Idiots'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'The Three Idiots' can be rented for a total of 3 days and 2 nights." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date2 + "." + " \n\nPlease pay a total amount of Php " + moviepr2 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        if(movie9.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'UP'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'UP' can be rented for a total of 2 days and 1 night." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date1 + "." + " \n\nPlease pay a total amount of Php " + moviepr1 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        
        if(movie10.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'Scary Movie 2'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'Scary Movie 2' can be rented for a total of 3 days and 2 nights." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date2 + "." + " \n\nPlease pay a total amount of Php " + moviepr2 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
            
        if(movie11.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'A Dog's Purpose'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'A Dog's Purpose' can be rented for a total of 2 days and 1 night." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date1 + "." + " \n\nPlease pay a total amount of Php " + moviepr1 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        if(movie12.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'Now You See Me 2'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'Now You See Me 2' can be rented for a total of 3 days and 2 nights." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date2 + "." + " \n\nPlease pay a total amount of Php " + moviepr2 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        
        if(movie13.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'Resident Evil 2'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'Resident Evil 2' can be rented for a total of 2 days and 1 night." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date1 + "." + " \n\nPlease pay a total amount of Php " + moviepr1 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        
        if(movie14.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'Pitch Perfect'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'Pitch Perfect' can be rented for a total of 3 days and 2 nights." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date2 + "." + " \n\nPlease pay a total amount of Php " + moviepr2 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
            
        if(movie15.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'Mission Impossible'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'Mission Impossible' can be rented for a total of 2 days and 1 night." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date1 + "." + " \n\nPlease pay a total amount of Php " + moviepr1 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
        
        if(movie16.isSelected())
        {
            int result1 = JOptionPane.showConfirmDialog(panel, "Are you sure you want to rent 'Dr. Strange'?", "Renting?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result1 == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null, "'Dr. Strange' can be rented for a total of 3 days and 2 nights." + " \n\nDate rented: " + sdf.format(cal1.getTime())+ "." + " Date of return: "+ date2 + "." + " \n\nPlease pay a total amount of Php " + moviepr2 + " either via online transaction \nor in the store physically on your way to pick up the movie.");

            }
        else if (result1 == JOptionPane.NO_OPTION){
               remove(this);
            }
        }
    }//GEN-LAST:event_SelectbtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(Rentmov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rentmov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rentmov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rentmov.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rentmov().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aboutbtn;
    private javax.swing.JButton Exitbtn;
    private javax.swing.JButton Loginbtn;
    private javax.swing.JButton Selectbtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton movie1;
    private javax.swing.JRadioButton movie10;
    private javax.swing.JRadioButton movie11;
    private javax.swing.JRadioButton movie12;
    private javax.swing.JRadioButton movie13;
    private javax.swing.JRadioButton movie14;
    private javax.swing.JRadioButton movie15;
    private javax.swing.JRadioButton movie16;
    private javax.swing.JRadioButton movie2;
    private javax.swing.JRadioButton movie3;
    private javax.swing.JRadioButton movie4;
    private javax.swing.JRadioButton movie5;
    private javax.swing.JRadioButton movie6;
    private javax.swing.JRadioButton movie7;
    private javax.swing.JRadioButton movie8;
    private javax.swing.JRadioButton movie9;
    // End of variables declaration//GEN-END:variables
}
