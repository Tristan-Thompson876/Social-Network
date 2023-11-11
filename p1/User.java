package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;

import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;
import p1.Post;

public class User {
    private String uname;
    private String password;
    public User[] users;
    private PostType postType;

	private ArrayList<String> subscribers = new ArrayList<String>(), subscribed = new ArrayList<String>(), restricted = new ArrayList<String>();
	private ArrayList<Post> posts = new ArrayList<Post>();
    private PostAudience sharedWith;
    private Post post;
    private Content content;
    //private List<Content> contents;

	public User(String uname, String password, Post post) {
        this.uname = uname;
        this.password = password;
        this.post = post;
	}
    //////////////////////////////Getters
    public String getUname(){
        return uname;
    }
    public String getPassword(){
        return password;
    }
    public PostType getPostType(){
        return postType;
    }
    //////////////////////////////Setters
    public void setUname(String uname){
        this.uname = uname;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setPostType(PostType postType){
        this.postType = postType;
    }

	public boolean login(String uname, String pword) {
		return false;
	}

	public void reactToPost(String pstID, ReactionType vote) {
        for(Post p : posts){
            if(p.getPostId() == Integer.parseInt(pstID)){
                String username = p.getUsername().getUname();  // Assuming getUsername() returns an object with a method getUname()
                p.addReaction(username, vote);
            }
        }
	}

    public void addNewPost(PostType postType, PostAudience sharedWith, Content content)
    {
        this.postType = postType;
        this.sharedWith = sharedWith;
        this.content = content;
    
        Post p = new Post(postType, sharedWith, null);
        //p.setPostID(pstID);
        posts.add(p);
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
        if(isRestricted(name) == false){
            return true;
        }
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
		for(String sub: subscribed){
            if(sub == name){
                return true;
            }
        }
		return false;
	}

	public boolean isRestricted(String name) {
		for(String sub: restricted){
            if(sub == name){
                return true;
            }
        }
		return false;
	}

	public boolean hasAccesstoPost(String name, int pstID) {
		return false;
	}

	public boolean isPostOwner(int pstID) {
        for(Post p: posts){
            if(p.getPostId() == pstID){
                return true;
            }
        }
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