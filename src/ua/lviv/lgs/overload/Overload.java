package ua.lviv.lgs.overload;

public class Overload {
    int a;
    int b;
    int c;

    public Overload(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Overload{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}