package kr.ac.hansung.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	@Autowired
	@Qualifier("qf_cat")
	public AnimalType animal;

	/*
	public PetOwner(AnimalType animal) {
		this.animal = animal;
	} */

	
	public void setAnimal(AnimalType animal) {
		this.animal = animal;
	}
	
	public void play() {
		animal.sound();
	}
}
