package p1;

import java.util.ArrayList;
import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;

/**
 * Represents a post in the social media platform.
 */
public class Post {

    private static int posts = 0;

    // Immutable instance data
    private final int postID = ++posts;
    private final PostType postType;
    private final PostAudience sharedWith;
    private final ArrayList<Content> contents = new ArrayList<>();

    // Mutable instance data
    private int popularityScore = 0;
    private Reaction upvote = new Reaction(ReactionType.Upvote);
    private Reaction downvote = new Reaction(ReactionType.Downvote);

    /**
     * Constructs a new Post with specified type, audience, and contents.
     *
     * @param postType The type of the post.
     * @param sharedWith The audience with whom the post is shared.
     * @param contents Varargs array of Content objects included in the post.
     */
    public Post(PostType postType, PostAudience sharedWith, Content... contents) {
        this.postType = postType;
        this.sharedWith = sharedWith;
        addContents(contents);
    }

    /**
     * Adds contents to the post.
     *
     * @param contents Varargs array of Content objects to be added to the post.
     */
    private void addContents(Content... contents) {
        for (Content c : contents) {
            this.contents.add(c);
        }
    }

    // Method for updating popularity score...

    /**
     * Adds a reaction to the post.
     *
     * @param name Name of the user reacting to the post.
     * @param type The type of reaction (e.g., upvote, downvote).
     * @return True if the reaction is successfully added, false otherwise.
     */
    public boolean addReaction(String name, ReactionType type) {
        // Logic for adding a reaction
        return false;
    }

    /**
     * Removes a reaction from the post.
     *
     * @param name Name of the user whose reaction is to be removed.
     * @return True if the reaction is successfully removed, false otherwise.
     */
    public boolean removeReaction(String name) {
        // Logic for removing a reaction
        return false;
    }

    /**
     * Checks if a user has already reacted to the post.
     *
     * @param name Name of the user.
     * @return True if the user has already reacted, false otherwise.
     */
    public boolean alreadyReacted(String name) {
        // Logic to check if a user has reacted
        return false;
    }

    // Getters for various fields...

    @Override
    public String toString() {
        // Implement the toString method for representing a Post object as a string
        return "";
    }
}
