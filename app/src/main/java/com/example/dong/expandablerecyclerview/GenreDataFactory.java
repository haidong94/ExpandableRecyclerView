package com.example.dong.expandablerecyclerview;

import com.example.dong.expandablerecyclerview.model.Artist;
import com.example.dong.expandablerecyclerview.model.Genre;

import java.util.Arrays;
import java.util.List;

/**
 * Created by DONG on 28-Dec-17.
 */

public class GenreDataFactory {

    public static List<Genre> makeGenres() {
        return Arrays.asList(makeClassicGenre(),
                makeSalsaGenre(),
                makeBluegrassGenre());
    }





    public static List<Artist> makeRockArtists() {
        Artist queen = new Artist("Queen", true);
        Artist styx = new Artist("Styx", false);
        Artist reoSpeedwagon = new Artist("REO Speedwagon", false);
        Artist boston = new Artist("Boston", true);

        return Arrays.asList(queen, styx, reoSpeedwagon, boston);
    }





    public static List<Artist> makeJazzArtists() {
        Artist milesDavis = new Artist("Miles Davis", true);
        Artist ellaFitzgerald = new Artist("Ella Fitzgerald", true);
        Artist billieHoliday = new Artist("Billie Holiday", false);

        return Arrays.asList(milesDavis, ellaFitzgerald, billieHoliday);
    }

    public static Genre makeClassicGenre() {
        return new Genre("Classic", makeClassicArtists());
    }



    public static List<Artist> makeClassicArtists() {
        Artist beethoven = new Artist("Ludwig van Beethoven", false);
        Artist bach = new Artist("Johann Sebastian Bach", true);
        Artist brahms = new Artist("Johannes Brahms", false);
        Artist puccini = new Artist("Giacomo Puccini", false);

        return Arrays.asList(beethoven, bach, brahms, puccini);
    }

    public static Genre makeSalsaGenre() {
        return new Genre("Salsa", makeSalsaArtists());
    }



    public static List<Artist> makeSalsaArtists() {
        Artist hectorLavoe = new Artist("Hector Lavoe", true);
        Artist celiaCruz = new Artist("Celia Cruz", false);
        Artist willieColon = new Artist("Willie Colon", false);
        Artist marcAnthony = new Artist("Marc Anthony", false);

        return Arrays.asList(hectorLavoe, celiaCruz, willieColon, marcAnthony);
    }

    public static Genre makeBluegrassGenre() {
        return new Genre("Bluegrass", makeBluegrassArtists());
    }



    public static List<Artist> makeBluegrassArtists() {
        Artist billMonroe = new Artist("Bill Monroe", false);
        Artist earlScruggs = new Artist("Earl Scruggs", false);
        Artist osborneBrothers = new Artist("Osborne Brothers", true);
        Artist johnHartford = new Artist("John Hartford", false);

        return Arrays.asList(billMonroe, earlScruggs, osborneBrothers, johnHartford);
    }

}
