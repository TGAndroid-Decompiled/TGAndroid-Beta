package t7;

import j$.util.Objects;
import w7.i7;
public final class k extends d {
    public final transient Object[] f42094c;
    public final transient int d;
    public final transient int e;

    public k(int i10, int i11, Object[] objArr) {
        this.f42094c = objArr;
        this.d = i10;
        this.e = i11;
    }

    @Override
    public final Object get(int i10) {
        i7.a(i10, this.e);
        Object obj = this.f42094c[i10 + i10 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.e;
    }
}
