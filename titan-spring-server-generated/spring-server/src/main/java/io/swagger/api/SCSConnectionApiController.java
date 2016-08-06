package io.swagger.api;

import io.swagger.model.SCSConnections;
import io.swagger.model.Error;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-06T10:54:33.246Z")

@Controller
public class SCSConnectionApiController implements SCSConnectionApi {

    public ResponseEntity<List<SCSConnections>> sCSConnectionGet(@ApiParam(value = "" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization,
        @ApiParam(value = "") @RequestParam(value = "pagingOffset", required = false) Long pagingOffset,
        @ApiParam(value = "") @RequestParam(value = "pagingLimit", required = false) Long pagingLimit) {
        // do some magic!
        return new ResponseEntity<List<SCSConnections>>(HttpStatus.OK);
    }

}
