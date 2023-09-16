package ua.lviv.lgs.overload;

public class Main {
    public static void main(String[] args) {
        OverloadConstructor constructor = Overload::new;

        Overload o1 = constructor.create(4, 5, 0);
        Overload o2 = constructor.create(1, 2, 3);

        System.out.println(o1);
        System.out.println(o2);
    }
}