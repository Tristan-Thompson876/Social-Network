package p1;

import java.util.ArrayList;
import p1.enums.ReactionType;

/**
 * Represents a reaction to a post, such as an upvote or downvote.
 */
public class Reaction {

    // Immutable instance data: the type of the reaction (e.g., upvote or downvote)
    private ReactionType type;

    // Mutable instance data: list of usernames who have reacted
    private ArrayList<String> reactors = new ArrayList<>();

    /**
     * Constructs a new Reaction with the specified type.
     *
     * @param type The type of the reaction (e.g., upvote or downvote).
     */
    public Reaction(ReactionType type) {
        this.type = type;
    }

    /**
     * Returns the type of this reaction.
     *
     * @return The type of the reaction.
     */
    public ReactionType getType() {
        return type;
    }

    /**
     * Adds a reactor to this reaction if they have not already reacted.
     *
     * @param name The name of the user reacting.
     */
    public void addReactor(String name) {
        if (!reactors.contains(name)) {
            reactors.add(name);
        }
    }

    /**
     * Removes a reactor from this reaction.
     *
     * @param name The name of the user whose reaction is to be removed.
     */
    public void removeReactor(String name) {
        if (reactors.contains(name)) {
            reactors.remove(name);
        }
    }

    /**
     * Checks if a user has already reacted.
     *
     * @param name The name of the user to check.
     * @return True if the user has already reacted, otherwise false.
     */
    public boolean alreadyReacted(String name) {
        return reactors.contains(name);
    }

    /**
     * Returns the count of reactors.
     *
     * @return The number of users who have reacted.
     */
    public int getCount() {
        return reactors.size();
    }

    /**
     * Returns a string representation of the reactors.
     *
     * @return A string containing the names of all the reactors, separated by commas.
     */
    public String getReactors() {
        return String.join(", ", reactors);
    }

    /**
     * Returns a string representation of this Reaction.
     *
     * @return A string that includes the type of reaction and the list of reactors.
     */
    @Override
    public String toString() {
        return "Reaction{" +
            "type=" + type +
            ", reactors=" + getReactors() +
            '}';
    }
}
