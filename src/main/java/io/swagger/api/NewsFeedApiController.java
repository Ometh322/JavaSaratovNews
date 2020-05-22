package io.swagger.api;

import io.swagger.model.Record;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-22T15:19:35.941Z")

@Controller
public class NewsFeedApiController implements NewsFeedApi {

    private static final Logger log = LoggerFactory.getLogger(NewsFeedApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NewsFeedApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Record>> listNewsFeed(@ApiParam(value = "Number of Outputing Objects") @Valid @RequestParam(value = "numberOfObject", required = false) Integer numberOfObject,@ApiParam(value = "Index of First Object, that need to be Outputed") @Valid @RequestParam(value = "startIndex", required = false) Integer startIndex) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Record>>(objectMapper.readValue("[ {  \"comments\" : [ {    \"numberOfLikes\" : 7,    \"creatorId\" : 2,    \"id\" : 5,    \"message\" : \"message\",    \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\"  }, {    \"numberOfLikes\" : 7,    \"creatorId\" : 2,    \"id\" : 5,    \"message\" : \"message\",    \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\"  } ],  \"numberOfLikes\" : 5,  \"creatorId\" : 6,  \"description\" : \"description\",  \"id\" : 0,  \"title\" : \"title\",  \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"numberOfComments\" : 1,  \"typeOfRecord\" : \"NEWS\"}, {  \"comments\" : [ {    \"numberOfLikes\" : 7,    \"creatorId\" : 2,    \"id\" : 5,    \"message\" : \"message\",    \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\"  }, {    \"numberOfLikes\" : 7,    \"creatorId\" : 2,    \"id\" : 5,    \"message\" : \"message\",    \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\"  } ],  \"numberOfLikes\" : 5,  \"creatorId\" : 6,  \"description\" : \"description\",  \"id\" : 0,  \"title\" : \"title\",  \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"numberOfComments\" : 1,  \"typeOfRecord\" : \"NEWS\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Record>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Record>>(objectMapper.readValue("<null>  <id>123456789</id>  <creatorId>123456789</creatorId>  <title>aeiou</title>  <publicationDate>2000-01-23T04:56:07.000Z</publicationDate>  <description>aeiou</description>  <numberOfComments>123</numberOfComments>  <numberOfLikes>123</numberOfLikes>  <typeOfRecord>aeiou</typeOfRecord></null>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Record>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Record>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
