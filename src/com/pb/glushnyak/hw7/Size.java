package com.pb.glushnyak.hw7;

public enum Size {
    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M("Взрослый размер", 38),
    L("Взрослый размер", 40);

    private String description;
    private int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription(Size size) {
        switch (size) {
            case XXS:
                return "Детский размер";
            default:
                return "Взрослый размер";
        }
    }

    public int getEuroSize(Size size) {
        switch (size) {
            case XXS:
                return (32);
            case XS:
                return (34);
            case S:
                return (36);
            case M:
                return (38);
            case L:
                return (40);
            default:
                return (0);
        }
    }
}
