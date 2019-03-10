package code;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class after10 extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame frame;

	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("static-access")
			public void run() {
                try {
                    after10 window = new after10();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	 public after10() {
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
	        ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\Career_Options_After_12th_Science.jpg");
	        ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\direct-way-to-success-10081000.jpg");
	        ImageIcon icon3=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\college-major-and-career-options_165104_large.jpg");
	        ImageIcon icon4=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\ca7b81256d27f757790508035a8177c0.png");
	        ImageIcon icon5=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\images(1).jpg");
	        
	        frame.setIconImage(icon.getImage());
	        
	        JPanel co = new JPanel();
	        co.setLayout(null);
	        JScrollPane sp = new JScrollPane(co);
	        co.setPreferredSize(new Dimension(100, 1000));
	    
	        //co.setBackground(Color.blue);
	        

	        JLabel label2 = new JLabel("DashBoard");
	        label2.setBounds(50,650,300,40); 
	        Font f1=new Font("Arial",Font.BOLD,30);
	         label2.setFont(f1);
	        
	        JButton b1 = new JButton(icon4);
	        b1.setBounds(75,690,80,80);
	        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
	        b1.setCursor(cur);
	        
	        b1.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				b1Event(e);
         			}
        			
         		});

	        JButton logout = new JButton(icon5);
   	        logout.setBounds(75,870,80,80);
   	       
   	        logout.setCursor(cur);
   	        
   	     logout.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				logoutEvent(e);
	     			}
	    			
	    	});
	        
	        
	        JButton b2 = new JButton("About");
	        b2.setBounds(50,780,130,30);
	        b2.setCursor(cur);

	        
	        b2.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				b2Event(e);
         			}
        			
         		});
            
	        
	        JButton b3 = new JButton("Expert Guidance");
	        b3.setBounds(50,830,130,30);
	        b3.setCursor(cur);

	        b3.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				b3Event(e);
         			}
        			
         		});
            
	        
            JButton b4 = new JButton("Diploma in Computer Engineering >");
            b4.setBounds(390,560,390,40);
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
            
      
            JButton b5 = new JButton("Diploma in Mechanical Engineering >");
            b5.setBounds(390,620,390,40);
            b5.setFont(f3);
            b5.setForeground(Color.blue);
            b5.setCursor(cur);
            
            b5.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				b5Event(e);
         			}
        			
         		});
            
            
            JButton b6 = new JButton("Diploma in Civil Engineering >");
            b6.setBounds(390,680,390,40);
            b6.setFont(f3);
            b6.setForeground(Color.blue);
            b6.setCursor(cur);
            
            
            b6.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				b6Event(e);
         			}
        			
         		});
            
            
            JButton b7 = new JButton("Diploma in Aeronautical Engineering>");
            b7.setBounds(390,740,390,40);
            b7.setFont(f3);
            b7.setForeground(Color.blue);
            b7.setCursor(cur);
            
            
            b7.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				b7Event(e);
         			}
        			
         		});
            
            
            
            JButton b8 = new JButton("Diploma in E&TC Engineering >");
            b8.setBounds(390,800,390,40);
            b8.setFont(f3);
            b8.setForeground(Color.blue);
            b8.setCursor(cur);
            
            
            b8.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				b8Event(e);
         			}
        			
         		});
            
            
            
           
           
            
            

            
	        JLabel label1 = new JLabel(icon1);
	        label1.setBounds(160,-30,1400,500);
	        
	        JLabel label4 = new JLabel(icon2);
	        label4.setBounds(800,420,450,550);
	        
	        
	        JLabel label5 = new JLabel(icon3);
	        label5.setBounds(10,-130,400,900);
	        
	        JLabel notice = new JLabel("* Select any of the Course above to gain more info or to start your IQ Test.");
            notice.setBounds(400,780,1200,200);
            notice.setForeground(Color.red);
            Font f11=new Font("Calibri (body)",Font.PLAIN,15);
            notice.setFont(f11);
	     
	
	        
	        
	        
	        JLabel label3 = new JLabel("List of Cources after 10th : ");
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
	        co.add(label5);
	        co.add(notice);
	        co.add(logout);
	        
	        
	        
	        frame.getContentPane().add(sp);

	}
	@SuppressWarnings("unused")
	private Border newRoundedBorder(int i)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static void b2Event(ActionEvent e)
    {
		About a = new About();
	    a.setVisible(true);
	   
	   
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
 
 public static void logoutEvent(ActionEvent e)
 {
		Login l = new Login();
	    l.setVisible(true);
	       	
	}
	
	
	public void setVisible(boolean b)
	   {
		   this.setVisible(true);
	   }
	
	 public static void b4Event(ActionEvent e)
	    {
			dce c = new dce();
		    c.setVisible(true);
		       	
		}
	 
	 public static void b5Event(ActionEvent e)
	    {
			dme m = new dme();
		    m.setVisible(true);
		       	
		}
	 
	 
	 public static void b6Event(ActionEvent e)
	    {
			dcie ci = new dcie();
		    ci.setVisible(true);
		       	
		}
	 
	 
	 public static void b7Event(ActionEvent e)
	    {
			dae a = new dae();
		    a.setVisible(true);
		       	
		}
	 
	 public static void b8Event(ActionEvent e)
	    {
			dee etc = new dee();
		    etc.setVisible(true);
		       	
		}
	 

}