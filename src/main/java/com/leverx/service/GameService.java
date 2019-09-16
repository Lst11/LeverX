package com.leverx.service;

import com.leverx.entity.Game;

import java.util.List;

public interface GameService {
    List<Game> getAll();

    Game save(Game game);

    List<Game> getByUserId(int userId);

    void remove(int gameId);

    void update(int gameId, Game updatedGame);
}