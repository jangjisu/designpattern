package com.study.designpattern.responsibilityChain.service;

import com.study.designpattern.responsibilityChain.vo.Info;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderHandler2 extends OrderHandler {
    private final OrderHandler handler;

    @Override
    void predicate(Info info) {
        if(info.isStock()) {
            System.out.println("상품을 주문합니다.");
        } else {
            handler.predicate(info);
        }
    }
}
