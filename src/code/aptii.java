package code;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
class  apti1 extends JFrame implements ActionListener
{
            /**
             * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
			JPanel panel;
            JPanel panelresult;
            JRadioButton choice1;
            JRadioButton choice2;
            JRadioButton choice3;
            JRadioButton choice4;
            ButtonGroup bg;
            JLabel lblmess;
            JButton btnext;
            String[][] qpa;
            String[][] qca;
            int qaid;
            private Timer tim;
            private int t;
            private JLabel lb2;
            HashMap<Integer, String> map;
            
            
           
                

           public apti1()
           {
                      initializedata();
                      setTitle("Career World --Way To Success");
                      setDefaultCloseOperation(EXIT_ON_CLOSE);
                      setBounds(-10,0,1800,740);
                    
                      
                      Container cont=getContentPane();
                      cont.setLayout(null); 
                      
                     
                      ImageIcon icon=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\PicsArt_1485415453700.png");
                      ImageIcon icon1=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\gfdt.jpg");
                      ImageIcon icon2=new ImageIcon("C:\\Users\\TAK\\workspace\\CareerWorld\\src\\image\\aptitude-test.jpg");
                      
             
                      
                     setIconImage(icon.getImage());
                      
                     
                    bg=new ButtonGroup();      
                    choice1=new JRadioButton("Choice1",true);
                    choice2=new JRadioButton("Choice2",false);
                    choice3=new JRadioButton("Choice3",false);
                    choice4=new JRadioButton("Choice4",false);
                    bg.add(choice1);
                    bg.add(choice2);
                    bg.add(choice3);
                    bg.add(choice4);
                   lblmess=new JLabel("Choose a correct anwswer");
                    lblmess.setForeground(Color.BLUE);
                   lblmess.setFont(new Font("AR JULIAN", Font.BOLD, 20));
           
                  
                   
                  
       	        
       	  
             JLabel l1 = new JLabel(icon1);
 	        l1.setBounds(-20,-50,1400,450);
             
             JLabel l2=new JLabel(icon2);
             l2.setBounds(1000,300,350,330);
             
             
             panel=new JPanel();
             panel.setBackground(Color.white);
             panel.setBounds(380,300,600,400);
         

       	     
       	     
       	     
                   
                    btnext=new JButton("Next");
                    
                    btnext.setForeground(Color.red);
                    btnext.setFont(new Font("AR JULIAN", Font.PLAIN, 20));
                    btnext.setBorder(null);
                 //   btnext.setBounds(300,340,200,50);
                  
                    btnext.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        
                        t=10;
                        lb2.setText(String.valueOf(t));
                        tim.start();
                       
                           if(btnext.getText().equals("Next")){
                                                if(qaid<14){
                                                            
                                                            map.put(qaid,getSelection());
                                                            qaid++;
                                                            readqa(qaid);
                                                            }
                                                else {
                                                            map.put(qaid,getSelection());
                                                          
                                                            btnext.setText("Last Question after 10 sec it will be directed to Result >>>");
                                                            btnext.setEnabled(false);
                                                         }
                                                }
                                   // else if(btnext.getText().equals("Result >>>"))
                                     //           new Report();
                          
                        }
                    });

                    
                    
                    t=10;

                  //Taimer
                  lb2=new JLabel("10");
                  lb2.setBounds(150,450,80,80);
                 Font f1=new Font("Algerian",Font.BOLD,80);
     	         lb2.setFont(f1);
     	         lb2.setForeground(Color.red);
     	         
                  tim=new Timer(1000,new ActionListener(){
                      @Override
                      public void actionPerformed(ActionEvent e){
                          if(t>0){
                          t--;
                          lb2.setText(String.valueOf(t));
                          }else{
                              tim.stop();
                              
                              JOptionPane.showMessageDialog(null, "Time's up");
                              
                              t=10;
                              lb2.setText(String.valueOf(t));
                              tim.start();
                              
                             
                              
                              if(qaid<14){
                                  
                                  map.put(qaid,getSelection());
                                  qaid++;
                                  readqa(qaid);
                                  }
                      else {
                                  map.put(qaid,getSelection());
                                  btnext.setText("Result >>>");
                                  new Report();
                                  setVisible(false);
                                tim.stop();
                               }
                         
                           
                             
                             
                              } 
        
                          
                          }
                      });
                  
                  t=10;

                  //Taimer
                  lb2=new JLabel("10");
                  lb2.setBounds(150,450,80,80);
                 
     	         lb2.setFont(f1);
     	         lb2.setForeground(Color.red);
     	         
                 
                     
                      
                          if(t>0)
                          {
                          t--;
                          lb2.setText(String.valueOf(t));
                          }
                          else
                          {
                              tim.stop();
                              
                          }
                   
                    
                    
                   
                    panel.setLayout(new GridLayout(6,2));
                   panel.add(lblmess);
                    panel.add(choice1);
                    panel.add(choice2);
                    panel.add(choice3);
                    panel.add(choice4);
                    panel.add(btnext);
                    cont.add(lb2);
                    cont.add(panel);
                   cont.add(l1);
                   cont.add(l2);
                 
                   
                    qaid=0;
                    readqa(qaid);
        
                    
                    
                    tim.start();
                    setVisible(true);
            }
           
           
               
        public void initializedata(){
                        //qpa stores pairs of question and its possible answers
                        qpa=new String[15][5];

                        qpa[0][0]="The most widely used computer device is...";
                        qpa[0][1]="Solid state disks";
                        qpa[0][2]="External hard disk";
                        qpa[0][3]="Internal hard disk";
                        qpa[0][4]="Mouse";

                        qpa[1][0]="_______ are software which is used to do particular task.";
                        qpa[1][1]="Operating system";
                        qpa[1][2]="Program";
                        qpa[1][3]="Data";
                        qpa[1][4]="Software";
                        
                        qpa[2][0]="Who is father of modern computers? ";
                        qpa[2][1]="Abraham Lincoln";
                        qpa[2][2]="James Gosling";
                        qpa[2][3]="Charles Babbage";
                        qpa[2][4]="Gordon E. Moore";

                        qpa[3][0]="How many generations of computers we have? ";
                        qpa[3][1]="6";
                        qpa[3][2]="7";
                        qpa[3][3]="5";
                        qpa[3][4]="4";

                        qpa[4][0]=" ________ controls the way in which the computer system functions.";
                        qpa[4][1]="The operating system";
                        qpa[4][2]="The motherboard";
                        qpa[4][3]="The platform";
                        qpa[4][4]="Application software";

                        qpa[5][0]="How do you convert a string of number to a number?";
                        qpa[5][1]="int num=Integer.parseInt(str_num)";
                        qpa[5][2]="int num=str_num.toInteger()";
                        qpa[5][3]="int num=(int)str_num";
                        qpa[5][4]="int num=(Integer)str_num";

                        qpa[6][0]="The term 'Pentium' is related to ";
                        qpa[6][1]="DVD";
                        qpa[6][2]="HardDisk";
                        qpa[6][3]="Microprocessor";
                        qpa[6][4]="Mouse";

                        qpa[7][0]="How to do exit a loop?";
                        qpa[7][1]="Using exit";
                        qpa[7][2]="Using break";
                        qpa[7][3]="Using continue";
                        qpa[7][4]="Using terminate";

                        qpa[8][0]="What is the correct way to allocate one-dimensional array?";
                        qpa[8][1]="int[size] arr=new int[]";
                        qpa[8][2]="int arr[size]=new int[]";
                        qpa[8][3]="int[size] arr=new int[size]";
                        qpa[8][4]="int[] arr=new int[size]";

                        qpa[9][0]="What is the correct way to allocate two-dimensional array?";
                        qpa[9][1]="int[size][] arr=new int[][]";
                        qpa[9][2]="int arr=new int[rows][cols]";
                        qpa[9][3]="int arr[rows][]=new int[rows][cols]";
                        qpa[9][4]="int[][] arr=new int[rows][cols]";
                        
                        qpa[10][0]="How to run Java program on the command prompt?";
                        qpa[10][1]="javac JavaProgram";
                        qpa[10][2]="java JavaProgram";
                        qpa[10][3]="javac JavaProgram.java";
                        qpa[10][4]="No one";

                        qpa[11][0]="What does HTTP stands for? ";
                        qpa[11][1]="Head Tail Transfer Protocol";
                        qpa[11][2]="Hypertext Transfer Protocol";
                        qpa[11][3]="Hypertext Transfer Plotter";
                        qpa[11][4]="Hypertext Transfer Plot";
                        
                        qpa[12][0]="How to read a character from the keyboard?";
                        qpa[12][1]="char c=System.read()";
                        qpa[12][2]="char c=System.in.read()";
                        qpa[12][3]="char c=(char)System.read()";
                        qpa[12][4]="char c=(char)System.in.read()";

                        qpa[13][0]="Which one is a single-line comment?";
                        qpa[13][1]="/...";
                        qpa[13][2]="//...";
                        qpa[13][3]="/*...";
                        qpa[13][4]="/*...*/";

