package lambda;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;

public class Lambda01 {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("新的线程")).start();
        ArrayList<Object> list = new ArrayList<>();
    }
}
