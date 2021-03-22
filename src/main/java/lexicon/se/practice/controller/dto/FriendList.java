package lexicon.se.practice.controller.dto;

public class FriendList {

    private int id;
    private String name;

    public FriendList() {
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

    @Override
    public String toString() {
        return "FriendList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
