package com.rp.sec03;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxGenerate {

    public static void main(String[] args) {

        // Generate maintains the infinite loop until receiving cancel() signal
        // or invoking the complete(), error() method

        //Consumer is invoked again and again based on
        //the downstream demand
        Flux.generate(synchronousSink -> {
            System.out.println("emitting");
            synchronousSink.next(Util.faker().country().name()); // Can run only 1
            //synchronousSink.error(new RuntimeException("oops"));
        })
        .take(2)
        .subscribe(Util.subscriber());


    }

}
