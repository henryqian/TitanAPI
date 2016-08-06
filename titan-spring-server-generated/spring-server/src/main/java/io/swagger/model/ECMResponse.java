package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-06T10:54:33.246Z")

public class ECMResponse   {
  
  private byte[] eCMResponse = null;

  /**
   **/
  public ECMResponse eCMResponse(byte[] eCMResponse) {
    this.eCMResponse = eCMResponse;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ECM_response")
  public byte[] getECMResponse() {
    return eCMResponse;
  }
  public void setECMResponse(byte[] eCMResponse) {
    this.eCMResponse = eCMResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ECMResponse eCMResponse = (ECMResponse) o;
    return Objects.equals(eCMResponse, eCMResponse.eCMResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eCMResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECMResponse {\n");
    
    sb.append("    eCMResponse: ").append(toIndentedString(eCMResponse)).append("\n");
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

