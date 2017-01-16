package brauliomendez.com.mimonitest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Braulio on 16/01/2017.
 */

public class Service {

    private String name;

    @SerializedName("app_services")
    private List<ServiceApp> appServices = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ServiceApp> getAppServices() {
        return appServices;
    }

    public void setAppServices(List<ServiceApp> appServices) {
        this.appServices = appServices;
    }

}
