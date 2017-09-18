package com.naveen.project.hindijukebox;

/**
 * Created by user on 2/8/17.
 */

class Config {

    static final String YOUTUBE_API_KEY = "AIzaSyAgOh3CKuy8d7ntlq7Ga-NrrRzNrKWWYvA";
    static final String LATEST_JUKEBOX_URL = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet%2CcontentDetails&playlistId=PLTdrP_4OeWz-DZWp58Myk2nTv_NHGNGIZ&key=AIzaSyAgOh3CKuy8d7ntlq7Ga-NrrRzNrKWWYvA";
    static final String OLD_JUKEBOX_URL = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet%2CcontentDetails&playlistId=PLTdrP_4OeWz9QJwuiRLKrdBfc-DkngDAj&key=AIzaSyAgOh3CKuy8d7ntlq7Ga-NrrRzNrKWWYvA";
    static final String VIDEO_URL = "https://www.googleapis.com/youtube/v3/videos?part=snippet%2CcontentDetails%2cstatistics&key="+YOUTUBE_API_KEY+"&id=";
    static final String COMMENT_URL = "https://www.googleapis.com/youtube/v3/commentThreads?part=snippet&key="+YOUTUBE_API_KEY+"&videoId=";
    static final String ALL_OLD_JUKEBOX_URL="https://www.googleapis.com/youtube/v3/playlistItems?part=snippet%2CcontentDetails&maxResults=25&playlistId=PLTdrP_4OeWz9QJwuiRLKrdBfc-DkngDAj&key=AIzaSyAgOh3CKuy8d7ntlq7Ga-NrrRzNrKWWYvA";
    static final String ALL_LATEST_JUKEBOX_URL="https://www.googleapis.com/youtube/v3/playlistItems?part=snippet%2CcontentDetails&maxResults=25&playlistId=PLTdrP_4OeWz-DZWp58Myk2nTv_NHGNGIZ&key=AIzaSyAgOh3CKuy8d7ntlq7Ga-NrrRzNrKWWYvA";

}
