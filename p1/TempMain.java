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
        System.out.println("Enter your password\n" + "________________________");
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

    
        
        System.out.println("Post Type:/n option 1: Text/n option 2: external link");
        //break;
        int option = scan.nextInt();
        switch (option) {
            case 1:
                System.out.println("post type selected : text");
                type = "Text";
                break;
            case 2:
                System.out.println("post type selected : link");
                type = "link";
                break;
    
        System.out.println("Post audience: (Private: pt/n/Public: pc/n/Subscribers: subs/n)");
        String noption = scan.next();
        switch (noption) {
            case "pt":
                System.out.println("audience selected : text");
                aud = "Private";

                break;
            case "pc":
                System.out.println("audience selected : link");
                aud = "Public";
                break;
            case "subs":
                System.out.println("audience selected : link");
                aud = "Subscribers";
                break;
                    

        //create a post
        System.out.println("Enter Post type\n" + "________________________");
         type = scan.next();
        System.out.println("Enter your password\n" + "________________________");
        PostAudience = scan.next();
        u1.addNewPost(type, null, postContent);

    }
}