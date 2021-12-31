package com.example.dbConnection.restController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbConnection.domain.Product;
import com.example.dbConnection.domain.ProductTO;
import com.example.dbConnection.repositories.ProductRepo;

@RestController

@RequestMapping(value = "/product/")
public class ProductRestController {

	@Autowired
	ProductRepo productRepo;
	
//	@Autowired
//	Product product;
	
	@GetMapping("getAll")
	public String getList () {
		
		
//		List<Product> list = new ArrayList<>();
//		list= (List<Product>) product.findAll();
////		 forEach(list:: add);
		 return "list";
	
	}
	

    @GetMapping("show/{id}")
    public Product getProduct(@PathVariable String id){
//        model.addAttribute("product", product.findById(id));
    	Optional<Product> p = productRepo.findById(id);
    	ProductTO pp = new ProductTO();
    pp.setId( p.get().getId());
//    	return	
        return p.get();
    }
	
//	@GetMapping("getAll")
//	public List<Product> getList () {
//		
//		
//		List<Product> list = new ArrayList<>();
//		list= (List<Product>) product.findAll();
////		 forEach(list:: add);
//		 return list;
//	
//	}
}
