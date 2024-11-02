import java.util.ArrayList;
import java.util.List;

import Enums.City;

public class Theatre {
    int theatreId;
    Address address;
    City city;
    List<Screen> screen = new ArrayList<>();
    List<Show> shows = new ArrayList<>();

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Screen> getScreen() {
        return screen;
    }

    public void setScreen(List<Screen> screen) {
        this.screen = screen;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}