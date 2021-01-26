package ru.geekbrains.nostromo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.nostromo.entity.Rover;
import ru.geekbrains.nostromo.entity.repository.RoverRepository;

@Configuration
@Slf4j
public class NostromoConfiguration {

    @Bean
    public CommandLineRunner loadService(RoverRepository roverRepository){
        return args -> {
            log.info("Start load data");
            log.info("Data = {}", roverRepository.save(new Rover("Battle Freanky 0", "777")));
            log.info("Data = {}", roverRepository.save(new Rover("Battle Freanky 1", "716")));
            log.info("Data = {}", roverRepository.save(new Rover("Battle Freanky 2", "MK1")));
            log.info("Data was loaded");
        };
    }
}
