package com.ktck124.lop124LTTD04.Nhom15;

public class Foods {
    private boolean BestFood;
    private int CategoryId;
    private String Description;
    private Integer Id;
    private String ImagePath;
    private int LocationId;
    private double Price;
    private int PriceId;
    private int resourceId;
    private double Star;
    private int TimeId;
    private int TimeValue;
    private String Title;

    public Foods(boolean bestFood, int categoryId, String description, Integer id, String imagePath, int locationId, double price, int priceId, int resourceId, double star, int timeId, int timeValue, String title) {
        BestFood = bestFood;
        CategoryId = categoryId;
        Description = description;
        Id = id;
        ImagePath = imagePath;
        LocationId = locationId;
        Price = price;
        PriceId = priceId;
        this.resourceId = resourceId;
        Star = star;
        TimeId = timeId;
        TimeValue = timeValue;
        Title = title;
    }

    public Foods() {
    }

    public boolean isBestFood() {
        return BestFood;
    }

    public void setBestFood(boolean bestFood) {
        BestFood = bestFood;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public int getLocationId() {
        return LocationId;
    }

    public void setLocationId(int locationId) {
        LocationId = locationId;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getPriceId() {
        return PriceId;
    }

    public void setPriceId(int priceId) {
        PriceId = priceId;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public double getStar() {
        return Star;
    }

    public void setStar(double star) {
        Star = star;
    }

    public int getTimeId() {
        return TimeId;
    }

    public void setTimeId(int timeId) {
        TimeId = timeId;
    }

    public int getTimeValue() {
        return TimeValue;
    }

    public void setTimeValue(int timeValue) {
        TimeValue = timeValue;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}