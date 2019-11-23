package com.prince.badal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestURL {
	
	public static void main(String[] args) {
		
		try {
			String url="";
			URL obj =new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			int responsecode =con.getResponseCode();
			System.out.println(" \n Sending GET  request to url" + url);
			System.out.println(" Response Code " + responsecode);
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while((inputLine = in.readLine())!= null)
			{
				response.append(inputLine);
				
			}
			in.close();
			System.out.println(response.toString());
		
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
		//JSONobject myresponse = new JSONobject(response.toString());
	}

}
