package brauliomendez.com.mimonitest.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Braulio on 14/01/2017.
 */

public class Experience {

    private String city;

    @SerializedName("city_experiences")
    private List<CityExperience> cityExperiences = new ArrayList<>();

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<CityExperience> getCityExperiences() {
        return cityExperiences;
    }

    public void setCityExperiences(List<CityExperience> cityExperiences) {
        this.cityExperiences = cityExperiences;
    }

}
