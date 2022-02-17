package homepage;


import Admin.Admin;
import Doctor.LoginForm;
import Patient.PatientOption;
import Pharmacy.Pharmacy;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class homepage extends JFrame {
    JButton jbtn_log,ad,doc,pat,phar;
    ImageIcon ilogo,iadmin,idoctor,ipatient,iphar;
    Container co;
    JLabel hos,logo,admin,doctor,patient,pharmacy; 
    JPanel p1,p2,p3,pa1,pa2,pa3;
    JSplitPane jsp;
    public homepage(){
        
       
         co=getContentPane();
        
        p1=new JPanel(null);
        p2=new JPanel(null);
        p3=new JPanel(null);
        jsp=new JSplitPane();
        co.add(jsp);
        jsp.setDividerLocation(400);
        
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
     
         admin=new JLabel("ADMIN");
         admin.setForeground(Color.white);
        admin.setFont(new Font(Font.SERIF,Font.BOLD,20));
         admin.setBounds(180,0,250,100);
        
         doctor=new JLabel("DOCTOR");
         doctor.setForeground(Color.white);
        doctor.setFont(new Font(Font.SERIF,Font.BOLD,20));
       doctor.setBounds(520,0,250,100);
        
         patient=new JLabel("PATIENT");
         patient.setForeground(Color.white);
        patient.setFont(new Font(Font.SERIF,Font.BOLD,20));
       patient.setBounds(170,360,200,100);
         
         pharmacy=new JLabel("PHARMACY");
         pharmacy.setForeground(Color.white);
        pharmacy.setFont(new Font(Font.SERIF,Font.BOLD,20));
        pharmacy.setBounds(510,360,130,100);
        
        p1.add(hos);
        
        
       p2.add(admin);
        p2.add(doctor);
        p2.add(patient);
        p2.add(pharmacy);
        
        iadmin=new ImageIcon("project\\admin.jpg");
         ad = new JButton(iadmin);
        iadmin.setImageObserver(ad);
        ad.setBounds(100,90,250, 250);
        ad.setBackground(Color.gray);
        ad.setFocusPainted(false);
        p2.add(ad);
        
        idoctor=new ImageIcon("project\\doctor1.jpg");
        doc = new JButton(idoctor);
        idoctor.setImageObserver(doctor);
        doc.setBounds(450,90, 250, 250);
        doc.setBackground(Color.gray);
        doc.setFocusPainted(false);
        p2.add(doc);
        
        ipatient=new ImageIcon("project\\patient1.jpg");
        pat = new JButton(ipatient);
        ipatient.setImageObserver(patient);
        pat.setBounds( 100,440, 250, 250);
        pat.setBackground(Color.gray);
        pat.setFocusPainted(false);
        p2.add(pat);
       
        iphar=new ImageIcon("project\\pharmacy.png");
          phar = new JButton(iphar);
        iphar.setImageObserver(phar);
        phar.setBounds( 450,440, 250, 250);
        phar.setBackground(Color.gray);
        phar.setFocusPainted(false);
        p2.add(phar);
        

   
   ad.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new Admin();
                        setVisible(false);
                       
                }
                });
   
   doc.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new LoginForm();
                        setVisible(false);
                       
                }
                });
   pat.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new PatientOption();
                        setVisible(false);
                       
                }
                });
  phar.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new Pharmacy();
                        setVisible(false);
                       
                }
                });
    home.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new homepage();
                        setVisible(false);
                       
                }
                });
        
         about.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new aboutpage();
                        setVisible(false);
                       
                }
                });
     contact.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        new contactpage();
                        setVisible(false);
                       
                }
                });
        
        p1.setBackground( Color.decode("#DC050C"));
        p2.setBackground(Color.decode("#333333"));
        
       jsp.setTopComponent(p1);
        jsp.setBottomComponent(p2);
        
        setBounds(100, 100, 1250, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new homepage();
    }
    
}
