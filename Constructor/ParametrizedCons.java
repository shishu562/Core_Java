package Constructor;


class ParametrizedCons {
    String name;
    int rollNo;
    // Create Parametrized Constructor 
    ParametrizedCons(String n, int r)
    {
        name = n;
        rollNo = r;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Roll No. : "+rollNo);
    }
    public static void main(String[] args) {
        ParametrizedCons p1 = new ParametrizedCons("Shishu Pal", 101);
        ParametrizedCons p2 = new ParametrizedCons("Ayush Raj", 102);

        // Call the method for Show
        p1.display();
        p2.display();
    }
}
