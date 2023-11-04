package com.apps.razorpay.model.complex;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Data
public class Card {
  
	
  @Column(name = "\"Emi\"", nullable = true)
  private Boolean emi;
	
  @Column(name = "\"Entity\"", nullable = true)
  private String entity;
	
  @Column(name = "\"Id\"", nullable = true)
  private String id;
	
  @Column(name = "\"Iin\"", nullable = true)
  private String iin;
	
  @Column(name = "\"International\"", nullable = true)
  private Boolean international;
	
  @Column(name = "\"Issuer\"", nullable = true)
  private String issuer;
	
  @Column(name = "\"Last4\"", nullable = true)
  private String last4;
	
  @Column(name = "\"Name\"", nullable = true)
  private String name;
	
  @Column(name = "\"Network\"", nullable = true)
  private String network;
	
  @Column(name = "\"Sub_type\"", nullable = true)
  private String sub_type;
	
  @Column(name = "\"Type\"", nullable = true)
  private String type;
}
