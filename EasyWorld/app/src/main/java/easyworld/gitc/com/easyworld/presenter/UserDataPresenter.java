package easyworld.gitc.com.easyworld.presenter;

import easyworld.gitc.com.easyworld.interactors.SavingDataInteractorImpl;
import easyworld.gitc.com.easyworld.model.Person;

public class UserDataPresenter implements BasePresenter {

    private final SavingDataInteractorImpl savingImpl;

    public UserDataPresenter() {
        savingImpl = new SavingDataInteractorImpl();
    }

    /**
     *  Saving user data
     * @param person
     */
    public void saveUserInfo(Person person) {
        savingImpl.saveUserData(person);
    }

    public Person checkAndGetUserInfo() {
        return savingImpl.getUserData();
    }
}
