package com.jrules.ruleengine.model;

import java.util.Date;

public class Author{

	private String authorId;
	private String authorName;
	private String authorAlias;
	private String introduction;
	private String specialIntroduction;
	private String authorType;
	private Integer active;
	private String authorLevel;
	private String category;
	private String subCategory;
	private String avatarUrl;
	private String source;
	private String tags;
	private Integer bizId;
	private String userSource;
	private String userId;
	private String openAward;
	private String openTbk;
	private String superV;
	private String xssSeedId;
	private String extra;
	private Date createdAt;
	private Date updatedAt;
    private String privateExtra;
	
    public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getPrivateExtra() {
		return privateExtra;
	}

	public void setPrivateExtra(String privateExtra) {
		this.privateExtra = privateExtra;
	}

	public String getXssSeedId() {
		return xssSeedId;
	}
	public void setXssSeedId(String xssSeedId) {
		this.xssSeedId = xssSeedId;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorAlias() {
		return authorAlias;
	}
	public void setAuthorAlias(String authorAlias) {
		this.authorAlias = authorAlias;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getSpecialIntroduction() {
		return specialIntroduction;
	}
	public void setSpecialIntroduction(String specialIntroduction) {
		this.specialIntroduction = specialIntroduction;
	}
	public String getAuthorType() {
		return authorType;
	}
	public void setAuthorType(String authorType) {
		this.authorType = authorType;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	public String getAuthorLevel() {
		return authorLevel;
	}
	public void setAuthorLevel(String authorLevel) {
		this.authorLevel = authorLevel;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Integer getBizId() {
		return bizId;
	}
	public void setBizId(Integer bizId) {
		this.bizId = bizId;
	}
	
	public String getUserSource() {
        return userSource;
    }
    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getOpenAward() {
		return openAward;
	}
	public void setOpenAward(String openAward) {
		this.openAward = openAward;
	}
	public String getOpenTbk() {
		return openTbk;
	}
	public void setOpenTbk(String openTbk) {
		this.openTbk = openTbk;
	}
	public String getSuperV() {
		return superV;
	}
	public void setSuperV(String superV) {
		this.superV = superV;
	}
	//返回给前端的结果集，去除extra的字符串，由extraMap来返回
	public void ignoreExtra(){
		this.extra = null;
	}
	
}
