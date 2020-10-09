package com.company;

import DB.Repository.UserRepository;
import DB.Virtual.UserDB;

import java.io.File;
import java.util.List;

/**
 * Class Hotel
 * assumption: room just can be added, not removed
 */

public class Hotel {
    String name, address;
    List<Room> rooms;

    UserRepository userRepo;

    public Hotel(String name, String address) {
        setName(name);
        setAddress(address);
    }

    //for test
    public void setRooms() {
        rooms.add(new Room(String.valueOf(rooms.size()+1), 40.3, 2, true, 10.0));
        rooms.add(new Room(String.valueOf(rooms.size()+1), 60.3, 3, true, 15.0));
        rooms.add(new Room(String.valueOf(rooms.size()+1), 80.3, 4, true, 20.0));
    }

    //for reality
    public void setRooms(File file) {}


    //before
    public User register(String email, String password) {

        return null;
    }

    //refine: after create model
//    public User register(Model.User user) {
//        //check email exists?
//        if (UserDB.checkEmailExist(user.getEmail())) {
//            return userRepo.insert(new Model.User(user));
//        }
//        //create new member
//        userRepo.insert(user);
//        return null;
//    }

    public User login(User user) {
        return null;
    }



    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
