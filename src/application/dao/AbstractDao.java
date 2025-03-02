package application.dao;

/**
 * @author Sina Ramezani, 3/2/2025
 */
public abstract class AbstractDao<T, ID> {

    T save(T input){
        return input;
    }

    T update(T input,ID id){
        return input;
    }

    /*T findById(ID id) throws InstantiationException, IllegalAccessException {
        return getClass(T).newInstance();
    };

    Boolean remove(ID id);*/
}
