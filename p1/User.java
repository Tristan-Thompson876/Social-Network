package p1;

import java.util.ArrayList;

import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;

public class User {

	// immutable instance data
	private String username;

	// mutable instance data
	private String password;
	// there should be no overlap between subscribers and restricted
	// however, an overlap between subscribed and restricted is OK
	private ArrayList<String> subscribers = new ArrayList<String>(), subscribed = new ArrayList<String>(),
			restricted = new ArrayList<String>();
	private ArrayList<Post> posts = new ArrayList<Post>();

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public boolean login(String uname, String pword) {
		return false;
	}

	public void addNewPost(PostType type, PostAudience sharedWith, Content... contents) {
	}

	public void deletePost(int pstID) {
	}

	public void reactToPost(String pstID, ReactionType vote) {
	}

	public boolean subscribe(String name) {
		return false;
	}

	public boolean unsubscribe(String name) {
		return false;
	}

	public boolean restrict(String name) {
		return false;
	}

	public boolean unrestrict(String name) {
		return false;
	}

	public boolean isASubscriber(String name) {
		return false;
	}

	public boolean isSubscribedTo(String name) {
		return false;
	}

	public boolean isRestricted(String name) {
		return false;
	}

	public boolean hasAccesstoPost(String name, int pstID) {
		return false;
	}

	public boolean isPostOwner(int pstID) {
		return false;
	}

	public ArrayList<String> subscribersWithAccessToPost(int pstID) {
		return new ArrayList<String>();
	}

	@Override
	public String toString() {
		return "TBD";
	}

}
