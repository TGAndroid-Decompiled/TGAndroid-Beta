package x7;
public final class za extends ta {
    public final transient Object[] f51740c;
    public final transient int d;
    public final transient int e = 1;

    public za(int i10, Object[] objArr) {
        this.f51740c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.c0.a(i10, this.e);
        Object obj = this.f51740c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
