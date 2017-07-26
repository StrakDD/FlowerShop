package ua.home.work.model.entity;

import ua.home.work.model.entity.Plant.Flower;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class Accessory {
    private Flower flower;
    private boolean wrap;
    private boolean ribbon;
    private boolean basket;

    public Accessory(Flower flower){
        this(flower, false, false, false);
    }

    public Accessory(Flower flower, boolean wrap, boolean ribbon, boolean basket){
        this.flower = flower;
        this.wrap = wrap;
        this.ribbon = ribbon;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "flower=" + flower +
                ", wrap=" + wrap +
                ", ribbon=" + ribbon +
                ", basket=" + basket +
                '}';
    }
}
