package android.com.miniproject2.model;

/**
 * Created by nasos on 2017-07-13.
 */

public class ItemData {
    int id;
    String name;
    int img;
    String description;
    int check;

    public ItemData(int id, String name, int img, String description, int check) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.description = description;
        this.check = check;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }
}
