package katas.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstanceOfTest {

    /**
     * We will use OOP practices to instantiate a Cat and a Shark and check that they are of the
     * correct types.
     * <p>
     * The type hierarchy is expected to be like this:
     * <p><pre>
     * Vertebrate --> Mammal --> Cat
     *            \-> Fish --> Shark
     * </pre>
     * <p>
     * Each vertebrate has a name.
     * <p>
     * Task: Add `extends` clauses and other required statements to the classes below to make the
     * test work! Also uncomment the two lines below -- they are commented to make the yet
     * unfinished code compile.
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
        Assertions.assertThat(shark).isInstanceOf(UnderWaterAnimal.class);
        Assertions.assertThat(shark).isNotInstanceOf(Mammal.class);

        // TODO feel free to add a name check for the shark!
    }
}


class Vertebrate {
}


class Mammal {
}


class Cat {
    public Cat(String name) {
    }
}


class Fish {
}


class Shark {
    public Shark(String name) {
    }
}

interface UnderWaterAnimal {

}