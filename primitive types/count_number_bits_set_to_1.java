package semester4;
//WAP to count the number of bits set to 1
class prog3 {
	//approach 1
public static int CountOnes1(int x){
  int numOnes=0;
  int count=0;
  while(x!=0){
   
    int y=x&~(x-1);
    x=x^y;
    count++;
  }
  return count;
}
//approach 2
public static int CountOnes2(int x){
  int numOnes=0;
  int count=0;
  while(x!=0){
  
    int y=x&~(x-1);
    x=x^y;
    count++;
  }
  
  return count;
}
//approach 3
public static int CountOnes3(int x){
  int count=0;
  while(x!=0){
    x=x&(x-1);
    count++;
  }
return count;
}
public static void main(String[] args) {
int x=0b1010;
System.out.println("using first approach "+CountOnes1(x));
System.out.println("using second approach "+CountOnes2(x));
System.out.println("using third approach "+CountOnes3(x));

}}

//output
// using first approach 2
// using second approach 2
// using third approach 2

