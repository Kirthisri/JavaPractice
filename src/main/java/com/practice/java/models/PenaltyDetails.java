package com.practice.java.models;

sealed class PenaltyDetails permits Residents{
	
	private double penaltyAmount;
	private int elapsedDays;
	public double getPenaltyAmount() {
		return penaltyAmount;
	}
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	public int getElapsedDays() {
		return elapsedDays;
	}
	public void setElapsedDays(int elapsedDays) {
		this.elapsedDays = elapsedDays;
	}
	
	
}
