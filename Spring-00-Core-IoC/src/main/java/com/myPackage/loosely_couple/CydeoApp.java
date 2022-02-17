package com.myPackage.loosely_couple;

public class CydeoApp {
    public static void main(String[] args) {


        FullTimeMentor fullTimeMentor = new FullTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTimeMentor);

        mentor.manageAccount();
    }
}