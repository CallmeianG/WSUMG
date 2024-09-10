/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasApi;
import com.edu.umg.dpbase64.DpBase64_descodificar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.JSONObject;

/**
 *
 * @author Ian
 */
public class pruebasApi {
    public static void main(String[] args) throws MalformedURLException, IOException{
    
      // URL del WebService
            String url = "http://localhost:8080/WSUMG/resources/WSUMGH/pruebaUMG";
     // Crear la conexión
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
                      
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();         
       // Obtener la respuesta en Base64
       String base64Response = response.toString();
        
      DpBase64_descodificar dconf = new DpBase64_descodificar();
      
        
      JSONObject jsonDecodificado = dconf.decodificar(base64Response);
      
      String nombre = (String) jsonDecodificado.get("Nombre");
      String apellido = (String) jsonDecodificado.get("Apellido");
      
      System.out.println("Nombre: " + nombre);
      System.out.println("Apellido: " + apellido);
      
    
    
    
    }
}
