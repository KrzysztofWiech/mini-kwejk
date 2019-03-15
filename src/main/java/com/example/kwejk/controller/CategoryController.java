package com.example.kwejk.controller;

import com.example.kwejk.data.CategoryRepository;
import com.example.kwejk.data.GifRepository;
import com.example.kwejk.model.Category;
import com.example.kwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap) {
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";
    }

    @RequestMapping("category/{id}")
    public String getOfCategories(@PathVariable int id, ModelMap modelMap) {
        List<Gif> gifs = gifRepository.getGifsByCategoryId(id);
        modelMap.put("gifs", gifs);
        //id przekazuje id do argumentu id a PathVariable odczytuje id ze ścieżki {id}
        modelMap.put("category", categoryRepository.getCategoryById(id));
        return "category";
    }
}
