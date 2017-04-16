package wangyikai.bwie.com.a0415ceshi.bean;

/**
 * date: 2017/4/16.
 * author: 王艺凯 (lenovo )
 * function:
 */

public class ListBean {
    private String title;
    private String price;
    private String apply;

    public ListBean(String title, String price, String apply) {
        this.title = title;
        this.price = price;
        this.apply = apply;
    }

    public ListBean() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
