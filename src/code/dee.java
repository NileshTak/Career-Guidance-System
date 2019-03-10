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

public class dee extends JFrame
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
                    dee window = new dee();
                    window.f1.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	 public dee() {
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
	        ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\3d-wallpaper-motherboard-widescreen-1024x640.jpg");
	        ImageIcon icon3=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\Electronics Engineering.jpg");
	        ImageIcon icon4=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\Electronics-Mini-Projects-Ideas.jpg");
	 //       ImageIcon icon5=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\reddit.png");
	        ImageIcon icon6=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\ca7b81256d27f757790508035a8177c0.png");	        
	        ImageIcon icon7=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\images(1).jpg");        
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
	        
	        JButton b1 = new JButton(icon6);
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
	       

	        JButton logout = new JButton(icon7);
   	        logout.setBounds(75,720,80,80);
   	        
   	        logout.setCursor(cur);
   	        
   	     logout.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				logoutEvent(e);
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
	        label2.setBounds(-25,0,1400,450);
	             
	        
	        JLabel label4 = new JLabel(icon3);
	        label4.setBounds(840,500,600,300);
	        
	        
	        JLabel label5 = new JLabel(icon4);
	        label5.setBounds(10,1095,250,250);

	   //     JLabel label6 = new JLabel(icon5);
	     //   label6.setBounds(65,670,100,100);

	        
	       
	        
	        
	        JLabel label3 = new JLabel("Diploma in Electronics & Communication Engineering");
	        label3.setBounds(350,470,1000,40); 
	        Font f2=new Font("copperplate Gothic Bold",Font.PLAIN,30);
	           label3.setFont(f2);
	           label3.setForeground(Color.blue);
	           
	           
	           JTextArea a1 = new JTextArea("-Electronics and Communication Engineering "
	           		+ "is a 3 years \nlong Diploma certificate program. In this article, "
	           		+ "you will be \nreading correct details about Diploma in Electronics "
	           		+ "and \nCommunication Engineering course, such as- eligibility "
	           		+ "\ncriteria, admission process, further studies, career prospects \nand job profiles."
	           		+ "\n \n-This field focuses on concepts of electrical engineering, "
	           		+ "\nelectronic devices. Electronics and "
	           		+ "Communication Engineering \nis also known by the short name "
	           		+ "of EC Engineering.");
	           a1.setBorder(null);
	              a1.setBounds(280,520,640,265); 
	              Font f3=new Font("Verdana",Font.PLAIN,20);
	               a1.setFont(f3);
	              // a1.setForeground(Color.red);
	               a1.setEditable(false);
	             
	           
	               
	               JTextArea a2 = new JTextArea("-EC Engineering not only deals with small household electronic goods. It also "
	               		+ "deals with design \nmanufacturing and maintenance of electrical and electronic systems used in large"
	               		+ " and medium sized \nindustries too!"
               		+ "\n \n-The prime focus of EC Engineering can be said to be on design, analysis and manufacturing of "
               		+ "\nelectronic "
               		+ "and communication circuits. Some of the important subjects covered in this discipline \ninclude- "
               		+ "Control systems, "
               		+ "Logic design, VLSI, PCB Design, Circuit Networks, Integrated circuits, Electrical \nsystems,"
               		+ "Communication "
               		+ "engineering, Signal processing, Sensors etc."
	             
	               		+ "\n \n-Eligibility criteria: 10+2 passed in Science stream (with Physics, Chemistry and Mathematics "
	               		+ "\nsubjects) from a recognized board. Minimum marks criteria may exist in case of many institutes "
	               		+ "\n(around 50% aggregate marks)."
	               		
	               		+ "\n \n- Admission process: Mode of admission depends on the institute. Some institutes follow direct "
	               		+ "\nadmission process. Many institutes follow merit based admission process. Marks scored by a student "
	               		+ "\nin board exam and/or relevant entrance test is taken into consideration, when it comes to merit based "
	               		+ "\nadmission process."
	               		+ "\n \n- Further studies and PG courses: The best step ahead for Diploma holders is to go for Bachelor’s "
	               		+ "\nDegree program in Engineering. Using the lateral entry, deserving Diploma "
	               		+ "holders \nmay secure admission directly in the second academic year of B.E. / B.Tech. "
	               		+ "\nEC Engineering program");
	   	              a2.setBounds(280,790,1050,600); 
	   	               a2.setFont(f3);
	   	              // a1.setForeground(Color.red);
	   	               a2.setEditable(false);
	   	       
	   	               
	   	            JTextArea a3 = new JTextArea("1st semester subjects-"
	   	            		+ "\n•Engineering Mathematics"
	   	            		+ "\n•Engineering Physics"
	   	            		+ "\n•Electronic Components"
	   	            		+ "\n•Basic Electrical"
	   	            		+ "\n•Computer Programming");
	   		              a3.setBounds(280,1395,400,170);
	   		               a3.setFont(f3);
	   		              // a1.setForeground(Color.red);
	   		               a3.setEditable(false);
	   		               
	   		            JTextArea a4 = new JTextArea("2nd semester subjects-"
	   		            		+ "\n•Engineering Mathematics"
	   		            		+ "\n•Electronic Networks"
	   		            		+ "\n•Electronic Circuits"
	   		            		+ "\n•Workshop (Practical)");
		   		              a4.setBounds(690,1395,400,170);
		   		               a4.setFont(f3);
		   		              // a1.setForeground(Color.red);
		   		               a4.setEditable(false);
		   		               
		   		              
		   		               
		   		           
		   		            JTextArea a5 = new JTextArea("3rd semester subjects-"
		   		            		+ "\n•Analog Electronics"
		   		            		+ "\n•Wave Propagation"
		   		            		+ "\n•Principle of EC"
		   		            		+ "\n•Digital Logic Design"
		   		            		+ "\n•C Programming");
			   		              a5.setBounds(1100,1395,235,170);
			   		               a5.setFont(f3);
			   		              // a1.setForeground(Color.red);
			   		               a5.setEditable(false);
			   		               
			   		               
			   		            JTextArea a6 = new JTextArea("4th semester subjects-"
			   		            		+ "\n•Digital Communication"
			   		            		+ "\n•Optical Communication"
			   		            		+ "\n•Electronics Instruments and Measurement"
			   		            		+ "\n•Circuit Design Tools"
			   		            		+ "\n•Industrial Electronics");
				   		              a6.setBounds(280,1570,400,170);
				   		               a6.setFont(f3);
				   		              // a1.setForeground(Color.red);
				   		               a6.setEditable(false);
				   		               
				   		               
				   		            JTextArea a7 = new JTextArea("5th semester subjects-"
				   		            		+ "\n•Microcontroller"
				   		            		+ "\n•Mobile Communication"
				   		            		+ "\n•Microwave and Radar Engineering"
				   		            		+ "\n•Elective Subject"
				   		            		+ "\n•Project Work");
					   		              a7.setBounds(690,1570,400,170);
					   		               a7.setFont(f3);
					   		              // a1.setForeground(Color.red);
					   		               a7.setEditable(false);
					   		                       
				   		           
					   		               
					   		               
					   		            JTextArea a8 = new JTextArea("6th semester subjects-"
					   		            		+ "\n•Consumer Electronics"
					   		            		+ "\n•Elective Subjects"
					   		            		+ "\n•Electronic Equipment "
					   		            		+ " \n  Maintenance"
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
	       // co.add(label6);
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
	        co.add(logout);
	        frame.getContentPane().add(sp);	        
}
	 
	 public static void b1Event(ActionEvent e)
	    {
			Home h = new Home();
		    h.setVisible(true);
		       	
		} 
	 public static void b4Event(ActionEvent e)
	    {
		   
		 TPentc te = new TPentc();
		    te.setVisible(true);
		}
	 
	 public static void b2Event(ActionEvent e)
	    {
			About a = new About();
		    a.setVisible(true);
		       	
		}
	 public static void logoutEvent(ActionEvent e)
	    {
			Login l = new Login();
		    l.setVisible(true);
		       	
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