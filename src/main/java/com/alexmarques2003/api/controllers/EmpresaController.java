package com.alexmarques2003.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexmarques2003.api.dtos.EmpresaDto;
import com.alexmarques2003.api.responses.Response;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
	
	@PostMapping
	public ResponseEntity<Response<EmpresaDto>> cadastrar(@RequestBody EmpresaDto empresaDto){
		Response<EmpresaDto> response = new Response<EmpresaDto>();
		
		empresaDto.setId(1L);
		response.setData(empresaDto);
		return ResponseEntity.ok(response);
	}
}
