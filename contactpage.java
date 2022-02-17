package homepage;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class contactpage extends JFrame {
    JButton jbtn_log,ad,doc,pat,phar,mail;
    ImageIcon ilogo,iadmin,idoctor,ipatient,iphar;
    Container co;
    JLabel hos,logo,admin,doctor,patient,pharmacy,head; 
    JPanel p1,p2,p3,pa1,pa2,pa3;
    JPanel pl1,pl2;
    JSplitPane jsp;
    contactpage(){
 
         co=getContentPane();
        p1=new JPanel(null);
        p2=new JPanel(null);
        p3=new JPanel(null);
        jsp=new JSplitPane();
        co.add(jsp);
        mail= new JButton("skcethospital@gmail.com");
        jsp.setDividerLocation(400);
        
        pl1=new JPanel(null);
        pl1.setBounds(0,0,820,100);
        mail.setBounds(220,460,350,50);
        mail.setBackground(Color.decode("#333333"));
        mail.setForeground(Color.white);
        mail.setFont(new Font("Arial Black",Font.BOLD, 15));
        p2.add(mail);
        mail.setBorderPainted(false);
 mail.setFocusPainted(false);
        pl1.setBackground(Color.decode("#DC050C"));

        

       
//pl1.setBackground(new java.awt.Color(204, 204, 204));
           p2.add(pl1);
         
               p3.setBounds(0,400,400,400);
          p3.setBackground(Color.decode("#333333"));
           p1.add(p3);
           
    JButton home = new JButton("Home");  
    home.setBackground(Color.decode("#333333")); 
    home.setForeground(Color.white);
     home.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
    home.setBounds(0, 280, 400, 50);  
   
    
    
    
    JButton about = new JButton("About Us");  
    about.setBackground(Color.decode("#333333"));  
    about.setForeground(Color.white);
    about.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
    about.setBounds(0, 330, 400, 50);  
    
    
    JButton contact = new JButton("Contact us");  
    contact.setBackground(Color.decode("#333333"));  
    contact.setForeground(Color.white);
    contact.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
    contact.setBounds(0, 380, 400, 50);  
     JLayeredPane pane = getLayeredPane();  
    //creating buttons  
  
    //adding buttons on pane  
    pane.add(contact);  
    pane.add(home);  
    pane.add(about);  

          head=new JLabel("Contact Us");
    
         head.setFont(new java.awt.Font("Tahoma", 1, 32));
        head.setBounds(300,30, 200, 35);// NOI18N
         head.setForeground(Color.white);
        p2.add(head);
         
        String text="<html><p><center> ADDRESS <br> 239,SKCET memorial hospital, Teynampet, Chennai-29.<br><br>" + " Phone Number<br> +91 9455924591 (7 lines) <br><br>" + "E-mail ID<br><br></center>.</p></html>";
    
        JLabel para=new JLabel(text);
         para.setForeground(Color.white);
       para.setFont(new Font("Arial Black",Font.BOLD,15));
       para.setBounds(130,150,820,500);
         p2.add(para);
        
        ilogo=new ImageIcon("project\\logo.jpg");
        logo=new JLabel(ilogo);
        logo.setBackground(Color.decode("#DC050C"));
   logo.setBounds(0,10,400,152);
        p1.add(logo);
       
        hos=new JLabel("SKCET Memorial Hospital");
        hos.setForeground(Color.white);
        hos.setFont(new Font("Arial Black",Font.BOLD,22));
        hos.setBounds(24,163,350,50);
         p1.add(hos);
  
          home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
              new homepage();
                setVisible(false);
            }
        });  
          mail.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new mail();
                        setVisible(false);
                       
                }
                });
    
         about.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new aboutpage();
                        setVisible(false);
                       
                }
                });
    
        contact.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new aboutpage();
                        setVisible(false);
                       
                }
                });
         p1.setBackground( Color.decode("#DC050C"));
        p2.setBackground(Color.decode("#333333"));
      jsp.setTopComponent(p1);
        jsp.setBottomComponent(p2);
         p2.add(pl1);
        setBounds(100, 100, 1250, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        new contactpage();
    }
    
}