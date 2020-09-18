package com.aydan.product.dao;

import com.aydan.product.dto.Product;

public interface ProductDAO {
	
	void create(Product pro);
	
	Product read(int id);
	
	void update(Product product);
	
	void delete(int id);
}
