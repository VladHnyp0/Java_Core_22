package ua.lviv.lgs.pet;

public class Cow extends Pet {
    @Override
    Voice getVoice() {
        return () -> System.out.println("Я корова - Мууу-Мууу");
    }
}