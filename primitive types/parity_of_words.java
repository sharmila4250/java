//WAP for computing the parity of a word
public class prog7 {
	public static int parityofword(int x){
	    int res=0;
	    while(x!=0){
	      res=res^(x&1);
	      x=x>>1;
	    }
	    return res;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0b1011;
		System.out.println(parityofword(x));
	}

}

//output
//1
