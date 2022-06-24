package katas.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstanceOfTest {

    @Test
    void instanceOfTest() {
        // a cat is a mammal and a vertebrate
        Cat cat = new Cat("Niko");
        Assertions.assertThat(cat).isInstanceOf(Mammal.class);
        Assertions.assertThat(cat).isInstanceOf(Vertebrate.class);

        // each mammal has a name -- TODO uncomment the next two lines
//        Mammal mammal = cat;
//        Assertions.assertThat(mammal.getName()).isEqualTo("Niko");

        // a shark is a fish and a vertebrate but never a mammal
        Shark shark = new Shark("Bruce");
        Assertions.assertThat(shark).isInstanceOf(Fish.class);
        Assertions.assertThat(shark).isInstanceOf(Shark.class);
        Assertions.assertThat(shark).isNotInstanceOf(Mammal.class);
    }
}


class Vertebrate {
}


class Mammal extends Vertebrate {
}


class Cat extends Mammal {
    public Cat(String name) {
    }
}


class Fish extends Vertebrate {
}


class Shark extends Fish {
    public Shark(String name) {
    }
}