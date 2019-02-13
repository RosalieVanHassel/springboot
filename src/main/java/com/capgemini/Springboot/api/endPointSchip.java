package com.capgemini.Springboot.api;

import com.capgemini.Springboot.model.Schip;
import com.capgemini.Springboot.repository.SchipRepository;
import com.capgemini.Springboot.service.SchipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class endPointSchip {

    @Autowired
    public SchipRepository schipRepository;

    @GetMapping("/api")
    public Schip sendJojo(){

        Schip schip = new Schip();
        schip.setNaam("Titanic");
        schipRepository.save(schip);
        System.out.println(schip.getId());

        return schip;
    }

    @GetMapping("/allboots")
    public Iterable<Schip>  toonSchepen(){
        Iterable<Schip> schip = schipRepository.findAll();
        System.out.println(schip);
        return schip;
    }
}
