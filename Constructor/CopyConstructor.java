package Constructor;
// Source code is decompiled from a .class file using FernFlower decompiler.
class CopyConstructor {
   String name;
   int age;

   CopyConstructor(String var1, int var2) {
      this.name = var1;
      this.age = var2;
   }

   CopyConstructor(CopyConstructor var1) {
      this.name = var1.name;
      this.age = var1.age;
   }

   void display() {
      System.out.println("Name: " + this.name + ", Age: " + this.age);
   }

   public static void main(String[] var0) {
      CopyConstructor var1 = new CopyConstructor("Shishu", 23);
      CopyConstructor var2 = new CopyConstructor(var1);
      var1.display();
      var2.display();
   }
}
