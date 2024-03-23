/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Account {

    private int user_id;
    private String username;
    private String password;
    private boolean isAdmin;
    private int telephone;
    private String email;
    private int addressId;

    public Account() {
    }

    public Account(int user_id, String username, String password, boolean isAdmin, int telephone, String email, int addressId) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.telephone = telephone;
        this.email = email;
        this.addressId = addressId;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "Account{" + "user_id=" + user_id + ", username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + ", telephone=" + telephone + ", email=" + email + ", addressId=" + addressId + '}';
    }

}
