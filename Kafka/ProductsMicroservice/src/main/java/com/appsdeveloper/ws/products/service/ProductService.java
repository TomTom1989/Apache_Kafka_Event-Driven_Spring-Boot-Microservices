package com.appsdeveloper.ws.products.service;

import com.appsdeveloper.ws.products.rest.CreateProductRestModel;

public interface ProductService {
	
	String createProduct(CreateProductRestModel productRestModel) throws Exception ;

}
