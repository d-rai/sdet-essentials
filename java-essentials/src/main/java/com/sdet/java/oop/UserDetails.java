package com.sdet.java.oop;

/**
 * This class demonstrates encapsulation by hiding user details using private fields
 * and exposing controlled access through public getter methods.
 *
 * The object state is initialized via a constructor, ensuring consistency.
 * Since all fields are final and there are no setter methods, the class is immutable,
 * meaning its state cannot be changed after creation.
 */
public class UserDetails {
    private final String username;
    private final int age;
    private final String email;
    private final String address;

    public UserDetails(String username, int age, String email, String address) {
        this.username = username;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserDetails [username=" + username + ", age=" + age + ", email=" + email + ", address=" + address + "]";
    }
}