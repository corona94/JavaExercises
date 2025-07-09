import java.io.Console;
import java.util.*;

public class JavaExercises {

    public static void main(String[] args) {


        //  Palindromo();
          Modulo();
        //ComparisonSorting();
        //  alfabeto();
        //  List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
        //   printFormatted(100);

        // Declare a HashMap
     /*   HashMap weekDays = new HashMap<>();

        // Add data to the HashMap
        weekDays.put("Monday", "Working Day");
        weekDays.put("Tuesday", "Working Day");
        weekDays.put("Wednesday", "Working Day");
        weekDays.put("Thursday", "Working Day");
        weekDays.put("Friday", "Working Day");
        weekDays.put("Saturday", "Off Day");
        weekDays.put("Sunday", "Off Day");

        // Print the data in the HashMap
        System.out.println("Working Schedule : " + weekDays + "\n");


        // Check if the given key is present in the Map
        // IF yes, its value will be returned
        String sunday = weekDays.getOrDefault("Sunday", "No Announcements Yet.").toString();
        System.out.println("Is Sunday a working day?  " + sunday);

        // IF not, the default value passed will be returned
        String christmas = weekDays.getOrDefault("Christmas", "National Holiday").toString();
        System.out.println("Is Christmas a working day?  " + christmas);

        // Key not present in the HashMap
        // Default Value returned
        String easter = weekDays.getOrDefault("Easter", "National Holiday").toString();
        System.out.println("Is Easter a working day?  " + easter);*/

        HashMap<Object, Boolean> holidays = new HashMap<>();

        // Add data to the HashMap
        holidays.put("Saturday",  true);
        holidays.put("Sunday", true);

        // Print the data in the HashMap
        System.out.println("Holidays: " + holidays + "\n");
        // Key not present, default value returned
        Object christmas = holidays.getOrDefault("Christmas", true);
      //  System.out.println("Is Christmas a holiday?  " + christmas);

        // Key not present, null returned
        christmas = holidays.get("Christmas");
      //  System.out.println("Is Christmas a holiday?  " + christmas);

        List<Integer> list = List.of(1,1,3,3,4,2,2);
        lonelyinteger(list);


    }

    public static void Palindromo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrono: ");
        var palindromo = scanner.nextLine();


        char[] invert = new char[palindromo.length()];
        char[] pal = palindromo.toCharArray();
        String[] arrayOrigi = new String[pal.length];
        String[] arraInvert = new String[pal.length];

        for (int i = 0; i < pal.length; i++) {
            arrayOrigi[i] = String.valueOf(pal[i]);

        }
        //Character.toLowerCase(c1) == Character.toLowerCase(c2)

        for (int i = pal.length - 1, j = 0; i >= 0; i--, j++) {

            arraInvert[j] = arrayOrigi[i];
            //  System.out.println(invert[j]);
        }

        int band = 0;
        for (int j = 0; j < pal.length; j++) {
            if (arraInvert[j].equalsIgnoreCase(arrayOrigi[j])) {
                band++;
                continue;
            } else {
                System.out.println("No es palindromo");
                break;
            }

        }
        if (band == pal.length) {
            System.out.println("La palabra: " + palindromo + " Es palindromo");
        }


    }

    public static void Modulo() {
        Scanner input = new Scanner(System.in);
        System.out.println(" -- Saber si es modulo un numero --");
        System.out.println("ingresa el numero: ");
        var numero = input.nextInt();


        int aux = numero, mut = 0;

        int cont = 0, invert = 0;
        while (numero != 0) {
            aux = numero % 10;
            mut = mut * 10 + aux;
            numero = numero / 10;
        }

        System.out.println(mut);


    }

    public static void ComparisonSorting() {

        int[] arreglo = new int[100];
        int[] auxArr = new int[100];
        int[] frequency = new int[100];

        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(100) + 1;
            System.out.print(arreglo[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]++ + " ");


        }


        // Contar las frecuencias
        for (int i = 0; i < arreglo.length; i++) {
            frequency[arreglo[i]]++;
        }

        int count = 0;


        // Imprimir el arreglo de frecuencias
        System.out.println("Arreglo de frecuencias:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.print(frequency[i] + " ");
        }

        //int[] result = array.stream().mapToInt(Integer::intValue).toArray();


    }

    public static void alfabeto() {


    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        // /*
        // 0.400000
        //0.400000
        //0.200000
        // */

        int total = arr.size();
        double positivos = 0, negativos = 0, ceros = 0;

        for (int num : arr) {

            if (num > 0) {
                positivos++;

            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }


        }
        System.out.printf("%.6f\n", negativos / total);
        System.out.printf("%.6f\n", positivos / total);
        System.out.printf("%.6f\n", ceros / total);


    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : arr) {

            total += num;

            if (num < min) {

                min = num;
            }
            if (num > max) {

                max = num;
            }

        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);


    }

    public static String timeConversion(String s) {
        // Write your code here

        String date = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));
        String minsec = s.substring(2, 8);
        if (date.equals("AM")) {

            if (hour == 12) {
                hour = 0;
            }

        } else {

            if (hour != 12) {
                hour += 12;
            }

        }

        String newdate = String.format("%02d", hour);

        return newdate + minsec;

    }


    public static void printFormatted(int n) {
        int width = Integer.toBinaryString(n).length(); // Longitud del binario más largo
        System.out.println(width);

        for (int i = 1; i <= n; i++) {
            String decimal = String.format("%" + width + "d", i);
            String octal = String.format("%" + width + "o", i);
            String hex = String.format("%" + width + "X", i); // Mayúsculas
            String binary = String.format("%" + width + "s", Integer.toBinaryString(i));

            System.out.println(decimal + " " + octal + " " + hex + " " + binary);
        }
    }


    public class TwoSum {
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>(); // valor -> índice

            for (int i = 0; i < nums.length; i++) {
                int complemento = target - nums[i];

                if (map.containsKey(complemento)) {
                    return new int[]{map.get(complemento), i};
                }

                map.put(nums[i], i);
            }

            // Si no se encuentra solución, devuelve null o lanza una excepción
            return null;
        }

    }

    public static void lonelyinteger(List<Integer> a) {
        // Write your code here

        Map<Integer, Integer> couMap = new HashMap<>();
       // System.out.println(couMap.getOrDefault(a.get(4),0));
        for (int num : a) {
            couMap.put(num, couMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : couMap.entrySet())
        {

            if(entry.getValue() == 1)
            {
                System.out.println(entry.getValue());
            }

        }


    }

    public static int superDigit(String n, int k) {
        // Write your code here

        long initialSum = 0;
        for (char digit : n.toCharArray()) {
            initialSum += Character.getNumericValue(digit);
        }

        long total = initialSum * k;
        return superDigitHelper(total);
    }

    private static int superDigitHelper(long num) {
        if (num < 10) {
            return (int) num;
        }

        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return superDigitHelper(sum);


    }


}












