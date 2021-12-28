package dao;

import java.util.ArrayList;

public interface CrudDAO<T, I> extends SuperDAO {
    public boolean save(T t);
    public boolean update(T t);
    public boolean delete(I i);
    public T get(I i);
    public ArrayList<T> getAll();
}
