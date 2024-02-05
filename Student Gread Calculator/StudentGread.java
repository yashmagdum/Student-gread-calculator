import jdk.jfr.Percentage;

import java.util.Scanner;

public class StudentGread {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Welcome To The Student Gread Calculator....");
        System.out.println("Enter Your Marks");
        int eng =0; int mar =0; int geo =0; int his=0; int maths =0;
        do{
            System.out.println("Enter Marks Of English -");
            eng =obj.nextInt();
        }while (eng < 0 || eng > 100);
        do{
            System.out.println("Enter Marks Of Marathi -");
            mar =obj.nextInt();
        }while (mar < 0 || mar > 100);
        do{
            System.out.println("Enter Marks Of Geology -");
            geo =obj.nextInt();
        }while (geo < 0 || geo > 100);
        do{
            System.out.println("Enter Marks Of History -");
            his =obj.nextInt();
        }while (his < 0 || his > 100);
        do{
            System.out.println("Enter Marks Of Maths -");
            maths =obj.nextInt();
        }while (maths < 0 || maths > 100);

        System.out.println("");
        //Sum
        int Total = eng+mar+geo+his+maths;
        System.out.println("The Total Marks Is " +Total);
        System.out.println("");
        //Average
        long Avg = Total/5;
        System.out.println("The Average Marks is " +Avg);
        System.out.println("");
        //Percentage
        double per = ((double) Total/500)*100;
        System.out.println("The Percentage is "+per);
        System.out.println("");


       System.out.println("Congrats You Get" );
       System.out.println(Total+ "Total Marks");
        System.out.println(Avg+ "Total Average");
        System.out.println(per+ "Total Percentage");
        char gread = calgread(Avg);
        System.out.println("Gread As Your Feed  " + gread);

    }
        private static char calgread(long Total){
        if(Total == 100 || Total >86){
            return 'A';
        } else if (Total <=86 || Total >=70) {
            return 'B';
        } else if (Total<=69 || Total >=50) {
            return 'C';
        } else if ( Total<=49  || Total>=35 ) {
            return 'D';
        }
        else {
            return 'F';
        }
        }
}
