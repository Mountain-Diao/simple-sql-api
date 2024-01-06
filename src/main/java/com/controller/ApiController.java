package com.controller;

import com.bo.ProductProcessor;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.openapitools.api.InsertProductApi;
import org.openapitools.model.ProductResponse;
import org.openapitools.model.ProductSchema;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class ApiController implements InsertProductApi {
    private final ProductProcessor processor;

    public ApiController(ProductProcessor processor){
        this.processor = processor;
    }
    /**
     * POST /insertProduct/with-params : Insert a product with parameters
     *
     * @param name name of product (required)
     * @param productId ID of product (required)
     * @return Product inserted Successfully (status code 200)
     */
    @ApiOperation(value = "Insert a product with parameters", nickname = "insertProductParams", notes = "", tags={ "product", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Product inserted Successfully") })
    @PostMapping(
            value = "/insertProduct/with-params"
    )
    public ResponseEntity<ProductResponse> insertProductParams(@NotNull @ApiParam(value = "name of product", required = true) @Valid @RequestParam(value = "name", required = true) String name, @NotNull @ApiParam(value = "ID of product", required = true) @Valid @RequestParam(value = "product_id", required = true) String productId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /insertProduct/with-payload : Insert a product with a Json payload
     *
     * @param productSchema  (required)
     * @return Product inserted Successfully (status code 200)
     */
    @ApiOperation(value = "Insert a product with a Json payload", nickname = "insertProductPayload", notes = "", tags={ "product", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Product inserted Successfully") })
    @PostMapping(
            value = "/insertProduct/with-payload",
            consumes = { "application/json" }
    )
    public ResponseEntity<ProductResponse> insertProductPayload(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ProductSchema productSchema) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
}
