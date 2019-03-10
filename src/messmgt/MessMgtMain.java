package messmgt;

import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

class WindowSensor extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
        System.exit(0);
    }
}

class WindowSensor1 extends WindowAdapter{
	JFrame rf;
	public WindowSensor1(JFrame f){
		rf=f;
	}
	@Override
	public void windowClosing(WindowEvent we){
		rf.setVisible(false);
       }
}

class MouseSensor extends MouseAdapter{
	JTextField memberId;
	JTextField memberName;
	JTextField contactNumber;
	JTextField address;
	JTable memberTable;
	DefaultTableModel memberModel;
	public MouseSensor(){
	
	}
	public MouseSensor(JTextField t,JTextField t1,JTextField t2,JTextField t3,JTable tb,DefaultTableModel m){
		memberId=t;
		memberName=t1;
		contactNumber=t2;
		address=t3;
		memberTable=tb;
		memberModel=m;
	}
	@Override
	public void  mouseClicked(MouseEvent e){
		int i=memberTable.getSelectedRow();
		memberId.setText(memberModel.getValueAt(i, 0).toString());
		memberName.setText(memberModel.getValueAt(i, 1).toString());
		contactNumber.setText(memberModel.getValueAt(i, 2).toString());
		address.setText(memberModel.getValueAt(i, 3).toString());
	}
}

class MouseSensor1 extends MouseAdapter{
	JTextField mId;
	JTextField mName;
	JTextField meal;
	JTable mealTable;
	DefaultTableModel mealModel;
	
	public MouseSensor1(){
        
    
	}
	
	public MouseSensor1(JTextField t,JTextField t1,JTextField t2,JTable tb,DefaultTableModel m){
		mId=t;
		mName=t1;
		meal=t2;
		mealTable=tb;
		mealModel=m;
	}
	
	@Override
	public void mouseClicked(MouseEvent e){
		int i=mealTable.getSelectedRow();
		mId.setText(mealModel.getValueAt(i, 0).toString());
		mName.setText(mealModel.getValueAt(i, 1).toString());
	}	
}

class MouseSensor2 extends MouseAdapter{
	JTextField bpName;
	JTextField bpId;
	JTable bazarTable1;
	DefaultTableModel bazarModel1;
	public MouseSensor2(){
		
	}
	
	public MouseSensor2(JTextField t,JTextField t1,JTable tb1,DefaultTableModel m1){
		bpName=t1;
		bpId=t;
		bazarTable1=tb1;
		bazarModel1=m1;
	}
	
	@Override
	public void  mouseClicked(MouseEvent e){
		int i=bazarTable1.getSelectedRow();
		bpId.setText(bazarModel1.getValueAt(i, 0).toString());
		bpName.setText(bazarModel1.getValueAt(i, 1).toString());
	}
}

class MouseSensor3 extends MouseAdapter{
	JTextField member;
	JTextField amount;
	JTable payTable1;
	DefaultTableModel payModel1;
	
	public MouseSensor3(){
    
	}
	
	public MouseSensor3(JTextField t,JTextField t1,DefaultTableModel m1,JTable tb1){
		member=t;
		amount=t1;
		payTable1=tb1;
		payModel1=m1;
	}
	
	@Override
	public void  mouseClicked(MouseEvent e){
		int i=payTable1.getSelectedRow();
		member.setText(payModel1.getValueAt(i, 0).toString());
	}
}

class ButtonSensor1 implements ActionListener{
    MainFrame mf;
    //LoginFrame lf;
    public ButtonSensor1(MainFrame m){
        mf=m;
    }
    /*public ButtonSensor1(LoginFrame m){
        lf=m;
    }*/
    @Override
    public void actionPerformed(ActionEvent ae){
        String c=ae.getActionCommand();
        switch (c) {
            case "LOG OUT":
                mf.setVisible(false);
                LoginFrame lf1=new LoginFrame();
                lf1.addWindowListener(new WindowSensor());
                lf1.setVisible(true);
                lf1.setResizable(false);
                break;
            case "REFRESH":
                mf.setVisible(false);
                MainFrame mf1 = null;
        try {
            mf1 = new MainFrame();
        } catch (SQLException ex) {
            Logger.getLogger(ButtonSensor1.class.getName()).log(Level.SEVERE, null, ex);
        }
                mf1.addWindowListener(new WindowSensor());
                mf1.setVisible(true);
                //mf1.setResizable(false);
                break;
        }
    }
}

class ButtonSensor implements  ActionListener,KeyListener{
	DataAccess da=new DataAccess();
	ResultSet rs=null;
        MainFrame mf;
        JPanel jp;
        JPanel jp1;
	JLabel usermsg;
	LoginFrame lf;
	JTextField username;
	JTextField password;
	JLabel loginmsg;
	JTextField memberId;
	JTextField memberName;
	JTextField contactNumber;
	JTextField address;
	JTable memberTable;
	DefaultTableModel memberModel;
	JTextField mId;
	JTextField mName;
	JTextField meal;
	JTable mealTable;
	DefaultTableModel mealModel;
	JTextField bName;
	JTextField bpId;
	JTextField bpName;
	JTextField bpWeight;
	JTextField bpUnit;
	JTextField bpPrice;
	JTable bazarTable;
	DefaultTableModel bazarModel;
	JTable bazarTable1;
	DefaultTableModel bazarModel1;
	JTextField proId;
	JTextField proName;
	JTextField unit;
	JTable proTable;
	DefaultTableModel proModel;
	JTextField member;
	JTextField amount;
	JTable payTable;
	DefaultTableModel payModel;
	JTable payTable1;
	DefaultTableModel payModel1;
	JTextField messAddress;
	JTextField buaBill;
	JTable messTable;
	DefaultTableModel messModel;
	JTable mainTable;
	DefaultTableModel mainModel;
	JTable mainTable1;
	DefaultTableModel mainModel1;
	JTable mainTable2;
	DefaultTableModel mainModel2;
	JTable mainTable3;
	DefaultTableModel mainModel3;
	JTextField lunch;
	JTextField dinner;
	JTextField breakfast;
	JTextField choice;
	JTextField choice1;
	JTextField choice2;
	JLabel passMsg;
	JTextField oldPass;
	JTextField newPass;
	JTextField confirmPass;
	JLabel messinfo;
	JLabel deletemsg;
	Object [] mainRow=new Object[4];
	Object [] mainRow1=new Object[4];
	Object [] mainRow2=new Object[4];
	Object [] mainRow3=new Object[2];
	Object [] payRow=new Object[4];
	Object [] payRow1=new Object[2];
	Object [] proRow=new Object[5];
	Object [] memberRow=new Object[4];
	Object [] mealRow=new Object[3];
	Object [] bazarRow=new Object[4];
	Object [] bazarRow1=new Object[2];
	private float mr;
	private float buabill;
        MainFrame mf1;
	private float bua;
	
	public ButtonSensor(){
    
	}
	
	public ButtonSensor(JLabel l,JTextField t,JTextField t1,JTextField t2,JTextField t3,JTable tb,DefaultTableModel m) throws SQLException{
		memberId=t;
		memberName=t1;
		contactNumber=t2;
		address=t3;
		memberTable=tb;
		memberModel=m;
		deletemsg=l;
        
		String view="select * from member_info";
		rs=da.getData(view);
		while(rs.next()){
			int mi=rs.getInt("member_id");
			String mn = rs.getString("member_name");
			String ma= rs.getString("contact_number");
			String add=rs.getString("member_address");
			memberRow[0]=mi;
			memberRow[1]=mn;
			memberRow[2]=ma;
			memberRow[3]=add;
			memberModel.addRow(memberRow);
		}
		da.close();
	}
	
	public ButtonSensor(JTextField t,JTextField t1,JTextField t2){
		breakfast=t;
		lunch=t1;
		dinner=t2;
	}
	
	public ButtonSensor(JTextField t,JTextField t1,JTextField t2,JLabel l){
		choice=t;
		choice1=t1;
		choice2=t2;
	}
	
	public ButtonSensor(JLabel l,JTextField t,JTextField t1,JTextField t2){
		oldPass=t;
		newPass=t1;
		confirmPass=t2;
		passMsg=l;
	}
	
	public ButtonSensor(JTextField t,JTextField t1,JTextField t2,DefaultTableModel m,JTable tb) throws SQLException{
		proId=t;
		proName=t1;
		unit=t2;
		proTable=tb;
		proModel=m;
        
		String view="select * from product";
		rs=da.getData(view);
		while(rs.next()){
			String mn = rs.getString("pro_name");
			int ma= rs.getInt("pro_id");
			float we=rs.getFloat("weight");
			String u = rs.getString("unit");
			float c=rs.getFloat("pro_cost");
			proRow[0]=ma;
			proRow[1]=mn;
			proRow[2]=we;
			proRow[3]=u;
			proRow[4]=c;
			proModel.addRow(proRow);
		}
		da.close();
	}
	
