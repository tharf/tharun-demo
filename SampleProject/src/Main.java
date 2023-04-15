import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int i, j,k, row = 6;

        for(i=0;i<row;i++)
        {
            for(j=(row-i);j>=0;j--)
            {
                System.out.print(" ");
            }

            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}