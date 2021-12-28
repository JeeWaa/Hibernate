package business.custom.implement;

import business.custom.ItemBO;
import dto.ItemDTO;

import java.util.ArrayList;

public class ItemImplementBO implements ItemBO {
    @Override
    public boolean saveItem(ItemDTO itemDTO) {
        return false;
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) {
        return false;
    }

    @Override
    public boolean deleteItem(String code) {
        return false;
    }

    @Override
    public ItemDTO getItem(String code) {
        return null;
    }

    @Override
    public ArrayList<ItemDTO> getAllItem() {
        return null;
    }
}
