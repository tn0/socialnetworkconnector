package de.comlineag.sbm.handler;

import java.util.List;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import twitter4j.User;
import de.comlineag.sbm.data.*;

/**
 * 
 * @author Christian Guenther
 * @category Handler
 * 
 * @description Implementation of the twitter user manager - extends GenericDataManager. 
 * 				This handler is used to save a new user or update an existing one.
 * 				TwitterUserManager is called after a posting with all relevant information
 * 				about the user (posting user as well as mentioned users) is decoded by TwitterParser. 
 * 				
 *
 * @param		none
 * 
 *				"id"				Long
 *				"name"				String
 *				"screen_name"		String
 * 				"location"			List
 *				"followers_count"	Long
 * 				"friends_count"		Long
 * 				"statuses_count"	Long
 *				"favourites_count"	Long
 *				"listed_count" 		Long
 *				"lang"				String
 */
<<<<<<< HEAD:src/main/java/de/comlineag/sbm/handler/TwitterUser.java
public class TwitterUser extends GenericDataManager<TwitterUserData> {
	
	/*
	 * 
	 * Die nachfolgenden Elemente des Users sollen weiter verarbeitet und gespeichert werden
	 *				
	 *	key="cl_userID" 					value="id"
	 *	key="cl_userName" 					value="name"
	 *	key="cl_userScreenName" 			value="screen_name"
	 * 	key="cl_userLocation" 				value="location"
	 *	key="cl_userFollower" 				value="followers_count"
	 * 	key="cl_userFriends" 				value="friends_count"
	 * 	key="cl_userPostingsCount"			value="statuses_count"
	 *	key="cl_userFavoritesCount"			value="favourites_count"
	 *	key="cl_userListsAndGroupsCount"	value="listed_count" 
	 *	key="cl_userLang" 					value="lang"
	 */
	private TwitterUserData data;
=======
public final class TwitterUserManager extends GenericDataManager<TwitterUser> {
>>>>>>> 5feb78f3e2b7bb14c47d1197df99fa3b3809b15c:src/main/java/de/comlineag/sbm/handler/TwitterUserManager.java
	
	private final Logger logger = LoggerFactory.getLogger(getClass().getName());
	
	public TwitterUser(JSONObject jsonObject) {
		// TODO Auto-generated constructor stub
		logger.debug("constructor of class" + getClass().getName() + " called");
		data = new TwitterUserData(jsonObject);
	}
	
//	public void save(List<TwitterUser> users){
	public void save(){
		// log the startup message
		logger.warn("method save from class " + getClass().getName() + " called");
				
	}
	
	
}
