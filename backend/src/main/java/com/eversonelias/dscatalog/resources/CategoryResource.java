/*
 * The resource will implement the REST controller.
 */

package com.eversonelias.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eversonelias.dscatalog.entities.Category;

@RestController // Annotation is a simple way of configuring a REST controller. It is a preprocessor orientation.
@RequestMapping(value = "/categories") // Defining the route of the category.
public class CategoryResource { // Everytime a resource is related to an entity, the name will be [Name of Entity]Resource.
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Books"));
		list.add(new Category(2L, "Eletronics"));
		return ResponseEntity.ok().body(list);
	}
	
}
