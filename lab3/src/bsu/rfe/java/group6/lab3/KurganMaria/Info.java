package bsu.rfe.java.group6.lab3.KurganMaria;

public class Info {
    private final String surname = "Курган";
    private final int group = 6;

    @Override
    public String toString() {
        return "Фамилия " + surname + " " +
                ", Группа " + group;
    }
}
