package ua.home.work.model.entity.Instances;

import ua.home.work.model.entity.Accessory;
import ua.home.work.model.entity.Bouquet;
import ua.home.work.model.entity.Plant.Color;
import ua.home.work.model.entity.Plant.Flower;
import ua.home.work.model.entity.Plant.Stalk;

import java.util.Date;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public enum InstancesStalk {
    LONG {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLE_COLOR, Stalk.LONG);
            Accessory accessory = new Accessory(flower);

            return new Bouquet(3,accessory, new Date());
        }
    },
    MIDDLE {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLE_COLOR, Stalk.MIDDLE);
            Accessory accessory = new Accessory(flower);

            return new Bouquet(3,accessory, new Date());
        }
    },
    SHORT {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLE_COLOR, Stalk.SHORT);
            Accessory accessory = new Accessory(flower);

            return new Bouquet(3,accessory, new Date());
        }
    },
    ABSENCE {
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLE_COLOR, Stalk.ABSENCE);
            Accessory accessory = new Accessory(flower);

            return new Bouquet(3,accessory, new Date());
        }
    };

    abstract public Bouquet getInstance();
}
