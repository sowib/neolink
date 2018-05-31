package com.sow.java.model;

import java.time.LocalDate;
import java.util.List;
/**
 * 
 * @author sow
 *
 */
public class Account {
	private Long number;
	private double balance;
	private LocalDate dateOfCreation;
	private List<Double> operations;
	
	public Account() {
	}

	/**
	 * @param number
	 * @param balance
	 * @param dateOfCreation
	 * @param operations
	 * @param owner
	 */
	public Account(Long number, double balance, LocalDate dateOfCreation, List<Double> operations) {
		super();
		this.number = number;
		this.balance = balance;
		this.dateOfCreation = dateOfCreation;
		this.operations = operations;
	}

	/**
	 * @return the number
	 */
	public Long getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Long number) {
		this.number = number;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the dateOfCreation
	 */
	public LocalDate getDateOfCreation() {
		return dateOfCreation;
	}

	/**
	 * @param dateOfCreation the dateOfCreation to set
	 */
	public void setDateOfCreation(LocalDate dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	/**
	 * @return the operations
	 */
	public List<Double> getOperations() {
		return operations;
	}

	/**
	 * @param operations the operations to set
	 */
	public void setOperations(List<Double> operations) {
		this.operations = operations;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + ", dateOfCreation=" + dateOfCreation
				+ ", operations=" + operations.toString() + "]";
	}
	
	
}
