package p1;

import java.util.ArrayList;

import p1.enums.FeedAlgorithm;

public class Socials {

	/* is immutable instance data, i.e., once set cannot be changed */
	private String name;
	//private String password;

	/* is mutable instance data */
	private FeedAlgorithm feedSort;
	private ArrayList<Post> posts = new ArrayList<Post>();
	private ArrayList<User> users = new ArrayList<User>();

	

	public Socials(String name) {
		super();
		this.name = name;
		this.feedSort = FeedAlgorithm.Popular;
	}

	public Socials(String name, FeedAlgorithm feedSort) {
		super();
		this.name = name;
		this.feedSort = feedSort;
	}

	public void addNewSocialsPost(Post post) {
		posts.add(post);
	}

	public void removeSocialsPost(int pstID) {
		for (Post post : posts) {
			if (post.getPostId() == pstID) {
				posts.remove(post);
				System.out.println("Post with pstID " + pstID + "was removed successfully.");
				//return; 
			}
			System.out.println("Post with pstID " + pstID + "was not found");
		}

	}

	public boolean searchForSocialsPost(int pstID) {
		for (Post post : posts) {
			if (post.getPostId() == pstID) {
				return true;
			}
		}
		return false;
	}

	public String whoOwnsSocialsPost(int pstID) {
		for (Post post : posts) {
			if (post.getPostId() == pstID) {
				return "Owner found";
			}
		}
		return "Owner not found";
	}

	public ArrayList<Integer> getAllSocialsPosts() {
		return new ArrayList<Integer>();
	}

	public void addNewUser(String name, String password) {
		User u = new User(name, password, null);
		users.add(u);
	}

	public void removeUser(String name) {
		if(isSocialsUser(name)){
			users.remove(name);
		}
	}

	public boolean isSocialsUser(String name) {
		if (users.contains(name)) {
			return true;  
        } else {
            System.out.println(name + "Not an user");
		return false;
		}
	}

	public ArrayList<String> getAllSocialsUsers() {
		return new ArrayList<String>();
	}

	public ArrayList<Integer> getSocialsUserFeed(String name) {
		return new ArrayList<Integer>();
	}

	public String getSocialsName() {
		return name;
	}

	public FeedAlgorithm getSocialsFeedSort() {
		return feedSort;
	}

	public void updateSocialsFeedSort(FeedAlgorithm feedSort) {
		this.feedSort = feedSort;
	}

	@Override
	public String toString() {
		return "TBD";
	}

}
