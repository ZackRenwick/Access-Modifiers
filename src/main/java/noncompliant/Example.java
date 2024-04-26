package main.java.noncompliant;

public class Example {

    //This String here can be accessed outside the class 
    //and modified without using the getters and setters
    //This represents weak encasulation
    public String action;

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    } 


}

