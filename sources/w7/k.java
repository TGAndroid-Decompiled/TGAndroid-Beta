package w7;

import c8.jd;
import j$.util.Objects;
public final class k extends d {
    public final transient Object[] f59744c;
    public final transient int d;
    public final transient int f59745e;

    public k(int i7, int i10, Object[] objArr) {
        this.f59744c = objArr;
        this.d = i7;
        this.f59745e = i10;
    }

    @Override
    public final Object get(int i7) {
        jd.a(i7, this.f59745e);
        Object obj = this.f59744c[i7 + i7 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f59745e;
    }
}
