package org.example.tranducvu_21013481_tuan04.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemCart {
    private Product product;
    private int quantity;
}
