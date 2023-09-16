package ua.lviv.lgs.overload;

@FunctionalInterface
interface OverloadConstructor {
    Overload create(int a, int b, int c);
}