	public ButtonSensor(JPanel j,JPanel j1,JLabel l,JLabel l1,DefaultTableModel m,JTable tb,DefaultTableModel m1,JTable tb1,DefaultTableModel m2,JTable tb2,DefaultTableModel m3,JTable tb3) throws SQLException{
		messinfo=l;
		usermsg=l1;
		mainTable=tb;
		mainModel=m;
		mainTable1=tb1;
		mainModel1=m1;
		mainTable2=tb2;
		mainModel2=m2;
		mainTable3=tb3;
		mainModel3=m3;
                jp=j;
                jp1=j1;
        
		String calm="select * from calculation";
		rs=da.getData(calm);
		while(rs.next()){
			float cost = rs.getFloat("totalcost");
			int tmeal= rs.getInt("totalmeal");
			float ab=rs.getFloat("availablebalance");
			bua=rs.getFloat("bua_bill");
			mr=cost/tmeal;
			mr=cost/tmeal;
			mainRow1[0]=cost;
			mainRow1[1]=tmeal;
			mainRow1[2]=mr;
			mainRow1[3]=ab;
			mainModel1.addRow(mainRow1);
		}
		da.close();
        
		String q="SELECT COUNT(*) FROM member_info;";
		rs=da.getData(q);
		while(rs.next()){
		int cn=rs.getInt("COUNT(*)");
			buabill=bua/cn;
		}
        
		String view="select * from member_info";
		rs=da.getData(view);
		while(rs.next()){
			String mn = rs.getString("member_name");
			int ma= rs.getInt("meal");
			float bal=rs.getFloat("balance");
			float bl=(ma*mr)+buabill;
			float due=bl-bal;
			mainRow[0]=mn;
			mainRow[1]=ma;
			mainRow[2]=bl;
			if(due>0){
				mainRow[3]=due;
			}
			else{
				mainRow[3]="no dues";
			}
			mainModel.addRow(mainRow);
		}
		da.close();
		String uc="select * from meal_req";
		rs=da.getData(uc);
		while(rs.next()){
			String mn = rs.getString("member_name");
			int brk = rs.getInt("breakfast");
			int ln = rs.getInt("lunch");
			int din = rs.getInt("dinner");
			mainRow2[0]=mn;
			mainRow2[1]=brk;
			mainRow2[2]=ln;
			mainRow2[3]=din;
			mainModel2.addRow(mainRow2);
		}
		da.close();
        
		String uac="select * from userchoice";
		rs=da.getData(uac);
		while(rs.next()){
			String mn = rs.getString("member_name");
			String mc = rs.getString("choice");
			mainRow3[0]=mn;
			mainRow3[1]=mc;
			mainModel3.addRow(mainRow3);
		}
		da.close();
        
		String vim="select * from mess_info";
		rs=da.getData(vim);
		while(rs.next()){
			String min = rs.getString("mess_address");
			messinfo.setText(min);
		}
		da.close();
	}
	
	public ButtonSensor(JTextField t,JTextField t1,JTextField t2,JTextField t3,JTextField t4,JTextField t5,JTable tb,DefaultTableModel m,JTable tb1,DefaultTableModel m1) throws SQLException{
		bName=t;
		bpId=t1;
		bpName=t2;
		bpWeight=t3;
		bpUnit=t4;
		bpPrice=t5;
		bazarTable=tb;
		bazarModel=m;
		bazarTable1=tb1;
		bazarModel1=m1;
        
		String ca="select * from bazar";
		rs=da.getData(ca);
		while(rs.next()){
			String bd=String.valueOf(rs.getDate("date"));
			float bc=rs.getFloat("bazar_cost");
			String mm=rs.getString("member_name");
			String dt=rs.getString("details");
			bazarRow[0]=bd;
			bazarRow[1]=mm;             
			bazarRow[2]=bc;             
			bazarRow[3]=dt;             
			bazarModel.addRow(bazarRow);
		}
		da.close();                 
		String view="select * from product";         
		rs=da.getData(view);         
		while(rs.next()){             
			String mn = rs.getString("pro_name");             
			int ma= rs.getInt("pro_id");             
			bazarRow1[0]=ma;             
			bazarRow1[1]=mn;             
			bazarModel1.addRow(bazarRow1);         
		}         
		da.close();     
	}     
	
	public ButtonSensor(JTextField t,JTextField t1,JTable tb,DefaultTableModel m,JTable tb1,DefaultTableModel m1) throws SQLException{         
		member=t;         
		amount=t1;         
		payTable=tb;         
		payModel=m;         
		payTable1=tb1;         
		payModel1=m1;                 
		String ca="select * from payment";         
		rs=da.getData(ca);        
		while(rs.next()){             
			String bd=String.valueOf(rs.getDate("date"));             
			float bc=rs.getFloat("amount");             
			String mm=rs.getString("member_name");             
			String dt=rs.getString("type");             
			payRow[0]=bd;             
			payRow[1]=mm;             
			payRow[2]=bc;            
			payRow[3]=dt;             
			payModel.addRow(payRow);         
		}         
		da.close();                 
		String view="select * from member_info";         
		rs=da.getData(view);         
		while(rs.next()){             
			String mn = rs.getString("member_name");             
			float ma= rs.getFloat("balance");             
			payRow1[0]=mn;             
			payRow1[1]=ma;             
			payModel1.addRow(payRow1);         
		}         
		da.close();     
	}     
	
	public ButtonSensor(JTextField t,JTextField t1,DefaultTableModel m,JTable tb){         
		messAddress=t;         
		buaBill=t1;         
		messTable=tb;         
		messModel=m;     
	}     
	
	public ButtonSensor(LoginFrame l,JTextField t,JTextField t1,JLabel la){         
		lf=l;         
		username=t;         
		password=t1;         
		loginmsg=la;     
	}     
	
	public ButtonSensor(JTextField t,JTextField t1,JTextField t2,JTable tb,DefaultTableModel m) throws SQLException{         
		mId=t;         
		mName=t1;         
		meal=t2;         
		mealTable=tb;         
		mealModel=m;                 
		String view="select * from member_info";         
		rs=da.getData(view);         
		while(rs.next()){             
			int mi=rs.getInt("member_id");             
			String mn = rs.getString("member_name");             
			int ma= rs.getInt("meal");             
			mealRow[0]=mi;             
			mealRow[1]=mn;             
			mealRow[2]=ma;             
			mealModel.addRow(mealRow);         
		}         
		da.close();     
	}     
	
