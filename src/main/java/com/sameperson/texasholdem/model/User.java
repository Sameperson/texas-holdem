package com.sameperson.texasholdem.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] userpic;
    @Size(min = 4, max = 16, message = "Username should be from 3 to 16 characters in length!")
    private String username;
    @Size(min = 4, max = 16, message = "Password should be from 4 to 16 characters in length!")
    private String password;
    private int score;
    private LocalDateTime registrationTime = LocalDateTime.now();

    public User(){}

    public String getTimeSinceRegistration() {
        String unit = "";
        LocalDateTime now = LocalDateTime.now();
        long diff;
        if((diff = ChronoUnit.SECONDS.between(registrationTime,now)) < 60){
            unit = "secs";
        } else if ((diff = ChronoUnit.MINUTES.between(registrationTime,now)) < 60) {
            unit = "mins";
        } else if ((diff = ChronoUnit.HOURS.between(registrationTime,now)) < 24) {
            unit = "hours";
        } else if ((diff = ChronoUnit.DAYS.between(registrationTime,now)) < 30) {
            unit = "days";
        } else if ((diff = ChronoUnit.MONTHS.between(registrationTime,now)) < 12) {
            unit = "months";
        } else{
            diff = ChronoUnit.YEARS.between(registrationTime,now);
        }
        return String.format("%d %s",diff,unit);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getUserpic() {
        return userpic;
    }

    public void setUserpic(byte[] userpic) {
        this.userpic = userpic;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(LocalDateTime registrationTime) {
        this.registrationTime = registrationTime;
    }
}
