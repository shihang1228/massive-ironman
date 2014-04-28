package com.order;

public class FoodVo
{
    private Long foodId;
    private String foodName;
    private String foodPrice;
    private String foodType;
    private String foodPicture;
    private String foodDescription;
    
    public Long getFoodId()
    {
        return foodId;
    }
    public void setFoodId(Long foodId)
    {
        this.foodId = foodId;
    }
    
    public String getFoodName()
    {
        return foodName;
    }
    public void setFoodName(String foodName)
    {
        this.foodName = foodName;
    }
    
    public String getFoodPrice()
    {
        return foodPrice;
    }
    public void setFoodPrice(String foodPrice)
    {
        this.foodPrice = foodPrice;
    }
    
    public String getFoodType()
    {
        return foodType;
    }
    public void setFoodType(String foodType)
    {
        this.foodType = foodType;
    }
    
    public String getFoodPicture()
    {
        return foodPicture;
    }
    public void setFoodPicture(String foodPicture)
    {
        this.foodPicture = foodPicture;
    }
    
    public String getFoodDescription()
    {
        return foodDescription;
    }
    public void setFoodDescription(String foodDescription)
    {
        this.foodDescription = foodDescription;
    }
}