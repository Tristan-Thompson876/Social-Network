package p1;

import java.util.ArrayList;
import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;

/**
 * Represents a user in the social media platform.
 */
public class User {
    private String uname;
    private String password;
    private PostType postType;
    private ArrayList<String> subscribers = new ArrayList<>();
    private ArrayList<String> subscribed = new ArrayList<>();
    private ArrayList<String> restricted = new ArrayList<>();
    private ArrayList<Post> posts = new ArrayList<>();
    private PostAudience sharedWith;
    private Post post;
    private Content content;

    /**
     * Constructs a new User with a username, password, and an initial post.
     *
     * @param uname Username of the user.
     * @param password Password of the user.
     * @param post An initial post associated with the user.
     */
    public User(String uname, String password, Post post) {
        this.uname = uname;
        this.password = password;
        this.post = post;
    }

    // Getter and Setter methods...

    /**
     * Attempts to log in a user with the provided username and password.
     *
     * @param uname Username for login.
     * @param pword Password for login.
     * @return True if login is successful, false otherwise.
     */
    public boolean login(String uname, String pword) {
        // Logic for login
        return false;
    }

    /**
     * Allows the user to react to a post.
     *
     * @param pstID The ID of the post to react to.
     * @param vote The type of reaction (e.g., upvote, downvote).
     */
    public void reactToPost(String pstID, ReactionType vote) {
        // Logic for reacting to a post
    }

    /**
     * Adds a new post by the user.
     *
     * @param postType The type of the post.
     * @param sharedWith The audience with whom the post is shared.
     * @param content The content of the post.
     */
    public void addNewPost(PostType postType, PostAudience sharedWith, Content content) {
        // Logic for adding a new post
    }

    /**
     * Deletes a post by its ID.
     *
     * @param pstID The ID of the post to delete.
     */
    public void deletePost(int pstID) {
        // Logic for deleting a post
    }

    // Additional methods...

    @Override
    public String toString() {
        return "User{" +
               "uname='" + uname + '\'' +
               ", password='" + password + '\'' +
               ", postType=" + postType +
               ", subscribers=" + subscribers +
               ", subscribed=" + subscribed +
               ", restricted=" + restricted +
               ", posts=" + posts +
               ", sharedWith=" + sharedWith +
               ", post=" + post +
               ", content=" + content +
               '}';
    }
}
