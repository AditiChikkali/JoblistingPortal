package model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="jobpost")
public class Post {
	private String profile;
	private String desc;
	private int exp;
	private String tech[];
	
	public Post() {}
	
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String[] getTech() {
		return tech;
	}
	public void setTech(String tech[]) {
		this.tech = tech;
	}
	
	
	@Override
	public String toString() {
		return "Post [profile=" + profile + ", desc=" + desc + ", exp=" + exp + ", tech=" + Arrays.toString(tech) + "]";
	}

	
	
	
	

}
