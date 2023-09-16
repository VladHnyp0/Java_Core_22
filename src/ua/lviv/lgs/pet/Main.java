package ua.lviv.lgs.pet;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

        cat.getVoice().makeSound();
        cow.getVoice().makeSound();
        dog.getVoice().makeSound();
    }
}