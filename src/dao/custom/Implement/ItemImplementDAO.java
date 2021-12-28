package dao.custom.Implement;

import dao.custom.ItemDAO;
import entity.Item;

import java.util.ArrayList;

public class ItemImplementDAO implements ItemDAO {
    @Override
    public boolean save(Item item) {
        return false;
    }

    @Override
    public boolean update(Item item) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Item get(String s) {
        return null;
    }

    @Override
    public ArrayList<Item> getAll() {
        return null;
    }
}
