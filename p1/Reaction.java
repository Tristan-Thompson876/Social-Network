package p1;

import java.util.ArrayList;

import p1.enums.ReactionType;

public class Reaction {
	// immutable instance data
	private ReactionType type;

	// mutable instance data
	private ArrayList<String> reactors = new ArrayList<String>();

	public Reaction(ReactionType type) {
		this.type = type;
	}

	public ReactionType getType() {
		return type;
	}

	public void addReactor(String name) {
        if (!reactors.contains(name)) {
            reactors.add(name);
            
        }

		// duplicates not allowed
	}

	public void removeReactor(String name) {
       if (reactors.contains(name)) {
        reactors.remove(name);
        
       }
	}


	public boolean alreadyReacted(String name) {
		return reactors.contains(name);
	}

	public int getCount() {
		return reactors.size();
	}

	// returns a string with the reactors separated by a string
	public String getReactors() {
		return String.join(", ", reactors);
	}

	@Override
	public String toString() {
		return "Reaction{" +
        "type=" + type +
        ", reactors=" + getReactors() +
        '}';
	}

}
