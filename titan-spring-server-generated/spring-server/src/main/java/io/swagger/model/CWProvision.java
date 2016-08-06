package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-06T10:54:33.246Z")

public class CWProvision   {
  
  private byte[] cWProvision = null;

  /**
   **/
  public CWProvision cWProvision(byte[] cWProvision) {
    this.cWProvision = cWProvision;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CW_Provision")
  public byte[] getCWProvision() {
    return cWProvision;
  }
  public void setCWProvision(byte[] cWProvision) {
    this.cWProvision = cWProvision;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CWProvision cWProvision = (CWProvision) o;
    return Objects.equals(cWProvision, cWProvision.cWProvision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cWProvision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CWProvision {\n");
    
    sb.append("    cWProvision: ").append(toIndentedString(cWProvision)).append("\n");
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

