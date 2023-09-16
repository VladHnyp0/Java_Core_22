package ua.lviv.lgs.pet;

public class Dog extends Pet {
    @Override
    Voice getVoice() {
        return () -> System.out.println("Я пес - Гаууу-Гаууу");
    }
}