                        qpa[14][0]="How do you declare an integer variable x?";
                        qpa[14][1]="int x";
                        qpa[14][2]="x as Integer";
                        qpa[14][3]="Int[] x";
                        qpa[14][4]="No one is correct.";

                                               
                       
                        
                        //qca stores pairs of question and its correct answer
                        qca=new String[15][2];
                        
                        qca[0][0]="The most widely used computer device is....";
                        qca[0][1]="Internal hard disk";

                        qca[1][0]=".....are software which is used to do particular task";
                        qca[1][1]="Program";

                        qca[2][0]="Who is father of modern computers?";
                        qca[2][1]="Charles Babbage";

                        qca[3][0]="How many generations of computers we have? ";
                        qca[3][1]="5";


                        qca[4][0]=".....controls in which the computer system functions";
                        qca[4][1]="The operating system";

                        qca[5][0]="How do you convert a string of number to a number?";
                        qca[5][1]="int num=Integer.parseInt(str_num)";

                        qca[6][0]="The term 'Pentium' is related to ";
                        qca[6][1]="Microprocessor";
                        
                        qca[7][0]="How to do exit a loop?";
                        qca[7][1]="Using break";
                        
                        qca[8][0]="What is the correct way to allocate one-dimensional array?";
                        qca[8][1]="int[] arr=new int[size]";

