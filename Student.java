
// Source code is decompiled from a .class file using FernFlower decompiler.
class Student {
   String name;
   int marks;

   Student() {
   }

   void displayDetails() {
      System.out.println("Name : " + this.name);
      System.out.println("Marks : " + this.marks);
   }

   public static void main(String[] var0) {
      Student var1 = new Student();
      var1.name = "Shishu Pal";
      var1.marks = 92;
      var1.displayDetails();
   }
}
