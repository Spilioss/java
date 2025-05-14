//ascending sorting method based on the release year

import java.util.Comparator;

public class MovieYearComparator implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getYear(), m2.getYear()); 
    }
}
