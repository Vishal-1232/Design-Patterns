import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Enums.City;

public class TheatreController {
    HashMap<City, List<Theatre>> cityTheatreMap;
    List<Theatre> theatres;

    TheatreController() {
        cityTheatreMap = new HashMap<>();
        theatres = new ArrayList<>();
    }

    void addTheatre(City city, Theatre theatre) {
        theatres.add(theatre);

        List<Theatre> cityTheatres = cityTheatreMap.getOrDefault(city, new ArrayList<>());

        cityTheatres.add(theatre);
        cityTheatreMap.put(city, cityTheatres);
    }

    Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {

        // get all the theater of this city

        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        List<Theatre> theatres = cityTheatreMap.get(city);

        // filter the theatres which run this movie

        for (Theatre theatre : theatres) {

            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for (Show show : shows) {
                if (show.movie.getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }
            if (!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }

        return theatreVsShows;
    }

}
