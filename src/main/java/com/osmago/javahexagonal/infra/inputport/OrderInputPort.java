package com.osmago.javahexagonal.infra.inputport;

import java.math.BigDecimal;

import com.osmago.javahexagonal.domain.Orders;

public interface OrderInputPort {
    public Orders createOrder( String customerId, BigDecimal total );
}
