package p1;
import java.util.ArrayList;
import p1.enums.ReactionType;

public class User {
    private String username;
    private String password;
    public ArrayList<User> users;

    public User(String username, String password){
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
        return null;
    }

    //public addNewPost()
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
