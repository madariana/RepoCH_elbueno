package com.generation.ecommerce.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;

	import com.generation.ecommerce.services.ProductoService;

	public class ProductoController {

	    // Instancia de la clase "ProductoService" que se utiliza para acceder a los
	    // metodos definidos ahi. Se declara como final porque su valor no sera cambiado
	    // despues de inicializar,
	    // para que esta instancia no cambie durante la ejecucucion del programa.

	    private final ProductoService productoServicio; // no nos llames, nosotros te llamamos
	@Autowired //Se usa para indicar a Spring que inyecte automaticamente una instancia del productoService en la clase ProductoController. Asi nos aseguramos que la instancia esta disponible y lista para usarse cuando se necesite en la clase.

	//constructor con ese objeto como parametro
	    public ProductoController(ProductoService productoServicio) {
	        this.productoServicio = productoServicio;
	    }

	//HTTP GET
	    @GetMapping
	    public void getProducto() {

	    }

	    // HTTP POST
	    @PostMapping
	    public void postProducto() {

	    }

	    // HTTP PUT
	    @PutMapping
	    public void putProducto() {

	    }

	    // HTTP DELETE
	    @DeleteMapping
	    public void deleteProducto() {

	    }

	}