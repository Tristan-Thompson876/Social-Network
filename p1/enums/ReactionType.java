package p1.enums;

/**
 * Defines the types of reactions that can be made to a post.
 */
public enum ReactionType {

    /**
     * Represents a positive reaction, indicating approval.
     */
    Upvote("Approves"),

    /**
     * Represents a negative reaction, indicating disapproval.
     */
    Downvote("Disapproves");

    private String description;

    /**
     * Constructs a ReactionType with a given description.
     *
     * @param description A textual description of the reaction type.
     */
    ReactionType(String description) {
        this.description = description;
    }

    /**
     * Retrieves the description of the reaction type.
     *
     * @return The description of the reaction type.
     */
    public String getDescription() {
        return description;
    }
}
