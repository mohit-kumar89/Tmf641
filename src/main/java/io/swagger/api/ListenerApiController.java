package io.swagger.api;

import io.swagger.model.CancelServiceOrderCreateEvent;
import io.swagger.model.CancelServiceOrderInformationRequiredEvent;
import io.swagger.model.CancelServiceOrderStateChangeEvent;
import io.swagger.model.Error;
import io.swagger.model.EventSubscription;
import io.swagger.model.ServiceOrderAttributeValueChangeEvent;
import io.swagger.model.ServiceOrderCreateEvent;
import io.swagger.model.ServiceOrderDeleteEvent;
import io.swagger.model.ServiceOrderInformationRequiredEvent;
import io.swagger.model.ServiceOrderJeopardyEvent;
import io.swagger.model.ServiceOrderMilestoneEvent;
import io.swagger.model.ServiceOrderStateChangeEvent;
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
public class ListenerApiController implements ListenerApi {

    private static final Logger log = LoggerFactory.getLogger(ListenerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ListenerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EventSubscription> listenToCancelServiceOrderCreateEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody CancelServiceOrderCreateEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToCancelServiceOrderInformationRequiredEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody CancelServiceOrderInformationRequiredEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToCancelServiceOrderStateChangeEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody CancelServiceOrderStateChangeEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceOrderAttributeValueChangeEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceOrderAttributeValueChangeEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceOrderCreateEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceOrderCreateEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceOrderDeleteEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceOrderDeleteEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceOrderInformationRequiredEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceOrderInformationRequiredEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceOrderJeopardyEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceOrderJeopardyEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceOrderMilestoneEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceOrderMilestoneEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceOrderStateChangeEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceOrderStateChangeEvent body) throws InterruptedException {
        System.out.println("listner is listening to state changes in service order");
        System.out.println("****************************************************************************************************************");
        System.out.println(body.toString());
        System.out.println("****************************************************************************************************************");
        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

}
