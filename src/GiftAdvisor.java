import java.util.Scanner;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class GiftAdvisor {
	
	static JTable GiftTable;
	private static Scanner sc;
	private static int gender;
	private static int age;
	private static int price;
	
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		creategifttable();
		
		while(1>0)
		{
		System.out.println("Please enter your gender: (1 for Female, 2 for Male)");
		System.out.println("Press -1 for no idea");
		
		gender=sc.nextInt();
		
		if(gender==-1)
		{
			System.out.println("Please give him or her a gift certificate");
			break;
		}
		
		System.out.println("Please enter your Age: ( 1 for Adult, 2 for Teen, and 3 for Child)");
		age=sc.nextInt();
		
		System.out.println("Please enter your price: ( 1 for High, 2 for Medium and 3 for Low)");
		price=sc.nextInt();
		
		System.out.println("Your gift advise is:");
		
		advisor( gender, age,  price);
		}
		
		
	}
	
	
	public static void creategifttable()
	{
		
		//Create columns names
		
		String columnNames[]={"Gift", "Gender", "Age","Price"};
		
	    //Create some data
		
		String dataValues[][]=
			{
					{"Jewelry", "Female", "Adult","High"},
					{"Weekend Gataway", "Female", "Adult","High"},
					{"Wine", "Female", "Adult","High"},
					{"Selfie Stick", "Female", "Teen","Low"},
					{"Purfume", "Female", "Adult","Medium"},
					{"Sweater", "Female", "Child","Medium"},
					{"Hello Kitty", "Female", "Child","High"},
					{"Doll", "Female", "Child","Low"},
					{"Scarf", "Female", "Adult","Low"},
					{"Smartphone case", "Female", "Teen","Medium"},
					{"Bicycle", "Female", "Teen","High"},
					{"Smart TV", "Male", "Adult","High"},
					{"Apple Watch", "Male", "Adult","High"},
					{"Books", "Male", "Teen","Low"},
					{"Shoes", "Male", "Child","Low"},
					{"Guitar", "Male", "Teen","Medium"},
					{"Playstation", "Male", "Teen","High"},
					{"Captain America Toy", "Male", "Child","Medium"},
					{"Sports shoes", "Male", "Child","High"}
					
			};
		
		// Create a new table instance
		
		GiftTable=new JTable(new DefaultTableModel(dataValues, columnNames));
			
	}
	
	public static void advisor(int gender,int age, int price)
	{
		for(int i=0; i<=GiftTable.getRowCount()-1;i++)
		{
			if(GiftTable.getValueAt(i, 1)=="Female"&& gender==1)
			{
				if(GiftTable.getValueAt(i, 2)=="Adult" && age==1)
				{
					if(GiftTable.getValueAt(i, 3)=="High" && price==1)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Medium" && price==2)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Low" && price==3)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
						
				}
				else if(GiftTable.getValueAt(i, 2)=="Teen" && age==2)
				{
					if(GiftTable.getValueAt(i, 3)=="High" && price==1)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Medium" && price==2)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Low" && price==3)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
						
				}
				else if(GiftTable.getValueAt(i, 2)=="Child" && age==3)
				{
					if(GiftTable.getValueAt(i, 3)=="High" && price==1)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Medium" && price==2)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Low" && price==3)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
						
				}

			}
			else if(GiftTable.getValueAt(i, 1)=="Male"&& gender==2)
			{
				if(GiftTable.getValueAt(i, 2)=="Adult" && age==1)
				{
					if(GiftTable.getValueAt(i, 3)=="High" && price==1)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Medium" && price==2)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Low" && price==3)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
						
				}
				else if(GiftTable.getValueAt(i, 2)=="Teen" && age==2)
				{
					if(GiftTable.getValueAt(i, 3)=="High" && price==1)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Medium" && price==2)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Low" && price==3)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
						
				}
				else if(GiftTable.getValueAt(i, 2)=="Child" && age==3)
				{
					if(GiftTable.getValueAt(i, 3)=="High" && price==1)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Medium" && price==2)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
					else if(GiftTable.getValueAt(i, 3)=="Low" && price==3)
					{
						System.out.println(GiftTable.getValueAt(i, 0));
					}
						
				}

			}
			
		}
	}
	
	
	


}
