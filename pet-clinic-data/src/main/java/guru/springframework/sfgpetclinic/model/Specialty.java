package guru.springframework.sfgpetclinic.model;

/**
 * Created by Anti1991 on 10/15/2018
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
