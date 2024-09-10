/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.edu.umg.dpbase64;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.json.simple.JSONObject;
/**
 *
 * @author Ian
 */
public class DpBase64_codificar {

       public static String Codificar(JSONObject json) {
           // Convertir el JSON a String
        String jsonString = json.toString();
        
        // Convertir el string a bytes
        byte[] jsonBytes = jsonString.getBytes(StandardCharsets.UTF_8);
        
        // Codificar a Base64
        String base64Encoded = Base64.getEncoder().encodeToString(jsonBytes);
        
        return base64Encoded;

    }
 
    
}
