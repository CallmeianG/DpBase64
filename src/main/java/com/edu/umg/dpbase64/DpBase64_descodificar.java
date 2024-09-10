/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.umg.dpbase64;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.Base64;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Ian
 */
public class DpBase64_descodificar {
    
     public static JSONObject decodificar(String base64Encoded) {
        try {
            // Decodificar Base64 a bytes
            byte[] decodedBytes = Base64.getDecoder().decode(base64Encoded);

            // Convertir los bytes a string
            String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);

            // Crear un objeto JSONParser
            JSONParser parser = new JSONParser();
            
            // Parsear el String JSON decodificado a JSONObject
            return (JSONObject) parser.parse(decodedString);

        } catch (ParseException e) {
            e.printStackTrace();
            return null; // Retornar null en caso de error
        }
        
     }
}
