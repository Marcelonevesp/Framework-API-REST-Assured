package br.com.core;

import io.restassured.http.ContentType;

public interface Constantes {

	String APP_BASE_URL = "https://seubarriga.wcaquino.me/";
	Integer APP_PORT = 443; //http -> 80 https -> 443
	String APP_BASE_PATH = "";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 1000L;
}
