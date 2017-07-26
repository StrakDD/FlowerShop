package ua.home.work.model.entity.Plant;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class Flower implements Plant {
    private Color color;
    private boolean support;
    private boolean fertilize;
    private Stalk stalk;

    public Flower(Color color){
        this(color, true, true, Stalk.LONG);
    }

    public Flower(Color color, Stalk stalk){
        this(color, true, true, stalk);
    }

    public Flower(Color color, boolean support, boolean fertilize, Stalk stalk){
        this.color = color;
        this.support = support;
        this.fertilize = fertilize;
        this.stalk = stalk;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isSupport() {
        return support;
    }

    public void setSupport(boolean support) {
        this.support = support;
    }

    public boolean isFertilize() {
        return fertilize;
    }

    public void setFertilize(boolean fertilize) {
        this.fertilize = fertilize;
    }

    public Stalk getStalk() {
        return stalk;
    }

    public void setStalk(Stalk stalk) {
        this.stalk = stalk;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color=" + color +
                ", support=" + support +
                ", fertilize=" + fertilize +
                ", stalk=" + stalk +
                '}';
    }
}
