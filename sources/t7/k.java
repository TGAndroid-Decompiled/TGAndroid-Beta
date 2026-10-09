package t7;

import j$.util.Objects;
import w7.o7;
public final class k extends d {
    public final transient Object[] f48216c;
    public final transient int d;
    public final transient int f48217e;

    public k(int i10, int i11, Object[] objArr) {
        this.f48216c = objArr;
        this.d = i10;
        this.f48217e = i11;
    }

    @Override
    public final Object get(int i10) {
        o7.a(i10, this.f48217e);
        Object obj = this.f48216c[i10 + i10 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f48217e;
    }
}
