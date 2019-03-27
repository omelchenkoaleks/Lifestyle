package com.omelchenkoaleks.fish;

public class Fish {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Fish[] fishArray = {
            new Fish("crucian", "dwells everywhere", R.drawable.crucian),
            new Fish("carp", "desired fish", R.drawable.carp),
            new Fish("pike", "favorite fish", R.drawable.pike),
    };

    public Fish(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
