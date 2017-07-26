package ua.home.work;

import ua.home.work.model.entity.Bouquet;
import ua.home.work.model.entity.Instances.InstancesEvent;
import ua.home.work.model.entity.Instances.InstancesFresh;
import ua.home.work.model.entity.Instances.InstancesMoney;
import ua.home.work.model.entity.Instances.InstancesStalk;

public class Main {

    public static void main( String[] args ) {
        Bouquet bouquet1 = InstancesMoney.VIP.getInstance();
        Bouquet bouquet2 = InstancesMoney.EXPENSIVE.getInstance();
        Bouquet bouquet3 = InstancesMoney.CHEAP.getInstance();

        Bouquet bouquet4 = InstancesEvent.WEDDING.getInstance();
        Bouquet bouquet5 = InstancesEvent.SIMPLE.getInstance();

        Bouquet bouquet6 = InstancesStalk.LONG.getInstance();
        Bouquet bouquet7 = InstancesStalk.ABSENCE.getInstance();

        Bouquet bouquet8 = InstancesFresh.FRESH.getInstance();
        Bouquet bouquet9 = InstancesFresh.FADE.getInstance();
        Bouquet bouquet10 = InstancesFresh.NORMAL.getInstance();


        System.out.println(bouquet1);
        System.out.println(bouquet4);
    }
}
