package com.wizz.wizzhomepagebackend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stories {
    public Stories() {

    }

    public Stories(long time, String name, String storyDescribe) {
        this.time = time;
        this.name = name;
        this.storyDescribe = storyDescribe;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private long time;

    private String name;

    private String storyDescribe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoryDescribe() {
        return storyDescribe;
    }

    public void setStoryDescribe(String describe) {
        this.storyDescribe = describe;
    }
}
