package com.study.designpattern.responsibilityChain.service;

import com.study.designpattern.responsibilityChain.vo.Info;
import org.springframework.stereotype.Component;

@Component
public class OrderProvider {
    public OrderHandler handler;

    /**
     * 책임 연쇄 패턴 체인 셋팅
     */
    public OrderProvider() {
        OrderHandler3 third = new OrderHandler3();
        OrderHandler2 second = new OrderHandler2(third);
        handler = new OrderHandler1(second);
    }

    public void getOrderState(Info info) {
        handler.predicate(info);
    }
}
