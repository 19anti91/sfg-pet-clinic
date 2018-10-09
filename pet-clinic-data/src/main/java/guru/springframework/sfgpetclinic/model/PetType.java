package guru.springframework.sfgpetclinic.model;

/**
 * Created by Anti1991 on 10/8/2018
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
