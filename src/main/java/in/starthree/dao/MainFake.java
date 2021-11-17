package in.starthree.dao;

import java.util.ArrayList;
import java.util.List;

public class MainFake {

	public static void main(String[] args) {
		
		
		FakeProductDAO fdao=new FakeProductDAO();
		fdao.findAll().stream().forEach(System.out::println);
	}

}
