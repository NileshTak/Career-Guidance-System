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

public class bcom extends JFrame
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
                    bcom window = new bcom();
                    window.f1.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	 public bcom() {
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
	      //  ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\PicsArt_1485415453700.png");
	        ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\Bachelors-Degree-Headers-900-BOCA.jpg");
	        ImageIcon icon3=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\Career-BCom1.jpg");
	        ImageIcon icon4=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\B.com-Course.jpg");
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
   	        logout.setBounds(75,700,80,80);
   	       
   	        logout.setCursor(cur);
   	        
   	     logout.addActionListener(new ActionListener()
	     	{
	     			public void actionPerformed(ActionEvent e)
	     			{
	     				logoutEvent(e);
	     			}
	    			
	    	});
	        
	        
	        
	        JButton b2 = new JButton("About");
	        b2.setBounds(50,610,130,30);
	        b2.setCursor(cur);

	        
	        b2.addActionListener(new ActionListener()
         	{
         			public void actionPerformed(ActionEvent e)
         			{
         				b2Event(e);
         			}
        			
         		});

	        
	        JButton b3 = new JButton("Expert Guidance");
	        b3.setBounds(50,660,130,30);
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
	        label4.setBounds(840,500,600,300);
	        
	        
	        JLabel label5 = new JLabel(icon4);
	        label5.setBounds(20,1095,250,250);

	        
	        
	        
	        
	        JLabel label3 = new JLabel("Bachlor Of Commerce");
	        label3.setBounds(440,470,700,40); 
	        Font f2=new Font("copperplate Gothic Bold",Font.PLAIN,30);
	           label3.setFont(f2);
	           label3.setForeground(Color.blue);
	           
	           
	           JTextArea a1 = new JTextArea("-The B.Com. Degree Course will consist of three Years."
                                             +"The \nfirst year annual examination will be held at the"
	        		                         +"end of \nthe first year. The Second Year"
                                             +" annual examination \nwill be held at the end of the second year"
	        		                         +"\n-The Third annual examination shall be"
                                             +"held at the \nend of the third year."
	        		                         +"\n \n-A.T.K.T. Rules :"
+"\nAs far as A.T.K.T. is concerned, a student who fails in two"
+"\ntheory and one practical head of passing at F.Y.B.Com may be");
	           a1.setBorder(null);
	              a1.setBounds(280,520,640,265); 
	              Font f3=new Font("Verdana",Font.PLAIN,20);
	               a1.setFont(f3);
	              // a1.setForeground(Color.red);
	               a1.setEditable(false);
	             
	           
	               
	               JTextArea a2 = new JTextArea("admitted to S.Y.B.Com. likewise a student who fails in the two"
+"theory and one practical head of passing \nat S.Y.B.Com may be" 
+"admitted to T.Y.B.Com. "
+ "\n-But a student passing S.Y.B.Com but fails"
+"in any subject at F.Y.B.Com cannot be admitted to T.Y.B.Com"
	               		+ "\n \n-Theory and one practical head of passing at S.Y.B.Com may be" 
                        +"admitted to T.Y.B.Com.But a \nstudent passing S.Y.B.Com but fails"
                        +"in any subject at F.Y.B.Com cannot be admitted to T.Y.B.Com"
	               		+ "\n \n-ELIGIBILITY:"
                        +"\n-No Candidates shall be admitted to enter the First Year of the B.Com. Degree Course unless he/she"
                        +"\nhas passed the Higher Secondary School Certificate Examination of the Maharashtra State"
                        +"\nBoard of Higher Secondary Education Board or University with English as a passing subject."
                        + "\n\n-No candidate shall be admitted to the annual examination of the First year B.Com. unless he/she has"
                        +"\nsatisfactorily kept two terms for the course at the college at the college affiliated to this University."
	               	    +"\n\n-No candidate shall be admitted to the annual examination of the First year B.Com. unless he/she has"
                        +"\nsatisfactorily kept two terms for the course at the college at the college affiliated to this University."
                        
                        + "\n\n-No candidate shall be admitted to the Third year of the B.Com. Degree Course unless he/she has" 
                        +"\npassed in all the papers at the First Year B.Com. Examination and has passed in all the papers at"
	               	    +"\nthe first Year B.Com. Examination and has satisfactorily kept terms for the second year and also two"
                        +"\nterms for the third year of B.Com. satisfactorily in a college affiliated to this University.");
	   	              a2.setBounds(280,790,1050,600); 
	   	               a2.setFont(f3);
	   	              // a1.setForeground(Color.red);
	   	               a2.setEditable(false);
	   	       
	   	               
	   	            JTextArea a3 = new JTextArea("F.Y.B.Com. - "
	   	            		+ " \n\n-Functional English"
	   	            		+ " \n\n-Financial Accounting"
	   	            		+ " \n\n-Business Economic"
	   	            		+ "\n\n-Mathematics &"
                            +"Statistics"
	   	            		+"\n\n-Computer Concepts"
                            +" & Programming.");
	   		              a3.setBounds(280,1395,400,340);
	   		               a3.setFont(f3);
	   		              // a1.setForeground(Color.red);
	   		               a3.setEditable(false);
	   		               
	   		               
	   		            JTextArea a4 = new JTextArea("S.Y.B.Com."
	   		            		+ "\n\n-Business Communication"
	   		            		+"\n\n-Corporate Accounting"
	   		            		+"\n\n-Business Economic"
	   		            		+ "\n\n-Indian and Global"
                                            +"Economic Development"
				   		            		+"\n\n-Business Management"
					   	            		+ "\n\n-Computer Concepts"
                                            +"\nand Programming.");
		   		              a4.setBounds(690,1395,400,340);
		   		               a4.setFont(f3);
		   		              // a1.setForeground(Color.red);
		   		               a4.setEditable(false);
		   		               
		   		              
		   		               
		   		           
		   		            JTextArea a5 = new JTextArea("T.Y.B.Com"
		   		            		+"\n\n-Business Regulatory"
                                    +"\n Framework (M. Law)."
			   	            		+ "\n\n-Advanced Accounting"
			   	            		+ "\n\n-International \n Economics"
					   		            		
						   	            		+ "\n\n-Auditing and Taxation");
			   	            	
                                    // +"\nEconomic Development
			   		              a5.setBounds(1100,1395,235,340);
			   		               a5.setFont(f3);
			   		              // a1.setForeground(Color.red);
			   		               a5.setEditable(false);
			   		               
			   		               
			   		        //    JTextArea a6 = new JTextArea("
	   	            	//	+");
				   		          //    a6.setBounds(280,1570,400,170);
				   		  //             a6.setFont(f3);
				   		              // a1.setForeground(Color.red);
				   		    //           a6.setEditable(false);
				   		               
				   		               
				   		      //      JTextArea a7 = new JTextArea("");
					   		    //          a7.setBounds(690,1570,400,170);
					   		      //         a7.setFont(f3);
					   		              // a1.setForeground(Color.red);
					   		        //       a7.setEditable(false);
					   		                       
				   		           
					   		               
					   		               
					   		   //         JTextArea a8 = new JTextArea("");
						   		 //             a8.setBounds(1100,1570,235,170);
						   		   //            a8.setFont(f3);
						   		              // a1.setForeground(Color.red);
						   		     //          a8.setEditable(false);
			   		               
	               
	        
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
	        co.add(a1);
	        co.add(a2);
	        co.add(a3);
	        co.add(a4);
	        co.add(a5);
	      //  co.add(a6);
	      //  co.add(a7);
	      //  co.add(a8);
	      //  co.add(logo);
	        co.add(b1);
	        co.add(b2);
	        co.add(b3);
	        co.add(b4);
	        co.add(logout);
	        frame.getContentPane().add(sp);	        
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
	 
	 
	 public static void b4Event(ActionEvent e)
	    {
		   
		 TabbedPane tp = new TabbedPane();
		    tp.setVisible(true);
		}
	 
	 
	 public void setVisible(boolean b)
	   {
		   this.setVisible(true);
	   }
}