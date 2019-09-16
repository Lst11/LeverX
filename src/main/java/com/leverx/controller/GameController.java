package com.leverx.controller;

import com.leverx.entity.Game;
import com.leverx.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService service;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Game> getAllGames() {
        return service.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Game saveGame(@RequestBody Game game) {
        return service.save(game);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Game> getGamesForUser(@PathVariable("id") int userId) {
        return service.getByUserId(userId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable("id") int gameId) {
        service.remove(gameId);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public void update(@PathVariable("id") int gameId, @RequestBody Game updatedGame) {
        service.update(gameId, updatedGame);
    }
}