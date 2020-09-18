package com.aydan.product.bo;

import com.aydan.product.dto.Product;

public interface ProductBO {
	
	public void create (Product product);
	public Product findProduct(int id);

}
