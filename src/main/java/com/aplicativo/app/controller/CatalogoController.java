package com.aplicativo.app.controller;

import org.springframework.stereotype.Controller;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.aplicativo.app.model.Producto;
import com.aplicativo.app.repository.ProductoRepository;


@Controller
public class CatalogoController {
    private static final String INDEX ="catalogo/index";
    private final ProductoRepository productsData;

    public CatalogoController(ProductoRepository productsData){
        this.productsData = productsData;
    }

    @GetMapping("/catalogo/index")
    public String index(@RequestParam(defaultValue="") String searchName, Model model){
        List<Producto> listProducto = null;
        if(searchName.isEmpty()){
            listProducto = this.productsData.getAllActiveProductos();
        }else{
            listProducto = this.productsData.getAllActiveProductosBySearch(searchName);
        }
        model.addAttribute("products",listProducto);
        return INDEX;
    }

}
