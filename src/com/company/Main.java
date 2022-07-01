package com.company;

import com.company.classes.Impressora;
import com.company.classes.ImpressoraFalsa;
import com.company.classes.ImpressoraTeste;
import com.company.proxy.Handler;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        ImpressoraTeste original = new ImpressoraTeste();
        Handler handler = new Handler(original);

        ImpressoraFalsa falsa = new ImpressoraFalsa();
        Handler handler2 = new Handler(falsa);

        Impressora imp = (Impressora) Proxy.newProxyInstance(Impressora.class.getClassLoader(),
                new Class[]{Impressora.class},
                handler2);

        imp.imprime();
    }
}
