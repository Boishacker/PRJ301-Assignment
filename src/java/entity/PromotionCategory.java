/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class PromotionCategory {

    private int promotionCategoryId;
    private Category category;
    private Promotion promotion;

    public PromotionCategory() {
    }

    public PromotionCategory(int promotionCategoryId, Category category, Promotion promotion) {
        this.promotionCategoryId = promotionCategoryId;
        this.category = category;
        this.promotion = promotion;
    }

    public int getPromotionCategoryId() {
        return promotionCategoryId;
    }

    public void setPromotionCategoryId(int promotionCategoryId) {
        this.promotionCategoryId = promotionCategoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "PromotionCategory{" + "promotionCategoryId=" + promotionCategoryId + ", category=" + category + ", promotion=" + promotion + '}';
    }

}