                        qca[9][0]="What is the correct way to allocate two-dimensional array?";
                        qca[9][1]="int[][] arr=new int[rows][cols]";
                        
                        qca[10][0]="How to run Java program on the command prompt?";
                        qca[10][1]="java JavaProgram";

                        qca[11][0]="What does HTTP stands for?";
                        qca[11][1]="Hypertext Transfer Protocol";

                        qca[12][0]="How to read a character from the keyboard?";
                        qca[12][1]="char c=(char)System.in.read()";

                        qca[13][0]="Which one is a single-line comment?";
                        qca[13][1]="//...";


                        qca[14][0]="How do you declare an integer variable x?";
                        qca[14][1]="int x";

                       

                      

                        
                        //create a map object to store pairs of question and selected answer
                        map=new HashMap<Integer, String>();
                        
                        }
        public String getSelection(){
                        String selectedChoice=null;
                        Enumeration<AbstractButton> buttons=bg.getElements();  
                        while(buttons.hasMoreElements())  
                        {  
                        JRadioButton temp=(JRadioButton)buttons.nextElement();  
                        if(temp.isSelected())  
                                    {  
                                                selectedChoice=temp.getText();
                                    }  
                         }   
                        return(selectedChoice);
            }


        public void readqa(int qid){
                        lblmess.setText("  "+qpa[qid][0]);
                        choice1.setText(qpa[qid][1]);
                        choice2.setText(qpa[qid][2]);
                        choice3.setText(qpa[qid][3]);
                        choice4.setText(qpa[qid][4]);
                        choice1.setSelected(true); 
            }
        public void reset(){
                        qaid=0;
                        map.clear();
                        readqa(qaid);
                        btnext.setText("Next");
                        }
        public int calCorrectAnswer(){
                        int qnum=15;
                        int count=0;
                        for(int qid=0;qid<qnum;qid++)
                                    if(qca[qid][1].equals(map.get(qid))) count++;
                        return count;
            }
        
        
        
        
        
        

        public class Report extends JFrame
        {
        	
        	
        
        	 /**
			 * 
			 */
			private static final long serialVersionUID = 1L;


			public Report() {
        		 
                
                                   setTitle("Career World --Way To Success");
                                   setBounds(-10,0,1800,740);
                                   setBackground(Color.WHITE);
                                 // setLayout(new FlowLayout());
                                    
                                    ImageIcon icon=new ImageIcon("PicsArt_1485415453700.png");
                                                                     
                                    setIconImage(icon.getImage());
           
                                   
                        	                                 		
               
                                    addWindowListener(new WindowAdapter(){
                                                            public void windowClosing(WindowEvent e){
                                                                        dispose();
                                                                        reset();
                                                            }
                                                });
                                    
                                   
                                    
                                    
                                    Draw d=new Draw();                                   
                                   add(d);
                                   
                                   setVisible(true);
                                  
                            
                       	        
                                   
                                    }
                        
                        
                  class Draw extends Canvas
                  {
                	  
                	  private static final long serialVersionUID = 1L;
                	  
                	  public void paint(Graphics g)
                	  {
                                                int qnum=15;
                                                int x=10;
                                                int y=20;
                                               
                                             
                                                for(int i=0;i<qnum;i++){
                                                	
                                                	   
                                                            //print the 1st column
                                                            g.setFont(new Font("Arial",Font.BOLD,15));                                          
                                                            g.drawString(i+1+". "+qca[i][0], x,y);
                                                            y+=25;            
                                                            g.setFont(new Font("Arial",Font.PLAIN,12));                              
                                                            g.drawString("      Correct answer:"+qca[i][1], x,y);
                                                            y+=25;
                                                            g.drawString("      Your answer:"+map.get(i), x,y);
                                                            y+=25;
                                                            //print the 2nd column
                                                           if(y>600) 
                                                           {
                                                        	   
                                                         	y=25;
                                                             x=450;
                                                            }
                                                          
                                                         

                                                           
                                                           
                                                  	   
                                                           
                                                           
                                                            
                                                }
                                                
                                                //Show number of correct answers
                                                int numc=calCorrectAnswer();
                                                g.setColor(Color.BLUE);
                                                g.setFont(new Font("Arial",Font.BOLD,20));
                                                g.drawString("Number of correct answers:"+numc,500,650);
                        
                                            
                                    }   
                        }
                                    
            }







		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
        public class aptii{
        	  

        public static void main(String args[])
        {
                     new apti1();
                     
             	
        }

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			this.setVisible(true);
		}

		
}

            


