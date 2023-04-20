package spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class ComplexService1 {

    RandomNumberService randomNumberService;

    SomeService someService;

    public ComplexService1() {
    }

    // You are not allowed to edit the code above!

    // Start typing your code BELOW THIS LINE ONLY

    @Autowired
    public void setDependencies(RandomNumberService rs, SomeService ss) {
        this.randomNumberService = rs;
        this.someService = ss;
    }
}
