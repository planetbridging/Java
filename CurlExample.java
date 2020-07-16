/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curlexample;

/**
 *
 * @author the-s
 */

import java.io.*;
import java.net.*;

public class CurlExample {

    
     private final static String Auth = "Basic MY_AUTH_CODE";
    private final static String app_id = "MY_APP_ID";
    private final static String app_key = "MY_APP_KEY";
    
    public static void main(String[] args) {
        CurlExample ce = new CurlExample();
    }
    
    private void RunCurl() throws MalformedURLException, IOException{
        String stringUrl = "THIRD_PARTY_URL";
        URL url = new URL(stringUrl);
        URLConnection uc = url.openConnection();
         
        uc.setRequestProperty("Authorization:", Auth);
        uc.getContentType();
        uc.addRequestProperty("app_id:", app_id);
        uc.addRequestProperty("app_key", app_key);
         
        InputStreamReader is = new InputStreamReader(uc.getInputStream());
         
        System.out.println(is);
    }
    
    
    
}
