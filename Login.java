
package quizzz.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
     JTextField t1,t2; //have to declare globally (as first they were define imside the constructor so they cnnot be used in actionevent function
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login3.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,460);
        add(image);
        //heading
        JLabel heading=new JLabel("Java Quiz");
        heading.setBounds(700,70,600,80);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,80));
        heading.setForeground(new Color(0,102,102));
        add(heading);
        
        // name label
       JLabel name=new JLabel("Full Name");
        name.setBounds(650,200,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,19));
        name.setForeground(Color.BLACK);
        add(name);
        //name textfield
         t1=new JTextField();
        t1.setBounds(750,200,350, 25);
        t1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(t1);
        //email label
        JLabel email=new JLabel("E-Mail");
        email.setBounds(650,250,300,20);
        email.setFont(new Font("Mongolian Baiti",Font.BOLD,19));
        email.setForeground(Color.BLACK);
        add(email);
        //email textfield
        t2=new JTextField();
        t2.setBounds(750,250,350, 25);
        t2.setFont(new Font("Times New Roman",Font.PLAIN,20));
        add(t2);
        
     
        rules= new JButton("Rules");
        rules.setBounds(735,320,120,25);
        rules.setBackground(new Color(0,102,102));
        rules.setForeground(Color.WHITE );
        rules.addActionListener(this);
        add(rules);
        
         back= new JButton("Back");
        back.setBounds(915,320,120,25);
        back.setBackground(new Color(0,102,102));
        back.setForeground(Color.WHITE );
        back.addActionListener(this);
        add(back);
        
        
        setSize(1200,500);
        setLocation(150,150);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==rules){
            String name=t1.getText();
            String id=t2.getText();
            setVisible(false);
            new Rules(name,id);
            
        } else if(ae.getSource()==back) {
            setVisible(false);
        }
        
    }
        public static void main(String[] args) {
            new Login();
        }
    }
    

