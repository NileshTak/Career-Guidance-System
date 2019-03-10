package code;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
class  apti4 extends JFrame implements ActionListener
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
            
            
           
                

           public apti4()
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

                        qpa[0][0]="In room an intrinsic semiconductor is due to";
                        qpa[0][1]="holes";
                        qpa[0][2]="electrons";
                        qpa[0][3]="ions";
                        qpa[0][4]="holes and electrons";

                        qpa[1][0]="The most common semiconductor material is";
                        qpa[1][1]="silicon";
                        qpa[1][2]="germanium";
                        qpa[1][3]="mixture of silicon and germanium";
                        qpa[1][4]="none of the above";
                        
                        qpa[2][0]="Which is reverse recovery time nearly zero?";
                        qpa[2][1]="Zener diode";
                        qpa[2][2]="Tunnel diode";
                        qpa[2][3]="Schottky diode";
                        qpa[2][4]="PIN diode";

                        qpa[3][0]="Ferrite have";
                        qpa[3][1]="low copper loss";
                        qpa[3][2]="low eddy current loss";
                        qpa[3][3]="low resistivity";
                        qpa[3][4]="higher specific gravity compared to iron";

                        qpa[4][0]="In n-p-n transistor,majority carriers in the base are";
                        qpa[4][1]="electrons";
                        qpa[4][2]="holes";
                        qpa[4][3]="both holes and electrons";
                        qpa[4][4]="either holes or electrons";

                        qpa[5][0]="The number of doped regions in PIN diode is";
                        qpa[5][1]="1";
                        qpa[5][2]="2";
                        qpa[5][3]="3";
                        qpa[5][4]="1 or 2";

                        qpa[6][0]="A zener diode is used in";
                        qpa[6][1]="voltage regulator circuit";
                        qpa[6][2]="amplifier circuits";
                        qpa[6][3]="both voltage regulator and amplifier circuit";
                        qpa[6][4]="none of the above";

                        qpa[7][0]="In a bipolar transistor which current is largest";
                        qpa[7][1]="collector current";
                        qpa[7][2]="base current";
                        qpa[7][3]="emitter current";
                        qpa[7][4]="base current or emitter current";

                        qpa[8][0]="The types of carriers in a semiconductor are";
                        qpa[8][1]="1";
                        qpa[8][2]="2";
                        qpa[8][3]="3";
                        qpa[8][4]="4";

                        qpa[9][0]="The normal operation of JFET is";
                        qpa[9][1]="constant voltage region";
                        qpa[9][2]="constant current region";
                        qpa[9][3]="both constant voltage and constant current regions";
                        qpa[9][4]="either constant voltage or constant current region";
                        
                        qpa[10][0]="The word enhancement mode is associated with";
                        qpa[10][1]="tunnel diode";
                        qpa[10][2]="MOSFET";
                        qpa[10][3]="JFET";
                        qpa[10][4]="photo diode";

                        qpa[11][0]="Which region is collector current almost constant?";
                        qpa[11][1]="Saturation region";
                        qpa[11][2]="Active region";
                        qpa[11][3]="Breakdown region";
                        qpa[11][4]="Both saturation and active region";
                        
                        qpa[12][0]="Crossover distortion behaviour is characteristic of";
                        qpa[12][1]="class A O/P stage";
                        qpa[12][2]="class B O/P stage";
                        qpa[12][3]="class AB output stage";
                        qpa[12][4]="common pulse O/P state";

                        qpa[13][0]="As compared to ordinary semiconductor diode, a Schottky diode";
                        qpa[13][1]="has lower cut in voltage";
                        qpa[13][2]="has higher cut in voltage";
                        qpa[13][3]="lower reverse saturation current";
                        qpa[13][4]="both (b) and (c)";

                        qpa[14][0]="In a bipolar transistor the barrier potential";
                        qpa[14][1]="0";
                        qpa[14][2]="a total of 0.7 V";
                        qpa[14][3]="0.7 V across each depletion layer";
                        qpa[14][4]="0.35 V";

                                               
                       
                        
                        //qca stores pairs of question and its correct answer
                        qca=new String[15][2];
                        
                        qca[0][0]="At room temperature the current in an intrinsic semiconductor is due to";
                        qca[0][1]="holes and electrons";

                        qca[1][0]="The most commonly used semiconductor material is";
                        qca[1][1]="silicon";

                        qca[2][0]="In which of these is reverse recovery time nearly zero?";
                        qca[2][1]="Schottky diode";

                        qca[3][0]="Ferrite have";
                        qca[3][1]="low resistivity";


                        qca[4][0]="In an n-p-n transistor, the majority carriers in the base are";
                        qca[4][1]="electrons";

                        qca[5][0]="The number of doped regions in PIN diode is";
                        qca[5][1]="2";

                        qca[6][0]="A zener diode is used in";
                        qca[6][1]="voltage regulator circuit";
                        
                        qca[7][0]="In a bipolar transistor which current is largest";
                        qca[7][1]="emitter current";
                        
                        qca[8][0]="The types of carriers in a semiconductor are";
                        qca[8][1]="2";

                        qca[9][0]="The normal operation of JFET is";
                        qca[9][1]="constant current region";
                        
                        qca[10][0]="The word enhancement mode is associated with";
                        qca[10][1]="MOSFET";

                        qca[11][0]="Which region is collector current almost constant?";
                        qca[11][1]="Active region";

                        qca[12][0]="Crossover distortion behaviour is characteristic of";
                        qca[12][1]="class B O/P stage";

                        qca[13][0]="As compared to ordinary semiconductor diode, a Schottky diode";
                        qca[13][1]="has lower cut in voltage";


                        qca[14][0]="In a bipolar transistor the barrier potential";
                        qca[14][1]="0.7 V across each depletion layer";

                       

                      

                        
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
        public class aptientc{
        	  

        public static void main(String args[])
        {
                     new apti4();
                     
             	
        }

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			this.setVisible(true);
		}

		
}

            


