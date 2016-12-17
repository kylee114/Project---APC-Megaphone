package forum;

import javax.servlet.*;
import javax.servlet.http.*;


public class Cookies{
	
	public static String getCookies(Cookie[] cookies,
									  String cookieName,
									  String defaultValue){
						
		if (!cookies.equals(null)){ 
			Cookie cookie;
			for(int i=0;i<cookies.length;i++){
				cookie = cookies[i];
				if(cookieName.equals(cookie.getName())){
					return cookie.getValue();
				}			
			}
		}
			return(defaultValue);
	}
}
	
	
	
	
	
