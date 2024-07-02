package com.study.designpattern.responsibilityChain;

import com.study.designpattern.responsibilityChain.service.OrderProvider;
import com.study.designpattern.responsibilityChain.vo.Info;

public class Client {

    Info info = new Info(Info.Grade.VIP, Info.Type.INDIVIDUAL, true);

    public static void main(String[] args) {
        OrderProvider orderProvider = new OrderProvider();

        Info info = new Info(Info.Grade.VIP, Info.Type.INDIVIDUAL, true);

        orderProvider.getOrderState(info);

        Info info2 = new Info(Info.Grade.VIP, Info.Type.INDIVIDUAL, false);

        orderProvider.getOrderState(info2);

        Info info3 = new Info(Info.Grade.VIP, Info.Type.COMPANY, true);

        orderProvider.getOrderState(info3);

        Info info4 = new Info(Info.Grade.NORMAL, Info.Type.INDIVIDUAL, false);

        orderProvider.getOrderState(info4);
    }


    
}
