/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sagri
 */
public class Forecast {
    private Coordinate coord;
            private List<Weather> weather = new ArrayList<>();
            private String base;
            private Main main;
            private double visibility;
//            private double clouds;
            private Sys sys;
            private int id;
            private String name;
            private Wind wind;

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
            
    public Forecast() {
    }

 
    private double cod;

    public Coordinate getCoord() {
        return coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Forecast(Coordinate coord, String base, Main main, double visibility, Sys sys, int id, String name, double cod) {
        this.coord = coord;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
//        this.clouds = clouds;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

  

  
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

//    public double getClouds() {
//        return clouds;
//    }
//
//    public void setClouds(double clouds) {
//        this.clouds = clouds;
//    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCod() {
        return cod;
    }

    public void setCod(double cod) {
        this.cod = cod;
    }
            
}
