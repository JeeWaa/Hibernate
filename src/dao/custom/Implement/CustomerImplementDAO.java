package dao.custom.Implement;

import dao.custom.CustomerDAO;
import entity.Customer;

import java.util.ArrayList;

public class CustomerImplementDAO implements CustomerDAO {
    @Override
    public boolean save(Customer customer) {
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Customer get(String s) {
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() {
        return null;
    }
}
