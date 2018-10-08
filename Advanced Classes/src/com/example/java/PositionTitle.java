package com.example.java;

public enum PositionTitle {
    ADMINISTRATION("Administration"), PRODUCTION("Production"), SALES("Sales"), MAINTENANCE("Maintenance"), TECHNICAL("Technical"), SECRETARIAL("Secretarial");

    private String pos;

    PositionTitle(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return pos;
    }
}