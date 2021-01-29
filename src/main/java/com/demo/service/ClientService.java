package com.demo.service;

import com.demo.model.Client;
import com.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    public ClientRepository clientRepository;

    public List<Client> list(){
        return this.clientRepository.findAll();
    }

    public void register(Client input){
        this.clientRepository.save(input);
    }

}
