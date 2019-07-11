package Riotgames.controller;


import Riotgames.service.RiotGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiotGamesController {

    @Autowired
    RiotGamesService riotGamesService;

@GetMapping("/");
public

}
