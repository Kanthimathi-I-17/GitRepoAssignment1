package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Car car1 = new Car("Hondia","X500",2023);
//        car1.infoOfCar();
//
//        System.out.println("dummy method:");
//        car1.dummyMethod("kanthi");
//
//        System.out.println("Test class");
//        TestClass tc = new TestClass(4);
//        System.out.println(tc.x);
//        TestClass tc1 =new TestClass();
//
//        System.out.println("Recursion ex");
//        RecursionClass rc = new RecursionClass();
//        int number = 5;
//        System.out.println("Factorial of " + number + " is: " + rc.facto(number));

//        int bottlesNum = 99;
//        String word = "bottles";
//        while (bottlesNum > 0) {
//            if (bottlesNum == 1) {
//                word = "bottle"; // singular, as in ONE bottle.
//            }
//            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
//            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
//            System.out.println("And if one green bottle should accidentally fall,");
//            bottlesNum = bottlesNum - 1;
//            if (bottlesNum > 0) {
//                System.out.println("There'll be " + bottlesNum +
//                        " green " + word + ", hanging on the wall");
//            } else {
//                System.out.println("There'll be no green bottles, hanging on the wall");
//            } // end else
//        } // end while loop

        // make three sets of words to choose from. Add your own!
        String[] wordListOne = {"agnostic", "opinionated",
                "voice activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled",
                "strongly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma",
                "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless",
        "microservices", "distributed ledger"};
        String[] wordListThree = {"framework", "library",
                "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design",
                "orientation"};
        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        System.out.println(oneLength+","+twoLength+","+threeLength);
        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        System.out.println(randomGenerator);
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);
        System.out.println(rand1+","+rand2+","+rand3);
        // now build a phrase
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];
        // print out the phrase
        System.out.println("What we need is a " + phrase);

}
}