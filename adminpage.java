package Admin;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;


public class adminpage extends JFrame {

    JButton register,doctor,patient,room;
    ImageIcon iregister,idoctor,ipatient,irooms,ilogo;
    Container co;
    JLabel hos,logo,lbl_reg,lbl_doc,lbl_pat,lbl_room; 
    JPanel p1,p2;
    JSplitPane jsp;
    adminpage(){
        
        co=getContentPane();
        p1=new JPanel(null);
        p2=new JPanel(null);
        jsp=new JSplitPane();
        co.add(jsp);
        jsp.setDividerLocation(400);
        
        ilogo=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\logo.jpg");
        iregister=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\docregis.jpg");
        idoctor=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\doctor.jpg");
        ipatient=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\patient.jpg");
        irooms=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\rooms.png");
        
        logo=new JLabel(ilogo);
        logo.setBounds(0,10,400,152);
        p1.add(logo);
        
        hos=new JLabel("SKCET Memorial Hospital");
      
       
        hos.setForeground(Color.white);
        hos.setFont(new Font("Arial Black",Font.BOLD,22));
        
        hos.setBounds(24,163,350,50);
     
        
         lbl_reg=new JLabel("DOCTOR REGISTRATION");
         lbl_reg.setForeground(Color.white);
        lbl_reg.setFont(new Font(Font.SERIF,Font.BOLD,20));
        lbl_reg.setBounds(100,0,250,100);
        
         lbl_doc=new JLabel("DOCTOR DETAILS");
         lbl_doc.setForeground(Color.white);
        lbl_doc.setFont(new Font(Font.SERIF,Font.BOLD,20));
        lbl_doc.setBounds(500,0,200,100);
        
         lbl_pat=new JLabel("PATIENT DETAILS");
         lbl_pat.setForeground(Color.white);
        lbl_pat.setFont(new Font(Font.SERIF,Font.BOLD,20));
        lbl_pat.setBounds(140,360,200,100);
        
         lbl_room=new JLabel("ROOM");
         lbl_room.setForeground(Color.white);
        lbl_room.setFont(new Font(Font.SERIF,Font.BOLD,20));
        lbl_room.setBounds(530,360,100,100);
        
        p1.add(hos);
        
        
        p2.add(lbl_reg);
        p2.add(lbl_doc);
        p2.add(lbl_pat);
        p2.add(lbl_room);
        
         register = new JButton(iregister);
        iregister.setImageObserver(register);
        register.setBounds(100,90,250, 250);
        register.setBackground(Color.gray);
        register.setFocusPainted(false);
        p2.add(register);
        
        doctor = new JButton(idoctor);
        idoctor.setImageObserver(doctor);
        doctor.setBounds(450,90, 250, 250);
        doctor.setBackground(Color.gray);
        doctor.setFocusPainted(false);
        p2.add(doctor);
        
        patient = new JButton(ipatient);
        ipatient.setImageObserver(patient);
        patient.setBounds( 100,440, 250, 250);
        patient.setBackground(Color.gray);
        patient.setFocusPainted(false);
        p2.add(patient);
       
          room = new JButton(irooms);
        irooms.setImageObserver(room);
        room.setBounds( 450,440, 250, 250);
        room.setBackground(Color.gray);
        room.setFocusPainted(false);
        p2.add(room);
      
        p1.setBackground(Color.decode("#29aae1"));
        p2.setBackground(Color.decode("#332E2E"));
        
        jsp.setLeftComponent(p1);
        jsp.setRightComponent(p2);
        
        setBounds(100, 100, 1250, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
          register.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new regd();
                        setVisible(false);
                       
                }
                });
            doctor.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new docpage();
                        setVisible(false);
                       
                }
                });
            patient.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new patpage();
                        setVisible(false);
                       
                }
                });
    }   
        
    
    public static void main(String[] args) {
        new adminpage();
    }
    
}   

