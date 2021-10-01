import java.util.*;

class BloodBank
{
	public static Vector v = new Vector();
	

	public static void main(String args[])
	{
		int ch = 0;
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println("\n\nBlood Bank Options");
			System.out.println("--------------------------------------------------");
			System.out.println("\n1] Add new Blood Group:");
			System.out.println("2] Update  Blood Group:");
			System.out.println("3] View Blood Groups");
			System.out.println("4] Remove   BLood Groups:");
			System.out.println("5] Clear Blood Broups:");
			System.out.println("6] Exit:\n");
			System.out.println("--------------------------------------------------");
			System.out.print("Enter Your Choice: ");
			
			ch = s.nextInt();
			switch(ch)
				{
				case 1: 
					System.out.println("\n--------------------------------------------------");
					System.out.println("Enter Donars Details:");
					System.out.println("--------------------------------------------------");
					System.out.print("Enter Name: ");
					String Name = s.next();
					System.out.print("Enter ID no: ");
					String id_of_donar = s.next();
	               	System.out.print("Enter Blood Groups: ");
					String blood_g = s.next();
					System.out.print("Enter Ammount of Blood Donates: ");
					String ammount = s.next();
					v.addElement(new Groups(Name.toString(),id_of_donar, blood_g, ammount));
					System.out.println("\nDonar Details Added Successfully!!\n");
					
					break;
				case 2: 
					viewDonarInBloodBank();
					System.out.println("\n--------------------------------------------------");
					System.out.print("Enter Donar No  To update: ");
					try
					{
						int temp_ch = s.nextInt();
						((Groups)v.elementAt((temp_ch-1))).updateBloodGroup();				
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println("------------------Invalid choice-------------------");
					}
					break;
				case 3:
					viewDonarInBloodBank();
					break;
				case 4:
					viewDonarInBloodBank();
					System.out.println("--------------------------------------------------");
					System.out.print("\nEnter Donar Id  Number To Remove: ");
					try
					{
						int temp_ch = s.nextInt();
						v.removeElementAt((temp_ch-1));
						System.out.println("Donar Removed Successfully!!");
						System.out.println("--------------------------------------------------");	
					}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println("------------------Invalid choice-------------------");
					}
					break;
				case 5:
					v.clear();
					System.out.println("--------------------------------------------------");
					System.out.println("All Details Removed!!");
					System.out.println("--------------------------------------------------");
					break;
				case 6:
					v.clear();
					System.out.println("--------------------------------------------------");
					System.out.println("Exit");
					System.out.println("--------------------------------------------------");
					break;
			}	
			
		}while(ch!=6);
		
	}
	static public void viewDonarInBloodBank()
	{
		System.out.println("\n--------------------------------------------------");
		System.out.println("Donars Details In Blood Bank:");
		System.out.println("--------------------------------------------------");
		if(v.size()==0)
		{
			System.out.println("\nNo Details present in Bank..");
		}
		else
		{
			for(int i = 0 ; i < v.size() ; i++)
			{
				Groups temp_p = (Groups)v.elementAt(i);
				{
					System.out.println("\n\nDonar --------"+(i+1)+"--------");
					temp_p.showInfo();
				}
			}
			System.out.println("--------------------------------------------------");
		}
		
	}
}