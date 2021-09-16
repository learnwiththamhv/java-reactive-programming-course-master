package com.rp.sec01;

import java.util.stream.Stream;

public class Lec01Stream {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1)
                                        .map(i -> {
                                            try {
                                                Thread.sleep(3000);
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                            return i * 2;
                                        });
        // Stream is lazy -> no blocking without terminator. Run very fast.
        //System.out.println(stream);

        //Sleep 3s
        stream.forEach(System.out::println);

    }


}
