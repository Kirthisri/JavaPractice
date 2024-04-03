package com.practice.java.models;

import java.util.Date;

public record GarbageFreeupSchedule(Date freeupDate, String garbageType, Date nextSchedule) {

}
