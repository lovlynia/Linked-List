package assignment1;

import java.util.Scanner;

public class singlemain {

    public static void main(String[] args) 
    {
        singlelist list= new singlelist();

        Scanner scan=new Scanner(System.in);

        while(true)
        {

        System.out.println("\n1. Enter New Score \n2. Exit\n");

        System.out.print("1 or 2: ");
        int input= scan.nextInt();
        scan.nextLine();

            if(input==1){
                System.out.println("enter name: ");
                String name = scan.nextLine();

                System.out.println("enter score:");
                int num=scan.nextInt();

                System.out.println();
        

                list.add(num,name);

                list.print();
                System.out.println();
            }
            if(input==2){
                break;
            }
        }
                
 
    }
    
}
