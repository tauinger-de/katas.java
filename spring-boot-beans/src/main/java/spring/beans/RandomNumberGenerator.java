package spring.beans;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomNumberGenerator {

    private final Random random = new Random();

    int nextInt() {
        return random.nextInt();
    }
}
