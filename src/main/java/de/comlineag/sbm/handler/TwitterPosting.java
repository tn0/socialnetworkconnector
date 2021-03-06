package de.comlineag.sbm.handler;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;

import de.comlineag.sbm.data.TwitterPostingData;

/**
 * 
 * @author Christian Guenther, Magnus Leinemann
 * @category Parser
 * 
 * @description Implementation of the twitter posting manager - extends
 *              GenericDataManager This handler is used to save a new tweet or
 *              update an existing one. TwitterPostingManager is called after a
 *              posting with all relevant information about the posting (the
 *              original as well as the retweeted one) is decoded by
 *              TwitterParser.
 * 
 * 
 * @param <TwitterPosting>
 * 
 *            "id" Long "created_at" String "text" String "source" String
 *            "truncated" Boolean "in_reply_to_status_id" Long
 *            "in_reply_to_user_id" Long "in_reply_to_screen_name" String
 *            "coordinates" List "place" List "lang" String "hashtags" List
 *            "symbols" List
 */

public class TwitterPosting extends GenericDataManager<TwitterPostingData> {
	/*
	 * Die nachfolgenden Elemente des Tweets sollen weiter verarbeitet und
	 * gespeichert werden
	 * 
	 * key="cl_postID" value="id" key="cl_postTime" value="created_at"
	 * key="cl_posting" value="text" key="cl_postClient" value="source"
	 * key="cl_postTruncated" value="truncated" key="cl_postInReplyTo"
	 * value="in_reply_to_status_id" key="cl_postInReplyToUserID"
	 * value="in_reply_to_user_id" key="cl_postInReplyToScreenName"
	 * value="in_reply_to_screen_name" key="cl_postGeoLocation"
	 * value="coordinates" key="cl_postPlace" value="place" key="cl_postLang"
	 * value="lang" key="cl_postHashtags" value="hashtags" key="cl_postSymbols"
	 * value="symbols"
	 */

	private TwitterPostingData data;

	private final Logger logger = Logger.getLogger(getClass().getName());

	/**
	 * Baut aus dem JSON String ein TwitterPostingData Objekt
	 * 
	 * @param jsonObject
	 */
	public TwitterPosting(JSONObject jsonObject) {
		// TODO Auto-generated constructor stub
		logger.debug("constructor of class" + getClass().getName() + " called");
		data = new TwitterPostingData(jsonObject);

	}

	@Override
	// public void save(List<TwitterPosting> posting){
	public void save() {
		// log the startup message
		logger.info("method save from class " + getClass().getName() + " called");
		// TODO: implement save interface either to file, db or the like
	}
}
