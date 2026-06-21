public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
     public int expectedMinutesInOven() {
        return 40;
     }

    // TODO: define the 'remainingMinutesInOven()' method
         public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
         }

    // TODO: define the 'preparationTimeInMinutes()' method
          public int preparationTimeInMinutes(int layers) {
        return layers * 2;
          }

    // TODO: define the 'totalTimeInMinutes()' method
         public int totalTimeInMinutes(int layers, int actualMinutesInOven) {
        return preparationTimeInMinutes(layers) + actualMinutesInOven;
      }
         public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("Expected minutes in oven: " + lasagna.expectedMinutesInOven());
        System.out.println("Remaining minutes: " + lasagna.remainingMinutesInOven(30));
        System.out.println("Preparation time: " + lasagna.preparationTimeInMinutes(2));
        System.out.println("Total time: " + lasagna.totalTimeInMinutes(3, 20));
         }
}
