package org.software.iris.rest;

import org.bson.types.ObjectId;
import org.software.iris.rest.models.Especies;
import org.software.iris.rest.repositories.EspeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/especies")
public class EspeciesController {
	@Autowired
	private EspeciesRepository repository;

	@RequestMapping(value = "/prueba", method = RequestMethod.GET)
	public List<Especies> getAllEspecies() {
		return repository.findAll();
	}

	@RequestMapping(value = "/prueba/{id}", method = RequestMethod.GET)
	public Especies getEspecieById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}

	@RequestMapping(value = "/prueba/{id}", method = RequestMethod.PUT)
	public void modifyEspecieById(@PathVariable("id") ObjectId id, @Valid @RequestBody Especies especies) {
		especies.set_id(id);
		repository.save(especies);
	}

	@RequestMapping(value = "/prueba", method = RequestMethod.POST)
	public Especies createEspecie(@Valid @RequestBody Especies especies) {
		especies.set_id(ObjectId.get());
		repository.save(especies);
		return especies;
	}

	@RequestMapping(value = "/prueba/{id}", method = RequestMethod.DELETE)
	public void deleteEspecie(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}
}