package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Gif;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {

    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("toobad", LocalDate.of(2019, 2, 23), "Erika Languirand", true, 401),
            new Gif("exhausting", LocalDate.of(2019, 2, 23), "Jen Bloomer", false, 401),
            new Gif("headtilt", LocalDate.of(2019, 2, 23), "Dan Newport", true, 227),
            new Gif("corgibeg", LocalDate.of(2019, 2, 23), "Matt of Lansing", false, 227),
            new Gif("hugemistake", LocalDate.of(2019, 2, 23), "Erika Languirand", true, 610),
            new Gif("whatisaid", LocalDate.of(2019, 2, 23), "Dan Newport", true, 401),
            new Gif("battlestar", LocalDate.of(2019, 2, 26), "Joe Double", true, 227),
            new Gif("notwatchingstartrek", LocalDate.of(2019,2,26), "Joe Double", true, 227),
            new Gif("greysanatomy", LocalDate.of(2019, 2, 26), "Joe Double", true, 227),
            new Gif("beetsbearsbattlestargalacticaoffice", LocalDate.of(2019, 2, 26), "Joe Double", true, 227),
            new Gif("spocklivelongandprosperstartrek", LocalDate.of(2019, 2, 26), "Joe Double", true, 227),
            new Gif("startrekshittogether", LocalDate.of(2019, 2, 26), "Joe Double", true, 227));

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equalsIgnoreCase(name)) {
                return gif;
            }
        }
        return null;
    }

    public Gif findFavorite(Boolean favorite) {
        for (Gif gif : ALL_GIFS) {
            if (gif.isFavorite() == true) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> findByCategoryID(int categoryID) {

        List<Gif> gifsInCategory = new ArrayList<>();

        for (Gif gif : ALL_GIFS) {
            if (gif.getId() == categoryID) {
                gifsInCategory.add(gif);
            }
        }
        return gifsInCategory;
    }

    public List<Gif> searchByName(String name) {

        List<Gif> searchResultsArray = new ArrayList<>();

        for (Gif gif : ALL_GIFS) {
            if (gif.getName().contains(name)) {
                searchResultsArray.add(gif);
            }
        }
        return searchResultsArray;
    }
}

