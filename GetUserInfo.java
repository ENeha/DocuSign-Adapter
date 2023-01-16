package com.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class GetUserInfo {
    public static void main (String[] args)  throws IOException 
    {
        URL url = new URL("https://account-d.docusign.com/oauth/userinfo");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestProperty("Authorization", "Bearer eyJ0eXAiOiJNVCIsImFsZyI6IlJTMjU2Iiwia2lkIjoiNjgxODVmZjEtNGU1MS00Y2U5LWFmMWMtNjg5ODEyMjAzMzE3In0.AQoAAAABAAUABwAAPao4fffaSAgAAH3NRsD32kgCABcVcNhNFhBLqxqqGr1KswYVAAEAAAAYAAEAAAAFAAAADQAkAAAANmE3ODE4NmUtNDVlMy00MDU2LTgwNzQtODE4YWQ0NjE4Mjg3IgAkAAAANmE3ODE4NmUtNDVlMy00MDU2LTgwNzQtODE4YWQ0NjE4Mjg3MAAAL_ydeffaSDcAVIQ4rf0PnUOgDFlF5WPrkw.lgoQ_9JyOnwKjTo-6hhWuTi2UJ5Oz60EAo6cp3XpPb6epFtnQ0hNtfVJil0PuF1StWTJHNjrTYa9rb4aWpVSCJlW4C9VhExVdHj9BJEbjPLm9FiX77kUb2pon8yXeb0sg57HNtqVP1iW_iHI4jQhQQiqxqfN4W80C6QVuuqLX6MajshkjqlgDcg4iQa4uwflqhSJUZc2CNT7Y5Vyf8mw0RsL6iWn2sTXPyT6ERLhLCo6auYz5vxLY8DA4yihQKDXkqfPeYmooiLWau6t6Qu8mP-u2as9srMeYDTvR-0U88EDMeRsyXq_7rhpoCIUqcLpbj5E8JlGx6rBLHFd5j3uFA");

        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        System.out.println("Response code: " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        System.out.println(response.toString());                        
    }       
}