package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SCSConnection;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-06T10:54:33.246Z")

public class SCSConnections   {
  
  private Long total = null;
  private List<SCSConnection> sCSConnnetion = new ArrayList<SCSConnection>();

  /**
   **/
  public SCSConnections total(Long total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  /**
   **/
  public SCSConnections sCSConnnetion(List<SCSConnection> sCSConnnetion) {
    this.sCSConnnetion = sCSConnnetion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SCSConnnetion")
  public List<SCSConnection> getSCSConnnetion() {
    return sCSConnnetion;
  }
  public void setSCSConnnetion(List<SCSConnection> sCSConnnetion) {
    this.sCSConnnetion = sCSConnnetion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCSConnections sCSConnections = (SCSConnections) o;
    return Objects.equals(total, sCSConnections.total) &&
        Objects.equals(sCSConnnetion, sCSConnections.sCSConnnetion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, sCSConnnetion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCSConnections {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    sCSConnnetion: ").append(toIndentedString(sCSConnnetion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

