package Model;

import com.company.Role;

public class User {
    String name, password, email, id, address, phone, cardNumber;
    Role role;

    //before create model
//    public User(String password, String email) {
//        this.password = password;
//        this.email = email;
//    }

    //refine: after create model
    public User(User user) {
        setEmail(user.getEmail());
        setPassword(user.getPassword());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Role getRole() {
        return role;
    }
}
