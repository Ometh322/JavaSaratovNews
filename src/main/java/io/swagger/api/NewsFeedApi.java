/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Record;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-22T15:19:35.941Z")

@Api(value = "newsFeed", description = "the newsFeed API")
@RequestMapping(value = "/Ometh322/SararovNews/1.0.0")
public interface NewsFeedApi {

    @ApiOperation(value = "List of All News, Events, Polls in News Feed", nickname = "listNewsFeed", notes = "", response = Record.class, responseContainer = "List", tags={ "newsFeed", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Record.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "News Feed not found") })
    @RequestMapping(value = "/newsFeed",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Record>> listNewsFeed(@ApiParam(value = "Number of Outputing Objects") @Valid @RequestParam(value = "numberOfObject", required = false) Integer numberOfObject,@ApiParam(value = "Index of First Object, that need to be Outputed") @Valid @RequestParam(value = "startIndex", required = false) Integer startIndex) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"comments\" : [ {    \"numberOfLikes\" : 7,    \"creatorId\" : 2,    \"id\" : 5,    \"message\" : \"message\",    \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\"  }, {    \"numberOfLikes\" : 7,    \"creatorId\" : 2,    \"id\" : 5,    \"message\" : \"message\",    \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\"  } ],  \"numberOfLikes\" : 5,  \"creatorId\" : 6,  \"description\" : \"description\",  \"id\" : 0,  \"title\" : \"title\",  \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"numberOfComments\" : 1,  \"typeOfRecord\" : \"NEWS\"}, {  \"comments\" : [ {    \"numberOfLikes\" : 7,    \"creatorId\" : 2,    \"id\" : 5,    \"message\" : \"message\",    \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\"  }, {    \"numberOfLikes\" : 7,    \"creatorId\" : 2,    \"id\" : 5,    \"message\" : \"message\",    \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\"  } ],  \"numberOfLikes\" : 5,  \"creatorId\" : 6,  \"description\" : \"description\",  \"id\" : 0,  \"title\" : \"title\",  \"publicationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"numberOfComments\" : 1,  \"typeOfRecord\" : \"NEWS\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
            if (getAcceptHeader().get().contains("application/xml")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("<null>  <id>123456789</id>  <creatorId>123456789</creatorId>  <title>aeiou</title>  <publicationDate>2000-01-23T04:56:07.000Z</publicationDate>  <description>aeiou</description>  <numberOfComments>123</numberOfComments>  <numberOfLikes>123</numberOfLikes>  <typeOfRecord>aeiou</typeOfRecord></null>", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/xml", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default NewsFeedApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
