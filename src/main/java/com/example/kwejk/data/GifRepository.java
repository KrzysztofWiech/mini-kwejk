package com.example.kwejk.data;

import com.example.kwejk.model.Gif;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

//tworzy klasę w której obiekt będziemy mogli wstrzikiwać w innej klasie
@Component
public class GifRepository {

    //jeśli lista jest generyczna to moze przechowywać różne typy
    //lista gifów
    public final static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "mols", true, 1),
            new Gif("ben-and-mike", "mika", false, 2),
            new Gif("book-dominos", "mem", true, 1),
            new Gif("compiler-bot", "bot", false, 3),
            new Gif("cowboy-coder", "coder", true, 1),
            new Gif("infinite-andrew", "anrew", true, 1)
    );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }
}
