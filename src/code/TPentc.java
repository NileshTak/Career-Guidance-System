package code;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class TPentc extends JFrame
 {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JButton start;
	static JFrame f;
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("static-access")
			public void run() {
                try {
                    TabbedPane window = new TabbedPane();
                    window.f.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	 public TPentc() {
	        initialize();
	    }

	 private void initialize()
	 {

JFrame f=new JFrame();

f.setVisible(true);
f.setBounds(-10,0,1800,740);
f.setBackground(Color.white);
f.setTitle("Career World --Way To Success");
ImageIcon icon=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\ca7b81256d27f757790508035a8177c0.png");
ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\images(1).jpg");
ImageIcon icon3=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
ImageIcon icon4=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\aptitude test banner image.jpg");


f.setIconImage(icon.getImage());


JPanel co = new JPanel();
co.setLayout(null);
JScrollPane sp = new JScrollPane(co);
co.setPreferredSize(new Dimension(100, 100));
co.setBackground(Color.white);


JLabel logo = new JLabel(icon3);
logo.setBounds(-50,70,300,300);

JLabel apt = new JLabel(icon4);
apt.setBounds(150,0,1200,250);


JLabel l1 = new JLabel("DashBoard");
l1.setBounds(20,300,300,50); 
Font f3=new Font("Arial",Font.BOLD,30);
 l1.setFont(f3);

JButton b4 = new JButton(icon1);
b4.setBounds(50,350,80,80);
Cursor cur3 = new Cursor(Cursor.HAND_CURSOR);
b4.setCursor(cur3);

b4.addActionListener(new ActionListener()
	{
			public void actionPerformed(ActionEvent e)
			{
				b4Event(e);
			}
		
		});


JButton b5 = new JButton("About");
b5.setBounds(30,440,130,30);
Cursor cur4 = new Cursor(Cursor.HAND_CURSOR);
b5.setCursor(cur4);



b5.addActionListener(new ActionListener()
	{
			public void actionPerformed(ActionEvent e)
			{
				b5Event(e);
			}
		
		});


JButton b6 = new JButton("Expert Guidance");
b6.setBounds(30,490,130,30);
Cursor cur5 = new Cursor(Cursor.HAND_CURSOR);
b6.setCursor(cur5);


b6.addActionListener(new ActionListener()
	{
			public void actionPerformed(ActionEvent e)
			{
				b6Event(e);
			}
		
		});


JButton logout = new JButton(icon2);
   logout.setBounds(50,530,80,80);
  
   logout.setCursor(cur5);
   
logout.addActionListener(new ActionListener()
	{
			public void actionPerformed(ActionEvent e)
			{
				logoutEvent(e);
			}
		
});


JTextArea a2 = new JTextArea(" Instructions : ");
a2.setBounds(200,260,360,50);
a2.setEditable(false);

JTextArea a1 = new JTextArea(" > Total number of questions: 15. "
   		+ "\n > Time alloted: 10 seconds per Question."
   		+ "\n > Each question carry 1 mark, no negative marks."
   		+ "\n > Click the 'NEXT' button given in the bottom to \n   Submit your answers and continue your Test."
   		+ "\n > Test will be submitted when you click on Result Button. "
   		+ "\n > Compulsary to attempt all the Questions."
   		+ "\n > Click on Start Test option above to START the Test.");
a1.setEditable(false);
a1.setBounds(250,330,1000,300);
  
      Font f4=new Font("copperplate Gothic Bold",Font.PLAIN,30);
       a1.setFont(f4);
       Font f1=new Font("copperplate Gothic Bold",Font.BOLD,40);
       a2.setFont(f1);
      
       a2.setForeground(Color.blue);
    
      // a1.setForeground(Color.red);
       a1.setEditable(false);
    
       
       
      

   	
   	
   	
   	JButton start = new JButton("Start Test");
   
   	start.setForeground(Color.red);
   	start.setFont(f4);
   	start.setBounds(500,630,300,30);
   	Cursor cur = new Cursor(Cursor.HAND_CURSOR);
   	start.setCursor(cur);
  




   start.addActionListener(new ActionListener()
   	{
   			public void actionPerformed(ActionEvent e)
   			{
   				startEvent(e);
   			}
   		
   		});







   co.add(start);
co.add(a2);
co.add(a1);
co.add(b4);
co.add(l1);
co.add(b5);
co.add(b6);
co.add(logout);
co.add(logo);
co.add(apt);

f.getContentPane().add(sp);

}

public void setVisible(boolean b)
{
	   this.setVisible(true);
}


public static void b5Event(ActionEvent e)
{

	About a = new About();
    a.setVisible(true);
       	
}

public static void b4Event(ActionEvent e)
{
Home h = new Home();
h.setVisible(true);
   	
}

public static void b6Event(ActionEvent e)
{
	EG eg = new EG();
    eg.setVisible(true);
       	
}

public static void logoutEvent(ActionEvent e)
{
		Login l = new Login();
	    l.setVisible(true);
	       	
	}




public static void startEvent(ActionEvent e)
{
	apti4 en = new apti4();
    en.setVisible(true);
     	
}




	
	

    
	
}






