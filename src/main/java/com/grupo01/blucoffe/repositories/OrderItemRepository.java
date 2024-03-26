package com.grupo01.blucoffe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo01.blucoffe.entities.OrderItem;
import com.grupo01.blucoffe.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
