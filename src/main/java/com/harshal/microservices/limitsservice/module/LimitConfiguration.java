package com.harshal.microservices.limitsservice.module;

public class LimitConfiguration {
    private int maximum;
    private int minimum;
    private String profile;

    public LimitConfiguration() {
    }

    public LimitConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }
    
    public LimitConfiguration(int maximum, int minimum, String profile) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
		this.profile = profile;
	}

	public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
    
    
}
