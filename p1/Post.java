package p1;

import java.util.ArrayList;

import javax.swing.text.AbstractDocument.Content;

import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;

public class Post {

	private static int posts = 0;

	// immutable instance data
	private int postID = ++posts;
	private PostType postType;
	private PostAudience sharedWith = PostAudience.Public;
	private ArrayList<Content> contents = new ArrayList<Content>();

	// mutable instance data
	private int popularityScore = 0;
	private Reaction upvote = new Reaction(ReactionType.Upvote);
	private Reaction downvote = new Reaction(ReactionType.Downvote);

	public Post(PostType postType, PostAudience sharedWith, p1.Content contents) {
		this.postType = postType;
		this.sharedWith = sharedWith;
		addContents(contents);
	}

	public Post(PostType postType, Content contents) {
		this.postType = postType;
		addContents(contents);
	}

	private void addContents(Content contents) {
		for (Content c : contents)
			this.contents.add(c);
	}

	private void updatePopularityScore() {
	}

	public boolean addReaction(String name, ReactionType type) {
		
		// a user can only react once to a post
		return false;
	}

	public boolean removeReaction(String name) {
		return false;
	}

	public boolean alreadyReacted(String name) {
		return false;
	}

	public PostAudience getSharedWith() {
		return sharedWith;
	}
    public int getId(){
        return postID;
    }

	public int getPopularityScore() {
		return popularityScore;
	}
}
