public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while (i < 1000){
            if (i % 3 == 0 || i % 5 == 0) { count++;}
          i++;
        }
        System.out.println(count);
    }
}

