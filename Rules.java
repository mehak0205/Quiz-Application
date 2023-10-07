
package quizzz.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener
{
    String name,id;
    JButton start,back;
    Rules(String name,String id) 
    {
        this.name=name;
        this.id=id;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome " + name + " to Java Quiz");
        heading.setBounds(100,30,750,40);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(0, 128, 128));
        add(heading);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/rule3.jpg"));
        JLabel image=new JLabel(i1);
        image.setSize(100, 180);
     image.setBounds(490,150,300,220);
        add(image);
        
        //JLabel heading2=new JLabel("Registered name :- " + name);
       // heading2.setBounds(20,70,500,30);
       // heading2.setFont(new Font("Times New Roman",Font.BOLD,18));
       // heading2.setForeground(Color.BLACK);
       // add(heading2);
        
        JLabel heading3=new JLabel("Email :- " + id);
        heading3.setBounds(500,80,390,30);
        heading3.setFont(new Font("Times New Roman",Font.BOLD,14));
        heading3.setForeground(Color.BLACK);
        add(heading3);
        
        JLabel rules=new JLabel("");
        rules.setBounds(20,130,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
     
        rules.setText(
                "<html>"+
                 "1.There are total 10 questions and each question is of 10 marks." + "<br><br>" +
                 "2.Only a fool asks and a wise answers (Be wise, not otherwise)." + "<br><br>" +
                 "3.For each question only 15 seconds will be given." + "<br><br>" +
                 "4.You can take a hint with the help of 50-50 lifeline but only once." + "<br><br>" +
                 "5.If you will not answer the question in a given stipulated time <br><br> the question will be automatically get skipped." + "<br><br>" +
                 "6.You may have a lot of options in life but here all the questions are compulsory." + "<br><br>" +
                 "7.Good Luck!" + "<br><br>" +      
                "<html>"        
        );
        rules.setForeground(Color.BLACK);
        add(rules);
        
         
        
        
        
        back= new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE );
        back.addActionListener(this);
        add(back);
        
        start= new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE );
        start.addActionListener(this);
        add(start);
        
        
        setSize(800,650);
        setLocation(0,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==start) {
             setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    
    public static void main(String[] args)
    {
        new Rules("User","x");
    }    
}
