package com.aydan.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aydan.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDAO dao = new ProductDAOImpl();
		Product pro = new Product();
		pro.setId(1);
		pro.setName("iphone");
		pro.setDescription("good");
		pro.setPrice(800);
		dao.create(pro);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("iphone",result.getName());
		
	}

}
