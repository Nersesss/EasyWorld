package easyworld.gitc.com.easyworld.view.helpers;

/**
 * Created by User on 01.06.2017.
 */

public class NavViewItem {

    private int imgURL;
    private String name;
    private String num;

    public NavViewItem(int imgURL, String name, String num) {
        this.imgURL = imgURL;
        this.name = name;
        this.num = num;
    }

    public int getImgURL() {
        return imgURL;
    }

    public void setImgURL(int imgURL) {
        this.imgURL = imgURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
