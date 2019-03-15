package com.example.kwejk.data;

import com.example.kwejk.model.Gif;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//tworzy klasę w której obiekt będziemy mogli wstrzikiwać w innej klasie
//Adnotacja @Component pozwala nam na wykorzystanie adnotacji @Autowired czyli wstrzykniecie zaleznosci do @Controller
@Component
public class GifRepository {

    //jeśli lista jest generyczna to moze przechowywać różne typy
    //lista gifów
    public final static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "mols", true, 1),
            new Gif("ben-and-mike", "mika", false, 2),
            new Gif("book-dominos", "mem", true, 0),
            new Gif("compiler-bot", "bot", false, 2),
            new Gif("cowboy-coder", "coder", true, 1),
            new Gif("infinite-andrew", "anrew", true, 0)
    );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public static List<Gif> getFavorites() {
        List<Gif> gifs = new ArrayList<>();

        for (Gif gif : ALL_GIFS) {
            if (gif.getFavorite() == true) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

    public List<Gif> getGifsByCategoryId(int id) {
        List<Gif> categoryGifs = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getCategoryId() == id) {
                categoryGifs.add(gif);
            }

        }
        return categoryGifs;
    }
}
