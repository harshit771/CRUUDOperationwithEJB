package com.infinite.ejb;

import java.io.Serializable;

public class Agent implements Serializable {
       private int agentId;
       private String name;
       private String city;
       private String gender;
       private int MaritalStatus;
       private double primium;
       
  

	public int getAgentId() {
		return agentId;
	}


	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getMaritalStatus() {
		return MaritalStatus;
	}


	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}


	public double getPrimium() {
		return primium;
	}


	public void setPrimium(double primium) {
		this.primium = primium;
	}


	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ ", MaritalStatus=" + MaritalStatus + ", primium=" + primium + "]";
	}
       
       
}
