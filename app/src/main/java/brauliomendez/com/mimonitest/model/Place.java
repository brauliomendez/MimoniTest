package brauliomendez.com.mimonitest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Braulio on 15/01/2017.
 */

public class Place {

    private String city;

    @SerializedName("city_places")
    private List<CityPlace> cityPlaces = null;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<CityPlace> getCityPlaces() {
        return cityPlaces;
    }

    public void setCityPlaces(List<CityPlace> cityPlaces) {
        this.cityPlaces = cityPlaces;
    }

}
