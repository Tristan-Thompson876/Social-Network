package p1;

import java.util.ArrayList;

import javax.swing.text.AbstractDocument.Content;

import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;

public class Post {

	private static int postscount = 1;

	// immutable instance data
	private int pstID = ++postscount;
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

	public Post(PostType postType, PostAudience sharedWith, Content contents, int pstID) {
		this.postType = postType;
		this.sharedWith = sharedWith;
		addContents(contents);
		this.postID = pstID;
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
    public int getPostId(){
        return pstID;
    }

	public int getPopularityScore() {
		return popularityScore;
	}
	public void setPostID(){
		this.pstID = pstID;
	}
}
