package com.Bengaied.product_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Bengaied.product_service.dto.ProductRequest;
import com.Bengaied.product_service.dto.ProductResponse;
import com.Bengaied.product_service.service.ProductService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("path")
    @ResponseStatus(HttpStatus.CREATED)
    public void postMethodName(@RequestBody ProductRequest productRequest) {

        productService.createProduct(productRequest);

    }

    @GetMapping("path")
    public List<ProductResponse> getAllProducts() {
        productService.getAllProducts();
        return new String();
    }

}