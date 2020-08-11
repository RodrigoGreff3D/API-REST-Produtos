package br.com.produtos.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.produtos.apirest.model.Produtos;
import br.com.produtos.apirest.repository.ProdutosRepository;

@RestController
@RequestMapping(value = "/api")
public class ProdutosResource {

	@Autowired
	ProdutosRepository produtosRepository;

	@GetMapping("/produtos")
	public List<Produtos> listaProdutos() {
		return produtosRepository.findAll();

	}

	@GetMapping("/produto/{id}")
	public Produtos produto(@PathVariable(value = "id") long id) {
		return produtosRepository.findById(id);

	}

	@PostMapping("/produto")
	public Produtos salvar(@RequestBody Produtos produto) {
		return produtosRepository.save(produto);
	}

	@DeleteMapping("/produto")
	public void delete(@RequestBody Produtos produto) {
		produtosRepository.delete(produto);
	}

	@PutMapping("/produto")
	public Produtos editar(@RequestBody Produtos produto) {
		return produtosRepository.save(produto);
	}

}
