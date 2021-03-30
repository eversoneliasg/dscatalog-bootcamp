package com.eversonelias.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eversonelias.dscatalog.dto.CategoryDTO;
import com.eversonelias.dscatalog.entities.Category;
import com.eversonelias.dscatalog.repositories.CategoryRepository;

@Service // It will register my class as a component of the dependency injection automated system.
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> list = repository.findAll();
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}
}
