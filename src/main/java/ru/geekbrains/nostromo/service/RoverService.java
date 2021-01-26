package ru.geekbrains.nostromo.service;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.geekbrains.nostromo.entity.Rover;
import ru.geekbrains.nostromo.entity.repository.RoverRepository;

import java.util.List;

@Service
@Component
@Slf4j
public class RoverService {
    private final RoverRepository roverRepository;

    @Autowired
    public RoverService(RoverRepository roverRepository) {
        log.info("Get all rovers");
        this.roverRepository = roverRepository;
    }



    public List<Rover> getAllRovers(){
        return roverRepository.findAll();
    }
}