	@Override     
	public void actionPerformed(ActionEvent e){         
		String c=e.getActionCommand();         
		switch (c) {             
			case "Log In":                 
				String qu="UPDATE `mess_info` SET `loginas` = '"+username.getText()+"' WHERE `mess_info`.`messno` = '1'";                 
				int up=da.updateDB(qu);                 
				String qb="select * from logininfo WHERE `logininfo`.`username` = '"+username.getText()+"';";                 
				rs=da.getData(qb);                 
				{                     
					try {                         
						while(rs.next()){                             
							String un=rs.getString("username");                             
							String pass=rs.getString("password");                             
							if(pass.equals(password.getText())&& un.equals(username.getText())){                                 
								mf=new MainFrame();                                 
								mf.addWindowListener(new WindowSensor());                                 
								mf.setVisible(true);                                 
								//mf.setResizable(false);                                 
								lf.setVisible(false);                             
							}                             
							else{                                 
								loginmsg.setText("Invalid Username or Password");                                 
								loginmsg.setForeground(Color.red);                                 
								password.setText("");                             
							}                         
						}                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                 
				{                     
					try {                         
						da.close();                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                 
			break;    
				
			case "MEMBER":
				String ca="select * from mess_info";                 
				rs=da.getData(ca);                 
				{                     
					try {                         
						while(rs.next()){                             
							String umr=rs.getString("loginas");                             
							if("manager".equals(umr)){
								MemberFrame mmf = null;                                 
								try {                                     
									mmf = new MemberFrame();                                 
								}                                 
								catch (SQLException ex) {                                     
									Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                                 
								}                                 
								mmf.addWindowListener(new WindowSensor1(mmf));                                 
								mmf.setVisible(true);                                 
								mmf.setResizable(false);                             
							}                             
							else{                                 
								usermsg.setText("You are Login as a User. Please Use Right side Button only.");                                 
								usermsg.setForeground(Color.red);                             
							}                         
						}                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                 
				{                     
					try {                         
						da.close();                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                
			break;             
				
			case "UPDATE":                 
				MemberFrame mfu = null;                 
				try {                     
					mfu = new MemberFrame();                 
				}                 
				catch (SQLException ex) {                     
					Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                 
				}                 
				mfu.addWindowListener(new WindowSensor1(mfu));                 
				mfu.setVisible(true);                 
				mfu.setResizable(false);                 
				break;             
				case "MEAL":                 
				String cma="select * from mess_info";                 
				rs=da.getData(cma);                 
				{                     
					try {                         
						while(rs.next()){                             
							String umr=rs.getString("loginas");                             
							if("manager".equals(umr)){                                 
								MealFrame mmf1 = null;                                 
								try {                                     
									mmf1 = new MealFrame();                                 
								}                                 
								catch (SQLException ex) {                                     
									Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                                 
								}                                 
								mmf1.addWindowListener(new WindowSensor1(mmf1));                                 
								mmf1.setVisible(true);                                 
								mmf1.setResizable(false);                             
							}                             
							else{                                 
								usermsg.setText("You are Login as a User. Please Use Right side Button only.");                                 
								usermsg.setForeground(Color.blue);                             
							}                         
						}                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                 
				{                     
					try {                         
						da.close();                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}
				}	
			break;             
			
			case "BAZAR":                 
				String cta="select * from mess_info";                 
				rs=da.getData(cta);                 
				{                     
					try {                         
						while(rs.next()){                             
							String umr=rs.getString("loginas");                             
							if("manager".equals(umr)){                                 
								BazarFrame bf = null;                                 
								try {                                     
									bf = new BazarFrame();                                 
								}                                 
								catch (SQLException ex) {                                     
									Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                                 
								}                                 
								bf.addWindowListener(new WindowSensor1(bf));                                 
								bf.setVisible(true);                                 
								bf.setResizable(false);                             
							}                             
							else{                                 
								usermsg.setText("You are Login as a User. Please Use Right side Button only.");                                 
								usermsg.setForeground(new Color(10,180,20));                             
							}                         
						}                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                 
				{                     
					try {                         
						da.close();                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                 
			break;             
			
			case "PRODUCT":                 
				String cpa="select * from mess_info";                 
				rs=da.getData(cpa);                 
				{                     
					try {                         
						while(rs.next()){                             
							String umr=rs.getString("loginas");                             
							if("manager".equals(umr)){                                 
								ProFrame pf = null;                                 
								try {                                     
									pf = new ProFrame();                                 
								}                                 
								catch (SQLException ex) {                                     
									Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                                 
								}                                 
								pf.addWindowListener(new WindowSensor1(pf));                                 
								pf.setVisible(true);                                 
								pf.setResizable(false);                             
							}                             
							else{                                 
								usermsg.setText("You are Login as a User. Please Use Right side Button only.");                                 
								usermsg.setForeground(Color.magenta);                             
							}                         
						}                     
					}                    
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                 
				{                     
					try {                         
						da.close();                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                 
			break;             
			
			case "PAYMENT":                 
			String pca="select * from mess_info";                 
			rs=da.getData(pca);                 
			{                     
				try {                         
					while(rs.next()){                             
						String umr=rs.getString("loginas");                             
						if("manager".equals(umr)){                                
							PayFrame pmf = null;                                 
							try {                                     
								pmf = new PayFrame();                                 
							}                                 
							catch (SQLException ex) {                                     
								Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                                 
							}                                 
							pmf.addWindowListener(new WindowSensor1(pmf));                                 
							pmf.setVisible(true);                                 
							pmf.setResizable(false);                             
						}                             
						else{                                 
							usermsg.setText("You are Login as a User. Please Use Right side Button only.");                                 
							usermsg.setForeground(Color.red);                             
						}                         
					}                     
				}                     
				catch (SQLException ex) {                         
					Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
				}                 
			}                 
			{                     
				try {                         
					da.close();                     
				}                     
				catch (SQLException ex) {                         
					Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
				}                 
			}                 
			break;             
			
			case "MESSINFO":                 
				MessFrame mf1=new MessFrame();                 
				mf1.addWindowListener(new WindowSensor1(mf1));                 
				mf1.setVisible(true);                 
				mf1.setResizable(false);                 
			break;             
			
			case "CHANGE PASSWORD":                 
				UserFrame uf=new UserFrame();                 
				uf.addWindowListener(new WindowSensor1(uf));                 
				uf.setVisible(true);                 
				uf.setResizable(false);                 
			break;             
			
			case "ADD MEAL":				
				UserMealFrame uof=new UserMealFrame();                 
				uof.addWindowListener(new WindowSensor1(uof));                 
				uof.setVisible(true);                 
				uof.setResizable(false);                 
			break;             
			
			case "MENU CHOICE":				
				UserMenuFrame ff=new UserMenuFrame();                 
				ff.addWindowListener(new WindowSensor1(ff));                 
				ff.setVisible(true);                 
				ff.setResizable(false);                 
			break;             
			
			case "CHECK INFO":
                                
				/*UserInfoFrame uif=new UserInfoFrame();                 
				uif.addWindowListener(new WindowSensor1(uif));                 
				uif.setVisible(true);                 
				uif.setResizable(false);*/
                                jp.setVisible(true);
                                jp1.setVisible(false);
			break;             
			
			case "CHECKED":                 
				String cca="select * from mess_info";                 
				rs=da.getData(cca);                 
				{                     
					try {                         
						while(rs.next()){                             
							String umr=rs.getString("loginas");                             
							if("manager".equals(umr)){                                 
								String qry="DELETE FROM `meal_req`";                                 
								int cd=da.updateDB(qry);                                 
								String qr="DELETE FROM `userchoice`";                                 
								int cdu=da.updateDB(qr);                             
							}                             
							else{                                 
								usermsg.setText("You are Login as a User. Please Use Right side Button only.");                                 
								usermsg.setForeground(Color.magenta);                             
							}                         
						}                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                 
				{                     
					try {                         
						da.close();                     
			           	}                     
			        	catch (SQLException ex) {                         
				        	Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
			        }                 
			break;                 
			
			case "RESETALL":                 
				String re="select * from mess_info";                 
				rs=da.getData(re);                 
				{                     
			        	try {                         
			        		while(rs.next()){                             
			         			String umr=rs.getString("loginas");                             
			        			if("manager".equals(umr)){                                 
			        				String qry="DELETE FROM `meal_req`";                                 
			        				int a=da.updateDB(qry);                                 
			          				String py="DELETE FROM `payment`";                                 
			         				int cd=da.updateDB(py);                                 
			          				String qr="DELETE FROM `userchoice`";                                 
			           				int cdu=da.updateDB(qr);                                 
			          				String by="DELETE FROM `bazar`";                                 
			           				int cb=da.updateDB(by);                                 
			          				String qrp="DELETE FROM `product`";                                 
			              				int cdp=da.updateDB(qrp);                                 
				          			String mi="DELETE FROM `meal_info`";                                 
				            			int ci=da.updateDB(mi);                                 
				              			String qur="UPDATE `member_info` SET `meal` = '0', `balance` = '0'";                                 
					          		int upr=da.updateDB(qur);                                 
					          		String cal="UPDATE `calculation` SET `totalcost` = '0', `totalmeal` = '0',`Availablebalance`='0',`bua_bill`='0'";                                 
					        		int cc=da.updateDB(cal);                             
					           	}                             
					        	else{                                 
					        		usermsg.setText("You are Login as a User. Please Use Right side Button only.");                                 
					        		usermsg.setForeground(Color.magenta);                             
					          	}                         
		        			}                     
		        		}                     
					catch (SQLException ex) {                         
		          	        	Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
		                 	}                 
	                  	}                 
	                    	{                     
	                       		try {                         
	               	          		da.close();                     
					}                     
	                       		catch (SQLException ex) {                         
	        	         		Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
	            	          	}                 
				}                  
			break;             
		
			case "Add":             
	        	{          
	          		String q="insert into member_info values('"+memberId.getText()+"','"+memberName.getText()+"','"+contactNumber.getText()+"','"+address.getText()+"','0','0')";                 
              			int d=da.updateDB(q);                 
	              		{                     
		          		try {                         
          					da.close();                     
        				}                     
           				catch (SQLException ex) {                         
            					Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
           				}                 
        			}                             
	          		String log="insert into logininfo values('"+memberName.getText()+"','1234')";                 
	            		int lin=da.updateDB(log);                 
				try {                     
			        	da.close();                 
               			}                 
	          		catch (SQLException ex) {                     
	            			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                 
	               		}                 
		         	deletemsg.setText("Successfully added "+memberName.getText()+" as member");                 
	             		deletemsg.setForeground(new Color(10,180,20));                 
		           	memberRow[0]=memberId.getText();                 
				memberRow[1]=memberName.getText();                 
	          		memberRow[2]=contactNumber.getText();                 
	        		memberRow[3]=address.getText();                 
            			memberModel.addRow(memberRow);                 
               			memberId.setText("");                 
	            		memberName.setText("");                 
	            		contactNumber.setText("");                 
	             		address.setText("");                 
				break;             
		        }              
		
			case "Update":             
			{                 
	        		int i=memberTable.getSelectedRow();                 
          			if(i>=0){                     
               				memberModel.setValueAt(memberId.getText(),i,0);                     
	               			memberModel.setValueAt(memberName.getText(),i,1);                     
		             		memberModel.setValueAt(contactNumber.getText(),i,2);                     
		         		memberModel.setValueAt(address.getText(),i,3);                 
		         	}                 
			        String qur="UPDATE `member_info` SET `member_name` = '"+memberName.getText()+"', `contact_number` = '"+contactNumber.getText()+"', `member_address` = '"+address.getText()+"' WHERE `member_info`.`member_id` = '"+memberId.getText()+"'";                 
               			int upr=da.updateDB(qur);                 
	              		try {                     
	           			da.close();                 
	         		}                 
	             		catch (SQLException exx) {                     
		           		Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, exx);                            
	              		}                 
		          	deletemsg.setText("Successfully update "+memberName.getText()+"'s information");                 
	        		deletemsg.setForeground(new Color(10,180,20));                 
	        		memberId.setText("");                 
		          	memberName.setText("");                 
	           		contactNumber.setText("");                
				address.setText("");                 
	             		break;             
	          	}             
		
			case "Delete":             
	           	{                 
	            		String pda="select * from mess_info";                 
	             		rs=da.getData(pda);                 
		          	try {                     
		           		while(rs.next()){                         
						String umr=rs.getString("loginas");                         
            					if("manager".equals(umr)){                             
          						int i=memberTable.getSelectedRow();                             
            						if(i>=0){                                 
								memberModel.removeRow(i);                             
	          					}                             
			            			String qri="DELETE FROM `member_info` WHERE `member_info`.`member_id` ="+memberId.getText();                             
					        	int cdi=da.updateDB(qri);                             
				        		String dlog="DELETE FROM `logininfo` WHERE `logininfo`.`username` ='"+memberName.getText()+"'";                             
							int dt=da.updateDB(dlog);                             
			            			deletemsg.setText(memberName.getText()+" is deleted from Member List");                             
			          			deletemsg.setForeground(Color.red);                         
			         		}                         
				          	else{                             
				         		deletemsg.setText("You are not allowed to delete any member");                             
				         		deletemsg.setForeground(Color.red);                         
				        	}                     
	          			}                 
	        		}                 
	            	        catch (SQLException ex) {                     
	          			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                 
	        		}                 
	         		try {                    
	              			da.close();             
		         	} 
			        catch (SQLException ex) {        
		          		Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);         
				}        
	               		memberId.setText("");                
	          		memberName.setText("");      
         			contactNumber.setText("");       
             			address.setText("");       
	           		break;      
	           	}    
		
            		case "Add Meal":
        		{         
	          		String baz="INSERT INTO `meal_info` (`mid`,`date`, `member_name`, `meal`) VALUES (NULL,SYSDATE(),'"+mName.getText()+"','"+meal.getText()+"')";      
           			int bz=da.updateDB(baz);          
	           		String mm="select * from member_info WHERE `member_info`.`member_name` = '"+mName.getText()+"';";       
		        	rs=da.getData(mm);      
		          	try {         
			        	while(rs.next()){         
				          	int mc=rs.getInt("meal");          
			            		int count1=Integer.parseInt(meal.getText());       
			        		int mCount=mc+count1;     
			          		String qurw="UPDATE `member_info` SET `meal` = '"+mCount+"' WHERE `member_info`.`member_name` = '"+mName.getText()+"';";        
			         		int upw=da.updateDB(qurw);        
			        	}     
	           		}         
		           	catch (SQLException ex) {         
			        	Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);      
				}    
	          		String qrt="select * from calculation";    
		        	rs=da.getData(qrt);         
	        		try {         
        				while(rs.next()){         
	        				int m=rs.getInt("totalmeal");      
		               			int count=Integer.parseInt(meal.getText());       
				         	int mCount1=m+count;   
		        			String um="UPDATE `calculation` SET `totalmeal` = '"+mCount1+"' WHERE `calculation`.`no` = 1";         
		           			int upk=da.updateDB(um);           
		             		}        
          			}               
	        		catch (SQLException ex) {         
	           			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);         
          			}     
             			try {          
	           			da.close();        
	           		}       
	              		catch (SQLException ex) {         
		            		Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                
         			}          
	          		int i=mealTable.getSelectedRow();        
	           		if(i>=0){         
         				mealModel.setValueAt(mId.getText(),i,0); 	
        				mealModel.setValueAt(mName.getText(),i,1);        
          				mealModel.setValueAt(meal.getText(),i,2); 	
          			} 
	        		mId.setText("");      
	          		mName.setText("");         
	             		meal.setText("");         
		          	break;      
			}

	         	case "Create Bazar":       
	         	{ 
		           	String baz="INSERT INTO `bazar` (`bazar_id`,`date`, `member_name`, `bazar_cost`, `details`) VALUES (NULL,SYSDATE(),'"+bName.getText()+"', '0', '')";           
		         	int bz=da.updateDB(baz);         
         			try {       
	        			da.close();      
	            		}    
	           		catch (SQLException ex) {       
	          			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);        
	          		}            
	          		break;       
			}
           
	          	case "Entry Pro":        
		        { 
				String mm="select * from product WHERE `product`.`pro_id` = '"+bpId.getText()+"'";      
	        		rs=da.getData(mm);        
          			try {       
	           			while(rs.next()){ 
	          				float w=Float.parseFloat(bpWeight.getText());      
	             				float p=Float.parseFloat(bpPrice.getText());       
		            			float dw=rs.getFloat("weight");    
		          			float dp=rs.getFloat("pro_cost");           
		              			float nw=w+dw;      
			            		float np=p+dp;         
			          		String qqu="UPDATE `product` SET `weight` = '"+nw+"', `pro_cost` = '"+np+"' WHERE `product`.`pro_id` = '"+bpId.getText()+"'";    
			            		int qup=da.updateDB(qqu);        
	            			}      
	           		}  
	           		catch (SQLException ex) {     
	             			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);       
		              	}     
               			try {           
					da.close();        
			        } 
		        	catch (SQLException ex) {      
		          		Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);       
	           		}        
	          		String bq="SELECT * FROM bazar ORDER BY bazar_id DESC LIMIT 1;";   
	            		rs=da.getData(bq);          
	               		try {       
		           		while(rs.next()){       
		         			int id=rs.getInt("bazar_id");    
		          			String det=bpName.getText()+bpWeight.getText()+bpUnit.getText();        
		             			float bzp=Float.parseFloat(bpPrice.getText());   
			          		float dbc=rs.getFloat("bazar_cost");      
			          		String dtl=rs.getString("details");      
			            		float nc=bzp+dbc;      
			             		String detail=det+"; "+dtl;       
				           	String qeu="UPDATE `bazar` SET `bazar_cost` = '"+nc+"',`details` = '"+detail+"'WHERE `bazar`.`bazar_id` ="+id;       
				        	int uep=da.updateDB(qeu);       
		           		}       
          			}   
	         		catch (SQLException ex) {     
	          			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);          
	         		}  
	        		String qra="select * from calculation";   
	          		rs=da.getData(qra);    
	        		try {      
	          			while(rs.next()){         
		        			float m=rs.getFloat("totalcost");     
			        		float cost=Float.parseFloat(bpPrice.getText());       
		           			float mCount=m+cost;     
	          				String um="UPDATE `calculation` SET `totalcost` = '"+mCount+"' WHERE `calculation`.`no` = 1";      
            					int upa=da.updateDB(um);       
	        			}  
	         		}       
	          		catch (SQLException ex) {  
	         			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);       
	        		} 
	        		String av="select * from calculation"; 
	           		rs=da.getData(av);      
	        		try {         
	          			while(rs.next()){          
	           				float m=rs.getFloat("Availablebalance");       
	         				float cost=Float.parseFloat(bpPrice.getText());        
	            				float mCount=m-cost;        
	              				String um="UPDATE `calculation` SET `Availablebalance` = '"+mCount+"' WHERE `calculation`.`no` = 1" ;       
		           			int upd=da.updateDB(um);       
		         		}     
		         	}        
	         		 catch (SQLException ex) {     
	          			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);       
	          		}        
	           		try {       
	          			da.close();  
	           		}          
				catch (SQLException ex) {     
	        		  	Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);        
	        		} 
	         		bpId.setText("");      
	        		bpName.setText("");      
	        		bpWeight.setText("");       
	        		bpUnit.setText("");      
	        		bpPrice.setText("");       
	        		break;      
        		}         
	
	        	case "Add Pro":    
          		{ 
	        		String prod="insert into product values('"+proId.getText()+"','"+proName.getText()+"','0','"+unit.getText()+"','0')";         
	          		int pd=da.updateDB(prod);         
	          		{             
	            			try {          
	        				da.close();        
	             			} 
		           		catch (SQLException ex) {      
		             			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);          
			        	}     
	         		}            
		         	proRow[0]=proId.getText();       
	            		proRow[1]=proName.getText();    
	            		proRow[3]=unit.getText();      
	           		proModel.addRow(proRow);       
	          		proId.setText("");        
	          		proName.setText("");        
	          		unit.setText("");      
	            		break;      
	         	}      

	         	case "Add Balance":        
	           	{            
	          		String baz="INSERT INTO `payment` (`pay_id`,`date`, `member_name`, `amount`, `type`) VALUES (NULL,SYSDATE(),'"+member.getText()+"','"+amount.getText()+"','Receive')";            
	         		int bz=da.updateDB(baz);        
	           		String qrb="select * from member_info where member_name='"+member.getText()+"'";        
	          		rs=da.getData(qrb);          
	           		try {         
	            			while(rs.next()){              
	           				int id=rs.getInt("member_id");        
						float m=rs.getFloat("balance");         
			         		float cost=Float.parseFloat(amount.getText());        
			         		float mCount=m+cost;       
			        		String um="UPDATE `member_info` SET `balance` = '"+mCount+"' WHERE `member_info`.`member_id` ='"+id+"'";            
			        		int upd=da.updateDB(um);          
			          	}
	          		}    
	           		catch (SQLException ex) {         
	             			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);      
	            		}
	             		String av="select * from calculation";        
	          		rs=da.getData(av);   
	         		try {           
	            			while(rs.next()){         
		        			float m=rs.getFloat("Availablebalance");      
		          			float cost=Float.parseFloat(amount.getText());        
		            			float mCount=m+cost;      
		        			String um="UPDATE `calculation` SET `Availablebalance` = '"+mCount+"' WHERE `calculation`.`no` = 1" ;     
		         			int upd=da.updateDB(um);        
		         		}       
		        	}
	          		catch (SQLException ex) {      
	            			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);      
	          		}        
				try {          
			         	da.close();    
	           		}     
	          		catch (SQLException ex) {         
	            			Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);          
	         		} 
	           		payRow[1]=member.getText();       
	           		payRow[2]=amount.getText();          
	          		payRow[3]="Receive";        
	               		payModel.addRow(payRow);        
		             	member.setText("");        
		         	amount.setText("");         
		        	break;          
	         	}    
	        	case "Return":         
	          	{ 
	         		String baz="INSERT INTO `payment` (`pay_id`,`date`, `member_name`, `amount`, `type`) VALUES (NULL,SYSDATE(),'"+member.getText()+"','"+amount.getText()+"','Return')";                
	             		int bz=da.updateDB(baz);          
		        	String qrb="select * from member_info where member_name='"+member.getText()+"'";        
          			rs=da.getData(qrb);      
        			try {          
          				while(rs.next()){       
        					int id=rs.getInt("member_id");        
          					float m=rs.getFloat("balance");       
              					float cost=Float.parseFloat(amount.getText()); 
	              				float mCount=m-cost;       
		             			String um="UPDATE `member_info` SET `balance` = '"+mCount+"' WHERE `member_info`.`member_id` ="+id;       
			        		int upz=da.updateDB(um);     
	            			} 
	        		}   
	         		catch (SQLException ex) {    
		         		Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);    
		        	} 
	           		String av="select * from calculation";    
          			rs=da.getData(av);            
          			try {         
        				while(rs.next()){         
           					float m=rs.getFloat("Availablebalance");       
	          				float cost=Float.parseFloat(amount.getText());        
	           				float mCount=m-cost;        
	             				String um="UPDATE `calculation` SET `Availablebalance` = '"+mCount+"'WHERE `calculation`.`no` = 1" ;         
			         		int upd=da.updateDB(um);           
			        	}
		        	}      
		        	catch (SQLException ex) {     
		          		Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);      
           			}  
          			try {       
          				da.close();      
          			}    
            			catch (SQLException ex) {      
            				Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);         
            			}     
            			payRow[1]=member.getText();        
	           		payRow[2]=amount.getText();     
	            		payRow[3]=c;        
	            		payModel.addRow(payRow);          
	              		member.setText("");        
		            	amount.setText("");        
	              		break;       
		        }         
        		case "SETINFO":     
        		{      
         			String qzu="UPDATE `mess_info` SET `mess_address` = '"+messAddress.getText()+"' WHERE `mess_info`.`messno` = '1'";       
        			int uzp=da.updateDB(qzu);         
          			try {      
          				da.close();        
         			}      
          			catch (SQLException ex) {     
        				Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);         
               			} 
	           		break;    
           		}        

			case "SETBILL":            
         		{   
         			String qru="UPDATE `calculation` SET `bua_bill` = '"+buaBill.getText()+"' WHERE `calculation`.`no` = '1'";       
        			int urp=da.updateDB(qru);       
         			try {            
         				da.close();        
          			}     
           			catch (SQLException ex) {      
             				Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);        
	         		}       
	          		buaBill.setText("");     
	           		break;       
          		}  

	        	case "Send":       
          		{     
				String qrb="select * from mess_info" ;       
				rs=da.getData(qrb);       
				try {        
					while(rs.next()){      
						String usr=rs.getString("loginas");      
						String baz="INSERT INTO `meal_req` (`r_no`, `member_name`,`breakfast`,`lunch`, `dinner`) VALUES (NULL,'"+usr+"','"+breakfast.getText()+"','"+lunch.getText()+"','"+dinner.getText()+"')";                 
						int bz=da.updateDB(baz);          
					}               
				}  
				catch (SQLException ex) {     
					Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);        
				}       
				try {          
					da.close();         
				}      
				catch (SQLException ex) {        
					Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);       
				}  
				breakfast.setText("");  
				lunch.setText("");        
				dinner.setText("");        
				break;      
			}           
			
