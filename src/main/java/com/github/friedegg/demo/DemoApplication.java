package com.github.friedegg.demo;

import com.github.friedegg.demo.domain.Iris;
import com.github.friedegg.demo.mapper.IrisMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    private final IrisMapper irisMapper;

    public DemoApplication(IrisMapper irisMapper) {
        this.irisMapper = irisMapper;
    }

    @Override
    public void run(String... args) {
        for (Iris iris : this.irisMapper.findBySpecies("Setosa")) {
            logger.info("Row: " + iris.toString());
        }
        logger.info("Press Ctrl+C to exit");
    }

}
