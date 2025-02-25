class A {
    int i,j, int z=10;
    A(int a, int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.println(i+""+j);
    }
}
class B extends A
{
    int K;
    B(int a, int b, int c)
    {
        Super(a,b);
        k=c;
    }
}
