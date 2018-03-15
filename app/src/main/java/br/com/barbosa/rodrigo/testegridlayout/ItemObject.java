package br.com.barbosa.rodrigo.testegridlayout;

/**
 * Created by rodrigobarbosa on 15/03/18.
 */

public class ItemObject {

    public ItemObject(String name, int photo) {
        Name = name;
        Photo = photo;
    }

    private String Name;
    private int Photo;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
