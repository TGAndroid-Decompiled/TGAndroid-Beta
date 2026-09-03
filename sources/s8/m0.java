package s8;

import j$.util.Objects;
import k7.c7;
public final class m0 extends v {
    public final transient Object[] f47149c;
    public final transient int d;
    public final transient int f47150e;

    public m0(int i10, int i11, Object[] objArr) {
        this.f47149c = objArr;
        this.d = i10;
        this.f47150e = i11;
    }

    @Override
    public final Object get(int i10) {
        c7.c(i10, this.f47150e);
        Object obj = this.f47149c[(i10 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.f47150e;
    }
}
