package com.jmr.exCollection.start.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jmr.exCollection.start.model.Item;
import com.jmr.exCollection.start.repository.ItemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    // Criar item
    public Item salvarItem(Item item) {
        return itemRepository.save(item);
    }

    // Buscar por ID
    public Optional<Item> buscarPorId(Long id) {
        return itemRepository.findById(id);
    }

    // Deletar item
    public void deletarItem(Long id) {
        itemRepository.deleteById(id);
    }

    // Atualizar item
    public Item atualizarItem(Long id, Item itemAtualizado) {
        return itemRepository.findById(id).map(item -> {
            item.setNome(itemAtualizado.getNome());
            item.setPreco(itemAtualizado.getPreco());
            item.setQuantidade(itemAtualizado.getQuantidade());
            return itemRepository.save(item);
        }).orElseThrow(() -> new RuntimeException("Item não encontrado!"));
    }

    // Listagem paginada com filtros
    public Page<Item> listarItens(String nome, Pageable pageable) {
        return itemRepository.findByNomeContaining(nome, pageable);
    }

    // Método complexo usando List, if, else if, else if, else if, else
    public String analisarEstoque(List<Item> itens) {
        int totalItens = itens.size();
        if (totalItens == 0) {
            return "Nenhum item disponível";
        } else if (totalItens == 1) {
            return "1 itens no estoque, Faser mais pedidos urgente";
        } else if (totalItens == 2) {
            return "2 itens estoque para acabar, Faser mais pedidos";
        } else if (totalItens == 3) {
            return "3 itens no estoque, entrar em contato com vendedor";
        } else if (totalItens == 4) {
            return "Pouco itens no estoque, entrar em contato com o Fornecedor";
        }else if (totalItens < 5) {
            return "Poucos itens no estoque";
        } else if (totalItens < 10) {
            return "Estoque médio";
        } else if (totalItens < 20) {
            return "Estoque alto";
        } else {
            return "Estoque cheio";
        }
    }

    // Método para criar um vetor de itens
    public Item[] criarVetorDeItens(List<Item> itens) {
        return itens.toArray(new Item[0]);
    }
}
