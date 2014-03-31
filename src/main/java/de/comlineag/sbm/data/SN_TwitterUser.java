package de.comlineag.sbm.data;

import java.util.List;

import org.json.simple.JSONObject;

/**
 *
 * @author Christian Guenther
 * @category data type
 *
 * @description describes all elements needed for the representation of a twitter user
 */
public class SN_TwitterUser {
	
	private long id;
	private String username;
	private String screenName;
	private List<?> location;
	private long followersCount;
	private long friendsCount;
	private long postingsCount;
	private long favoritesCount;
	private long listsAndGrooupsCount;
	private String lang;

	public SN_TwitterUser(JSONObject jsonObject){
		setId((Long)jsonObject.get("id"));
		setUsername((String)jsonObject.get("name"));
		setScreenName((String)jsonObject.get("screen_name"));
		//setLocation((List)jsonObject.get("location"));
		setFollowersCount((Long)jsonObject.get("followers_count"));
		setFriendsCount((Long)jsonObject.get("friends_count"));
		setPostingsCount((Long)jsonObject.get("statuses_count"));
		setFavoritesCount((Long)jsonObject.get("favorites_count"));
		setListsAndGrooupsCount((Long)jsonObject.get("listed_count"));
		setLang((String)jsonObject.get("lang"));
	}

	// getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public List<?> getLocation() {
		return location;
	}
	public void setLocation(List<?> location) {
		this.location = location;
	}
	public long getFollowersCount() {
		return followersCount;
	}
	public void setFollowersCount(long followersCount) {
		this.followersCount = followersCount;
	}
	public long getFriendsCount() {
		return friendsCount;
	}
	public void setFriendsCount(long friendsCount) {
		this.friendsCount = friendsCount;
	}
	public long getPostingsCount() {
		return postingsCount;
	}
	public void setPostingsCount(long postingsCount) {
		this.postingsCount = postingsCount;
	}
	public long getFavoritesCount() {
		return favoritesCount;
	}
	public void setFavoritesCount(long favoritesCount) {
		this.favoritesCount = favoritesCount;
	}
	public long getListsAndGrooupsCount() {
		return listsAndGrooupsCount;
	}
	public void setListsAndGrooupsCount(long listsAndGrooupsCount) {
		this.listsAndGrooupsCount = listsAndGrooupsCount;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
}
