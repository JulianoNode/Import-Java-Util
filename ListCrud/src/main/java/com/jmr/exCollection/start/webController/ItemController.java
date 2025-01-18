package com.jmr.exCollection.start.webController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jmr.exCollection.start.model.Item;
import com.jmr.exCollection.start.service.ItemService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/itens")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Criar item
    @PostMapping
    public ResponseEntity<Item> criarItem(@RequestBody Item item) {
        Item novoItem = itemService.salvarItem(item);
        return ResponseEntity.ok(novoItem);
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Item> buscarPorId(@PathVariable Long id) {
        Optional<Item> item = itemService.buscarPorId(id);
        return item.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Atualizar item
    @PutMapping("/{id}")
    public ResponseEntity<Item> atualizarItem(@PathVariable Long id, @RequestBody Item item) {
        Item itemAtualizado = itemService.atualizarItem(id, item);
        return ResponseEntity.ok(itemAtualizado);
    }

    // Deletar item
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarItem(@PathVariable Long id) {
        itemService.deletarItem(id);
        return ResponseEntity.noContent().build();
    }

    // Listagem paginada
    @GetMapping
    public ResponseEntity<Page<Item>> listarItens(
            @RequestParam(defaultValue = "") String nome,
            Pageable pageable) {
        Page<Item> itens = itemService.listarItens(nome, pageable);
        return ResponseEntity.ok(itens);
    }

    // Analisar estoque
    @GetMapping("/analise-estoque")
    public ResponseEntity<String> analisarEstoque() {
        List<Item> itens = itemService.listarItens("", Pageable.unpaged()).getContent();
        String resultado = itemService.analisarEstoque(itens);
        return ResponseEntity.ok(resultado);
    }

    // Criar vetor de itens
    @GetMapping("/vetor-itens")
    public ResponseEntity<Item[]> vetorItens() {
        List<Item> itens = itemService.listarItens("", Pageable.unpaged()).getContent();
        Item[] vetor = itemService.criarVetorDeItens(itens);
        return ResponseEntity.ok(vetor);
    }
}
