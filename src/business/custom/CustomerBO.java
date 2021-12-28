package business.custom;

import business.SuperBO;
import dto.CustomerDTO;
import entity.Customer;

import java.util.ArrayList;

public interface CustomerBO extends SuperBO {
    public boolean saveCustomer(CustomerDTO customerDTO);
    public boolean updateCustomer(CustomerDTO customerDTO);
    public boolean deleteCustomer(String id);
    public Customer getCustomer(String id);
    public ArrayList<CustomerDTO> getAllCustomer();
}
