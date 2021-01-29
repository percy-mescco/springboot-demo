package com.demo.controller;

import com.demo.model.Client;
import com.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> List(){
        return this.clientService.list();
    }

    @PostMapping
    public void register(@RequestBody Client input){
        this.clientService.register(input);
    }
}
