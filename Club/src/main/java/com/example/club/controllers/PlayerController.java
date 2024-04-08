package com.example.club.controllers;

import com.example.club.model.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PlayerController {

    @GetMapping("players")
    public ResponseEntity<List<Player>> getPlayer(){
        List<Player> player = new ArrayList<>();
        return ResponseEntity.ok(player);
    }

    @PostMapping("players/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Player> createPlayer(@RequestBody Player player){
        System.out.println(player.getPlayerName());

    return new ResponseEntity<>(player, HttpStatus.CREATED);
    }

    @PutMapping("players/{id}/update")
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player, @PathVariable("id")int playerId){
        System.out.println(player.getPlayerName());
        return ResponseEntity.ok(player);
    }

}
