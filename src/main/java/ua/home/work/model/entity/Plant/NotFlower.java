package ua.home.work.model.entity.Plant;

/**
 * Created by Denis Starovoitenko on 27.07.2017.
 */
public class NotFlower implements Plant {
    private Sort sort;

    public NotFlower(Sort sort){
        this.sort = sort;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
