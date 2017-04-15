import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class Class extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5057788763456398410L;
	private JTextField txtWL;
	private JTextField txtR_2;
	private JTextField txttam;
	private JTextField txtWP;
	private JLabel lblOut;
	private JLabel lblOut2;
	private JLabel txtFinal;
	private JTextField textIP;
	private JTextField txtd10;
	private JTextField txtd30;
	private JTextField txtd60;
	String Wp="0",Wl="0";
	private JTextField txtCu;
	private JTextField txtCc;
	
	
	public Class() {
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnFindClass = new JButton("Find Class ! ");
	
		btnFindClass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
				onCall();
				}
				catch (Exception Ec){
					lblOut2.setText(" Error, Please check Input.");
				}
				finally{
					
				}
			
			}
		});
		
		btnFindClass.setBounds(172, 251, 122, 23);
		getContentPane().add(btnFindClass);
		
		txttam = new JTextField();
		txttam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txttam.setBackground(Color.LIGHT_GRAY);
		txttam.setText("0");
		
		txttam.setHorizontalAlignment(SwingConstants.CENTER);
		txttam.setToolTipText("T_80\u00B5m");
		txttam.setBounds(146, 66, 86, 20);
		getContentPane().add(txttam);
		txttam.setColumns(10);
		
		txtWP = new JTextField();
		txtWP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtWP.setText("0");
		txtWP.setHorizontalAlignment(SwingConstants.CENTER);
		txtWP.setBounds(146, 97, 86, 20);
		getContentPane().add(txtWP);
		txtWP.setColumns(10);
		
		txtWL = new JTextField();
		txtWL.setText("0");
		txtWL.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtWL.setHorizontalAlignment(SwingConstants.CENTER);
		txtWL.setBounds(146, 32, 86, 20);
		getContentPane().add(txtWL);
		txtWL.setColumns(10);
		
		txtR_2 = new JTextField();
		txtR_2.setBackground(Color.LIGHT_GRAY);
		txtR_2.setText("0");
		txtR_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtR_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtR_2.setBounds(146, 128, 86, 20);
		getContentPane().add(txtR_2);
		txtR_2.setColumns(10);
		
	    lblOut = new JLabel("");
	    lblOut.setHorizontalAlignment(SwingConstants.CENTER);
	    lblOut.setForeground(Color.BLUE);
	    lblOut.setBackground(Color.GREEN);
	    lblOut.setFont(new Font("Andalus", Font.BOLD, 26));
		lblOut.setBounds(10, 367, 492, 38);
		getContentPane().add(lblOut);
		
		JLabel lblNewLabel = new JLabel("Tamisat a 0.08 mm :");
		lblNewLabel.setBounds(10, 69, 126, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblWl = new JLabel("Wl :");
		lblWl.setBounds(67, 37, 46, 14);
		getContentPane().add(lblWl);
		
		JLabel lblWp = new JLabel("Wp");
		lblWp.setBounds(67, 100, 46, 14);
		getContentPane().add(lblWp);
		
		JLabel lblNewLabel_1 = new JLabel("Tamisat a 2mm :");
		lblNewLabel_1.setBounds(28, 131, 108, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Classification");
		lblNewLabel_2.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(276, 51, 121, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblDesSols = new JLabel("Des Sols");
		lblDesSols.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
		lblDesSols.setBounds(286, 72, 121, 14);
		getContentPane().add(lblDesSols);
		
		JLabel lblLcpuscs = new JLabel("LCP/USCS");
		lblLcpuscs.setFont(new Font("Yu Mincho", Font.PLAIN, 17));
		lblLcpuscs.setBounds(276, 98, 121, 14);
		getContentPane().add(lblLcpuscs);
		
		textIP = new JTextField();
		textIP.setForeground(SystemColor.menu);
		textIP.setBackground(Color.DARK_GRAY);
		textIP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textIP.setHorizontalAlignment(SwingConstants.CENTER);
		textIP.setBounds(311, 126, 86, 20);
		getContentPane().add(textIP);
		textIP.setColumns(10);
		
		JLabel lblIp = new JLabel("Ip : ");
		lblIp.setBounds(268, 128, 33, 14);
		getContentPane().add(lblIp);
		
		txtFinal = new JLabel("");
		txtFinal.setToolTipText("Result");
		txtFinal.setForeground(Color.RED);
		txtFinal.setBackground(Color.GREEN);
		txtFinal.setFont(new Font("Verdana", Font.PLAIN, 18));
		txtFinal.setHorizontalAlignment(SwingConstants.CENTER);
		txtFinal.setBounds(129, 416, 239, 18);
		getContentPane().add(txtFinal);
		
		txtd10 = new JTextField();
		txtd10.setText("0");
		txtd10.setHorizontalAlignment(SwingConstants.CENTER);
		txtd10.setBounds(235, 166, 46, 20);
		getContentPane().add(txtd10);
		txtd10.setColumns(10);
		
		txtd30 = new JTextField();
		txtd30.setText("0");
		txtd30.setHorizontalAlignment(SwingConstants.CENTER);
		txtd30.setColumns(10);
		txtd30.setBounds(129, 166, 46, 20);
		getContentPane().add(txtd30);
		
		txtd60 = new JTextField();
		txtd60.setText("0");
		txtd60.setHorizontalAlignment(SwingConstants.CENTER);
		txtd60.setColumns(10);
		txtd60.setBounds(348, 166, 46, 20);
		getContentPane().add(txtd60);
		
		JLabel lblD = new JLabel("D10");
		lblD.setBounds(205, 169, 24, 14);
		getContentPane().add(lblD);
		
		JLabel lblD_1 = new JLabel("D30");
		lblD_1.setBounds(86, 169, 24, 14);
		getContentPane().add(lblD_1);
		
		JLabel lblD_2 = new JLabel("D60");
		lblD_2.setBounds(314, 169, 24, 14);
		getContentPane().add(lblD_2);
		
		txtCu = new JTextField();
		txtCu.setBackground(Color.ORANGE);
		txtCu.setText("0");
		txtCu.setHorizontalAlignment(SwingConstants.CENTER);
		txtCu.setColumns(10);
		txtCu.setBounds(265, 205, 73, 20);
		getContentPane().add(txtCu);
		
		txtCc = new JTextField();
		txtCc.setBackground(Color.ORANGE);
		txtCc.setText("0");
		txtCc.setHorizontalAlignment(SwingConstants.CENTER);
		txtCc.setColumns(10);
		txtCc.setBounds(152, 205, 63, 20);
		getContentPane().add(txtCc);
		
		JLabel lblCu = new JLabel("Cu :");
		lblCu.setBounds(231, 208, 24, 14);
		getContentPane().add(lblCu);
		
		JLabel lblCc = new JLabel("Cc :");
		lblCc.setBounds(122, 208, 24, 14);
		getContentPane().add(lblCc);
		
		lblOut2 = new JLabel("");
		lblOut2.setForeground(Color.RED);
		lblOut2.setHorizontalAlignment(SwingConstants.CENTER);
		lblOut2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOut2.setBounds(116, 288, 239, 18);
		getContentPane().add(lblOut2);
		
		JLabel lblClassificationResults = new JLabel("Classification Results :");
		lblClassificationResults.setBackground(Color.ORANGE);
		lblClassificationResults.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblClassificationResults.setForeground(SystemColor.textHighlight);
		lblClassificationResults.setBounds(139, 335, 206, 23);
		getContentPane().add(lblClassificationResults);
	

			
			
		}
	 public String FindClass(int R){
		 String Result = "";
		 
       if(R >= 50){    	   
    	   Result = "Sols Grenus";
    	  return Result;
    	      	  
       }else{
    	   
    	   Result = "Sols Fins";
    	   
    	   return Result;
       }
         	 
	 }
	 public void onCall(){
		  int Ip = 0;
		  float d10 = Float.parseFloat(txtd10.getText());
	      float d30 = Float.parseFloat(txtd30.getText());
	      float d60 = Float.parseFloat(txtd60.getText());
	      double Cu = d60/d10;
	      Cu = BigDecimal.valueOf(Cu).setScale(3,RoundingMode.HALF_UP).doubleValue();
	      
	      
	      txtCu.setText("" + Cu);
		  double Cc = (d30*d30)/(d10*d60);
		  Cc = BigDecimal.valueOf(Cc).setScale(3, RoundingMode.HALF_UP).doubleValue();
		  
		  txtCc.setText("" + Cc);
		  
			Wp = txtWP.getText().toString();
			Wl = txtWL.getText().toString();
			int A = Integer.parseInt(Wl); 
			int B = Integer.parseInt(Wp);
			Ip = A-B;
			textIP.setText("" + Ip);
			int Tam = Integer.parseInt(txttam.getText());
	    	 int Refus = 100 - Tam;
	    	 
	    	int R2m = Integer.parseInt(txtR_2.getText());
	    	int R2f = 100 - R2m;
	    	String RES=""; 
	    	//= FindClass(Refus);
	    			//
	    			if(FindClass(Refus) == "Sols Grenus"){
	    				RES = FindClass(Refus) + " " + FindClassType(Refus,R2f,A,B,Cu,Cc);
	    			}else if( FindClass(Refus) == "Sols Fins" ) {
	    				
	    				RES = FindClass(Refus) + " " + checkSolFin();
	    			}
	    				
	    	lblOut.setText(RES);
	 }
	 public String FindClassType( int R1 ,int R2, int Wp,int Wl,double Cu,double Cc){
		 
		 // Sable ou Gravier ?
		 
		 String R = "";
		 float Re = R2*100/R1;
		 
		 if (Re > 50){
			 R = "Gravier";
			 Check(100 -R2,"G",Wp,Wl,Cu,Cc);
			 
			 //textIP.setText("" + Re);
			 
			 
		 }else if (Re <= 50){
			 R= "Sable";
			 Check(100 - R2,"S",Wp,Wl,Cu,Cc);
			 
		 }
		 return  R;
	 }
	 public String ClassLineAG (int WL,int WP){
		 double IP =0.73*(WL-20);
		 String Res = "";
		 if(WL < IP){
			 Res = "GL (GM) ";
			 return Res;
		 }else{
		  Res = "GA (GC) ";
		 // check if Under or Above  Graph of Line A for Gravier
		 
		 return Res;
		 }
	 }
     public String ClassLineAS(int WL,int WP){
    	 
    	// check if Under or Above  Graph of Line A for Sable 
    	 double IP =0.73*(WL-20);
		 String Res = "";
		 if(WL < IP){
			 Res = "SL (SM) ";
			 return Res;
		 }else{
		  Res = "SA (SC) ";
		
		 
		 return Res;
		 }
    	
     }

	
     public void  Check(int R80,String K,int Wp,int Wl,double Cu,double Cc){
    	 // for The Intermediate Cass where 5=<R80<=12
    	 String Gra1 ="",Gra2= "";
    	 Gra1 = Granul(K,Cu,Cc);
    	 if (R80 <= 12 && R80 >=5 ) {
    		 
        	 
    		 if(K =="G"){
    			 Gra2 = ClassLineAG(Wl,Wp);
    			 

    		 }else{
    			 if(K == "S"){
    				 Gra2 = ClassLineAS(Wl,Wp);
    				 

    			 }
            
    		 }
    		 txtFinal.setText(Gra1 + "-" + Gra2);
    	 }
    	 if (R80 < 5){
    		 // Call Granul

    		 Granul(K,Cu,Cc);
    		 //txtFinal.setText(Gra1);

    	 }else if (R80 >12){
    		 if(K =="G"){
    			 Gra2 = ClassLineAG(Wl,Wp);
    			 txtFinal.setText(Gra2);

    		 }else{
    			 if(K == "S"){
    				 Gra2 = ClassLineAS(Wl,Wp);
    				 txtFinal.setText(Gra2);

    			 }
    		 }
    	 }
    	 
     }

	
	public String Granul(String S, double Cu , double Cc) {
	     
		if (S == "G"){
			if (Cu > 4 && Cc < 3 && Cc > 1){
				txtFinal.setText("Bien Gradués -> Gb (GW) ");
				return "Gb(GW)";
			}else{
				txtFinal.setText("Mal Gradués -> Gm (GP) ");
				return "Gm(GP)";
			}
		}else if ( S == "S"){
			if (Cu > 6 && Cc < 3 && Cc > 1){
				txtFinal.setText("Bien  Gradués -> Sb (Sw) ");
				return "Sb(SW)";
			}else {
				txtFinal.setText("Mal  Gradués -> Sm (SP) ");
				return "Sm(SP)";
			}
		}
		return "";
	}

    public String checkSolFin(){
    	//String B = txtWP.getText().toString();
		String A = txtWL.getText().toString();
		int Wl = Integer.parseInt(A); 
		//int Wp = Integer.parseInt(B);
    	double IP =0.73*(Wl-20);
  		String Res = "";
  		
    	if(Wl > 50 ){
    		
   		 if(Wl < IP){
   			 Res = "t(H) --> Lt(MH) / Ot(OH) ";
   			 //return Res;
   			 
   		 }else{
   		  Res = "t(H) --> At(CH) ";
   		  
   		 }
    	}else{
    		if(Wl < IP){
    		Res =" p(L) --> Lp(ML) / Op(OL)";
    		}else{
    			Res =" p(L) --> AP(CL)";
    		}
    			
    	}
		return Res;
    	
    }
	public static void main(String[] args) {
	
		Class Find = new Class();
		Find.setSize(530,490);
		Find.setVisible(true);

	}
}
