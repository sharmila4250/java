//compute x modulo a power of two
public class prog5 {
	public static int modulopoweroftwo(int x,int y){
	     int z=x^y;
	     return z;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0b1001101;
		 int y=0b1000000;
		  System.out.println(modulopoweroftwo(x,y));
	}

}

//output
//13
