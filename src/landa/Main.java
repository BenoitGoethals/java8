package landa;

import landa.Fly;
import landa.TypeFly;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       List<Fly> flyList=Arrays.asList(new Fly(23, TypeFly.StrontFly,45,"45ffgdfd"),new Fly(23, TypeFly.Normal,45,"hhere4dsfd5"),new Fly(23, TypeFly.StrontFly,45,"45"),new Fly(23, TypeFly.StrontFly,45,"kjkdfdf45"),new Fly(23, TypeFly.StrontFly,45,"45dfd"),new Fly(23, TypeFly.Normal,45,"hh4dsfdffd5"),new Fly(23, TypeFly.StrontFly,45,"45"),new Fly(23, TypeFly.StrontFly,45,"kjkfdf45"),new Fly(23, TypeFly.StrontFly,45,"45dfd"),new Fly(23, TypeFly.Normal,45,"hh4dsfd5"),new Fly(23, TypeFly.StrontFly,45,"45"),new Fly(23, TypeFly.StrontFly,45,"kjk45"));
           ;
        System.out.println( flyList.stream().count());

        Fly  fly;
       flyList.stream().findFirst().ifPresent(System.out::println);

        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);  // 5.0
      ;
        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt).forEach(System.out::println);

              //  .ifPresent(System.out::println);  // 3
        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        Stream.of("d2", "a2", "b1", "b3", "c")
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

    }
}
