//WAP to right propagate the rightmost set bit in x
public class prog4 {
	public static int rightpropagate(int x){
	   x=x|(x-1);
	   return x;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=0b01010000;
		 System.out.println(Integer.toBinaryString(rightpropagate(x)));
	}


}
//output
//1011111
