package com.example.demo.w;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Cart {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer cart_id;
public Integer getCart_id() {
	return cart_id;
}
public void setCart_id(Integer cart_id) {
	this.cart_id = cart_id;
}
private Date chart_create_date;

@OneToMany(fetch = FetchType.EAGER, mappedBy="cart")
public List<Product> product;
// Getter and Setter Method
@JsonManagedReference
public List<Product> getProduct() {
return product;
}
public void setProduct(List<Product> product) {
this.product = product;
}
public Date getChart_create_date() {
	return chart_create_date;
}
public void setChart_create_date(Date chart_create_date) {
	this.chart_create_date = chart_create_date;
}

}
