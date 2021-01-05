/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.park.easyrecruit.common;

import com.park.easyrecruit.entity.PositionComment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Silvan
 */
public class PositionDetails implements Serializable {
    private Integer id;
    private String name;
    private String description;
    private Boolean isOpen;
    private Integer nbOfCandidatesNeeded;
    private String creatorUserName;
    private List<PositionComment> comments = new ArrayList<>();

    public PositionDetails(Integer id, String name, String description, Boolean isOpen, Integer nbOfCandidatesNeeded, String creatorUserName, List<PositionComment> comments) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isOpen = isOpen;
        this.comments = comments;
        this.nbOfCandidatesNeeded = nbOfCandidatesNeeded;
        this.creatorUserName = creatorUserName;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }
    
    public Integer getNbOfCandidatesNeeded() {
        return nbOfCandidatesNeeded;
    }

    public String getCreatorUserName() {
        return creatorUserName;
    }

    public void setCreatorUserName(String creatorUserName) {
        this.creatorUserName = creatorUserName;
    }

    public List<PositionComment> getComments() {
        return comments;
    }
    
}
