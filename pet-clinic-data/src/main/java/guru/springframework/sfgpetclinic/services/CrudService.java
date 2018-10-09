package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Anti1991 on 10/9/2018
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
