import java.util.*;
class looping {
public static void main(String []args) {
Scanner sc=new Scanner(System.in);
int i,j;
System.out.print("Enter your number:");
int n=sc.nextInt();
for(i=0;i<n;i++) {
for(j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
}
}