package exercise1_6;

public class TestMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat1");
        cat1.greets();

        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2");
        dog1.greets();
        dog1.greets(dog2);

        BigDog bigDog1 = new BigDog("bigdog1");
        BigDog bigDog2 = new BigDog("bigdog2");
        bigDog1.greets();
        bigDog1.greets(bigDog2);
        bigDog1.greets(dog1);
    }
}
