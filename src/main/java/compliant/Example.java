package main.java.compliant;

public class Example {


    //This String here can't be accessed outside the class 
    //and is unable to be modified without using the getters and setters
    //This represents strong encasulation
    private String action;

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    } 


}
