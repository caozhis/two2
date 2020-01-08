package com.two2.serice;

public class PayServerImpl implements PayServer {
    @Override
    public void add(double money) {
        System.out.println("支付增加");
    }

    @Override
    public void del(double money) {
        System.out.println("支付减少");
    }

    @Override
    public void updata(double money) {
        System.out.println("支付更新");       
    }
}
