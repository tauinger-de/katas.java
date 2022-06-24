package katas.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstanceOfTest {

    /**
     * We will use OOP practices to instantiate a Cat and a Shark and check that they are of the correct types.
     *
     * The type hierarchy is expected to be like this:
     *
     * Vertebrate --> Mammal --> Cat
     *            \-> Fish --> Shark
     *
     * Each vertebrate has a name.
     */
    @Test
    void instanceOfTest() {
        // a cat is a mammal and a vertebrate
        Cat cat = new Cat("Niko");
        Assertions.assertThat(cat).isInstanceOf(Mammal.class);
        Assertions.assertThat(cat).isInstanceOf(Vertebrate.class);

        // each vertebrate has a name -- TODO uncomment the next two lines
//        Vertebrate vertebrate = cat;
//        Assertions.assertThat(vertebrate.getName()).isEqualTo("Niko");

        // a shark is a fish and a vertebrate but never a mammal
        Shark shark = new Shark("Bruce");
        Assertions.assertThat(shark).isInstanceOf(Fish.class);
        Assertions.assertThat(shark).isInstanceOf(Shark.class);
        Assertions.assertThat(shark).isNotInstanceOf(Mammal.class);

        // TODO feel free to add a name check for the shark!
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