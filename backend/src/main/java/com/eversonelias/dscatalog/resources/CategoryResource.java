/*
 * The resource will implement the REST controller.
 */

package com.eversonelias.dscatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eversonelias.dscatalog.dto.CategoryDTO;
import com.eversonelias.dscatalog.services.CategoryService;

@RestController // Annotation is a simple way of configuring a REST controller. It is a preprocessor orientation.
@RequestMapping(value = "/categories") // Defining the route of the category.
public class CategoryResource { // Everytime a resource is related to an entity, the name will be [Name of Entity]Resource.
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll() {
		List<CategoryDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
