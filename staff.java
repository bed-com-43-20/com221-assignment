public class staff extends employee {
    private String title;

    public staff(){

    }
    
    public staff(String title){
        this.title = title;
    }

    public String getTitle(){
        System.out.println("enter your title");
        this.title = input.nextLine();
        return title;
    }

    public void setTitle(){
        this.title = title;
    }

        public String toString(){ 
        return super.toString() + " " + "\n Title; " +getTitle();
        }
}