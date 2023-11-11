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

        
        
        User u1 = new User(username, pass, null);
        mySocials.addNewUser(u1.getUname(), u1.getPassword());

        Content postContent = new Content("This is a post.");
        u1.addNewPost(PostType.Text, PostAudience.Public, postContent);

        System.out.println("User Name: " + u1.getUname());

        System.out.println("Password for testing: " + u1.getPassword());//only for testing purposes would not display a users password
        System.out.println("User Count in Socials: " + mySocials.getAllSocialsUsers().size());
        
        mySocials.addNewUser(u1.getUname(), u1.getPassword());
    
       
        PostType type = null;
        System.out.println("Post Type:/n option 1: Text/n option 2: external link");
        //break;
        int option = scan.nextInt();
        //PostType type;
        switch (option) {
            case 1:
                System.out.println("post type selected : text");
                type = PostType.Text;
                break;
            case 2:
                System.out.println("post type selected : link");
                type = PostType.ExternalLink;
                break;
            } 
        PostAudience aud = PostAudience.Public;
        System.out.println("Post audience: (Private: pt/n/Public: pc/n/Subscribers: subs/n)");
        String noption = scan.next();
        

        switch (noption) {
            case "pt ":
                System.out.println("audience selected : text");
                aud = PostAudience.Private;
                break;
            case "pc":
                System.out.println("audience selected : public");
                aud = PostAudience.Public;
                break;
            case "subs":
                System.out.println("audience selected : subscribers only");
                aud = PostAudience.Subscribers;
                break;
            }

        System.out.println("Enter Post content");
        String dat = scan.next();
        Content content = new Content(dat);
        //create a post
        System.out.println("Post Type: " + type.toString());
        System.out.println("Post Audience: " + aud.toString());
        System.out.println("Content: " + content);
        u1.addNewPost(type, aud, postContent);
        
        
        Reaction react = null;
        String coption = scan.next();

        switch (coption) {
            case "y":
                System.out.println("upvote");
                react = new Reaction(ReactionType.Upvote);
                break;
            case "n":
                System.out.println("downvote");
                react = new Reaction(ReactionType.Downvote);
                break;}
        u1.reactToPost(dat, react.getType());;
    
    }
}