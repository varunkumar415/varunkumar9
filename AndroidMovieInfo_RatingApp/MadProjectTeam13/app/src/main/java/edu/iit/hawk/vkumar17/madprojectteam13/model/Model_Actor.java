package edu.iit.hawk.vkumar17.madprojectteam13.model;


public class Model_Actor {

    private int id;
    private String name;
    private String picturePath;
    private String knownForFilm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getKnownForFilm() {
        return knownForFilm;
    }

    public void setKnownForFilm(String knownForFilm) {
        this.knownForFilm = knownForFilm;
    }
}
