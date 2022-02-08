import java.io.*;
import java.lang.Thread;

public class HelloWorld {

    public static void main(String[] args) {
      try {
        Thread.sleep(10000);
      } catch (Exception e) {
        System.out.println("Error occurred");
      }
        System.out.println("Hello, World");
    }
}
