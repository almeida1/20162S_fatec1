package br.sceweb.teste;

public class UserBuilder {

    public static final String DEFAULT_NAME = "John Smith";
    public static final String DEFAULT_ROLE = "ROLE_USER";
    public static final String DEFAULT_PASSWORD = "42";

    private String username;
    private String password = DEFAULT_PASSWORD;
    private String role = DEFAULT_ROLE;
    private String name = DEFAULT_NAME;

    private UserBuilder() {
    }

    public static UserBuilder aUser() {
        return new UserBuilder();
    }

    public UserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder withNoPassword() {
        this.password = null;
        return this;
    }

    public UserBuilder inUserRole() {
        this.role = "ROLE_USER";
        return this;
    }

    public UserBuilder inAdminRole() {
        this.role = "ROLE_ADMIN";
        return this;
    }

    public UserBuilder inRole(String role) {
        this.role = role;
        return this;
    }

    public UserBuilder but() {
        return UserBuilder
                .aUser()
                .inRole(role)
                .withName(name)
                .withPassword(password)
                .withUsername(username);
    }

//    public User build() {
//        return new User(name, username, password, role);
//    }
}
