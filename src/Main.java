
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //C= n!/(r!*(n-r)!) combination of the formula

        int n, nFac=1, rFac=1, nrFac=1, C,r;

        //nFac =n! , rFac=r!, nrFac=(n-r)!

        Scanner scan = new Scanner(System.in);
        System.out.print("Factorial number n : ");
        n= scan.nextInt();
        System.out.println("Enter the number of elements r : ");
        r=scan.nextInt();

        for (int i =1; i<= n ; i++) {

            nFac *= i;
        }
        for (int i=1; i<= r ; i++){
            rFac *=i;
        }
        for (int i=1; i<= (n-r) ; i++){
            nrFac = i;
        }

        C =nFac / (rFac * (nrFac));
        System.out.println("C(n,r) combination : " + C);
    }
}
