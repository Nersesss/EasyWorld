package easyworld.gitc.com.easyworld.interactors;

import easyworld.gitc.com.easyworld.model.Person;

public interface SavingDataInteractor {
    void saveUserData(Person person);
    Person getUserData();
}
