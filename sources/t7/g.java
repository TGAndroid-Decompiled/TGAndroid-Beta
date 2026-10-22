package t7;

import j$.util.Objects;
import w7.o7;
public final class g extends d {
    public static final g e = new g(0, new Object[0]);
    public final transient Object[] f46893c;
    public final transient int d;

    public g(int i10, Object[] objArr) {
        this.f46893c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        o7.a(i10, this.d);
        Object obj = this.f46893c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f46893c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int m() {
        return this.d;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final Object[] o() {
        return this.f46893c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
