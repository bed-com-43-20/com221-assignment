// import java.util.Scanner;
public class student extends person{
    private String Status;

    public student(){

    }
    public student(String Status){
        this.Status = Status;
    }


    public String getStatus(){
        System.out.println("please select your status \n 1. Freshmans \n 2. Sophomore \n 3. Junior \n 4. Senior");
        int Select = input.nextInt();

        if (Select == 1)
            this.Status = "Freshmans";

            else if (Select == 2)
            this.Status = "Sophomore";

            else if (Select == 3)
            this.Status = "Junior";

            else if (Select == 4)
            this.Status = "Senior";

            else
            System.out.println("Wrong input");

        return Status;
    }

    public void setStatus(String Status){
        this.Status = Status;
    }

    public String toString(){
        return super.toString() + "\n Student status; " +getStatus();
    }
}