package p1;

import p1.enums.PostAudience;
import p1.enums.PostType;


public class Post implements Comparable<Post>{
    private int pstID;
    private int popularityScore;
    public Post[] posts;

    public Post(int pstID, PostType type, PostAudience sharedWith){

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
    public void setPostID(){
        this.pstID = pstID;
    }

    @Override
    public int compareTo(Post o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