			case "Add Choice":   
			{     
				String qrb="select * from mess_info";         
				rs=da.getData(qrb);          
				try {        
					while(rs.next()){      
						String usr=rs.getString("loginas");         
						String baz="INSERT INTO `userchoice` (`member_name`,`choice`) VALUES ('"+usr+"','"+choice.getText()+";"+choice1.getText()+";"+choice2.getText()+"')";                         
						int bz=da.updateDB(baz);           
					}        
				}  
				catch (SQLException ex) {            
					Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);           
				}  
				try {            
					da.close();          
				} 
				catch (SQLException ex) {            
					Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);          
				}      
				choice.setText("");      
				choice1.setText("");        
				choice2.setText("");        
				break;        
			}     
			case "Confirm":         
				if(newPass.getText().equals(confirmPass.getText())){         
					String calm="select * from mess_info";       
					rs=da.getData(calm);         
					{       
						try {              
							while(rs.next()){ 
								String un=rs.getString("loginas");       
								String rqu="UPDATE `logininfo` SET `password` = '"+confirmPass.getText()+"' WHERE `logininfo`.`username` ='"+un+"'";             
								int rup=da.updateDB(rqu);         
							}             
						}  
						catch (SQLException ex) {      
							Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);             
						}      
					}    
					try {              
						da.close();             
						}          
						catch (SQLException ex) {           
							Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
						}                
						passMsg.setText("Password Successfully changed");       
						passMsg.setForeground(new Color(10,180,20));        
					}        
					else{            
						passMsg.setText("Password not matched.please try again");    
					}  
					oldPass.setText("");       
					newPass.setText("");      
					confirmPass.setText("");        
				break;    
			}
	}
        public void keyTyped(KeyEvent ke){
        
        System.out.println(ke.getKeyChar()+" is typed");
    }
    public void keyPressed(KeyEvent ke){
	    if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                System.out.println("Right");
            }

            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String qu="UPDATE `mess_info` SET `loginas` = '"+username.getText()+"' WHERE `mess_info`.`messno` = '1'";                 
				int up=da.updateDB(qu);                 
				String qb="select * from logininfo WHERE `logininfo`.`username` = '"+username.getText()+"';";                 
				rs=da.getData(qb);                 
				{                     
					try {                         
						while(rs.next()){                             
							String un=rs.getString("username");                             
							String pass=rs.getString("password");                             
							if(pass.equals(password.getText())&& un.equals(username.getText())){                                 
								mf=new MainFrame();                                 
								mf.addWindowListener(new WindowSensor());                                 
								mf.setVisible(true);                                 
								//mf.setResizable(false);                                 
								lf.setVisible(false);                             
							}                             
							else{                                 
								loginmsg.setText("Invalid Username or Password");                                 
								loginmsg.setForeground(Color.red);                                 
								password.setText("");                             
							}                         
						}                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}                 
				{                     
					try {                         
						da.close();                     
					}                     
					catch (SQLException ex) {                         
						Logger.getLogger(ButtonSensor.class.getName()).log(Level.SEVERE, null, ex);                     
					}                 
				}
                System.out.println("Left");
            }
        
        System.out.println(ke.getKeyChar()+" is pressed");
    }
    public void keyReleased(KeyEvent ke){
        
        System.out.println(ke.getKeyChar()+" is released");
    }
        	
}


