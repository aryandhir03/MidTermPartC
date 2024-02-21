/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
/**
 *
 * @author dhira
 */
public class TestUserprofile {
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Available genres: ");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"}; 
        for (String genre : genres) {
            System.out.println(genre);
        }
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        
        System.out.print("Enter your favorite genre: ");
        String userGenre = sc.nextLine();
        
        UserProfile userProfile = new UserProfile(userName, userGenre);
        
        System.out.println("Profile created for: "); 
        System.out.println("UserID: " + userProfile.getUserID());
        System.out.println("Genre: " + userProfile.getGenre());
        
        sc.close();
    }
}
