package ua.home.work.model.entity.Instances;

import ua.home.work.model.entity.Accessory;
import ua.home.work.model.entity.Bouquet;
import ua.home.work.model.entity.Plant.Color;
import ua.home.work.model.entity.Plant.Flower;

import java.util.Calendar;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public enum InstancesFresh {
    FRESH {
        @Override
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLE_COLOR);
            Accessory accessory = new Accessory(flower);
            Calendar calendar = Calendar.getInstance();

            return new Bouquet(1,accessory, calendar.getTime());
        }
    },
    NORMAL {
        @Override
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLE_COLOR);
            Accessory accessory = new Accessory(flower);
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_MONTH, -5);

            return new Bouquet(3,accessory, calendar.getTime());
        }
    },
    BAD {
        @Override
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLE_COLOR);
            Accessory accessory = new Accessory(flower);
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_MONTH, -15);

            return new Bouquet(5,accessory, calendar.getTime());
        }
    },
    FADE {
        @Override
        public Bouquet getInstance() {
            Flower flower = new Flower(Color.SINGLE_COLOR);
            Accessory accessory = new Accessory(flower);
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MONTH, -1);

            return new Bouquet(5,accessory, calendar.getTime());
        }
    };

    abstract public Bouquet getInstance();
}
