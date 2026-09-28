package x7;
public final class w extends o {
    public final transient Object[] f45939c;
    public final transient int d;
    public final transient int e = 1;

    public w(int i10, Object[] objArr) {
        this.f45939c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.n8.a(i10, this.e);
        Object obj = this.f45939c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
