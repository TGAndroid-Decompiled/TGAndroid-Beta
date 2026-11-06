package w7;

import c8.ed;
import j$.util.Objects;
public final class k extends d {
    public final transient Object[] f57508c;
    public final transient int d;
    public final transient int f57509e;

    public k(int i7, int i10, Object[] objArr) {
        this.f57508c = objArr;
        this.d = i7;
        this.f57509e = i10;
    }

    @Override
    public final Object get(int i7) {
        ed.a(i7, this.f57509e);
        Object obj = this.f57508c[i7 + i7 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f57509e;
    }
}
