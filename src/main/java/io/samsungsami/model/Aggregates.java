package io.samsungsami.model;

import java.math.BigDecimal;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class Aggregates  { 
  private BigDecimal count = null;
  
  //public enum countEnum {  }; 
  
  private BigDecimal min = null;
  
  //public enum minEnum {  }; 
  
  private BigDecimal max = null;
  
  //public enum maxEnum {  }; 
  
  private BigDecimal mean = null;
  
  //public enum meanEnum {  }; 
  
  private BigDecimal sum = null;
  
  //public enum sumEnum {  }; 
  
  
  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getCount() {
    return count;
  }
  public void setCount(BigDecimal count) {
    this.count = count;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getMin() {
    return min;
  }
  public void setMin(BigDecimal min) {
    this.min = min;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getMax() {
    return max;
  }
  public void setMax(BigDecimal max) {
    this.max = max;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getMean() {
    return mean;
  }
  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getSum() {
    return sum;
  }
  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aggregates {\n");
    
    sb.append("  count: ").append(count).append("\n");
    sb.append("  min: ").append(min).append("\n");
    sb.append("  max: ").append(max).append("\n");
    sb.append("  mean: ").append(mean).append("\n");
    sb.append("  sum: ").append(sum).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
