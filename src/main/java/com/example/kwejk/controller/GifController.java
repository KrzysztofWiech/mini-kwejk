package com.example.kwejk.controller;

import com.example.kwejk.data.CategoryRepository;
import com.example.kwejk.data.GifRepository;
import com.example.kwejk.model.Gif;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class GifController {

    @Autowired
    GifRepository gifRepository;


    //metoda wyświetlająca wszystkie gify
//    @RequestMapping("/")//RequestMapping - bardziej działa jako get
//    public String listGifs(ModelMap modelMap) {
//
//        //1 wyciąganie gifów
//        List<Gif> gifs = gifRepository.getAllGifs();
//
//        //2 przekazanie gifa do view(frontEnd'u)
//        modelMap.put("gifs", gifs);
//
//        //wyciąganie gifów
//        return "home";
//    }

    //RequestMapping
    @RequestMapping("/favorites")
    public String gifFavourites(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.getFavorites();
        modelMap.put("gifs", gifs);
        return "favorites";
    }

    //odpalanie strony głównej, jednocześnie z działającym wyszukiwaniem z metody(contains)
    @RequestMapping("/")
    public String getNameGif(@RequestParam(required = false) String q, ModelMap modelMap) {
        List<Gif> gifs;

        if (q != null) {

            gifs = gifRepository.getSearchNameGifs(q);
        } else {
            gifs = gifRepository.ALL_GIFS;
        }
        modelMap.put("gifs", gifs);
        return "home";
    }
}


