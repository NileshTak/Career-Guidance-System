package code;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
class  apti3 extends JFrame implements ActionListener
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
            
            
           
                

           public apti3()
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

                        qpa[0][0]="An aircraft gas turbine operates on";
                        qpa[0][1]="Otto cycle";
                        qpa[0][2]="Sterling cycle";
                        qpa[0][3]="Rankine cycle";
                        qpa[0][4]="Bryton cycle";

                        qpa[1][0]="Which of the following is not used as a refrigerant?";
                        qpa[1][1]="carbon monoxide";
                        qpa[1][2]="carbon dioxide";
                        qpa[1][3]="amonia";
                        qpa[1][4]="sulphur dioxide";
                        
                        qpa[2][0]="Quick return motion is used in a";
                        qpa[2][1]="drilling";
                        qpa[2][2]="shaper";
                        qpa[2][3]="lathe";
                        qpa[2][4]="grinder";

                        qpa[3][0]="A refigerant used in the domestic refrigerator is";
                        qpa[3][1]="air";
                        qpa[3][2]="Sulphur dioxide";
                        qpa[3][3]="freon";
                        qpa[3][4]="methane";

                        qpa[4][0]="In Industry of the developed nations the type of production most often occurring is ";
                        qpa[4][1]="Batch production";
                        qpa[4][2]="Single lot production";
                        qpa[4][3]="Mass production";
                        qpa[4][4]="Create lot production";

                        qpa[5][0]="Draft on a pattern is provided for";
                        qpa[5][1]="facilitating pattern making";
                        qpa[5][2]="easy lifting of the casting";
                        qpa[5][3]="facilitating withdrawal of the pattern from the mould";
                        qpa[5][4]="providing for strinkage of the casting";

                        qpa[6][0]="Which of the following operations cannot be performed on a lathe";
                        qpa[6][1]="slotting";
                        qpa[6][2]="facing";
                        qpa[6][3]="drilling";
                        qpa[6][4]="thread cutting";

                        qpa[7][0]="Feed in a lathe is expressed in";
                        qpa[7][1]="mm per degree";
                        qpa[7][2]="rpm";
                        qpa[7][3]="mm per revolution";
                        qpa[7][4]="mm";

                        qpa[8][0]="Sprue is the passing provided for the";
                        qpa[8][1]="outflow";
                        qpa[8][2]="smooth flow";
                        qpa[8][3]="solidification of the molten material";
                        qpa[8][4]="inflow";

                        qpa[9][0]="The operation of enlarging of a hole is called";
                        qpa[9][1]="boring";
                        qpa[9][2]="drilling";
                        qpa[9][3]="reaming";
                        qpa[9][4]="counter sinking";
                        
                        qpa[10][0]="Rapping allowance is provided on a pattern to take care of";
                        qpa[10][1]="shrinkage";
                        qpa[10][2]="machining";
                        qpa[10][3]="distortion";
                        qpa[10][4]="easy withdrawl";

                        qpa[11][0]="Mandrels are used to hold";
                        qpa[11][1]="face plate";
                        qpa[11][2]="cutting tools";
                        qpa[11][3]="hollow work pieces";
                        qpa[11][4]="drill bits";
                        
                        qpa[12][0]="Brasses and bronzes are welded using";
                        qpa[12][1]="neutral flame";
                        qpa[12][2]="oxidizing flames";
                        qpa[12][3]="reducing flame";
                        qpa[12][4]="carburising flame";

                        qpa[13][0]="Upsetting is the term used in one of the following operations";
                        qpa[13][1]="forging";
                        qpa[13][2]="drilling";
                        qpa[13][3]="turning";
                        qpa[13][4]="casting";

                        qpa[14][0]="Reducing flame is obtained in oxyactetylane welding with";
                        qpa[14][1]="equal parts of both gases";
                        qpa[14][2]="excess oxygen";
                        qpa[14][3]="excess of acetylene";
                        qpa[14][4]="reduced acetylene";

                                               
                       
                        
                        //qca stores pairs of question and its correct answer
                        qca=new String[15][2];
                        
                        qca[0][0]="An aircraft gas turbine operates on";
                        qca[0][1]="Bryton cycle";

                        qca[1][0]="Which of the following is not used as a refrigerant?";
                        qca[1][1]="carbon monoxide ";

                        qca[2][0]="Quick return motion is used in a";
                        qca[2][1]=" shaper";

                        qca[3][0]="A refigerant used in the domestic refrigerator is";
                        qca[3][1]="freon";


                        qca[4][0]="In Industry of the developed nations the type of production most often occurring is";
                        qca[4][1]="Batch production";

                        qca[5][0]="Draft on a pattern is provided for";
                        qca[5][1]="providing for strinkage of the casting";

                        qca[6][0]="Which of the following operations cannot be performed on a lathe";
                        qca[6][1]="slotting";
                        
                        qca[7][0]="Feed in a lathe is expressed in";
                        qca[7][1]="mm per revolution";
                        
                        qca[8][0]="Sprue is the passing provided for the";
                        qca[8][1]="inflow";

                        qca[9][0]="The operation of enlarging of a hole is called";
                        qca[9][1]="boring";
                        
                        qca[10][0]="Rapping allowance is provided on a pattern to take care of";
                        qca[10][1]="easy withdrawl";

                        qca[11][0]="Mandrels are used to hold";
                        qca[11][1]="hollow work pieces";

                        qca[12][0]="Brasses and bronzes are welded using";
                        qca[12][1]="neutral flame";

                        qca[13][0]="Upsetting is the term used in one of the following operations";
                        qca[13][1]="forging";


                        qca[14][0]="Reducing flame is obtained in oxyactetylane welding with";
                        qca[14][1]="excess of acetylene";

                       

                      

                        
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
        public class aptimech{
        	  

        public static void main(String args[])
        {
                     new apti3();
                     
             	
        }

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			this.setVisible(true);
		}

		
}

            


