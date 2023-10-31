package p1.enums;

/**
 * An enum enumaration
 */
public enum PostAudience {
    
    Private("Only Owner"), Public("Public , except restricted"), Subscribers("Subscribers");
    public String description;

    PostAudience(String description){
        this.description = description;
    }

    public String getDecription;

}
