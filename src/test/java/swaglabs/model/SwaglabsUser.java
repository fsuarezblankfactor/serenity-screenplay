package swaglabs.model;

import lombok.Getter;

@Getter
public enum SwaglabsUser {
    STANDARD_USER("standard_user", "secret_sauce");

    public final String username;
    public final String password;

    SwaglabsUser(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
