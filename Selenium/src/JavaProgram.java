import java.util.Scanner;

public class JavaProgram {

	public JavaProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
    {
        int x,y,a=0,n;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        y=n;
        while(y>0) {
        	
        	x= y% 10;
        	a=a*10+x;
        	n= n/10;
        	
        			
        }
        
    }
}