class MealFrame extends JFrame{
	public MealFrame() throws SQLException{
		super("Meal");
		JLabel lb=new JLabel("Member Id :");  
		JLabel lb1=new JLabel("Member Name :"); 
		JLabel lb2=new JLabel("Meal Amount :");  
		JLabel lb3=new JLabel("Meal Information");   
		JTextField tf=new JTextField(15);      
		JTextField tf1=new JTextField(15); 
		JTextField tf2=new JTextField(15); 	
		JButton bt=new JButton("Add Meal"); 	
		lb3.setBounds(25,20,400,25); 	
		lb.setBounds(30,60,100,25); 
		tf.setBounds(30,90,150,25);
		lb1.setBounds(30,120,100,25); 	
		tf1.setBounds(30,150,150,25); 	
		lb2.setBounds(30,180,100,25); 	
		tf2.setBounds(30,210,150,25); 	
		bt.setBounds(30,250,90,35); 
		lb3.setForeground(Color.blue); 
		lb3.setFont(new Font("CURLZ MT", Font.PLAIN, 25));
		JTable table = new JTable(); 	
		Object[] columns={"Member Id","Member Name","Meal"}; 
		DefaultTableModel model=new DefaultTableModel(); 
		model.setColumnIdentifiers(columns); 	
		table.setModel(model); 
		table.setRowHeight(20); 
		JScrollPane p=new JScrollPane(table); 	
		p.setBounds(220,55,300,260); 	
		add(p); 
		add(lb); 
		add(lb1); 
		add(lb2); 
		add(lb3); 
		add(tf); 	
		add(tf1); 	
		add(tf2); 
		add(bt); 
		ButtonSensor bs=new ButtonSensor(tf,tf1,tf2,table,model); 
		MouseSensor1 ms=new MouseSensor1(tf,tf1,tf2,table,model); 
		table.addMouseListener(ms); 
		bt.addActionListener(bs); 
		setLayout(null); 	
		setSize(550,380);
        }
}

