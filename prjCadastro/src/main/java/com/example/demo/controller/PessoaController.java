package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Pessoa;
import com.example.demo.services.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	private final PessoaService pessoaService;

	public PessoaController(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}

	@GetMapping("/{id}")
	public Pessoa getPessoa(@PathVariable Long id) {
			return pessoaService.findPessoaById(id);
		}

	@GetMapping
	public List<Pessoa> getAllPessoas(){
		return pessoaService.getAllPessoas();
	}

	@PostMapping
	public Pessoa createPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.savePessoa(pessoa);
	}
	
	@DeleteMapping("/{id}")
	public void deletePessoa(@PathVariable Long id) {
		pessoaService.findPessoaById(id);
	}

}