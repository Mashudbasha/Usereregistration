package com.day19;


	import java.util.Scanner;
	public class Useregistration {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String sp=" ";
	        System.out.println("Enter the Username");
	        String username = sc.nextLine();
	        if((username.contains(sp)) || username.length()<4){
	            System.out.println("Invalid Username");
	            return;
	        }

	        System.out.println("Enter the Password");
	        String pass = sc.nextLine();
	        if((pass.contains(sp)) || pass.length()<8){
	            System.out.println("Invalid Password");
	            return;
	        }
	        System.out.println("Enter the mail_id");
	        String mailId = sc.nextLine();
	        if((mailId.contains(sp)) ||mailId.length()<8){
	            System.out.println("Invalid mailId");
	            return;
	        }
	        System.out.println("Enter the mobilenumber");
	        String mbno = sc.nextLine();
	        if((mbno.contains(sp)) ||mbno.length()<10){
	            System.out.println("Invalid mailId");
	            return;
	        }

	        System.out.println(username+" you are Registered Successfully");

	        System.out.println("Enter the Username");
	        String lname = sc.nextLine();
	        System.out.println("Enter the Password");
	        String lpass = sc.nextLine();
	        System.out.println("Enter the mailId");
	        String lmailId = sc.nextLine();
	        System.out.println("Enter the mobilenumber");
	        String lmbno = sc.nextLine();


	        if(username.equals(lname) && pass.equals(lpass)&&mailId.equals(lmailId)&&(mbno.equals(lmbno))){
	            System.out.println("Welcome "+lname+" you have Logged-in Successfully");
	        }
	        else{
	            System.out.println("Username or password Mismatch");
	        }
	    }
	    }
	

