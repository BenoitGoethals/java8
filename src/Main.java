import landa.Fly;
import landa.TypeFly;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       List<Fly> flyList=Arrays.asList(new Fly(23, TypeFly.StrontFly,45,"45ffgdfd"),new Fly(23, TypeFly.Normal,45,"hhere4dsfd5"),new Fly(23, TypeFly.StrontFly,45,"45"),new Fly(23, TypeFly.StrontFly,45,"kjkdfdf45"),new Fly(23, TypeFly.StrontFly,45,"45dfd"),new Fly(23, TypeFly.Normal,45,"hh4dsfdffd5"),new Fly(23, TypeFly.StrontFly,45,"45"),new Fly(23, TypeFly.StrontFly,45,"kjkfdf45"),new Fly(23, TypeFly.StrontFly,45,"45dfd"),new Fly(23, TypeFly.Normal,45,"hh4dsfd5"),new Fly(23, TypeFly.StrontFly,45,"45"),new Fly(23, TypeFly.StrontFly,45,"kjk45"));
           ;
        System.out.println( flyList.stream().count());

       flyList.stream().findFirst().ifPresent(System.out::println);
      ;

    }
}
