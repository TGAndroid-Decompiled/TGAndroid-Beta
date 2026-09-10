package t7;

import j$.util.Objects;
import w7.i7;
public final class g extends d {
    public static final g e = new g(0, new Object[0]);
    public final transient Object[] f42090c;
    public final transient int d;

    public g(int i10, Object[] objArr) {
        this.f42090c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        i7.a(i10, this.d);
        Object obj = this.f42090c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f42090c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int n() {
        return this.d;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] p() {
        return this.f42090c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
