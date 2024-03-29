package com.example.demo1.model.mapper;

import com.example.demo1.model.domain.Order;
import com.example.demo1.model.dto.OrderDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper extends EntityMapper<OrderDTO, Order>{
}
