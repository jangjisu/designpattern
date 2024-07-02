package com.study.designpattern.responsibilityChain.service;

import com.study.designpattern.responsibilityChain.exception.OrderException;
import com.study.designpattern.responsibilityChain.vo.Info;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderHandler1 extends OrderHandler {
    private final OrderHandler handler;

    @Override
    void predicate(Info info) {
        if(!Info.Type.INDIVIDUAL.equals(info.getCustomerType())) {
            throw new OrderException("개인 고객만 주문할 수 있습니다.");
        }

        handler.predicate(info);
    }
}
