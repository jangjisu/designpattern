package com.study.designpattern.responsibilityChain.service;

import com.study.designpattern.responsibilityChain.vo.Info;
import lombok.Setter;

public abstract class OrderHandler {
    @Setter
    protected OrderHandler next;

    abstract void predicate(Info info);
}
