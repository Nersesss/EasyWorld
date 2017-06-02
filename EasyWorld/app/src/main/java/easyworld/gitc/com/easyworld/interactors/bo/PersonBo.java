package easyworld.gitc.com.easyworld.interactors.bo;

public class PersonBo {

    private String name;
    private boolean userLogined;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonBo() {}

    public PersonBo(String name) {
        this.name = name;
    }

    public boolean isUserLogined() {
        return userLogined;
    }

    public void setUserLogined(boolean userLogined) {
        this.userLogined = userLogined;
    }
}
