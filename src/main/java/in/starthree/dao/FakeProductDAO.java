package in.starthree.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FakeProductDAO implements ProductDAO{

	@Override
	public List<Product> findAll() {
		
		List<Product> ls=new ArrayList<Product>();
		ls.add(new Product(1, "HP", 100));
		ls.add(new Product(2, "Lenovo", 150000));
		ls.add(new Product(3, "DELL", 175000));
		return ls;
	}

	@Override
	public Product findById(int id) {
		
		
		return new Product(1, "HP", 105000);
	}

	@Override
	public Product save(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

}
