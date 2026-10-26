package y7;
public final class v extends n {
    public final transient Object[] f52363c;
    public final transient int d;
    public final transient int e = 1;

    public v(int i10, Object[] objArr) {
        this.f52363c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        w7.h5.a(i10, this.e);
        Object obj = this.f52363c[i10 + i10 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
