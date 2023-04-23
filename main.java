import java.util.Scanner;
public class main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

            student student1 = new student();
            employee employee1 = new employee();
            person person1 = new person();

            falculty falculty1 = new falculty();
            staff staff1 = new staff();

            // falculty1.getRank();           

        System.out.println("select your category \n 1. Student \n 2. Employee");

        int select = input.nextInt();

        if (select == 1){
        System.out.println(student1.toString());
        }

        else if (select == 2){
            System.out.println("select your working area \n 1. Falculty \n 2. Staff");
            int select2 = input.nextInt();
            if (select2==1){
            System.out.println(falculty1.toString());
            }
            else if (select2 == 2){
                System.out.println(staff1.toString());
            }
            else{
                System.out.println("wrong input");
            }
        }

        else {
        System.out.println("Wrong input");
             }

        
    }

}