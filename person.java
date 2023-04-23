
import java.util.Scanner;
public class person {
    private String name;
    private String address;
    private int phoneNumber;
    private String emailAddress;

Scanner input = new Scanner(System.in);

    public person(){

    }

    public person(String name, String address, int phoneNumber, String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName(){
            System.out.println("Enter your name;");
            this.name = input.nextLine();
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
    System.out.println("Enter your address;");
    this.address = input.nextLine();
        return address;
    }

    public void setAddress( String address){
        this.address = address;
    }

    public int getPhoneNumber(){
    System.out.println("enter your phone number");
    this.phoneNumber = input.nextInt();
        return phoneNumber;
    }

    public void setPhoneNumber( int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

        public String getEmailAddress(){
        System.out.println("enter your email address;");
        this.emailAddress = input.nextLine();
        return emailAddress;
    }

    public void setEmailAddress( String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String toString(){
        return "Name; " +getName()+ "\n Address; " +getAddress()+ "\n Phone Number; " +getPhoneNumber()+ "\n Email address; " +getEmailAddress();
    }

}