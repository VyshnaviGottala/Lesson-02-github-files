package com.mindtree.shop.entity;

import javax.persistence.Entity;

@Entity
public class Apparal extends Products 
{
	
	private String apparalType;
	private String apparalBrand;
	private String apparalDesign;

	public Apparal() {
		super();
	}

	public Apparal(String apparalType, String apparalBrand, String apparalDesign) {
		super();
		this.apparalType = apparalType;
		this.apparalBrand = apparalBrand;
		this.apparalDesign = apparalDesign;
	}

	public String getApparalType() {
		return apparalType;
	}

	public void setApparalType(String apparalType) {
		this.apparalType = apparalType;
	}

	public String getApparalBrand() {
		return apparalBrand;
	}

	public void setApparalBrand(String apparalBrand) {
		this.apparalBrand = apparalBrand;
	}

	public String getApparalDesign() {
		return apparalDesign;
	}

	public void setApparalDesign(String apparalDesign) {
		this.apparalDesign = apparalDesign;
	}

	@Override
	public String toString() {
		return "Apparal [apparalType=" + apparalType + ", apparalBrand=" + apparalBrand + ", apparalDesign="
				+ apparalDesign + "]";
	}

	
	
}
