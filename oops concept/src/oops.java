class abc{
String name;
int num;
void putdata(String str,int a) {
name=str;
num=a;	
}
void display()
{
	System.out.println(name + " " +num);
}
}
public class oops {
public static void main(String[] args) {
	abc dbc=new abc();
	abc efg=new abc();
	abc igh=new abc();
dbc.putdata("asus",4);
efg.putdata("sita" ,5);
igh.putdata("saloni", 6);
dbc.display();
	efg.display();
	igh.display();
}

}
