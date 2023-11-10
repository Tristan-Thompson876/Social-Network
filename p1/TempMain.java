package p1;

import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;

import java.util.Scanner;

public class TempMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Creation of a Socials instance
        
        Socials mySocials = new Socials("Social");
//nm
        // Get user input for username and password
        System.out.println("Enter User name(no space)\n" + "________________________");
        String username = scan.next();
        System.out.println("Enter your password");
        String pass = scan.next();

        // Create a user with the provided username and password
        User u1 = new User(username, pass, null);

        // Add the user to the social instance
        mySocials.addNewUser(u1.getUname(), u1.getPassword());

        // Create a post
        Content postContent = new Content("This is a post.");
        u1.addNewPost(PostType.Text, PostAudience.Public, postContent);

        // Display user information(Both are correct)
        System.out.println("User Name: " + u1.getUname());
        //System.out.println("Password for testing: " + u1.getPassword());
        System.out.println("User Count in Socials: " + mySocials.getAllSocialsUsers().size());


    }
}