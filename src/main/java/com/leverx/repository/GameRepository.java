package com.leverx.repository;

import com.leverx.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Integer> {

    @Query("select game from Game game where game.author = :userId")
    List<Game> getByAuthorId(@Param("userId") int userId);

    default void update(int id, Game updatedGame) {
        Game gameToUpdate = this.getOne(id);
        gameToUpdate.setTitle(updatedGame.getTitle());
        gameToUpdate.setStatus(updatedGame.getStatus());
        gameToUpdate.setUpdatedAt(updatedGame.getUpdatedAt());
        this.saveAndFlush(gameToUpdate);
    }
}