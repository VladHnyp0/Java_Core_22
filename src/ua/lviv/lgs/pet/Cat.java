package ua.lviv.lgs.pet;

public class Cat extends Pet {
    @Override
    Voice getVoice() {
        return () -> System.out.println("Я кіт - Мяууу-Мяууу");
    }
}