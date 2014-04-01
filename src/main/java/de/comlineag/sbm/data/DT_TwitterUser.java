package de.comlineag.sbm.data;

import java.util.List;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Christian Guenther
 * @category data type
 *
 * @description describes all elements needed for the representation of a twitter user
 */
public class DT_TwitterUser {
	
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
	
	private String ml_variable_dreck_git;
	
	public String getMl_variable_dreck_git() {
		return ml_variable_dreck_git;
	}

	public void setMl_variable_dreck_git(String ml_variable_dreck_git) {
		this.ml_variable_dreck_git = ml_variable_dreck_git;
	}
	private final Logger logger = LoggerFactory.getLogger(getClass().getName());

	public DT_TwitterUser(JSONObject jsonObject){
		
		logger.debug("constructor of class" + getClass().getName() + " called");
		
		setId((Long)jsonObject.get("id"));
		setUsername((String)jsonObject.get("name"));
		setScreenName((String)jsonObject.get("screen_name"));
		//setLocation((List)jsonObject.get("location"));
		
		if (jsonObject.get("followers_count") != null)
			setFollowersCount((Long)jsonObject.get("followers_count"));
		if (jsonObject.get("friends_count") != null)
			setFriendsCount((Long)jsonObject.get("friends_count"));
		if (jsonObject.get("statuses_count") != null)
			setPostingsCount((Long)jsonObject.get("statuses_count"));
		if (jsonObject.get("favorites_count") != null)
			setFavoritesCount((Long)jsonObject.get("favorites_count"));
		if (jsonObject.get("listed_count") != null)
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
