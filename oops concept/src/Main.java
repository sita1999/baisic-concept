import java.util.Scanner;
public class Main{
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		Account sa[]= new Account[100];
		int Choice, count =0;
		while(true) {
			System.out.println("MENU");
			System.out.println("1.CREATE ACCOUNT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.print("5.SORTING");
		System.out.println("6.EXIT");
			System.out.print("Enter your choice:");
			Choice =sc.nextInt();
			switch (Choice) {
			case 1:
			sa[count]= new Account();
			sa[count].open_account();
			count++;
			break;
			case 2:
			for(int i=0;i<count; i++)
				sa[i].display();
			break;
			case 3:
				System.out.println("enter the name");
				String na=sc1.nextLine();
				int f=0;
				for(int i=0;i<count; i++) {
					if(sa[i].search(na)) {
						f=1;
					}
					}
				
				if(f==0)
					System.out.println("result not found");
				else
					System.out.println("result found");
			break;
			case 4:
				System.out.println("enter the name");
				String n1=sc1.nextLine();
				int f1=0;
				for(int i=0;i<count; i++) {
					if(sa[i].delete(n1)) {
						for(int j=i;j<count-1;j++)
							sa[j]=sa[j+1];
						sa[count-1]=null;
						count--;
						f1=1;
						break;
				}
				}
				if(f1==0)
					System.out.println("result not found");
				else
					System.out.println("result found");
				
			break;
			case 5:
				System.out.println("sorting");
				String temp;
				for(int i=0;i<count;i++) {
					for(int j=i+1; j<count;j++)
					{
						if(sa[i].holder_name.compareTo(sa[j].holder_name)>0)
						{
							temp=sa[i].holder_name;
						
							sa[i].holder_name=sa[j].holder_name;
							sa[j].holder_name=temp;
						}
						}					
				}
				System.out.print("names is sorted order:");
			break;
				
				case 6:
			System.out.println("bye");
			System.exit(0);
			default:
				}
			}
	}
}
class Account{
	String holder_name;
	Double balance;
	Scanner sc =new Scanner(System.in);
	void open_account() {
		System.out.print("enter holder name");
		holder_name =sc.nextLine();
		System.out.print("balance");
		balance = sc.nextDouble();
		}
	void display() {
		System.out.println(holder_name+"    "+balance);
		
	}
	boolean search(String n) {
		if(n.equalsIgnoreCase(holder_name)) {
			display();
			return true;
		}
		return false;
	}
	boolean delete(String b) {
		if(b.equalsIgnoreCase(holder_name)) {
			return true;
		}else {
			return false;
			


		}
	}
	
}