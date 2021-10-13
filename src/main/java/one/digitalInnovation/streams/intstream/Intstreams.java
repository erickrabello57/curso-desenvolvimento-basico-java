package one.digitalInnovation.streams.intstream;

import java.util.stream.IntStream;

public class Intstreams {
    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5).forEach(System.out::println);
        System.out.println();
        IntStream.range(57, 60).forEach(x ->{
            System.out.println("o valor de x é :"+ x);
        });
    }
}
