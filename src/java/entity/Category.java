/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Category {

    private int category_id;
    private int parent_category_id;
    private String name;
    private String cate_img;

    public Category() {
    }

    public Category(int category_id, int parent_category_id, String name, String cate_img) {
        this.category_id = category_id;
        this.parent_category_id = parent_category_id;
        this.name = name;
        this.cate_img = cate_img;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getParent_category_id() {
        return parent_category_id;
    }

    public void setParent_category_id(int parent_category_id) {
        this.parent_category_id = parent_category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCate_img() {
        return cate_img;
    }

    public void setCate_img(String cate_img) {
        this.cate_img = cate_img;
    }

    @Override
    public String toString() {
        return "Category{" + "category_id=" + category_id + ", parent_category_id=" + parent_category_id + ", name=" + name + ", cate_img=" + cate_img + '}';
    }

}
