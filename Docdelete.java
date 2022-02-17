package Admin;


import java.awt.BorderLayout;
import java.awt.Color;
   import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Docdelete extends JFrame implements ActionListener{

    JLabel lbl_eid,title,lbl_bg;
    JComboBox jcb_eid;
    ImageIcon iback;
    JButton jbtn_submit,jbtn_back;
    ImageIcon background;
    JPanel a;
    Container co;

    public Docdelete(){
               this.setLocationRelativeTo(null);
        co=getContentPane();
        co.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setTitle("DELETION FORM");
     
        lbl_eid=new JLabel("ID");
        title=new JLabel("DOCTOR DELETION FORM");
        jcb_eid=new JComboBox();
        jbtn_submit=new JButton("SUBMIT");
        
        jbtn_submit.addActionListener(this);
        
       
        
        title.setBounds(740,200,360,70);
        lbl_eid.setBounds(780,280,100,25);
        jcb_eid.setBounds(890, 280, 100, 25);
        jbtn_submit.setBounds(810, 350, 100, 25);
   
        
        background = new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\del.jpg");
        lbl_bg = new JLabel(" ",background, JLabel.CENTER);
        lbl_bg.setBounds(0, 0, 700, 780);
          add(lbl_bg);
       
          
        co.add(title);
        co.add(lbl_eid);
        co.add(jcb_eid);
        co.add(jbtn_submit);
       
      
        
        co. setBackground(Color.decode("#CC8DBD"));

	
          title.setForeground(Color.white);
          lbl_eid.setForeground(Color.white);
          jcb_eid.setBackground(Color.WHITE);
          
          title.setFont(new Font( Font.DIALOG,Font.BOLD, 23));
           lbl_eid.setFont(new Font( Font.SERIF,Font.BOLD, 15));
            try{
                   jcb_eid.addItem("0");

                   Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","lemon","root");
                   String query="select id from docdetails";
                   PreparedStatement pstmt=con.prepareStatement(query);

                   ResultSet rst=pstmt.executeQuery();

                   while(rst.next()){

                       jcb_eid.addItem(rst.getInt("id"));
                   }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this, " ERRORRR! "+ ex.toString());
            }

         setLayout(null);
        setBounds(100,100,1250, 800);
        setVisible(true);
    

  iback = new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\BACKF.jpg");
        jbtn_back = new JButton(iback);
        iback.setImageObserver(jbtn_back);
        jbtn_back.setBounds(10, 10, 50, 50);
        jbtn_back.setBackground(Color.decode("#E0EBEA"));
         jbtn_back.setFocusPainted(false);
         co.add(jbtn_back);
         
         jbtn_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
              new docpage();
                setVisible(false);
            }
        });   
    }
    public void actionPerformed(ActionEvent ae){

        Object obj_source=ae.getSource();

        if(obj_source==jbtn_submit){

            try{
                int    eid=Integer.parseInt(jcb_eid.getSelectedItem().toString());

                   Class.forName("oracle.jdbc.driver.OracleDriver");
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","lemon","root");
                   String query="delete from docdetails where id=?";
                   PreparedStatement pstmt=con.prepareStatement(query);
                   pstmt.setInt(1,eid);
                   pstmt.executeUpdate();
                   con.setAutoCommit(true);
                   JOptionPane.showMessageDialog(this, "Deleted Successfully");
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Error"+ ex.toString());
            }

        }
    }
  
        
      //public void paint(Graphics g){
        //Toolkit t=Toolkit.getDefaultToolkit();  
       //doc=t.getImage("C:\\Users\\Admin\\OneDrive\\Documents\\project\\doc1.jpg");
       //g.drawImage(doc, 30,55,this);  
  // }

    public static void main(String args[]){
        new Docdelete();
}
} 

