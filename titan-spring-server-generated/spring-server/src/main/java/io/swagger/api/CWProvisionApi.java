package io.swagger.api;

import io.swagger.model.ECMResponse;
import io.swagger.model.CWProvision;
import io.swagger.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-06T10:54:33.246Z")

@Api(value = "CWProvision", description = "the CWProvision API")
public interface CWProvisionApi {

    @ApiOperation(value = "Create a new CW_Provision object", notes = "This will create a new CWProvisoin object.", response = ECMResponse.class, tags={ "CWProvision", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "This returns a ECMResponse object.", response = ECMResponse.class),
        @ApiResponse(code = 400, message = "Invalid data", response = ECMResponse.class),
        @ApiResponse(code = 403, message = "When authentication or authorization failed.", response = ECMResponse.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ECMResponse.class) })
    @RequestMapping(value = "/CWProvision",
        produces = { "application/json", "text/plain" }, 
        method = RequestMethod.POST)
    ResponseEntity<ECMResponse> cWProvisionPost(@ApiParam(value = "" ,required=true ) @RequestBody CWProvision body,@ApiParam(value = "" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization);

}
