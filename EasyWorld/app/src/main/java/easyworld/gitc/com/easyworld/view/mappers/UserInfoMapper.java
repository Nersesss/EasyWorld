package easyworld.gitc.com.easyworld.view.mappers;

import easyworld.gitc.com.easyworld.interactors.bo.PersonBo;
import easyworld.gitc.com.easyworld.model.Person;

public class UserInfoMapper {

    public static PersonBo toBo(Person person) {
        PersonBo personBo = new PersonBo();

        if (person != null) {
                personBo.setName(person.getName());
                personBo.setUserLogined(person.isUserLogined());
                }

                return personBo;
                }

public static Person toModel(PersonBo personBo) {
        Person person = new Person();
        if (personBo != null) {
        person.setName(personBo.getName());
        person.setUserLogined(personBo.isUserLogined());
        }

        return person;
        }
        }