package com.crud.crud.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ProductModel {
	
    private int id;
	private String name;
	private int quantity;
	private int price;
	private LocalDateTime date;


}
