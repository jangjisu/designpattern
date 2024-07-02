package com.study.designpattern.responsibilityChain.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Info {
    private Grade customerGrade;
    private Type customerType;
    private boolean isStock;

    public enum Type {
        INDIVIDUAL, COMPANY
    }

    public enum Grade {
        VIP, NORMAL
    }
}



