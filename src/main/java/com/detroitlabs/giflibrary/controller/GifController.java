package com.detroitlabs.giflibrary.controller;

import com.detroitlabs.giflibrary.data.GifRepository;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping(value = "/")
    public String displayGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("allGifs", allGifs);
        return "home";
    }

    @RequestMapping(value = "/", params = "q")
    public String searchGifs(@RequestParam("q") String searchTerm, ModelMap modelMap){
        List<Gif> searchResults = gifRepository.searchByName(searchTerm);
        modelMap.put("searchResults", searchResults);
        return "searchresults";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }

    @RequestMapping("/favorites")
    public String displayFavorites(ModelMap modelMap) {
        Gif allFavorites = gifRepository.findFavorite(false);
        modelMap.put("allFavorites", allFavorites);
        return "favorites";
    }

}
