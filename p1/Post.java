package p1;

import java.util.List;

import p1.enums.PostAudience;
import p1.enums.PostType;
import p1.enums.ReactionType;


public class Post implements Comparable<Post>{
    private int pstID;
    private int popularityScore;
    public Post[] posts;

    public Post(int pstID, PostType type, PostAudience sharedWith, Content content){

    }
    public Post(){

    }


    /**
     * 
     * @return Integer
     */
    public Integer getPostId(){
        return pstID;
    }

    /**
     * 
     */
    public void setPostID(){
        this.pstID = pstID;
    }

    /**
     * 
     * @param name
     * @param type
     */
    public void addReaction(String name, ReactionType type){
        //for
    }

    /**
     * 
     * @param name
     */
    public void removeReaction(String name){

    }

    /**
     * 
     * @param name
     * @return Boolean
     */
    public Boolean alreadyReacted(String name){
        return null;
    }
    

    @Override
    public int compareTo(Post o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
