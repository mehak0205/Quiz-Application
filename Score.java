
package quizzz.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {
    
    Score(String name,int score) {
        setBounds(400,120,750,550);
       getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("icons/score4.gif"));
      Image i3=i2.getImage().getScaledInstance(370, 550 ,Image.SCALE_FAST);
      ImageIcon i4=new ImageIcon(i3);
       JLabel imagee=new JLabel(i4);
       imagee.setBounds(0,0,350,550);
       add(imagee);
       
        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("icons/score2.jpg"));
       Image i6=i5.getImage().getScaledInstance(380, 270 ,Image.SCALE_DEFAULT);
       ImageIcon i7=new ImageIcon(i6);
       JLabel image1=new JLabel(i7);
       image1.setBounds(360,0,380,270);
       add(image1);
       
       //JLabel heading=new JLabel("Thankyou " + name);
      // heading.setBounds(350,35,700,50);
      // heading.setFont(new Font("Tahoma",Font.PLAIN,44));
      // heading.setForeground(new Color(0,102,102));
       //add(heading);
       
       JLabel lblscore=new JLabel(""+ score);
       lblscore.setBounds(510,300,300,35);
       lblscore.setFont(new Font("Brush Script MT",Font.BOLD,50));
       lblscore.setForeground(new Color(0,102,102));
       add(lblscore);
       
        JButton submit =new JButton("Play Again!");
        submit.setBounds(470,440,160,30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(0,102,102));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        
       setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae) {
        
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Score("user",0);
    }
}

    
    

