package x7;
public final class w extends o {
    public final transient Object[] f53416c;
    public final transient int d;
    public final transient int e = 1;

    public w(int i10, Object[] objArr) {
        this.f53416c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.v8.a(i10, this.e);
        Object obj = this.f53416c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
