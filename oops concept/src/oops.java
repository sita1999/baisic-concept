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
	abc dbc=new abc("vfgfgf",78);
	abc efg=new abc("www" ,45);
	abc igh=new abc("vvv",56);
dbc.display();
	efg.display();
	igh.display();
}
}
