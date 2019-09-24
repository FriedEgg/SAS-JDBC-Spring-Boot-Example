package com.github.friedegg.demo;

import com.github.friedegg.demo.domain.Iris;
import com.github.friedegg.demo.mapper.IrisMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        logger.info("SELECT * FROM IRIS WHERE Species='Setosa'");
        selectToLog("Setosa");
        logger.info("INSERT INTO IRIS (...) VALUES (...)");
        Iris iris = new Iris();
        iris.setSepalLength(1.0);
        iris.setSepalWidth(1.1);
        iris.setPetalLength(1.2);
        iris.setPetalWidth(1.3);
        iris.setSpecies("FriedEgg");
        irisMapper.insert(iris);
        selectToLog(iris.getSpecies());
        selectToLog("");

        logger.info("Press Ctrl+C to exit");
    }

    private void selectToLog(String species) {
        for (Iris iris : this.irisMapper.findBySpecies(species)) {
            logger.info("Row: " + iris.toString());
        }
    }

}
