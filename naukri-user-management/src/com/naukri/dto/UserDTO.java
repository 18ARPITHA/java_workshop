package com.naukri.dto;

public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String skill;

    public UserDTO(int id, String name, String email, String skill) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skill = skill;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSkill() { return skill; }
    public void setSkill(String skill) { this.skill = skill; }

    @Override
    public String toString() {
        return "UserDTO [id=" + id + ", name=" + name + ", email=" + email + ", skill=" + skill + "]";
    }
}
