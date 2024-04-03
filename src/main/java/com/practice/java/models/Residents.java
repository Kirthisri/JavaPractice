package com.practice.java.models;

import java.util.Date;

public non-sealed class Residents extends PenaltyDetails{
	
	private String flat_number;
	private String name;
	private Date lodge_date;
	private String bill_no;
	private String alert_message;
	private final GarbageFreeupSchedule freeupSchedule = null;
	
	public GarbageFreeupSchedule getFreeupSchedule() {
		return freeupSchedule;
	}
	public String getFlat_number() {
		return flat_number;
	}
	public void setFlat_number(String flat_number) {
		this.flat_number = flat_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLodge_date() {
		return lodge_date;
	}
	public void setLodge_date(Date lodge_date) {
		this.lodge_date = lodge_date;
	}
	public String getBill_no() {
		return bill_no;
	}
	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}
	public String getAlert_message() {
		return alert_message;
	}
	public void setAlert_message(String alert_message) {
		this.alert_message = alert_message;
	}
	@Override
	public String toString() {
		return "Residents [flat_number=" + flat_number + ", name=" + name + ", lodge_date=" + lodge_date + ", bill_no="
				+ bill_no + ", alert_message=" + alert_message + ", freeupSchedule=" + freeupSchedule + "]";
	}
	
	
}
