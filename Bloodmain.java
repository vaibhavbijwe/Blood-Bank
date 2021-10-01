import java.util.*;
import java.lang.*;


class Blood
{

public Vector na=new Vector(); //name
public Vector bg=new Vector(); //blood  group
public Vector co=new Vector();  //contact no
public Vector ad=new Vector();  //address
public Vector am=new Vector();  //ammount

public void add()
	{
	
	String name;
	String blood_g;
	int ammount;
	int contact_no;
	String address;
	

	Scanner s=new Scanner(System.in);
	System.out.print("\t\t\t\t\t\tWELCOME");
	System.out.print("\nEnter the details of donor\n\n");
	System.out.print("Name : ");
	name=s.nextLine();
	System.out.print("Blood group: ");
	blood_g=s.nextLine();
	System.out.print("contact no : ");
	contact_no=s.nextInt();
	System.out.print("Address : ");
	address=s.nextLine();
  System.out.print("Enter amouunt of blood : ");
  ammount=s.nextInt();
    
    am.addElement(new Integer(ammount));    //ammount of blood
    na.addElement(name);                      //adding name
    bg.addElement(blood_g);                 //adding blood group
    co.addElement(new Integer(contact_no)); //adding contact no
    ad.addElement(address);
	}
    

    public void display()
    {
     int ch;
     int n=na.size();
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the blood group which you want to search \n 1. Blood group A \n2. Blood group B \n3. Blood group AB \n4.Blood group O\n");
     ch=s.nextInt();
     
     switch(ch)
       {

                  case 1:
                   {
                    
                     int final_ammount=0;             //final blood ammount
                     String check;
                   	 for(int i=0;i<n;i++)
                   	    {
                        check=String.valueOf(bg.elementAt(i));
                          if(check.equals("A") || check.equals("a"))
                          {
                          final_ammount=final_ammount + (Integer.parseInt(String.valueOf(am.elementAt(i))));
                          } 
                        }
                       break;
                   }
        
                  case 2:	
					       {
                    
                     int final_ammount=0;             //final blood ammount
                     String check;
                     for(int i=0;i<n;i++)
                        {
                        check=String.valueOf(bg.elementAt(i));
                          if(check.equals("B") || check.equals("b"))
                          {
                          final_ammount=final_ammount + (Integer.parseInt(String.valueOf(am.elementAt(i))));
                          } 
                        }
                       break;
                   }                  

                  case 3:
                  {
                    
                    int final_ammount=0;             //final blood ammount
                     String check;
                     for(int i=0;i<n;i++)
                        {
                        check=String.valueOf(bg.elementAt(i));
                          if(check.equals("AB") || check.equals("ab"))
                          {
                          final_ammount=final_ammount + (Integer.parseInt(String.valueOf(am.elementAt(i))));
                          } 
                        }
                       break;
                   }

                   case 4:
                  {
                    
                     int final_ammount=0;             //final blood ammount
                     String check;
                     for(int i=0;i<n;i++)
                        {
                        check=String.valueOf(bg.elementAt(i));
                          if(check.equals("O") || check.equals("o"))
                          {
                          final_ammount=final_ammount + (Integer.parseInt(String.valueOf(am.elementAt(i))));
                          } 
                        }
                       break;
                   }
                  
        }
    } 
}


class 
public static void main(String args[])
{
  System.out.print("********************************************************************************************************************");
  System.out.print("\n\t\t\t\t\tWelcome to Blood bank\n");
  System.out.print("********************************************************************************************************************");
  System.out.print("\n\n\nChoose your option \n1.Adding\n2.dispaly\n3.Exit");
  add();
}







