//WAP to test if x is a power of 2
public class prog6 {
	   public static void poweroftwo(){
	     for(int i=1;i<=16;i++){
	      
	       int y=i&(i-1);
	       if(y==0){
	          System.out.println(i+" "+ "1");

       }else{
	         System.out.println(i+" "+ "0");
       }}}
	    
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poweroftwo();
	}

}
//output
// 1 1
// 2 1
// 3 0
// 4 1
// 5 0
// 6 0
// 7 0
// 8 1
// 9 0
// 10 0
// 11 0
// 12 0
// 13 0
// 14 0
// 15 0
// 16 1
