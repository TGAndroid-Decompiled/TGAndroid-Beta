package t7;

import j$.util.Objects;
import w7.m7;
public final class k extends d {
    public final transient Object[] f46907c;
    public final transient int d;
    public final transient int f46908e;

    public k(int i10, int i11, Object[] objArr) {
        this.f46907c = objArr;
        this.d = i10;
        this.f46908e = i11;
    }

    @Override
    public final Object get(int i10) {
        m7.a(i10, this.f46908e);
        Object obj = this.f46907c[i10 + i10 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f46908e;
    }
}
