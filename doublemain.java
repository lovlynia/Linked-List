package assignment1;

import java.util.Scanner;

public class doublemain {

    public static void main(String[] args) 
    {
        doublelist list= new doublelist();

        Scanner scan=new Scanner(System.in);

        while(true)
        {

        System.out.println("\n1. Enter New Score \n2. Remove\n3.exit\n");

        System.out.print("1 or 2 or 3: ");
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
                
            }
            if(input==2){
                System.out.println("Removing Student at Index: ");
                int index=scan.nextInt();
                scan.nextLine();
                list.remove(index);
                list.print();
            }
            if(input==3){
                break;
            }
        }
                
 
    }


}
