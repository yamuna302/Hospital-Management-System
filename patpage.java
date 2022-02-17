package Admin;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class  patpage  extends JFrame{
    JButton view,update,delete,back;
    ImageIcon iview,iupdate,idelete,ilogo,iback;
    Container co;
    JLabel hos,logo,lbl_view,lbl_delete,lbl_update; 
    JPanel p1,p2;
    JSplitPane jsp;
    patpage(){
        
        co=getContentPane();
        p1=new JPanel(null);
        p2=new JPanel(null);
        jsp=new JSplitPane();
        co.add(jsp);
        jsp.setDividerLocation(400);
        
        ilogo=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\logo.jpg");
        iview=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\view.png");
        iupdate=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\dupdate.png");
        idelete=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\ddelete.jpg");
        iback=new ImageIcon("C:\\Users\\Admin\\OneDrive\\Documents\\project\\b2.png");
       
        logo=new JLabel(ilogo);
        logo.setBounds(0,10,400,152);
        p1.add(logo);
        
        hos=new JLabel("SKCET Memorial Hospital");
      
       
        hos.setForeground(Color.white);
        hos.setFont(new Font("Arial Black",Font.BOLD,22));
        
        
        hos.setBounds(24,163,350,50);
        
        
         lbl_view=new JLabel("VIEW");
         lbl_view.setForeground(Color.white);
        lbl_view.setFont(new Font(Font.SERIF,Font.BOLD,22));
        lbl_view.setBounds(150,0,100,100);
        
         lbl_update=new JLabel("UPDATE");
         lbl_update.setForeground(Color.white);
        lbl_update.setFont(new Font(Font.SERIF,Font.BOLD,22));
        lbl_update.setBounds(550,0,150,100);
        
         lbl_delete=new JLabel("DELETE");
         lbl_delete.setForeground(Color.white);
        lbl_delete.setFont(new Font(Font.SERIF,Font.BOLD,22));
        lbl_delete.setBounds(300,350,150,100);
        
        p1.add(hos);
       
        
        p2.add(lbl_view);
        p2.add(lbl_update);
        p2.add(lbl_delete);
        
         view = new JButton(iview);
        iview.setImageObserver(view);
        view.setBounds(30,70,300, 300);
        view.setBackground(Color.gray);
        view.setFocusPainted(false);
        p2.add(view);
        
        update = new JButton(iupdate);
        iupdate.setImageObserver(update);
        update.setBounds(450,70, 300, 300);
        update.setBackground(Color.gray);
        update.setFocusPainted(false);
        p2.add(update);
        
        delete = new JButton(idelete);
        idelete.setImageObserver(delete);
        delete.setBounds( 210,420, 300, 300);
        delete.setBackground(Color.gray);
        delete.setFocusPainted(false);
        p2.add(delete);
       
      back=new JButton(iback);
        iback.setImageObserver(back);
        back.setBounds( 10,10, 50, 50);
        back.setBackground(Color.decode("#332E2E"));
        back.setFocusPainted(false);
        p2.add(back);
        
        p1.setBackground(Color.decode("#29aae1"));
        p2.setBackground(Color.decode("#332E2E"));
        
        jsp.setLeftComponent(p1);
        jsp.setRightComponent(p2);
        
        setBounds(100, 100, 1250, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          update.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new PatUpdate("1002");
                        setVisible(false);
                       
                }
                });
           view.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new ViewDetails("1002");
                        setVisible(false);
                       
                }
                });
            delete.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        new patdelete();
                        setVisible(false);
                       
                }
                });
            back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               adminpage rgf= new adminpage();
                setVisible(false);
            }
        });
    }
    public static void main(String[] args) {
        new patpage();
    }
    
}

