package p1.enums;

/**
 * Defines the algorithms for sorting posts in a feed.
 */
public enum FeedAlgorithm {

    /**
     * Sorts posts by popularity score, highest first.
     */
    Popular("Popularity score, highest first"),

    /**
     * Sorts posts with the newest ones first.
     */
    Newest("Newest first!"),

    /**
     * Sorts posts with the oldest ones first.
     */
    Oldest("Oldest first!");

    private String description;

    /**
     * Constructs a FeedAlgorithm with a given description.
     *
     * @param description A textual description of the feed algorithm.
     */
    FeedAlgorithm(String description) {
        this.description = description;
    }

    /**
     * Retrieves the description of the feed algorithm.
     *
     * @return The description of the feed algorithm.
     */
    public String getDescription() {
        return description;
    }
}
