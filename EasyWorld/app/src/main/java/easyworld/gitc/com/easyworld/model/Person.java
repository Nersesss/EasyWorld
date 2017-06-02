package easyworld.gitc.com.easyworld.model;

public class Person {

    private String name;
    private boolean userLogined;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {}

    public Person(String name) {

        this.name = name;
    }

    public boolean isUserLogined() {
        return userLogined;
    }

    public void setUserLogined(boolean userLogined) {
        this.userLogined = userLogined;
    }
}
