package p1.enums;

public enum PostAudience {
    
    Private("Only Owner"), Public("Public , except restricted"), Subscribers("Subscribers");
    public String description;

    PostAudience(String description){
        this.description = description;
    }

    public String getDecription;

}