class BazarFrame extends JFrame{
	public BazarFrame() throws SQLException{
		super("Bazar"); 	
		JLabel lb=new JLabel("Member Name :");
		JLabel lb1=new JLabel("Pro Id :");
		JLabel lb2=new JLabel("Pro Name :"); 
		JLabel lb3=new JLabel("Weight :");
		JLabel lb5=new JLabel("Price :"); 	
		JLabel lb4=new JLabel("Bazar Information");
		JLabel lb6=new JLabel("Product List :");
		JTextField tf=new JTextField(15);
		JTextField tf1=new JTextField(15);
		JTextField tf2=new JTextField(15); 
		JTextField tf3=new JTextField(15); 
		JTextField tf4=new JTextField(15);
		JTextField tf5=new JTextField(15);
		JButton bt=new JButton("Entry Pro"); 	
		JButton bt1=new JButton("Create Bazar"); 	
		lb4.setBounds(25,20,400,25); 
		lb.setBounds(30,70,90,25); 	
		tf.setBounds(30,95,140,25); 
		lb1.setBounds(30,165,50,25); 
		tf1.setBounds(30,190,50,25);
		lb2.setBounds(90,165,80,25);
		tf2.setBounds(90,190,80,25); 
		lb3.setBounds(30,220,60,25);
		tf3.setBounds(30,245,70,25);
		tf4.setBounds(110,245,60,25);
		lb5.setBounds(30,280,60,25);
		tf5.setBounds(80,280,90,25);
		bt.setBounds(30,310,100,30);
		bt1.setBounds(30,125,110,30);
		lb6.setBounds(30,350,110,25);
		lb4.setForeground(Color.blue);
		lb4.setFont(new Font("CURLZ MT", Font.PLAIN, 25)); 	JTable table = new JTable(); 
		Object[] columns={"Date","Member Name","Cost","Details"}; 
		DefaultTableModel model=new DefaultTableModel();
		model.setColumnIdentifiers(columns); 
		table.setModel(model); 
		table.setRowHeight(20); 
		JScrollPane p=new JScrollPane(table);
		p.setBounds(220,60,450,480); 
		JTable table1 = new JTable(); 
		Object[] columns1={"Pro Id","Pro Name"}; 
		DefaultTableModel model1=new DefaultTableModel(); 
		model1.setColumnIdentifiers(columns1); 	
		table1.setModel(model1); 
		table1.setRowHeight(20); 
		JScrollPane p1=new JScrollPane(table1); 
		p1.setBounds(30,375,170,165);
		add(lb); 
		add(lb1); 
		add(lb6);
		add(lb2); 
		add(lb3); 
		add(tf); 
		add(tf1); 
		add(tf2);
		add(tf3); 
		add(tf4);
		add(lb5); 	
		add(tf5); 
		add(bt);
		add(bt1);
		add(p); 
		add(p1); 	
		add(lb4); 
		ButtonSensor bs=new ButtonSensor(tf,tf1,tf2,tf3,tf4,tf5,table,model,table1,model1); 	
		MouseSensor2 ms=new MouseSensor2(tf1,tf2,table1,model1); 
		table1.addMouseListener(ms); 
		bt.addActionListener(bs); 
		bt1.addActionListener(bs); 	
		setLayout(null);
		setSize(700,620);
        }
}

class ProFrame extends JFrame{
	public ProFrame() throws SQLException{
		super("Product");
		JLabel lb=new JLabel("Product Id :"); 
		JLabel lb1=new JLabel("Product Name :"); 
		JLabel lb4=new JLabel("Product Information"); 	
		JLabel lb2=new JLabel("Unit :");
		JTextField tf2=new JTextField(15); 
		JTextField tf=new JTextField(15); 
		JTextField tf1=new JTextField(15);
		JButton bt=new JButton("Add Pro");
		lb4.setBounds(25,20,400,25); 	
		lb.setBounds(30,90,100,25); 	
		tf.setBounds(30,120,100,25); 
		lb1.setBounds(30,150,100,25); 
		tf1.setBounds(30,180,100,25); 
		lb2.setBounds(30,210,100,25);
		tf2.setBounds(30,240,100,25); 
		bt.setBounds(30,280,100,35); 
		lb4.setForeground(Color.blue); 	
		lb4.setFont(new Font("CURLZ MT", Font.PLAIN, 25));  
		JTable table = new JTable(); 
		Object[] columns={"Product Id","Pro Name","Weight","Unit","Cost"}; 	
		DefaultTableModel model=new DefaultTableModel(); 
		model.setColumnIdentifiers(columns); 	
		table.setModel(model); 	
		table.setRowHeight(20); 
		JScrollPane p=new JScrollPane(table); 
		p.setBounds(160,80,360,260); 	
		add(lb);    
		add(lb2); 	
		add(tf2); 
		add(lb1); 	
		add(tf); 
		add(tf1);
		add(bt); 
		add(p); 
		add(lb4);
		ButtonSensor bs=new ButtonSensor(tf,tf1,tf2,model,table); 
		bt.addActionListener(bs); 
		setLayout(null); 
		setSize(550,400);
	}
}

class UserFrame extends JFrame{
	public UserFrame(){ 	
		super("Change Password"); 
		JLabel lb=new JLabel("Current Password :"); 
		JLabel lb1=new JLabel("New Password :");
		JLabel lb2=new JLabel("Confirm new Password :"); 
		JLabel lb3=new JLabel("Change your log in password:"); 
		JLabel lb4=new JLabel("Password Change Form");
		JPasswordField tf=new JPasswordField(15); 
		JPasswordField tf1=new JPasswordField(15); 	
		JPasswordField tf2=new JPasswordField(15);
		JButton bt=new JButton("Confirm");
		lb3.setForeground(Color.red); 
		lb4.setForeground(Color.blue); 
		lb4.setFont(new Font("CURLZ MT", Font.PLAIN, 20)); 
		lb4.setBounds(25,15,400,25); 
		lb.setBounds(35,90,130,25); 
		tf.setBounds(185,90,160,25); 
		lb1.setBounds(35,120,130,25);
		tf1.setBounds(185,120,160,25); 	
		lb2.setBounds(35,150,150,25);
		tf2.setBounds(185,150,160,25);   
		lb3.setBounds(30,50,250,25); 
		bt.setBounds(260,190,80,25); 
		add(lb); 	
		add(tf); 
		add(lb1);
		add(tf1); 	
		add(tf2);
		add(lb2); 
		add(bt);
		add(lb3); 
		add(lb4); 
		ButtonSensor bs=new ButtonSensor(lb3,tf,tf1,tf2); 
		bt.addActionListener(bs); 
		setLayout(null); 	
		setSize(390,300);
	}
}

class UserMealFrame extends JFrame{	
	public UserMealFrame(){  
		super("User Form"); 	
		JLabel lb=new JLabel("Breakfast :"); 
		JLabel lb1=new JLabel("Lunch :");
		JLabel lb2=new JLabel("Dinner :"); 
		JLabel lb3=new JLabel("Enter Your todays meals & Send Request:");
		JLabel lb4=new JLabel("User Meal Request Form");
		JTextField tf=new JTextField(15); 
		JTextField tf1=new JTextField(15); 
		JTextField tf2=new JTextField(15); 
		JButton bt=new JButton("Send");
		lb3.setForeground(Color.red); 
		lb4.setForeground(Color.blue);
		lb4.setFont(new Font("CURLZ MT", Font.PLAIN, 20)); 
		lb4.setBounds(25,15,400,25);
		lb.setBounds(50,90,100,25); 	
		tf.setBounds(130,90,80,25); 	
		lb1.setBounds(50,120,100,25); 
		tf1.setBounds(130,120,80,25); 	
		lb2.setBounds(50,150,110,25); 
		tf2.setBounds(130,150,80,25); 
		lb3.setBounds(30,50,250,25); 
		bt.setBounds(130,190,80,25); 
		add(lb); 	
		add(tf); 	
		add(lb1); 	
		add(tf1); 
		add(tf2); 
		add(lb2); 	
		add(bt); 	
		add(lb3);
		add(lb4);
		ButtonSensor bs=new ButtonSensor(tf,tf1,tf2);
		bt.addActionListener(bs); 
		setLayout(null); 
		setSize(300,280);
	}
}

class UserMenuFrame extends JFrame{	
	public UserMenuFrame(){
		super("User Form");
		JLabel lb=new JLabel("Breakfast :");
         	JLabel lb1=new JLabel("Lunch :");
         	JLabel lb2=new JLabel("Dinner :");
        	JLabel lb3=new JLabel("Enter Your todays menu choice:");
        	JLabel lb4=new JLabel("User Menu Choice Form");
        	JTextField tf=new JTextField(15);
         	JTextField tf1=new JTextField(15);
		JTextField tf2=new JTextField(15);
          	JButton bt=new JButton("Add Choice");
         	lb3.setForeground(Color.red);
        	lb4.setForeground(Color.blue);
          	lb4.setFont(new Font("CURLZ MT", Font.PLAIN, 20));
          	lb4.setBounds(25,15,400,25);
              	lb.setBounds(50,90,100,25);
         	tf.setBounds(130,90,130,25);
           	lb1.setBounds(50,120,100,25);
          	tf1.setBounds(130,120,130,25);
          	lb2.setBounds(50,150,110,25);
         	tf2.setBounds(130,150,130,25);
         	lb3.setBounds(30,50,250,25); 
             	bt.setBounds(130,190,100,25);
          	add(lb);
           	add(tf);
           	add(lb1);
          	add(tf1);
          	add(tf2);
          	add(lb2);
            	add(bt);
          	add(lb3);
            	add(lb4);
             	ButtonSensor bs=new ButtonSensor(tf,tf1,tf2,lb);
          	bt.addActionListener(bs);
           	setLayout(null);
           	setSize(320,300);
	}
}

class UserInfoFrame extends JFrame{
	public UserInfoFrame(){
          	super("User");
		setSize(400,300);
	}
}

