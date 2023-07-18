package com.example.word_guesser.controllers;

import com.example.word_guesser.models.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @GetMapping
    public Game newGame() {
        return new Game("hello");
    }

}
