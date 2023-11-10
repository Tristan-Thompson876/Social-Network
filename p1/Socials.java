package p1;

import java.util.ArrayList;

import p1.enums.FeedAlgorithm;

public class Socials {

	/* is immutable instance data, i.e., once set cannot be changed */
	private String name;

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
	}

	public void removeSocialsPost(int pstID) {
	}

	public boolean searchForSocialsPost(int pstID) {
		return false;
	}

	public String whoOwnsSocialsPost(int pstID) {
		return "";
	}

	public ArrayList<Integer> getAllSocialsPosts() {
		return new ArrayList<Integer>();
	}

	public void addNewUser(String name, String password) {
	}

	public void removeUser(String name) {
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
