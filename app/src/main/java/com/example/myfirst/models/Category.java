
package com.example.myfirst.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import org.parceler.Parcel;

@Parcel
public class Category {

    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("title")
    @Expose
    private String title;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Category() {
    }

    /**
     * 
     * @param title
     * @param alias
     */
    public Category(String alias, String title) {
        super();
        this.alias = alias;
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
