class NestedIf {
    public static void main(String[ ] args) {
        int age = 34;
        if(age > 0) {
          if(age > 16) {
              System.out.println("Welcome!");
          } else {
              System.out.println("Too Young");
          }
        } else {
            System.out.println("Error");
        }
    }
}