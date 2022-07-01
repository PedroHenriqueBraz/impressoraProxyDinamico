package com.company.proxy;

import com.company.classes.Impressora;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {

    private final Impressora original;

    public Handler(Impressora original) {
      this.original = original;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before the proxy: ");
        method.invoke(original, args);
        System.out.println("After the proxy: ");
        return null;
    }
}
