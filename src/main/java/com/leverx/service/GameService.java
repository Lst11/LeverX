package com.leverx.service;

import com.leverx.entity.Game;

import java.util.List;

public interface GameService {
    Game save(Game game);

    void remove(int gameId);

    void update(int gameId, Game updatedGame);

    List<Game> getAll();

    List<Game> getByUserId(int userId);
}