package com.myPackage.loosely_couple;

public class MentorAccount {
    Mentor mentor;

    public MentorAccount(Mentor mentor) {
        this.mentor = mentor;
    }

    public void manageAccount(){
        this.mentor.createAccount();}
}
