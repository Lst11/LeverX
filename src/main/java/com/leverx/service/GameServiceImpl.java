package com.leverx.service;

import com.leverx.entity.Game;
import com.leverx.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GameRepository repository;

    @Override
    public List<Game> getAll() {
        return repository.findAll();
    }

    @Override
    public Game save(Game game) {
        game.setCreatedAt(LocalDateTime.now());
        return repository.saveAndFlush(game);
    }

    @Override
    public List<Game> getByUserId(int userId) {
        return null;
    }

    @Override
    public void remove(int gameId) {
        repository.deleteById(gameId);
    }

    @Override
    public void update(int gameId, Game updatedGame) {
        updatedGame.setUpdatedAt(LocalDateTime.now());
        repository.update(gameId, updatedGame);
    }
}