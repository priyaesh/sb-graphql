package com.example.sp_graphql.demo.controller;

import com.example.sp_graphql.demo.model.Player;
import com.example.sp_graphql.demo.model.Team;
import com.example.sp_graphql.demo.service.PlayerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class PlayerController {

    private  final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    @QueryMapping
    public List<Player> findAll(){
        return  playerService.findAll();
    }
    @QueryMapping
    public Optional<Player> findOne(@Argument Integer id){
      return  playerService.findOne(id);
    }
    @MutationMapping
    public  Player create(@Argument String name, @Argument Team team){
        return  playerService.create(name, team);
    }
    @MutationMapping
    public  Player update(@Argument Integer id, @Argument String name, @Argument Team team){
        return  playerService.update(id, name, team);
    }

    @MutationMapping
    public  Player delete(@Argument Integer id){
        return  playerService.delete(id);
    }
}
