import java.util.Scanner;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GiftAdvisor {
	
	static JTable GiftTable;
	private static Scanner sc;
	private static String gender;
	private static String age;
	private static String price;
	
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);

		
		while(1>0)
		{
		System.out.println("Please enter your gender: (Female, Male)");
		System.out.println("Press -1 for no idea");
		
		gender=sc.next();
		
		if(gender.equals("-1"))
		{
			System.out.println("Please give him or her a gift certificate");
			break;
		}
		
		System.out.println("Please enter your Age: ( Adult, Teen, and  Child)");
		age=sc.next();
		
		System.out.println("Please enter your price: (High, Medium and Low)");
		price=sc.next();
		
		System.out.println("Your gift advise is:");
		
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
		
		for(int i=0;i<=dataValues.length-1;i++)
		{
			if(dataValues[i][1].equals(gender)&&dataValues[i][2].equals(age)&&dataValues[i][3].equals(price))
			{
				System.out.println(dataValues[i][0]);
			}
		}
		
		
		}
		
		
	}
	
	
}