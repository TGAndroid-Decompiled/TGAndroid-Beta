package x7;
public final class w extends o {
    public final transient Object[] f51024c;
    public final transient int d;
    public final transient int f51025e = 1;

    public w(int i10, Object[] objArr) {
        this.f51024c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.m8.a(i10, this.f51025e);
        Object obj = this.f51024c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f51025e;
    }
}
