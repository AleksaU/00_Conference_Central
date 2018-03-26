package com.google.devrel.training.conference.domain;

import com.google.api.server.spi.config.ApiMethod;

public class Announcement {
private String message;

public Announcement(){}

public Announcement(String message){
this.message = message;
}

public String getMessage(){
return message;
}







}
