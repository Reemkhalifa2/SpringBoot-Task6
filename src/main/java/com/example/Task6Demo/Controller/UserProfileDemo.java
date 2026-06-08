package com.example.Task6Demo.Controller;

import com.example.Task6Demo.Entity.UserProfile;

public class UserProfileDemo {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile(1001,"0712345678","Address: Muscat, Oman");
        System.out.println("ID: "+userProfile.getUserId());
        System.out.println("Phone Number: "+userProfile.getPhoneNumber());
        System.out.println("Address: "+userProfile.getAddress());
        System.out.println();
        userProfile.setPhoneNumber("0798765432");
        userProfile.setAddress("Ruwi, Muscat ");
        System.out.println("Phone Number changed to: "+userProfile.getPhoneNumber());
        System.out.println("Address changed to: "+userProfile.getAddress());

    }
}
