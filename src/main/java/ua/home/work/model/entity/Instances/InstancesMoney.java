package ua.home.work.model.entity.Instances;

import ua.home.work.model.entity.Accessory;
import ua.home.work.model.entity.Bouquet;
import ua.home.work.model.entity.Plant.Color;
import ua.home.work.model.entity.Plant.Flower;

import java.util.Date;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public enum InstancesMoney {
    CHEAP(3) {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLE_COLOR);
            Accessory accessory = new Accessory(flower);

            return new Bouquet(getNumber(),accessory, getDate());
        }
    },
    BUDGETARY(15) {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLE_COLOR);
            Accessory accessory = new Accessory(flower, true, false, false);

            return new Bouquet(getNumber(),accessory, getDate());
        }
    },
    EXPENSIVE(35) {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.MULTICOLOR);
            Accessory accessory = new Accessory(flower, true, true, false);

            return new Bouquet(getNumber(),accessory, getDate());
        }
    },
    VIP(101) {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.MULTICOLOR);
            Accessory accessory = new Accessory(flower, true, false, true);

            return new Bouquet(getNumber(),accessory, getDate());
        }
    };

    private int number;
    private Date date = new Date();

    InstancesMoney(int number){
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public abstract Bouquet getInstance();


}
