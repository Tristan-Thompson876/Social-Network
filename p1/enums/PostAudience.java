package p1.enums;

/**
 * Defines the audience scope for a post.
 */
public enum PostAudience {

    /**
     * The post is private and can only be seen by the owner.
     */
    Private("Only Owner"),

    /**
     * The post is public but not visible to restricted profiles.
     */
    Public("Public, except restricted"),

    /**
     * The post is visible only to subscribers of the owner.
     */
    Subscribers("Subscribers!");

    private String description;

    /**
     * Constructs a PostAudience with a given description.
     *
     * @param description A textual description of the audience type.
     */
    PostAudience(String description) {
        this.description = description;
    }

    /**
     * Retrieves the description of the audience type.
     *
     * @return The description of the audience type.
     */
    public String getDescription() {
        return description;
    }
}

