package p1;

import java.util.ArrayList;
import p1.enums.FeedAlgorithm;

/**
 * Represents the social media platform. This class manages posts and users.
 */
public class Socials {

    // Immutable instance data: the name of the social media platform
    private String name;

    // Mutable instance data: the sorting algorithm for feeds and lists of posts and users
    private FeedAlgorithm feedSort;
    private ArrayList<Post> posts = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    /**
     * Constructs a new Socials instance with a given name.
     * The feed sorting algorithm is set to 'Popular' by default.
     *
     * @param name The name of the social media platform.
     */
    public Socials(String name) {
        this.name = name;
        this.feedSort = FeedAlgorithm.Popular;
    }

    /**
     * Constructs a new Socials instance with a given name and feed sorting algorithm.
     *
     * @param name The name of the social media platform.
     * @param feedSort The feed sorting algorithm.
     */
    public Socials(String name, FeedAlgorithm feedSort) {
        this.name = name;
        this.feedSort = feedSort;
    }

    /**
     * Adds a new post to the social media platform.
     *
     * @param post The post to be added.
     */
    public void addNewSocialsPost(Post post) {
        posts.add(post);
    }

    /**
     * Removes a post from the social media platform by its ID.
     *
     * @param pstID The ID of the post to be removed.
     */
    public void removeSocialsPost(int pstID) {
        posts.removeIf(post -> post.getPostId() == pstID);
    }

    /**
     * Searches for a post by its ID.
     *
     * @param pstID The ID of the post to search for.
     * @return True if the post exists, false otherwise.
     */
    public boolean searchForSocialsPost(int pstID) {
        return posts.stream().anyMatch(post -> post.getPostId() == pstID);
    }

    /**
     * Finds the owner of a post by its ID.
     *
     * @param pstID The ID of the post.
     * @return The name of the post's owner, or "Owner not found" if the post doesn't exist.
     */
    public String whoOwnsSocialsPost(int pstID) {
        return posts.stream()
                    .filter(post -> post.getPostId() == pstID)
                    .findFirst()
                    .map(Post::getOwnerName) // Assuming getOwnerName method in Post class
                    .orElse("Owner not found");
    }

    /**
     * Gets a list of all post IDs on the social media platform.
     *
     * @return A list of post IDs.
     */
    public ArrayList<Integer> getAllSocialsPosts() {
        ArrayList<Integer> postIds = new ArrayList<>();
        for (Post post : posts) {
            postIds.add(post.getPostId());
        }
        return postIds;
    }

    /**
     * Adds a new user to the social media platform.
     *
     * @param name The name of the user.
     * @param password The password of the user.
     */
    public void addNewUser(String name, String password) {
        users.add(new User(name, password)); // Assuming User class has a constructor with name and password
    }

    /**
     * Removes a user from the social media platform by name.
     *
     * @param name The name of the user to be removed.
     */
    public void removeUser(String name) {
        users.removeIf(user -> user.getName().equals(name)); // Assuming getName method in User class
    }

    /**
     * Checks if a user exists on the social media platform by name.
     *
     * @param name The name of the user to check.
     * @return True if the user exists, false otherwise.
     */
    public boolean isSocialsUser(String name) {
        return users.stream().anyMatch(user -> user.getName().equals(name));
    }

    /**
     * Gets a list of all user names on the social media platform.
     *
     * @return A list of user names.
     */
    public ArrayList<String> getAllSocialsUsers() {
        ArrayList<String> userNames = new ArrayList<>();
        for (User user : users) {
            userNames.add(user.getName());
        }
        return userNames;
    }

    /**
     * Gets the user feed for a specific user by name.
     *
     * @param name The name of the user.
     * @return A list of post IDs in the user
