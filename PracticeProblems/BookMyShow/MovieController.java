import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import Enums.City;

public class MovieController {
    HashMap<City,List<Movie>>cityMovieMap;
    List<Movie>movies;
    
    public MovieController(){
        cityMovieMap = new HashMap<>();
        movies = new ArrayList<>();
    }

    void addMovie(Movie movie, City city){
        movies.add(movie);

        List<Movie>cityMovies = cityMovieMap.getOrDefault(city, new ArrayList<>());

        cityMovieMap.put(city, cityMovies);
    }

    Movie getMovieByName(String movieName){
        for (Movie movie : movies) {
            if(movie.movieName.equals(movieName)){
                return movie;
            }
        }

        return null;
    }

    List<Movie> getMoviesByCity(City city){
        return cityMovieMap.getOrDefault(city, new ArrayList<>());
    }

    //REMOVE movie from a particular city, make use of cityVsMovies map

    //UPDATE movie of a particular city, make use of cityVsMovies map

    //CRUD operation based on Movie ID, make use of allMovies list

}
