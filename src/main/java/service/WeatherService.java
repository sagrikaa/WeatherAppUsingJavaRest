/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import model.Forecast;

/**
 *
 * @author sagri
 */
@Path("weather")
@Produces("application/json")
public class WeatherService {
    
    
// First Endpoint to get weather for city of toronto    
    @GET
    
    public String weather(){
        
        Client client = ClientBuilder.newClient();
        WebTarget resource = client.target("https://api.openweathermap.org/data/2.5/weather?q=toronto&appid=37e59ddebcf76adcf1b7cedb48db674a");
        
        Invocation.Builder request = resource.request();
        Response response = request.get();
        if(response.getStatus() == 200){
            System.out.println("success");
           String output= response.readEntity(String.class);
           Gson gson = new Gson();
            Forecast forecast = gson.fromJson(output, Forecast.class);
           return gson.toJson(forecast);
           }
        return "weather";
    }
    
   
    /*Second Endppoint to get weather for your city*/
       
    @GET
    @Path("{city}")
    public String weather(@PathParam("city") String city){
        
        Client client = ClientBuilder.newClient();
        WebTarget resource = client.target("https://api.openweathermap.org/data/2.5/weather?appid=37e59ddebcf76adcf1b7cedb48db674a").queryParam("q", city);
        
        Invocation.Builder request = resource.request();
        Response response = request.get();
        if(response.getStatus() == 200){
            System.out.println("success");
           String output= response.readEntity(String.class);
           Gson gson = new Gson();
            Forecast forecast = gson.fromJson(output, Forecast.class);
           return gson.toJson(forecast);
           }
        return "weather";
    }
    
// https://api.openweathermap.org/data/2.5/forecast?id=524901&appid=37e59ddebcf76adcf1b7cedb48db674a
}
