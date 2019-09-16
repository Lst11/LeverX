package com.leverx.repository;

import com.leverx.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {

    default void update(int id, Game updatedGame) {
        Game gameToUpdate = this.getOne(id);
        gameToUpdate.setTitle(updatedGame.getTitle());
        gameToUpdate.setStatus(updatedGame.getStatus());
        gameToUpdate.setUpdatedAt(updatedGame.getUpdatedAt());
        this.saveAndFlush(gameToUpdate);
    }
}