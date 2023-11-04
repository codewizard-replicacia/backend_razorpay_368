package com.apps.razorpay.model.complex;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Data
public class Upi {
  
	
  @Column(name = "\"Payer_account_type\"", nullable = true)
  private String payer_account_type;
	
  @Column(name = "\"Vpa\"", nullable = true)
  private String vpa;
	
  @Column(name = "\"Flow\"", nullable = true)
  private String flow;
}
