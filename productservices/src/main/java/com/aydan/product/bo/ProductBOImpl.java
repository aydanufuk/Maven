package com.aydan.product.bo;

import com.aydan.product.dao.ProductDAO;
import com.aydan.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private ProductDAO dao;
	@Override
	public void create(Product product) {
		dao.create(product);
		
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
