package brauliomendez.com.mimonitest.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Braulio on 13/01/2017.
 */

public class AccommodationResponse {

    private List<Accommodation> accommodation = new ArrayList<Accommodation>();

    public List<Accommodation> getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(List<Accommodation> accommodation) {
        this.accommodation = accommodation;
    }
}