class MessFrame extends JFrame{
	public MessFrame(){
          	super("MessInfo");
           	JLabel lb=new JLabel("Enter Mess Address & Additional Info:");
          	JLabel lb1=new JLabel("Member Bazar Information:");
           	JLabel lb4=new JLabel("Mess Information");
        	JTextField tf=new JTextField(15);
            	JLabel lb2=new JLabel("Bua Bill :");
          	JTextField tf1=new JTextField(10);
           	JButton bt=new JButton("SETINFO");
          	JButton bt1=new JButton("SETBILL");
          	lb4.setBounds(25,20,400,25);
             	lb.setBounds(60,60,250,25);
          	tf.setBounds(60,90,300,30);
          	lb2.setBounds(400,60,100,25);
            	tf1.setBounds(400,90,90,30);
        	lb1.setBounds(60,160,180,25);
          	bt.setBounds(265,130,90,30);
        	bt1.setBounds(400,130,90,30);
          	lb4.setForeground(Color.blue);
          	lb4.setFont(new Font("CURLZ MT", Font.PLAIN, 25));
             	JTable table = new JTable();
         	Object[] columns={"Member Name","Bazar Amount"};
          	DefaultTableModel model=new DefaultTableModel();
         	model.setColumnIdentifiers(columns);
           	table.setModel(model);
          	table.setRowHeight(20);
            	JScrollPane p=new JScrollPane(table);
          	p.setBounds(60,190,300,160);
           	add(lb);
		add(lb1);
         	add(tf);
           	add(bt);
		add(lb2);
           	add(tf1);
         	add(bt1);
         	add(p);
		add(lb4);
        	ButtonSensor bs=new ButtonSensor(tf,tf1,model,table);
          	bt.addActionListener(bs);
          	bt1.addActionListener(bs);
         	setLayout(null);
          	setSize(530,420);
	}
}

class PayFrame extends JFrame{
	public PayFrame() throws SQLException{
        	super("Payment");
        	JLabel lb=new JLabel("Member Name :");
         	JLabel lb1=new JLabel("Amount :");
         	JLabel lb4=new JLabel("Payment Information");
        	JTextField tf=new JTextField(15);
          	JTextField tf1=new JTextField(15);
          	JButton bt=new JButton("Add Balance");
           	JButton bt1=new JButton("Return");
         	lb4.setBounds(25,20,400,25);
        	lb.setBounds(160,50,100,25);
          	tf.setBounds(260,50,120,25);
         	lb1.setBounds(400,50,100,25);
         	tf1.setBounds(470,50,80,25);
        	bt.setBounds(440,85,110,25);
          	bt1.setBounds(320,85,100,25);
        	lb4.setForeground(Color.blue);
         	lb4.setFont(new Font("CURLZ MT", Font.PLAIN, 25));
         	JTable table = new JTable();
          	Object[] columns={"Date","Member Name","Amount","type"};
        	DefaultTableModel model=new DefaultTableModel();
		model.setColumnIdentifiers(columns);
          	table.setModel(model);
        	table.setRowHeight(20);
         	JScrollPane p=new JScrollPane(table);
        	p.setBounds(230,120,340,240);
        	JTable table1 = new JTable();
         	Object[] columns1={"Member Name","Amount Paid"};
         	DefaultTableModel model1=new DefaultTableModel();
        	model1.setColumnIdentifiers(columns1);
        	table1.setModel(model1);
          	table1.setRowHeight(20);
         	JScrollPane p1=new JScrollPane(table1);
          	p1.setBounds(30,120,185,240);
         	add(lb);
          	add(p1);
         	add(lb1);
         	add(tf);
         	add(tf1);
         	add(bt);
         	add(bt1);
          	add(p);
        	add(lb4);
          	ButtonSensor bs=new ButtonSensor(tf,tf1,table,model,table1,model1);
        	MouseSensor3 ms=new MouseSensor3(tf,tf1,model1,table1);
                bt.addActionListener(bs);
        	bt1.addActionListener(bs);
		table1.addMouseListener(ms);
        	setLayout(null);
          	setSize(620,420);
	}
}

class MemberFrame extends JFrame{
	public MemberFrame() throws SQLException{
          	super("Members");
         	JLabel lb=new JLabel("Member Id :");
        	JLabel lb1=new JLabel("Member Name :");
        	JLabel lb2=new JLabel("Contact Number :");
        	JLabel lb3=new JLabel("Address :");
        	JLabel lb4=new JLabel("Member Information");
		JLabel lb5=new JLabel("");
        	JTextField tf=new JTextField(15);
         	JTextField tf1=new JTextField(15);
        	JTextField tf2=new JTextField(15);
        	JTextField tf3=new JTextField(15);
        	JButton bt=new JButton("Add");
        	JButton bt1=new JButton("Delete");
        	JButton bt2=new JButton("Update");
		lb4.setBounds(25,20,400,25);
        	lb.setBounds(30,90,100,25);
          	tf.setBounds(30,120,150,25);
        	lb1.setBounds(30,150,100,25);
          	tf1.setBounds(30,180,150,25);
         	lb2.setBounds(30,210,100,25);
         	tf2.setBounds(30,240,150,25);
         	lb3.setBounds(30,270,100,25);
         	tf3.setBounds(30,300,150,25);
         	bt.setBounds(30,340,90,35);
         	bt1.setBounds(300,340,90,35);
          	bt2.setBounds(200,340,90,35);
		lb5.setBounds(180,400,300,25);
         	lb4.setForeground(Color.blue);
         	lb4.setFont(new Font("CURLZ MT", Font.PLAIN, 25));
          	JTable table = new JTable();
        	Object[] columns={"Member Id","Member Name","Contact Number","Address"};
         	DefaultTableModel model=new DefaultTableModel();
        	model.setColumnIdentifiers(columns);
           	table.setModel(model);
         	table.setRowHeight(20);
         	JScrollPane p=new JScrollPane(table);
          	p.setBounds(200,60,380,270);
         	add(lb);
        	add(lb1);
          	add(lb2);
         	add(lb3);
        	add(tf);
          	add(tf1);
        	add(tf2);
        	add(tf3);
        	add(bt);
         	add(bt1);
        	add(bt2);
          	add(p);
        	add(lb4);
		add(lb5);
         	ButtonSensor bs=new ButtonSensor(lb5,tf,tf1,tf2,tf3,table,model);
         	MouseSensor ms=new MouseSensor(tf,tf1,tf2,tf3,table,model);
         	table.addMouseListener(ms);
         	bt.addActionListener(bs);
        	bt1.addActionListener(bs);
         	bt2.addActionListener(bs);
        	setLayout(null);
          	setSize(620,480);
	}
}

