class Welcome {
  public static void main(String[] args) {

    System.out.println("welcome to array world");
    int[] numArray = ArrayUtility.inputArray();

    long sum = sum(numArray);
    int average = average(numArray);

    System.out.println("vikas yadav");
    System.out.println(sum);
    System.out.println(average);

  }

  public static long sum(int[] numArray) {
    int sum = 0;
    int i = 0;
    while (i < numArray.length) {
      sum = sum + numArray[i];
      i++;
    }

    return sum;
  }

  public static int average(int[] numArray) {

    long sum = sum(numArray);
    return (int) (sum / numArray.length);
  }
}
