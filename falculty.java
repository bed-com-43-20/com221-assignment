public class falculty extends employee {
private String rank;
private String officeHours;

public falculty(){

}

public falculty(String rank, String officeHours){
    this.rank = rank;
    this.officeHours = officeHours;
}

public String getRank(){
    System.out.println("enter your office Rank");
    this.rank = input.nextLine();
    return rank;
}

    public void setRank(String rank){
    this.rank = rank;
        }

    public String getOfficeHours() {
    System.out.println("enter your office hours");
    this.officeHours = input.nextLine();
    return officeHours;
    }

    public void setOfficeHours() {
    this.officeHours = officeHours;
    }

        public String toString(){
        return super.toString() + " " + "\n Rank; " +getRank()+ "\n Office hours ;" +getOfficeHours();
        }
}