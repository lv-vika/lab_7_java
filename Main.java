package combine;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args){

        Combine.printStaticCombineCount();

        Combine first_combine = new Combine();
        Combine second_combine = new Combine("CASE", 200, 10, true);
        Combine third_combine = new Combine(300, 200, 250, "Claas",
                20, 40, true, "red", "Germany", 1995);

        System.out.println(first_combine);
        System.out.println(second_combine);
        System.out.println(third_combine);

        first_combine.printCombineCount();

        first_combine.resetValues(200, 256,56, "Fendt", 65,
                28,false, "blue", "China", 2000);

        System.out.println(first_combine);
    }
}

