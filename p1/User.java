package p1;
import java.util.ArrayList;
import java.util.List;

import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;
import p1.enums.FeedAlgorithm;

public class User  {
    private String username;
    private String password;
    public User[] users;
    private PostType type;

    public User(String username, String password){
        
        this.username = username;
        this.username = password;
    }

    public User(String username, String password, ArrayList post){
        
        this.username = username;
        this.username = password;
    }
    /**
     * 
     * @return String
     */
    public String getUsername(){
        return username;
    }

    /**
     * @return String
     */
    public String getPassword(){
        return password;
    }

    /**
     * 
     */
    public void setUsername(){
        this.username = username;
    }

    /**
     * 
     */
    public void setPassword(){
        this.password = password;
    }

    /**
     * 
     * @param username
     * @param pword
     * @return Boolean
     */
    public Boolean login(String username, String pword){
        //if(username )
        for(User u : users){
            if (u.getUsername() != username && u.getPassword() != pword){
                return false;
            }
        }
        return true;

    }

    public void addNewPost(PostType type, PostAudience sharedWith, List<Content> contents, int pstID)
    {
        this.type = type;
        this.sharedWith = sharedWith;
        this.contents = contents;
    

        Post np = new Post(pstID, type, sharedWith, contents);
        //posts.put(np.getPostId(), np);

        //String postId = new Post.getPostId();

    }
    /**
     * 
     * @param pstID
     */
    public void deletePost(int pstID){

    }

    /**
     * 
     * @param pstID
     * @param vote
     */
    public void reactToPost(String pstID, ReactionType vote){
        Post post = posts.get(pstID);
        if (post != null){
            post.addReaction(vote);
        }
    }

    /**
     * 
     * @param name
     * @return Boolean
     */
    public Boolean subscribe(String name){
        return null;
    }

    /**
     * 
     * @param name
     * @return Boolean
     */
    public Boolean unsubscribe(String name){
        return null;
    }

    /**
     * 
     * @param name
     * @return Boolean
     */
    public Boolean restrict(String name){
        return null;

    }

    /**
     * 
     * @param name
     * @return Boolean
     */
    public Boolean unrestrict(String name){
        return null;
    }

    /**
     * 
     * @param name
     * @return Boolean
     */
    public Boolean isASubscriber(String name){
        return null;
    }

    /**
     * 
     * @param name
     * @return Boolean
     */
    public Boolean isSubscribed(String name){
        return null;
    }

    /**
     * 
     * @param name
     * @return Boolean
     */
    public Boolean isRestricted(String name){
        return null;
    }

    /**
     * 
     * @param pstID
     * @return Boolean
     */
    public Boolean hasAccessToPost(int pstID){
        return null;
    }

    /**
     * 
     * @param pstID
     * @return Boolean
     */
    public Boolean isPostOwner(int pstID){
        return null;
    }

    /**
     * 
     * @param pstID
     * @return String
     */
    public String subscribersWithAccessToPost(int pstID){
        return null;
    }

    /**
     * 
     */
    public String toString(){
        return null;
    }

}
