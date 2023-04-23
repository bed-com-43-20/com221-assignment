// import java.util.Scanner;
public class employee extends person {
    private String office;
    private Float salary;
    private java.util.Date hiredDate;

    public employee(){

    }
    public employee(String office, Float salary){
        this.office = office;
        this.salary = salary;
        // this.date = date;
    }

    public String getOffice(){
        System.out.println("enter your office");
        this.office = input.nextLine();
        return office;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public Float getSalary(){
        System.out.println("enter your salary");
        this.salary = input.nextFloat();
        return salary;
    }

    public void setSalary(){
        this.salary = salary;
    }
   
     public java.util.Date getHiredDate() {
    return hiredDate;
    }


    public String toString(){
        return super.toString() + " " + "\n Office; " +getOffice()+ "\n Salary; " +getSalary()+ "\n Hired Date; " +hiredDate;
        }
}