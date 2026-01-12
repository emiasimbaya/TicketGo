package com.app.util;

import java.util.Scanner;

public final class Input {
  private Input() {}
  public static final Scanner sc = new Scanner(System.in);

  public static String readLine(String label) {
    System.out.print(label + ": ");
    return sc.nextLine().trim();
  }

  public static int readInt(String label) {
    while (true) {
      try {
        System.out.print(label + ": ");
        return Integer.parseInt(sc.nextLine().trim());
      } catch (Exception e) {
        System.out.println("Ingrese un número válido.");
      }
    }
  }

  public static long readLong(String label) {
    while (true) {
      try {
        System.out.print(label + ": ");
        return Long.parseLong(sc.nextLine().trim());
      } catch (Exception e) {
        System.out.println("Ingrese un número válido.");
      }
    }
  }

  public static double readDouble(String label) {
    while (true) {
      try {
        System.out.print(label + ": ");
        return Double.parseDouble(sc.nextLine().trim());
      } catch (Exception e) {
        System.out.println("Ingrese un número válido (decimal).");
      }
    }
  }
}
