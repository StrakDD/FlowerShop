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

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    public boolean isWrap() {
        return wrap;
    }

    public void setWrap(boolean wrap) {
        this.wrap = wrap;
    }

    public boolean isRibbon() {
        return ribbon;
    }

    public void setRibbon(boolean ribbon) {
        this.ribbon = ribbon;
    }

    public boolean isBasket() {
        return basket;
    }

    public void setBasket(boolean basket) {
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
