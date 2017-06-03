package easyworld.gitc.com.easyworld.interactors;

import easyworld.gitc.com.easyworld.interactors.bo.PersonBo;

public interface SavingDataInteractor {
    void saveUserData(PersonBo person);
    PersonBo getUserData();
}
