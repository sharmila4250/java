package pack3;
class employeeDetails            //class employeeDetails is created
{
	public String name;      //name is an identifier returning string which is accesed everywhere
	public int age;          //age is an identifier returning int which is accessed everywhere
	public String city;      //city is an identifier returning string which is accesed everywhere
	public void display(String s,int a,String c)//function not returning anything and accesed everywhere
	{
		System.out.println("The name is "+s); //system is a class having a property out and a function println. this line display the output.
		System.out.println("Age of "+s+" is "+a);
		System.out.println(s+" lives in "+c);
	}
}

public class employee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeeDetails e=new employeeDetails();       //e object of employee class is created
		e.display("Shrishti", 22, "Odisha");           //function is called
		employeeDetails e1=new employeeDetails();     //e1 object of employee class is created
		e1.display("Shuwani",20,"Odisha");           //function is called
	}}