class MainFrame extends JFrame{
	public MainFrame() throws SQLException{
        	super("Mess Mgt Sys");
          	JLabel lb=new JLabel("      Mess Management System");
         	JLabel lb1=new JLabel("Mess Address & Additional Info");
          	JLabel lb2=new JLabel("   MANAGER");
        	JLabel lb3=new JLabel("       USER USE");
        	JLabel lb4=new JLabel("Member Requests");
          	JLabel lb5=new JLabel("Meal Request");
          	JLabel lb6=new JLabel(" Menu ");
          	JLabel lb7=new JLabel("");
		JLabel lb8=new JLabel(new ImageIcon("D:/aiub (1).png"));
                //JLabel lb8=new JLabel(new ImageIcon("D:/2014-10-24-11-54-02_deco.jpg"));
         	JButton bt=new JButton("MEMBER");
        	JButton bt1=new JButton("MEAL");
        	JButton bt2=new JButton("BAZAR");
          	JButton bt3=new JButton("PRODUCT");
         	JButton bt4=new JButton("PAYMENT");
          	JButton bt5=new JButton("MESSINFO");
         	JButton bt6=new JButton("CHANGE PASSWORD");
          	JButton bt7=new JButton("ADD MEAL");
         	JButton bt8=new JButton("MENU CHOICE");
         	JButton bt9=new JButton("CHECK INFO");
         	JButton bt10=new JButton("UPDATE");
          	JButton bt11=new JButton("CHECKED");
                JButton bt12=new JButton("RESETALL");
                JButton bt13=new JButton("REFRESH");
                JButton bt14=new JButton("LOG OUT");
                JPanel jp1=new JPanel();
                JPanel jp2=new JPanel();
                JPanel jp3=new JPanel();
                JPanel jp4=new JPanel();
                JPanel jp5=new JPanel();
                JPanel jp6=new JPanel();
                JPanel jp=new JPanel();
         	lb.setBackground(new Color(60,90,190));
        	lb.setForeground(Color.white);
        	lb2.setBackground(Color.gray);
        	lb2.setForeground(Color.yellow);
          	lb3.setBackground(Color.gray);
        	lb3.setForeground(Color.yellow);
         	lb1.setForeground(new Color(160,50,30));
		lb.setOpaque(true);
          	lb2.setOpaque(true);
        	lb3.setOpaque(true);
         	lb4.setForeground(Color.red);
        	lb6.setForeground(new Color(10,150,30));
        	lb5.setForeground(new Color(10,150,30));
          	lb.setBounds(0,15,1370,40);
        	lb7.setBounds(360,60,998,20);
                lb8.setBounds(130,460,180,180);
                //lb8.setBounds(1050,350,250,250);
        	bt6.setBounds(980,19,170,30);
                bt13.setBounds(880,19,100,30);
                bt14.setBounds(1150,19,100,30);
         	lb1.setBounds(280,650,868,30);
         	lb2.setBounds(170,110,120,30);
        	bt.setBounds(170,150,120,30);
        	bt1.setBounds(170,190,120,30);
        	bt2.setBounds(170,230,120,30);
         	bt3.setBounds(170,270,120,30);
        	bt4.setBounds(170,310,120,30);
        	bt5.setBounds(170,350,120,30);
          	bt11.setBounds(475,290,120,30);
                bt12.setBounds(170,390,120,30);
        	lb3.setBounds(1065,110,135,30);
          	bt7.setBounds(1065,150,135,30);
        	bt8.setBounds(1065,190,135,30);
        	bt9.setBounds(1065,230,135,30);
        	bt10.setBounds(1065,270,135,30);
        	lb4.setBounds(40,265,250,30);
          	lb5.setBounds(40,300,135,30);
          	lb6.setBounds(350,300,135,30);
        	bt.setFocusPainted(false);
          	bt.setOpaque(false);
        	bt.setContentAreaFilled(false);
        	bt1.setFocusPainted(false);
          	bt1.setOpaque(false);
         	bt1.setContentAreaFilled(false);
		bt12.setFocusPainted(false);
        	bt12.setOpaque(false);
         	bt12.setContentAreaFilled(false);
        	bt2.setFocusPainted(false);
        	bt2.setOpaque(false);
        	bt2.setContentAreaFilled(false);
          	bt3.setFocusPainted(false);
        	bt3.setOpaque(false);
          	bt3.setContentAreaFilled(false);
        	bt4.setFocusPainted(false);
          	bt4.setOpaque(false);
        	bt4.setContentAreaFilled(false);
         	bt5.setFocusPainted(false);
         	bt5.setOpaque(false);
          	bt5.setContentAreaFilled(false);
        	bt6.setFocusPainted(false);
         	bt6.setOpaque(false);
        	bt6.setContentAreaFilled(false);
          	bt6.setForeground(Color.green);
                
                bt13.setFocusPainted(false);
         	bt13.setOpaque(false);
        	bt13.setContentAreaFilled(false);
          	bt13.setForeground(Color.yellow);
                
                bt14.setFocusPainted(false);
         	bt14.setOpaque(false);
        	bt14.setContentAreaFilled(false);
          	bt14.setForeground(Color.red);
                
        	bt7.setFocusPainted(false);
         	bt7.setOpaque(false);
        	bt7.setContentAreaFilled(false);
         	bt8.setFocusPainted(false);
        	bt8.setOpaque(false);
        	bt8.setContentAreaFilled(false);
        	bt9.setFocusPainted(false);
        	bt9.setOpaque(false);
        	bt9.setContentAreaFilled(false);
         	bt10.setFocusPainted(false);
         	bt10.setOpaque(false);
        	bt10.setContentAreaFilled(false);
          	bt11.setFocusPainted(false);
        	bt11.setOpaque(false);
         	bt11.setContentAreaFilled(false);
          	bt12.setForeground(Color.red);
		bt11.setForeground(Color.blue);
         	bt.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 17));
          	bt1.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 17));
        	bt2.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 17));
         	bt3.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 17));
        	bt4.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 17));
         	bt5.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 17));
        	bt10.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 17));
        	bt11.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 17));
        	bt7.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 15));
		bt12.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 17));
         	bt8.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 14));
        	bt9.setFont(new Font("GOUDY OLD STYLE", Font.PLAIN, 15));
        	lb2.setFont(new Font("GOUDY OLD STYLE", Font.BOLD, 17));
         	lb3.setFont(new Font("GOUDY OLD STYLE", Font.BOLD, 17));
         	lb4.setFont(new Font("HARRINGTON", Font.PLAIN, 30));
         	lb5.setFont(new Font("GEORGIA", Font.BOLD, 17));
        	lb6.setFont(new Font("GEORGIA", Font.BOLD, 17));
        	lb.setFont(new Font("BRADLEY HAND ITC", Font.PLAIN, 30));
        	lb1.setFont(new Font("GEORGIA", Font.PLAIN, 12));
        	JTable table = new JTable();
        	Object[] columns={"Name","Meal","Bill","Due"};
        	DefaultTableModel model=new DefaultTableModel();
        	model.setColumnIdentifiers(columns);
        	table.setModel(model);
          	table.setRowHeight(20);
        	JScrollPane p=new JScrollPane(table);
        	JTable table1 = new JTable();
          	Object[] columns1={"Total Bazar Cost","Total Meal","Meal Rate","Available Balance"};
        	DefaultTableModel model1=new DefaultTableModel();
        	model1.setColumnIdentifiers(columns1);
        	table1.setModel(model1);
         	table1.setRowHeight(25);
        	JScrollPane p1=new JScrollPane(table1);
        	JTable table2 = new JTable();
        	Object[] columns2={"Name","Breakfast","Lunch","Dinner"};
         	DefaultTableModel model2=new DefaultTableModel();
         	model2.setColumnIdentifiers(columns2);
         	table2.setModel(model2);
        	table2.setRowHeight(20);
          	JScrollPane p2=new JScrollPane(table2);
        	JTable table3 = new JTable();
          	Object[] columns3={"Name","Choice"};
         	DefaultTableModel model3=new DefaultTableModel();
        	model3.setColumnIdentifiers(columns3);
        	table3.setModel(model3);
        	table3.setRowHeight(20);
         	JScrollPane p3=new JScrollPane(table3);
        	p1.setBounds(40,200,560,48);
          	p.setBounds(40,20,560,165);
        	p2.setBounds(40,330,300,150);
         	p3.setBounds(350,330,250,150);
        	add(bt6);
                add(bt13);
                add(bt14);
         	add(bt7);
        	jp.add(p2);
          	jp.add(p3);
        	jp.add(lb4);
        	jp.add(lb5);
           	jp.add(lb6);
        	add(lb1);
        	jp.add(p);
        	jp.add(p1);
          	add(lb);
        	add(bt);
        	add(lb3);
        	add(lb2);
          	add(bt1);
        	add(bt2);
          	add(bt3);
        	add(bt4);
        	add(bt5);
        	add(bt8);
          	add(bt9);
        	add(bt10);
          	jp.add(bt11);
        	add(lb7);
                add(bt12);
		add(lb8);
                
                jp.setBounds(360,100,640,510);
                jp.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
                jp.setBackground(Color.white);
                add(jp);
                jp.setLayout(null);
                jp1.setBounds(355,95,650,520);
                jp1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
                jp1.setBackground(Color.gray);
                add(jp1);
                jp1.setLayout(null);
                jp2.setBounds(350,90,660,530);
                jp2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
                jp2.setBackground(Color.gray);
                add(jp2);
                jp2.setLayout(null);
                
                jp3.setBounds(345,85,670,540);
                jp3.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
                jp3.setBackground(Color.gray);
                add(jp3);
                jp3.setLayout(null);
                jp4.setBounds(360,100,640,510);
                jp4.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
                jp4.setBackground(Color.white);
                add(jp4);
                jp4.setLayout(null);
                jp5.setBounds(360,100,640,510);
                jp5.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
                jp5.setBackground(Color.white);
                add(jp5);
                jp5.setLayout(null);
                jp6.setBounds(360,100,640,510);
                jp6.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
                jp6.setBackground(Color.white);
                add(jp6);
                jp6.setLayout(null);
        	ButtonSensor bs=new ButtonSensor(jp,jp1,lb1,lb7,model,table,model1,table1,model2,table2,model3,table3);
                ButtonSensor1 bs1=new ButtonSensor1(this);
                bt.addActionListener(bs);
        	bt1.addActionListener(bs);
          	bt2.addActionListener(bs);
        	bt3.addActionListener(bs);
         	bt4.addActionListener(bs);
          	bt5.addActionListener(bs);
        	bt6.addActionListener(bs);
          	bt7.addActionListener(bs);
         	bt8.addActionListener(bs);
          	bt9.addActionListener(bs);
        	bt10.addActionListener(bs);
          	bt11.addActionListener(bs);
                bt12.addActionListener(bs);
                bt13.addActionListener(bs1);
                bt14.addActionListener(bs1);
        	setLayout(null);
            	setSize(1370,850);
	}
}

class LoginFrame extends JFrame {
	public LoginFrame(){ 	
		super("Log In");
		JLabel lb=new JLabel("Username :"); 
		lb.setForeground(Color.black); 
		JLabel lb1=new JLabel("Password :"); 
		lb1.setForeground(Color.black); 	
                JLabel lb2=new JLabel("Welcome to Mess Management System"); 	
		JLabel lb3=new JLabel("**Enter valid Username & password"); 
		JLabel lb4=new JLabel(new ImageIcon("D:/member-login.png")); 
		JLabel lb5=new JLabel(new ImageIcon("D:/socolor.jpg")); 
		JTextField tf=new JTextField(15); 	
		JPasswordField pf=new JPasswordField(15); 
		JButton bt=new JButton("Log In");
		lb2.setBounds(50,40,450,20); 
		lb5.setBounds(0,0,520,360); 	
		lb2.setForeground(Color.blue); 
		lb2.setFont(new Font("Chiller", Font.BOLD, 30)); 
		lb.setBounds(280,100,100,20); 	
		lb.setFont(new Font("verdana", Font.BOLD, 15)); 	
		tf.setBounds(280,130,190,25); 	lb1.setBounds(280,160,100,20); 
		lb1.setFont(new Font("verdana", Font.BOLD, 15)); 
		pf.setBounds(280,190,190,25); 
		bt.setBounds(280,230,80,25); 
		lb3.setBounds(260,280,210,20);	
		lb4.setBounds(0,50,280,280); 	
		lb3.setForeground(Color.gray); 
		ButtonSensor bs=new ButtonSensor(this,tf,pf,lb3);
                //ButtonSensor1 bs1=new ButtonSensor1(this);
                addKeyListener(bs);
		add(lb3); 
		add(bt); 	
		add(tf); 
		add(lb); 
		add(pf); 
		add(lb1); 
		add(lb2); 
		add(lb4); 
		add(lb5); 
		bt.addActionListener(bs); 
		setLayout(null); 
		setSize(520,360);
	}
}
         

public class MessMgtMain {
    /**
     * @param args the command line arguments
     */
	public static void main(String[] args){
		LoginFrame lf=new LoginFrame();
		lf.addWindowListener(new WindowSensor());
		lf.setVisible(true);
		lf.setResizable(false);
	}
}
