package ru.ashamaz.model;

public class User {

    public String nickname;
    public int age;

    public User() {
        nickname = "";
        age = 0;
    }

    public User(String nickname) {
        this.nickname = nickname;
        age = 0;
    }

    public User(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "\"nickname\":\"" + nickname + "\"," +
                "\"age\":" + age +
                "}";
    }
}
