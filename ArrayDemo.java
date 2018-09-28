public class ArrayDemo {

public static void printArray(int[]ary){
  for (int i = 0; i < ary.length; i++) {
    System.out.print(ary[i] + " ");
  }
  System.out.print("\n");
}

public static void printArray(int[][]ary){
  for (int x = 0; x < ary.length; x++) {
    for(int y = 0; y <ary[x].length; y++) {
      System.out.print(ary[x][y] + " ");

    }
  }
  System.out.print("\n");
}

public static int countZeros2D(int[][] nums){
  int n = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int x = 0; x <nums[i].length; x++) {
      if (nums[i][x] == 0) {
        n++;
      }
    }
  }
  return n;
}

public static void fill2D(int[][] vals){
  for (int i = 0; i <vals.length; i++) {
    for (int x = 0; x <vals.length; x++) {
      if (x == i) {
        vals [i][x] = 3;
      }
      else {
        vals[i][x] = 1;
      }
    }
  }
}

public static int[][] fill2DCopy(int[][] vals){
int[][] newvals = new int[vals.length][vals[0].length];
for (int i = 0; i <vals.length; i++) {
  int[] subary = new int[vals[0].length];
  for (int x =0; x < vals[i].length; x++) {
    if (vals[i][x] < 0) {
      subary[x] = 3;
    }
    else {
      subary[x]= 1;
    }
  }
  newvals[i] =subary;
}
return newvals;
}

public static void main(String [] args) {
  int[] ary1 = {1,2,3,4,5};
  int[] ary2 = {123,234,345,456,567,678,789,890};
  int[] ary3 = {10,2,39,4,58,6,77};
  System.out.println("0a printArray Test Cases");
  printArray(ary1); System.out.print("\n");
  printArray(ary2); System.out.print("\n");
  printArray(ary3); System.out.print("\n\n");

  int[][] ary4 = {{-1,3,5},{0,-2,0},{6,0,9},{8,8,8},{0,6,9}};
  int[][] ary5 = {{100,0,300,-400},{0,-999,999,0},{-819,0,-220,112}};
  int[][] ary6 = {{2312,-434,0,32},{43446,-434,343244,55},{2347,337,0,-536}};
  System.out.println("0b printArray Test Cases");
  printArray(ary4); System.out.print("\n");
  printArray(ary5); System.out.print("\n");
  printArray(ary6); System.out.print("\n\n");

  System.out.println("1 countZeros2D Test Cases");
  printArray(ary4); System.out.print(" has " + String.valueOf(countZeros2D(ary4)) + " zeros.\n");
  printArray(ary5); System.out.print(" has " + String.valueOf(countZeros2D(ary5)) + " zeros.\n");
  printArray(ary6); System.out.print(" has " + String.valueOf(countZeros2D(ary6)) + " zeros.\n\n");

  System.out.println("2a fill2D Test Cases");
  printArray(ary4); System.out.print(" becomes "); fill2D(ary4); printArray(ary4); System.out.print("\n");
  printArray(ary5); System.out.print(" becomes "); fill2D(ary5); printArray(ary5); System.out.print("\n");
  printArray(ary6); System.out.print(" becomes "); fill2D(ary6); printArray(ary6); System.out.print("\n\n");

  int[][] ary7 = {{-1,2,5},{0,-5,0},{7,0,9},{8,8,8},{0,6,9}};
  int[][] ary8 = {{100,0,300,-400},{0,-999,999,0},{-819,0,-220,112}};
  int[][] ary9 = {{2312,-434,0,32},{434235346,-434,3464,66},{1738,4337,0,-536}};
  System.out.println("2b fill2DCopy Test Cases");
  printArray(ary7); System.out.print(" becomes "); printArray(fill2DCopy(ary7)); System.out.print("\n");
  printArray(ary8); System.out.print(" becomes "); printArray(fill2DCopy(ary8)); System.out.print("\n");
  printArray(ary9); System.out.print(" becomes "); printArray(fill2DCopy(ary9)); System.out.print("\n\n");
}
}
