package com.hypech.case83_room.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int _id;

    public String userId;
    public String userNickName;
    public String userPhone;
    public String userPassword;
    public String userAvatar;
}
