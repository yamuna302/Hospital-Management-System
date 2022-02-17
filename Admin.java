package Admin;


import homepage.homepage;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
public class Admin extends javax.swing.JFrame{
     
     Graphics g;
     Container co;
     Label u_name,p_word,create,head;
     JLabel log;
     TextField t_user,t_pass;
     ImageIcon ilog;
     JPanel p1,p2;
     JSplitPane jsp;
     Button login,cancel;
     public Admin(){
         
         co=getContentPane();
         co.setLayout(null);
         co. setBounds(130,110,500,600);
         p1=new JPanel(null);
        p2=new JPanel(null);
        jsp=new JSplitPane();
        co.add(jsp);
        jsp.setDividerLocation(400);
         setTitle("Doctor Login");
         
 
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         setLayout(null);
         co.setBackground(Color.decode("#003333"));
         
         head=new Label("Login Form");
         head.setFont(new java.awt.Font("Tahoma", 1, 32));
         head.setBounds(180,20, 220, 35);// NOI18N
         head.setForeground(new java.awt.Color(51,153,255));
         
         u_name=new Label("Username :");
         u_name.setFont(new java.awt.Font("Tahoma", 1, 22));
         u_name.setBounds(100,180, 120, 35);// NOI18N
         u_name.setForeground(new java.awt.Color(51,153,255));
         
         t_user=new TextField();
         t_user.setBounds(300, 180, 250,35 );
         
         p_word=new Label("Password :");
         p_word.setFont(new java.awt.Font("Tahoma", 1, 22));
         p_word.setBounds(100,250,150,35);
         p_word.setForeground(new java.awt.Color(51,153,255));
         
         t_pass=new TextField();
         t_pass.setEchoChar('*');
         t_pass .setBounds(300,250,250,35);
         
   
         create=new Label("Click here to create  a new account");
       create.setFont(new java.awt.Font("Tahoma", 1, 20)); 
         create.setForeground(new java.awt.Color(51,153,255));
         create.setBounds(100,450,400,30);
        
         
         login=new Button("Login"); 
         login.setFont(new java.awt.Font("Tahoma", 1, 22)); 
         login.setBounds(380,350,100,55);
         login.setBackground(new java.awt.Color(51, 0, 205));
         login.setForeground(new java.awt.Color(255, 255, 255));
         
         cancel=new Button("Cancel");
         cancel.setFont(new java.awt.Font("Tahoma", 1, 22)); 
         cancel.setBounds(100,350,100,55);
         cancel.setBackground(new java.awt.Color(255, 51, 51));
         cancel.setForeground(new java.awt.Color(255, 255, 255));
         
         p2.setBounds(600,150,500,400);
         add(p2);
         p2.setBackground(Color.black);
          ilog=new ImageIcon("project\\img2.jpg");
          log=new JLabel(ilog);
          log.setBounds(0,0,500,400);
          p2.add(log);
           
          
         add(head);
         add(u_name);
         add(p_word);
         add(create);
         add(t_user);
         add(t_pass);
         add(login);
         add(cancel);
         
         setBounds(100,100,1250,800);
         setBackground(Color.pink);
         setResizable(false);
         setVisible(true);
         
         login.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        String uname=t_user.getText();
                        String pass=t_pass.getText();

                        insert(uname, pass);
                    }
                });
         
          login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new adminpage();
                setVisible(false);
            }
        });
         
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 homepage rgf= new homepage();
                setVisible(false);
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
     }  
     
      
    public static void main(String args[]){
     
        new Admin();
        
    }

    public void insert(String uname,String pass){

  		try
  		{
                       if(!Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", uname)){
                        JOptionPane.showMessageDialog(login,"Invalid email");
                    }
                        else if(!Pattern.matches("^(?=.[a-z])(?=.[A-Z])(?=.[0-9])(?=.[@!$#%&*?])(?=\\S+$).{8,20}$", pass)){
                        JOptionPane.showMessageDialog(login,"Set valid password");
                    }
                        else{
   			Class.forName("oracle.jdbc.driver.OracleDriver");
   			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","login","log");
   			Statement  st=con.createStatement();

			String query="insert into doc values('"+uname+"','"+pass+"')";

   			st.executeUpdate(query);
   			con.close();

   			JOptionPane.showMessageDialog(null,"Success!");
  		}
                }
  		catch(Exception e)
  		{
   			JOptionPane.showMessageDialog(null,"  Exception   -->"+e);
  		}
        }

}

