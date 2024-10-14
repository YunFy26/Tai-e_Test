package org.example;

import org.example.proxy.MyInvocationHandler;
import org.example.proxy.Service;
import org.example.proxy.ServiceImpl;


public class Main {

    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        Service proxy = (Service) MyInvocationHandler.getProxy(service);
        System.out.println(proxy.getClass());   //class jdk.proxy1.$Proxy0
        proxy.doSomething();
    }
}
