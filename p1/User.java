package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;

import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;

public class User  {
    private String username;
    private String password;
    public User[] users;
    private PostType type;

	private ArrayList<String> subscribers = new ArrayList<String>(), subscribed = new ArrayList<String>(),
			restricted = new ArrayList<String>();
	private ArrayList<Post> posts = new ArrayList<Post>();
    private PostAudience sharedWith;
    private Post post;
    Content content;
    private List<Content> contents;

	public User(String username, String password, Post post) {
		super();
		this.username = username;
		this.password = password;
        this.post = post;
	}

	public boolean login(String uname, String pword) {
		return false;
	}

	public void reactToPost(String pstID, ReactionType vote) {
	}

    public void addNewPost(PostType type, PostAudience sharedWith, Content content, int pstID)
    {
        this.type = type;
        this.sharedWith = sharedWith;
        this.content = content;
    
        Post np = new Post(pstID, type, sharedWith, content);
        posts.add(np);
        //String postId = new Post.getPostId();

    }
    /**
     * 
     * @param pstID
     */
    public void deletePost(int pstID){
        for(Post p : posts){
            if (p.getPostId() == pstID){
                posts.remove(p);
            }
        }
    }

	public boolean unrestrict(String name) {
		return false;
	}

	public boolean isASubscriber(String name) {
        for(String sub: subscribers){
            if(sub == name){
                return true;
            }
        }
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
