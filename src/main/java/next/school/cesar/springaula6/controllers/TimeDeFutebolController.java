package next.school.cesar.springaula6.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import next.school.cesar.springaula6.entities.TimeDeFutebol;
import next.school.cesar.springaula6.repositories.TimeDeFutebolRepository;

@RestController
@RequestMapping("/timedefutebolv2")
public class TimeDeFutebolController {
    
    @Autowired
    private TimeDeFutebolRepository repository;

    @GetMapping
    public List<TimeDeFutebol> listTimeDeFutebol(){
        return this.repository.findAll();
    }

    @PostMapping
    public ResponseEntity<TimeDeFutebol> create(@RequestBody @Validated TimeDeFutebol time) {
        if (time.getNome() == "Palavrao") { 
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        time = this.repository.save(time);
        return new ResponseEntity<TimeDeFutebol>(time, HttpStatus.OK);
    }
    
}
