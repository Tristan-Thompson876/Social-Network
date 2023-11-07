package p1;
public class Post implements Comparable<Post>{
    private int pstID;
    public Post[] posts;

    public Post(int pstID){

    }
    /**
     * 
     * @return Integer
     */
    public Integer getPostId(){
        return pstID;
    }
    public String getUserName(){
        return this.username;

    }

    @Override
    public int compareTo(Post o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
