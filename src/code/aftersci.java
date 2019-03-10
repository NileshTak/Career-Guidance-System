package code;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class aftersci extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame f1;

	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("static-access")
			public void run() {
                try {
                    aftersci window = new aftersci();
                    window.f1.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	 public aftersci() {
	        initialize();
	    }

	 private void initialize()
	 {

		  JFrame frame=new JFrame();
	        frame.setVisible(true);
	        //frame.setSize(800,600);
	        //frame.setLocation(200,50);
	        frame.setBounds(-10,0,1800,740);
	        frame.setTitle("Career World --Way To Success");
	        ImageIcon icon=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
	        ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1486660746024.jpg");
	        ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\direct-way-to-success-10081000.jpg");
	        ImageIcon icon3=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\ca7b81256d27f757790508035a8177c0.png");
	        ImageIcon icon4=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\images(1).jpg");
	      
	        
	        frame.setIconImage(icon.getImage());
	        
	        JPanel co = new JPanel();
	        co.setLayout(null);
	        JScrollPane sp = new JScrollPane(co);
	        co.setPreferredSize(new Dimension(100, 1000));
	    
	        //co.setBackground(Color.blue);
	        
	        
	        JButton logout = new JButton(icon4);
   	        logout.setBounds(75,740,80,80);
   	        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
   	        logout.setCursor(cur);
   	        
   	     logout.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				logoutEvent(e);
	     			}
	    			
	    	});

	        JLabel label2 = new JLabel("DashBoard");
	        label2.setBounds(50,520,300,40); 
	        Font f1=new Font("Arial",Font.BOLD,30);
	         label2.setFont(f1);
	        
	        JButton b1 = new JButton(icon3);
	        b1.setBounds(75,560,80,80);
	        b1.setCursor(cur);
	        
	        
	        b1.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b1Event(e);
	     			}
	    			
	     		});
	       

	        
	        JButton b2 = new JButton("About");
	        b2.setBounds(50,650,130,30);
	        b2.setCursor(cur);
	        
	        b2.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b2Event(e);
	     			}
	    			
	     		});
	       

	        
	        JButton b3 = new JButton("Expert Guidance");
	        b3.setBounds(50,700,130,30);
	        b3.setCursor(cur);

	        
	        b3.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b3Event(e);
	     			}
	    			
	     		});
	       
            JButton b4 = new JButton("Computer Engineering >");
            b4.setBounds(400,560,380,40);
            Font f3=new Font("AR JULIAN",Font.BOLD,18);
            b4.setFont(f3);
            b4.setForeground(Color.blue);
            b4.setCursor(cur);
      
            
            b4.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b4Event(e);
	     			}
	    			
	     		});
	       
            
            JButton b5 = new JButton("Mechanical Engineering >");
            b5.setBounds(400,620,380,40);
            b5.setFont(f3);
            b5.setForeground(Color.blue);
            b5.setCursor(cur);
            
            JButton b6 = new JButton("Civil Engineering >");
            b6.setBounds(400,680,380,40);
            b6.setFont(f3);
            b6.setForeground(Color.blue);
            b6.setCursor(cur);
            
            JButton b7 = new JButton("BSC >");
            b7.setBounds(400,740,380,40);
            b7.setFont(f3);
            b7.setForeground(Color.blue);
            b7.setCursor(cur);
            
            JButton b8 = new JButton("E&TC Engineering >");
            b8.setBounds(400,800,380,40);
            b8.setFont(f3);
            b8.setForeground(Color.blue);
            b8.setCursor(cur);
            
           
            
            

            
	        JLabel label1 = new JLabel(icon1);
	        label1.setBounds(-25,10,1400,500);
	        
	        JLabel label4 = new JLabel(icon2);
	        label4.setBounds(800,420,450,550);
	     
	        JLabel notice = new JLabel("* Select any of the Course above to gain more info or to start your IQ Test.");
            notice.setBounds(400,780,1200,200);
            notice.setForeground(Color.red);
            Font f11=new Font("Calibri (body)",Font.PLAIN,15);
            notice.setFont(f11);
	     
	        
	        
	        
	        JLabel label3 = new JLabel("List of Cources after 12th : ");
            label3.setBounds(400,500,450,70);
            Font f2=new Font("RockWell",Font.BOLD,30);
             label3.setFont(f2);
	        
             
             
             
             
	        co.add(label1);
	        co.add(b1);
	        co.add(b2);
	        co.add(b3);
	        co.add(b4);
	        co.add(b5);
	        co.add(b6);
	        co.add(b7);
	        co.add(b8);
	       
	        co.add(label2);
	        co.add(label3);
	        co.add(label4);
	        co.add(notice);
	        co.add(logout);
	        
	        
	        frame.getContentPane().add(sp);

	}
	@SuppressWarnings("unused")
	private Border newRoundedBorder(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void logoutEvent(ActionEvent e)
    {
		Login l = new Login();
	    l.setVisible(true);
	       	
	}
	
	
	
	public static void b2Event(ActionEvent e)
    {
		About a = new About();
	    a.setVisible(true);
	       	
	}
	public static void b4Event(ActionEvent e)
    {
		ce c = new ce();
	    c.setVisible(true);
	       	
	}
	
	public static void b1Event(ActionEvent e)
    {
		Home h = new Home();
	    h.setVisible(true);
	       	
	}
	
	
	
 
 public static void b3Event(ActionEvent e)
    {
		EG eg = new EG();
	    eg.setVisible(true);
	       	
	}
	
	public void setVisible(boolean b)
	   {
		   this.setVisible(true);
	   }
	
	
}