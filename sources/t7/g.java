package t7;

import j$.util.Objects;
import w7.m7;
public final class g extends d {
    public static final g f46902e = new g(0, new Object[0]);
    public final transient Object[] f46903c;
    public final transient int d;

    public g(int i10, Object[] objArr) {
        this.f46903c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        m7.a(i10, this.d);
        Object obj = this.f46903c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f46903c;
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
        return this.f46903c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
