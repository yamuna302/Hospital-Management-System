package Admin;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class docupdate extends JFrame implements ActionListener{
    JLabel lbl_drid,lbl_view1,lbl_heading,lbl_subheading;
    Choice jcb_drid;
    JButton jbtn_submit;
    Container co;
    String int_id;
    ImageIcon view1,submit;
   docupdate(){
        
        super.setTitle("Update");
        co=getContentPane();
        
        co.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        submit=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\submit.png");
        view1=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\updateform1.png");
       
        
        lbl_heading=new JLabel("UPDATE DETAILS");
        lbl_subheading=new JLabel("Inorder to update the details, please enter the id");
        lbl_subheading.setFont(new Font("High Tower Text",Font.ITALIC,25)); 
        
        lbl_heading.setFont(new Font("High Tower Text",Font.BOLD,30)); 
        lbl_drid=new JLabel("Doctor ID");
        lbl_drid.setFont(new Font("High Tower Text",Font.ITALIC,20));
        jcb_drid=new Choice();
        jbtn_submit=new JButton("SUBMIT", submit);
        lbl_view1=new JLabel("",view1,JLabel.CENTER);
        
        lbl_view1.setBounds(0,0,625,800);
      
        co.setBackground(Color.decode("#EBF2FB"));
        co.add(lbl_view1);
        
        lbl_subheading.setBounds(700,200,800,50);
        lbl_heading.setBounds(800,100,400,50);
        jbtn_submit.addActionListener(this);
        lbl_drid.setBounds(700,300,100,100);
        
        jbtn_submit.setBounds(850,400,60,40);
        jcb_drid.setBounds(900,330,100,100);
        
       
      
    co.add(lbl_subheading);
    co.add(lbl_heading);
        co.add(lbl_drid);
        co.add(jcb_drid);
        co.add(jbtn_submit);
        
    
          try{
            jcb_drid.addItem("0");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","lemon","root");
            String query="select id from docdetails";
            PreparedStatement pstmt=con.prepareStatement(query);
            ResultSet rst=pstmt.executeQuery();
            while(rst.next()){
                jcb_drid.addItem(rst.getString("id"));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    
       
       
        setSize(1250,800);
       
        setVisible(true);
        
    }
   
    
    
    public static void main(String[] args){
        new docupdate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int_id=jcb_drid.getSelectedItem();
        new Update(int_id);
        this.dispose();
    }
}
    


    


