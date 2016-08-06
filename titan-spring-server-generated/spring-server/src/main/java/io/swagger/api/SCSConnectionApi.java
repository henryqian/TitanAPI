package io.swagger.api;

import io.swagger.model.SCSConnections;
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

@Api(value = "SCSConnection", description = "the SCSConnection API")
public interface SCSConnectionApi {

    @ApiOperation(value = "This will list all SCSConnections ", notes = "This will list all all SCSConnections", response = SCSConnections.class, responseContainer = "List", tags={ "SCSConnection", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of SCSConnections", response = SCSConnections.class),
        @ApiResponse(code = 403, message = "When authentication or authorization failed.", response = SCSConnections.class),
        @ApiResponse(code = 500, message = "Internal server error", response = SCSConnections.class) })
    @RequestMapping(value = "/SCSConnection",
        produces = { "application/json", "text/plain" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<SCSConnections>> sCSConnectionGet(@ApiParam(value = "" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "") @RequestParam(value = "pagingOffset", required = false) Long pagingOffset,@ApiParam(value = "") @RequestParam(value = "pagingLimit", required = false) Long pagingLimit);

}
