package p1;

import java.util.ArrayList;

import javax.swing.text.AbstractDocument.Content;

import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;

public class Post implements Comparable<Post> {
	
	private static int postscount = 0;

	// immutable instance data
	private int pstID = ++postscount;
	private PostType postType = PostType.Text;
	private PostAudience sharedWith = PostAudience.Public;
	private ArrayList<Content> contents = new ArrayList<Content>();
	private ArrayList<String> reactedUsers = new ArrayList<>();
	private Content content;
	private User username;

	// mutable instance data
	private int popularityScore = 0;
	private Reaction upvote = new Reaction(ReactionType.Upvote);
	private Reaction downvote = new Reaction(ReactionType.Downvote);

	/**
	 * 
	 * constructor for post
	 * @param postType
	 * @param sharedWith
	 * @param content
	 */
	public Post(PostType postType, PostAudience sharedWith, Content content) {
        this.postType = postType;
        this.sharedWith = sharedWith;
        this.content = content;
    }
	/**
	 * constructor for post
	 * @param postType
	 * @param sharedWith
	 * @param content
	 * @param pstID
	 */
	public Post(PostType postType, PostAudience sharedWith, Content content, int pstID) {
		this.postType = postType;
		this.sharedWith = sharedWith;
		this.pstID = pstID;
	}


	/**
	 * add a reaction with the name of reactor to post
 	 */
	public void addReaction(String name, ReactionType type) {
		// a user can only react once to a post
        if (!reactedUsers.contains(name)) {
            
            //Reaction reaction = new Reaction(type);
			if(type == ReactionType.Upvote){
            	reactedUsers.add(name);
			}
            
        } else {
            System.out.println(name + "already reacted");
        
        }
    }
	/**
	 * removes a reaction
	 * @param name 
	 */
	public void removeReaction(String name) {
		if(reactedUsers.contains(name)){
			reactedUsers.remove(name);

		}
		else{
			System.out.println(name + "have not reacted");
		}
	}
	/**
	 * 
	 * @param name
	 * @return boolean
	 */
	public boolean alreadyReacted(String name) {
		if (!reactedUsers.contains(name)) {
			return false;
		}
		else{
			return false;
		}

	}

	//////////////////////getters below//////////////////////////////
	/**
	 * 
	 * @return The type of post
	 */
	public PostType getPostType(){
		return postType;
	}
	/**
	 * 
	 * @return The audience of the post
	 */
	public PostAudience getSharedWith() {
		return sharedWith;
	}
	/**
	 * 
	 * @return Id of the post
	 */
    public int getPostId(){
        return pstID;
    }
	/**
	 * 
	 * @return Content of the post
	 */
	public Content getContent(){
		return content;
	}
	/**
	 * 
	 * @return The popularity score of the post
	 */
	private void getPopularityScore(){
		this.popularityScore = this.upvote.getCount() - this.downvote.getCount();
	}
	/**
	 * 
	 * @return
	 */
	public User getUsername(){
		return username;
	}
	////////////////////Setter Methods Below//////////////////////////////
	/**
	 * Post Id setter
	 */
	public void setPostID(int pstID){
		this.pstID = pstID;
	}
	/**
	 * Sharedwith setter
	 */
	public void setSharedWith(PostAudience sharedWith){
		this.sharedWith = sharedWith;
	}
	/**
	 * Post Type setter
	 */
	public void setPostType(PostType postType){
		this.postType = postType;
	}
	/**
	 * Content setter
	 */
	public void setContent(Content content){
		this.content = content;
	}
	/**
	 * 
	 * @param name
	 */
	public void setUname(User name){
		this.username = name;
	}
	@Override
    public int compareTo(Post other) {
		return this.popularityScore - other.popularityScore;
	}
}