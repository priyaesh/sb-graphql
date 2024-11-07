package com.example.sp_graphql.demo.controller;

import com.example.sp_graphql.demo.model.Player;
import com.example.sp_graphql.demo.service.PlayerService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

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
}
