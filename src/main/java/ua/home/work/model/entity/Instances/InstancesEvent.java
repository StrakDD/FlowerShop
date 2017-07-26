package ua.home.work.model.entity.Instances;

import ua.home.work.model.entity.Accessory;
import ua.home.work.model.entity.Bouquet;
import ua.home.work.model.entity.Plant.Color;
import ua.home.work.model.entity.Plant.Flower;

import java.util.Date;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public enum InstancesEvent {
    SIMPLE {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLECOLOR);
            Accessory accessory = new Accessory(flower);

            return new Bouquet(3,accessory, new Date());
        }
    },
    CELEBRATION {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.MULTICOLOR);
            Accessory accessory = new Accessory(flower, true, true, false);

            return new Bouquet(11,accessory, new Date());
        }
    },
    FUNERAL {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLECOLOR);
            Accessory accessory = new Accessory(flower, false, false, true);

            return new Bouquet(10,accessory, new Date());
        }
    },
    WEDDING {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.MULTICOLOR);
            Accessory accessory = new Accessory(flower, true, true, true);

            return new Bouquet(25,accessory, new Date());
        }
    };

    abstract public Bouquet getInstance();
}
