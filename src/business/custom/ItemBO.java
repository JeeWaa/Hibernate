package business.custom;

import business.SuperBO;
import dto.ItemDTO;

import java.util.ArrayList;

public interface ItemBO extends SuperBO {
    public boolean saveItem(ItemDTO itemDTO);
    public boolean updateItem(ItemDTO itemDTO);
    public boolean deleteItem(String code);
    public ItemDTO getItem(String code);
    public ArrayList<ItemDTO> getAllItem();
}
