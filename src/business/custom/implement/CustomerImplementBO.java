package business.custom.implement;

import business.custom.CustomerBO;
import dto.CustomerDTO;
import entity.Customer;

import java.util.ArrayList;

public class CustomerImplementBO implements CustomerBO {
    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }

    @Override
    public Customer getCustomer(String id) {
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() {
        return null;
    }
}
