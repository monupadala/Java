class A {
    synchronized void methodA(B b) {
        b.last();
    }
    synchronized void last() {}
}

class B {
    synchronized void methodB(A a) {
        a.last();
    }
    synchronized void last() {}
}