package com.products.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUCT")
public class Product implements Serializable{

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id;

  private String name;
  private BigDecimal quantity;
  private BigDecimal price;

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
  /**
   * @return the quantity
   */
  public BigDecimal getQuantity() {
    return quantity;
  }
  /**
   * @return the price
   */
  public BigDecimal getPrice() {
    return price;
  }
  
  
  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * @param quantity the quantity to set
   */
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }
  /**
   * @param price the price to set
   */
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


}