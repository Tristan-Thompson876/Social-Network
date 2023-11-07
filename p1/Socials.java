package p1;

import java.util.ArrayList;

import p1.enums.FeedAlgorithm;

/**
 * Class Socials
 */
public class Socials{
    ////Attributes\\\\
    private String name;
    FeedAlgorithm feedSort;
    //private int pstID;
    private ArrayList<Integer> posts = new ArrayList<Integer>();
    private User[] users;
    public Socials(User[] users){
        this.users = users;

    }

    ////Getters and Setters section\\\\
    public String getName(){
        return this.name;

    }
    public void setName(String name){
        name = this.name;
    }


    public void addNewSocialsPost(Integer pst){

    }

    public void removeSocialsPost(int pstID){

    }
    public Boolean searchForSocialsPost(Post pst){
        return null;
    }

    public String whoOwnsSocialsPost(int pstID){
        for(Post p:posts){
            if(p.getPostId() == pstID){
                return p.getUsername();
            }
        }
    }

    public Integer getAllSocialsPosts(){
        return null;
    }
    public void addNewSocialsUser(String name, String password){

    }

    public void removeSocialsUser(String name){

    }

    public Boolean isSocialsUser(String name){
        return null;
    }

    public String getAllSocialsUsers(){
        return null;
    }

    public Integer getSocialsUserFeed(String name){
        return null;
    }

    public String toString(){
        return null;
    }



}