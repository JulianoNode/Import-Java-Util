package com.jmr.exCollection.start;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public String listarProdutos(Model model, Pageable pageable) {
        Page<Produto> produtos = produtoService.listarProdutos(pageable);
        model.addAttribute("produtos", produtos);
        return "produtos";
    }

    @PostMapping("/salvar")
    public String salvarProduto(@ModelAttribute Produto produto) {
        produtoService.salvarProduto(produto);
        return "redirect:/produtos";
    }

    @GetMapping("/deletar/{id}")
    public String deletarProduto(@PathVariable Long id) {
        produtoService.deletarProduto(id);
        return "redirect:/produtos";
    }

    @GetMapping("/verificarEstoque/{id}")
    @ResponseBody
    public String verificarEstoque(@PathVariable Long id) {
        return produtoService.verificarEstoque(id);
    }
}
