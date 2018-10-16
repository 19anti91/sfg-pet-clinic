package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Anti1991 on 10/8/2018
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
