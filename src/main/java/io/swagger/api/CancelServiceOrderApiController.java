package io.swagger.api;

import io.swagger.model.CancelServiceOrder;
import io.swagger.model.CancelServiceOrderCreate;
import io.swagger.model.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")
@RestController
public class CancelServiceOrderApiController implements CancelServiceOrderApi {

    private static final Logger log = LoggerFactory.getLogger(CancelServiceOrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CancelServiceOrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CancelServiceOrder> createCancelServiceOrder(@Parameter(in = ParameterIn.DEFAULT, description = "The CancelServiceOrder to be created", required=true, schema=@Schema()) @Valid @RequestBody CancelServiceOrderCreate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CancelServiceOrder>(objectMapper.readValue("{\n  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"@baseType\" : \"@baseType\",\n  \"cancellationReason\" : \"cancellationReason\",\n  \"@type\" : \"@type\",\n  \"errorMessage\" : {\n    \"reason\" : \"reason\",\n    \"code\" : \"code\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"message\" : \"message\",\n    \"referenceError\" : \"http://example.com/aeiou\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"status\" : \"status\"\n  },\n  \"completionMessage\" : \"completionMessage\",\n  \"serviceOrder\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"http://example.com/aeiou\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  },\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"state\" : \"accepted\",\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\n  \"effectiveCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n}", CancelServiceOrder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CancelServiceOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CancelServiceOrder>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CancelServiceOrder>> listCancelServiceOrder(@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields,@Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CancelServiceOrder>>(objectMapper.readValue("[ {\n  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"@baseType\" : \"@baseType\",\n  \"cancellationReason\" : \"cancellationReason\",\n  \"@type\" : \"@type\",\n  \"errorMessage\" : {\n    \"reason\" : \"reason\",\n    \"code\" : \"code\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"message\" : \"message\",\n    \"referenceError\" : \"http://example.com/aeiou\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"status\" : \"status\"\n  },\n  \"completionMessage\" : \"completionMessage\",\n  \"serviceOrder\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"http://example.com/aeiou\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  },\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"state\" : \"accepted\",\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\n  \"effectiveCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"@baseType\" : \"@baseType\",\n  \"cancellationReason\" : \"cancellationReason\",\n  \"@type\" : \"@type\",\n  \"errorMessage\" : {\n    \"reason\" : \"reason\",\n    \"code\" : \"code\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"message\" : \"message\",\n    \"referenceError\" : \"http://example.com/aeiou\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"status\" : \"status\"\n  },\n  \"completionMessage\" : \"completionMessage\",\n  \"serviceOrder\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"http://example.com/aeiou\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  },\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"state\" : \"accepted\",\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\n  \"effectiveCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CancelServiceOrder>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CancelServiceOrder>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CancelServiceOrder> retrieveCancelServiceOrder(@Parameter(in = ParameterIn.PATH, description = "Identifier of the CancelServiceOrder", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CancelServiceOrder>(objectMapper.readValue("{\n  \"requestedCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"@baseType\" : \"@baseType\",\n  \"cancellationReason\" : \"cancellationReason\",\n  \"@type\" : \"@type\",\n  \"errorMessage\" : {\n    \"reason\" : \"reason\",\n    \"code\" : \"code\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"message\" : \"message\",\n    \"referenceError\" : \"http://example.com/aeiou\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"status\" : \"status\"\n  },\n  \"completionMessage\" : \"completionMessage\",\n  \"serviceOrder\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"http://example.com/aeiou\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  },\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"state\" : \"accepted\",\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\n  \"effectiveCancellationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n}", CancelServiceOrder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CancelServiceOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CancelServiceOrder>(HttpStatus.NOT_IMPLEMENTED);
    }

}
