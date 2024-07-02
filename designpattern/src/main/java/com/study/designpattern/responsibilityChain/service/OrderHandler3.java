package com.study.designpattern.responsibilityChain.service;

import com.study.designpattern.responsibilityChain.exception.OrderException;
import com.study.designpattern.responsibilityChain.vo.Info;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderHandler3 extends OrderHandler {

    @Override
    void predicate(Info info) {
        if(Info.Grade.VIP.equals(info.getCustomerGrade())) {
            System.out.println("상품을 예약합니다.");
        } else {
            throw new OrderException("상품의 재고가 없습니다.");
        }
    }
}
