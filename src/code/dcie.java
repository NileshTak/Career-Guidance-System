package code;

import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.*;

public class dcie extends JFrame
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
                    dcie window = new dcie();
                    window.f1.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	 public dcie() {
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
	      //  ImageIcon icon1=new ImageIcon("PicsArt_1485415453700.png");
	        ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\civil-engineering.jpg");
	        ImageIcon icon3=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\civil-logo.jpg");
	        ImageIcon icon4=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\3rd cover.png");
	        ImageIcon icon5=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\ca7b81256d27f757790508035a8177c0.png");	       
	        ImageIcon icon6=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\images(1).jpg");        
	        
	        frame.setIconImage(icon.getImage());
	        
	        
	        
	        JPanel co = new JPanel();
	        co.setLayout(null);
	        //co.setBackground(Color.blue);
	        JScrollPane sp = new JScrollPane(co);
	        co.setPreferredSize(new Dimension(100, 1850));

	    
	        
	        
	        JLabel label1 = new JLabel("DashBoard");
	        label1.setBounds(50,470,300,50); 
	        Font f1=new Font("Arial",Font.BOLD,30);
	         label1.setFont(f1);
	        
	        JButton b1 = new JButton(icon5);
	        b1.setBounds(75,520,80,80);
	        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
	        b1.setCursor(cur);
	        
	        b1.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b1Event(e);
	     			}
	    			
	     		});

	        JButton logout = new JButton(icon6);
   	        logout.setBounds(75,720,80,80);
   	        
   	        logout.setCursor(cur);
   	        
   	     logout.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				logoutEvent(e);
	     			}
	    			
	    	});
   	
	        JButton b2 = new JButton("About");
	        b2.setBounds(50,620,130,30);
	        b2.setCursor(cur);
	        
	        b2.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b2Event(e);
	     			}
	    			
	     		});
	       

	        
	        JButton b3 = new JButton("Expert Guidance");
	        b3.setBounds(50,670,130,30);
	        b3.setCursor(cur);

	        b3.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				b3Event(e);
	     			}
	    			
	     		});
	       
	        
	        
	      //  JLabel logo= new JLabel(icon1);
	      //  logo.setBounds(-20,110,300,300);
	           
	        JLabel label2 = new JLabel(icon2);
	        label2.setBounds(-20,0,1400,450);
	             
	        
	        JLabel label4 = new JLabel(icon3);
	        label4.setBounds(830,500,600,300);
	        
	        
	        JLabel label5 = new JLabel(icon4);
	        label5.setBounds(10,1095,260,250);

	        
	       
	        
	        
	        JLabel label3 = new JLabel("Diploma in Civil Engineering");
	        label3.setBounds(440,470,700,40); 
	        Font f2=new Font("copperplate Gothic Bold",Font.PLAIN,30);
	           label3.setFont(f2);
	           label3.setForeground(Color.blue);
	           
	           
	           JTextArea a1 = new JTextArea("-Civil Engineering is one of the core branches of "
	           		+ "\nengineering. It is the second oldest engineering branch. "
	           		+ "\nIt is an engineering discipline that focuses on design, planning, "
	           		+ "\nconstruction and maintenance of physically built as well as \n"
	           		+ "natural environment."
	           		+ "\n \n-It is a very diverse field, consisting of various sub \nbranches. Dams, roads, buildings, canals etc are examples of \nphysically built structures.");
	                 a1.setBorder(null);
	              a1.setBounds(280,520,640,265); 
	              Font f3=new Font("Verdana",Font.PLAIN,20);
	               a1.setFont(f3);
	              // a1.setForeground(Color.red);
	               a1.setEditable(false);
	             
	           
	               
	               JTextArea a2 = new JTextArea("When we think about civil engineering, the first thing that comes to our mind "
	               		+ "is buildings!!! \nBut civil engineers do more than just designing and constructing buildings!!! "
	               		+ "\nCivil engineers have the potential to work across various industries that require construction."
	               		
	               		+ "\n \n-The work of a civil engineer involves lots of drawing, sketching, planning, site work, material "
	               		+ "\nand human resource management, cost estimation, project planning and management, data collection \nand "
	               		+ "analysis, site supervision and finance management."
	               		+ "\n \n-To become a successful civil engineer, one must possess a set of skills and qualities. They are-"
	               		+ "\n•Good at mathematics and numbers"
	               		+ "\n•Good at drawing, planning and sketching"
	               		+ "\n•Good at reading plans"
	               		+ "\n•Good at surveying"
	               		+ "\n•Good at cost estimation and finance management"
	               		+ "\n•Good computer knowledge (especially CAD)"
	               		+ "\n•Resource and man management skills"
	               		+ "\n•Good communication skills"
	               		+ "\n•Time management, ability to respect deadlines"
	               		+ "\n•Knowledge about environmental and legal aspects"
	               		
	               		+ "\n \n-Diploma in Civil Engineering is a 3 years long program. The academic program is divided "
	               		+ "\ninto 6 semesters, with each semester lasting for a period of 6 months...");
	   	              a2.setBounds(280,790,1050,600); 
	   	               a2.setFont(f3);
	   	              // a1.setForeground(Color.red);
	   	               a2.setEditable(false);
	   	       
	   	               
	   	            JTextArea a3 = new JTextArea("1st semester subjects-"
	   	            		+ "\n•Engineering Mathematics"
	   	            		+ "\n•Engineering Physics"
	   	            		+ "\n•Engineering Graphics/Drawing"
	   	            		+ "\n•Computer Programming and Utilization"
	   	            		+ "\n•Environmental Science");
	   		              a3.setBounds(280,1395,400,170);
	   		               a3.setFont(f3);
	   		              // a1.setForeground(Color.red);
	   		               a3.setEditable(false);
	   		               
	   		            JTextArea a4 = new JTextArea("2nd semester subjects-"
	   		            		+ "\n•Engineering Mathematics"
	   		            		+ "\n•Applied Mechanics"
	   		            		+ "\n•Building Drawing"
	   		            		+ "\n•Applied Chemistry"
	   		            		+ "\n•Workshop (Practical)");
		   		              a4.setBounds(690,1395,400,170);
		   		               a4.setFont(f3);
		   		              // a1.setForeground(Color.red);
		   		               a4.setEditable(false);
		   		               
		   		              
		   		               
		   		           
		   		            JTextArea a5 = new JTextArea("3rd semester subjects-"
		   		            		+ "\n•Building Materials"
		   		            		+ "\n•Construction Tech"
		   		            		+ "\n•Hydraulics"
		   		            		+ "\n•Surveying"
		   		            		+ "\n•Structural Mechanics");
			   		              a5.setBounds(1100,1395,235,170);
			   		               a5.setFont(f3);
			   		              // a1.setForeground(Color.red);
			   		               a5.setEditable(false);
			   		               
			   		               
			   		            JTextArea a6 = new JTextArea("4th semester subjects-"
			   		            		+ "\n•Structural Mechanics"
			   		            		+ "\n•Advanced Surveying"
			   		            		+ "\n•Soil Mechanics"
			   		            		+ "\n•Water Resource Management"
			   		            		+ "\n•Transportation Engineering");
				   		              a6.setBounds(280,1570,400,170);
				   		               a6.setFont(f3);
				   		              // a1.setForeground(Color.red);
				   		               a6.setEditable(false);
				   		               
				   		               
				   		            JTextArea a7 = new JTextArea("5th semester subjects-"
				   		            		+ "\n•Sanitary Engineering"
				   		            		+ "\n•Water Supply Engineering"
				   		            		+ "\n•Concrete Technology"
				   		            		+ "\n•Cost Evaluation and Estimation"
				   		            		+ "\n•Project Work");
					   		              a7.setBounds(690,1570,400,170);
					   		               a7.setFont(f3);
					   		              // a1.setForeground(Color.red);
					   		               a7.setEditable(false);
					   		                       
				   		           
					   		               
					   		               
					   		            JTextArea a8 = new JTextArea("6th semester subjects-"
					   		            		+ "\n•RCC Design"
					   		            		+ "\n•Project Management"
					   		            		+ "\n•Quality Control"
					   		            		+ "\n•Elective Subjects"
					   		            		+ "\n•Project Work");
						   		              a8.setBounds(1100,1570,235,170);
						   		               a8.setFont(f3);
						   		              // a1.setForeground(Color.red);
						   		               a8.setEditable(false);
			   		               
	               
	        
						   		            JButton b4 = new JButton("Take an Aptitude Test >>>");
							   		         Font f4=new Font("AR JULIAN",Font.BOLD,20);
							   	            b4.setFont(f4);
							   	              b4.setBounds(600,1770,300,40);
							   	            b4.setForeground(Color.red);
		                                    b4.setCursor(cur);
		                                    
		                                    b4.addActionListener(new ActionListener()
		                                 	{
		                                 			public void actionPerformed(ActionEvent e)
		                                 			{
		                                 				b4Event(e);
		                                 			}
		                                			
		                                 		});
	        co.add(label1);
	        co.add(label2);
	        co.add(label3);
	        co.add(label4);
	        co.add(label5);
	        co.add(logout);
	        co.add(a1);
	        co.add(a2);
	        co.add(a3);
	        co.add(a4);
	        co.add(a5);
	        co.add(a6);
	        co.add(a7);
	        co.add(a8);
	      //  co.add(logo);
	        co.add(b1);
	        co.add(b2);
	        co.add(b3);
	        co.add(b4);
	        
	        frame.getContentPane().add(sp);	        
}

	 public static void b1Event(ActionEvent e)
	    {
			Home h = new Home();
		    h.setVisible(true);
		       	
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
	 
	 public static void b3Event(ActionEvent e)
	    {
			EG eg = new EG();
		    eg.setVisible(true);
		       	
		}
	 
	 public static void b4Event(ActionEvent e)
	    {
		   
		 TPcivil c = new TPcivil();
		    c.setVisible(true);
		}
	 
	 public void setVisible(boolean b)
	   {
		   this.setVisible(true);
	   }
}