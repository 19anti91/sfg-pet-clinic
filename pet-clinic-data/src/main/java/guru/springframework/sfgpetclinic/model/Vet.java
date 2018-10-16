package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Anti1991 on 10/8/2018
 */
public class Vet extends Person {

    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
