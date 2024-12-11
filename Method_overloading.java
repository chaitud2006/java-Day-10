class Method_overloading
{
    static void a()
    {
        System.out.println("Hello");
    }
    static void a(int b)
    {
        System.out.println("Hello"+b);
    }
    static void a(int b,int c,String d)
    {
        System.out.println(b+" "+c+" "+d);
    }
    public static void main(String args[])
    {
        a();
        a(6);
        a(4,5,"Chaitu");
    }
}     