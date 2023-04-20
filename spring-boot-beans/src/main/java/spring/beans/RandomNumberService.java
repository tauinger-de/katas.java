package spring.beans;

import org.springframework.stereotype.Service;

@Service
public class RandomNumberService {

    public RandomNumberService(RandomNumberGenerator generator) {
        this.generator = generator;
    }

    private final RandomNumberGenerator generator;
}
