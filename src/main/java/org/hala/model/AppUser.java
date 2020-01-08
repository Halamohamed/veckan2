package org.hala.model;

import java.util.Objects;

public class AppUser {
    private int appUserId;
    private String name;
    private String email;


    public AppUser(int appUserId, String name, String email) {
        this.appUserId = appUserId;
        setName(name);
        setEmail(email);
    }

    public int getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(int appUserId) {
        this.appUserId = appUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return appUserId == appUser.appUserId &&
                Objects.equals(name, appUser.name) &&
                Objects.equals(email, appUser.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appUserId, name, email);
    }
}
