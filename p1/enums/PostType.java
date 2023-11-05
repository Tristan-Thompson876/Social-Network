package p1.enums;

/**
 * Defines the types of posts that can be created.
 */
public enum PostType {

    /**
     * Represents a text-based post.
     */
    Text("Text"),

    /**
     * Represents a post containing an external URL.
     */
    ExternalLink("External URL");

    private String description;

    /**
     * Constructs a PostType with a given description.
     *
     * @param description A textual description of the post type.
     */
    PostType(String description) {
        this.description = description;
    }

    /**
     * Retrieves the description of the post type.
     *
     * @return The description of the post type.
     */
    public String getDescription() {
        return description;
    }
}

