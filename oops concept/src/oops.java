import java.util.Scanner;

class abc{
String name;
int num;
abc(String y,int z){
	name=y;
	num=z;	
}
void display()
{
	System.out.println(name + " " +num);
}
}
public class oops {
public static void main(String[] args) {
	Scanner input=new Scanner( System.in);
	System.out.println("Enter String ");
	String name=input.nextLine();
	System.out.println("Enter Int ");
	int n=input.nextInt();

	abc dbc=new abc(name,n);
	System.out.println("Enter String ");
	name=input.nextLine();
	System.out.println("Enter int ");
	n=input.nextInt();
	abc efg=new abc(name ,n);
	abc igh=new abc(name,n);
dbc.display();
	efg.display();
	igh.display();
}
}
