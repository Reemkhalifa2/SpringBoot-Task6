package com.example.Task6Demo;

public class UpdateEmailDemo {
    public static void main(String[] args) {
        updateEmail();
    }

    public static void updateEmail(){
        String email = "ahmed@gmail.com";
        String updatedEmail = "ahmed@gmail.com";
        Boolean status = false;

        if(!email.equalsIgnoreCase(updatedEmail)){
            System.out.println("Original Email: "+email);
            email = updatedEmail;
            status = true;
            System.out.println("Email updated successfully");
            System.out.println("Updated Email: "+email);
            System.out.println("Update Status:: "+status);
        }else{
            System.out.println("Original Email: "+email);
            System.out.println("No update required. Email address is already current");
            System.out.println("Updated Email: "+email);
            System.out.println("Update Status:: "+status);
        }

    }
}
