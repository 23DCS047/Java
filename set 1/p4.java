import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	float expanse[] =new float[30];
	float sum=0;
	
	for(int i=1;i<30;i++){
	System.out.print("Enter the expanse of  day " +i +" : "); 
	expanse[i]= sc.nextFloat();
	sum=sum+expanse[i];
	
	}
	System.out.println("your total expanse is : " +sum);
}
}
