package ua.home.work.model.entity;

import ua.home.work.model.entity.Plant.Color;
import ua.home.work.model.entity.Plant.Flower;
import ua.home.work.model.entity.Plant.Plant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class Bouquet {
    private Accessory accessory;
    private int number;
    private List<Plant> plants;
    private Date create;

    public Bouquet(){
        this(1, new Accessory(new Flower(Color.SINGLECOLOR)), new Date());
    }

    public Bouquet(int number, Accessory accessory, Date create){
        this.number = number;
        this.accessory = accessory;
        this.create = create;
        plants = new ArrayList<Plant>();
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("******BOUQUET*******");
        builder.append("\n");
        builder.append(accessory + "\n");
        builder.append("Number of Flowers: " + number + "\n");
        builder.append("Date of creation: " + create + "\n");
        builder.append("Plants: " + plants + "\n");

        return builder.toString();
    }
}
