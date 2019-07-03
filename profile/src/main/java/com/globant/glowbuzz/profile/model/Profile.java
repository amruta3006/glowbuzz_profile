package com.globant.glowbuzz.profile.model;

import java.sql.Blob;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Profile {

	@Id
	private Integer id;
	private String name;
	private String designation;
	private String studio;
	private String roject;
	private String location;
	private String contactNumber;
	private String email;
	private List<String> Hobies;
	private List<Integer> stars;
	private List<Integer> followers;
	private List<Integer> following;
	private List<Integer> groups;
	private Blob profilePicture;

	public Profile() {

	}

	public Profile(String name, String designation, String studio, String roject, String location, String contactNumber,
			String email, List<String> hobies, List<Integer> stars, List<Integer> followers, List<Integer> following,
			List<Integer> groups, Blob profilePicture) {
		super();
		this.name = name;
		this.designation = designation;
		this.studio = studio;
		this.roject = roject;
		this.location = location;
		this.contactNumber = contactNumber;
		this.email = email;
		Hobies = hobies;
		this.stars = stars;
		this.followers = followers;
		this.following = following;
		this.groups = groups;
		this.profilePicture = profilePicture;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public String getRoject() {
		return roject;
	}

	public void setRoject(String roject) {
		this.roject = roject;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getHobies() {
		return Hobies;
	}

	public void setHobies(List<String> hobies) {
		Hobies = hobies;
	}

	public List<Integer> getStars() {
		return stars;
	}

	public void setStars(List<Integer> stars) {
		this.stars = stars;
	}

	public List<Integer> getFollowers() {
		return followers;
	}

	public void setFollowers(List<Integer> followers) {
		this.followers = followers;
	}

	public List<Integer> getFollowing() {
		return following;
	}

	public void setFollowing(List<Integer> following) {
		this.following = following;
	}

	public List<Integer> getGroups() {
		return groups;
	}

	public void setGroups(List<Integer> groups) {
		this.groups = groups;
	}

	public Blob getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(Blob profilePicture) {
		this.profilePicture = profilePicture;
	}

}
