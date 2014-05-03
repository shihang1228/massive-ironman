package com.order;

import java.util.ArrayList;
import java.util.List;

public class Cart
{
    private List<CarItem> list = new ArrayList<CarItem>();
    
    public List<CarItem> list()
    {
        return list;
    }
    
    public void add(CarItem carItem)
    {   
        this.list.add(carItem);
    }
    
    public void remove(String foodName)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getFoodName().equals(foodName))
            {
                list.remove(i);
                return;
            }
        }
    }
}