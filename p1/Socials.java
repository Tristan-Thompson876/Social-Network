package p1;

import p1.enums.FeedAlgorithm;

/**
 * Class Socials
 */
public class Socials{
    ////Attributes\\\\
    private String name;
    FeedAlgorithm feedSort;
    private int pstID;
    public Socials(){

    }

    ////Getters and Setters section\\\\
    public String getName(){
        return this.name;

    }
    public void setName(String name){
        name = this.name;
    }
    public void addNewSocialsPost(Post pst){

    }

    public void removeSocialsPost(int pstID){

    }
    public Boolean searchForSocialsPost(Post pst){
        return null;
    }

    public String whoOwnsSocialsPost(int pstID){
        return null;
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