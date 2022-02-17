package homepage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class aboutpage extends JFrame {
    JButton jbtn_log,ad,doc,pat,phar;
    ImageIcon ilogo,iadmin,idoctor,ipatient,iphar;
    Container co;
    JLabel hos,logo,admin,doctor,patient,pharmacy,head; 
    JPanel p1,p2,p3,pa1,pa2,pa3;
    JPanel pl1,pl2;
    JSplitPane jsp;
    aboutpage(){
 
         co=getContentPane();
        p1=new JPanel(null);
        p2=new JPanel(null);
        p3=new JPanel(null);
        jsp=new JSplitPane();
        co.add(jsp);
        jsp.setDividerLocation(400);
        
        pl1=new JPanel(null);
        pl1.setBounds(0,0,820,100);
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
   
    
    
    
    JButton about = new JButton("About");  
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

          head=new JLabel("About Us");
     head.setFont(new Font(Font.MONOSPACED,Font.HANGING_BASELINE,30));
       
        head.setBounds(300,30, 200, 35);// NOI18N
         head.setForeground(Color.white);
        p2.add(head);
         
        String text="<html><p> SKCET memorial hospital has emerged as South India’s foremost integrated healthcare services provider and has a robust presence across the healthcare ecosystem, including Hospitals, Pharmacies, Primary Care & Diagnostic Clinics and several retail health models. The Group also has Telemedicine facilities across several states, Health Insurance Services, International Projects Consultancy, Medical Colleges, MEd varsity for E-Learning, Colleges of Nursing and Hospital Management and a Research Foundation.\n" +
"The cornerstones of SKCET memorial’s legacy are its unstinting focus on clinical excellence, affordable costs, modern technology and forward-looking research & academics. SKCET memorial was among the first few hospitals in the India to leverage technology to facilitate seamless healthcare delivery.   \n" +
"As a responsible corporate citizen, SKCET memorial Hospitals takes the spirit of leadership well beyond business and has embraced the responsibility of keeping India healthy. Recognizing that Non Communicable Diseases (NCDs) are the greatest threat to the nation, SKCET memorial Hospitals is continuously educating people about preventive healthcare as the key to wellness. Likewise, the “Billion Hearts Beating Foundation” endeavors to keep Indians heart-healthy.\n" +
"SKCET memorial Hospitals has championed numerous social initiatives – to cite a few which assist underprivileged children – SACHi (Save a Child’s Heart Initiative) which screens and provides pediatric cardiac care for congenital heart diseases, SAHI (Society to Aid the Hearing Impaired) and the CURE Foundation focused on cancer care. To introduce population health into the Indian narrative, It aims to provide “holistic healthcare” for the entire community starting from birth, through one’s journey into childhood, adolescence, adulthood and old age.</p></html>";
    
        JLabel para=new JLabel(text);
         para.setForeground(Color.white);
       para.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
       para.setBounds(0,150,820,500);
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
        new aboutpage();
    }
    
}
