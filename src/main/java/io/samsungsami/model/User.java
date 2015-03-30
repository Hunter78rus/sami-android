package io.samsungsami.model;

import java.math.BigDecimal;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class User  { 
  private String id = null;
  private String name = null;
  private String email = null;
  private String fullName = null;
  private String saIdentity = null;
  private BigDecimal createdOn = null;
  
  //public enum createdOnEnum {  }; 
  
  private BigDecimal modifiedOn = null;
  
  //public enum modifiedOnEnum {  }; 
  
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getSaIdentity() {
    return saIdentity;
  }
  public void setSaIdentity(String saIdentity) {
    this.saIdentity = saIdentity;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(BigDecimal createdOn) {
    this.createdOn = createdOn;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getModifiedOn() {
    return modifiedOn;
  }
  public void setModifiedOn(BigDecimal modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  fullName: ").append(fullName).append("\n");
    sb.append("  saIdentity: ").append(saIdentity).append("\n");
    sb.append("  createdOn: ").append(createdOn).append("\n");
    sb.append("  modifiedOn: ").append(modifiedOn).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
