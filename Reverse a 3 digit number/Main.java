 import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
        Scanner in = new Scanner(System.in);

    int n1= in .nextInt();
    int n2,n3=0;
    n2=n1;
    n3=n1;
    n1=n1/100;
    n2=(n2/10)%10;
    n3=n3%10;
    int reverse=n3*100+n2*10+n1;

  System.out.println(+reverse);
    
    
  
    //Type your code here
  }
}