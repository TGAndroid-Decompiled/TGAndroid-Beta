package p8;

import j$.util.Objects;

public final class p0 extends z {

    public final transient Object[] f45575c;
    public final transient int d;

    public final transient int f45576e;

    public p0(int i10, int i11, Object[] objArr) {
        this.f45575c = objArr;
        this.d = i10;
        this.f45576e = i11;
    }

    @Override
    public final Object get(int i10) {
        h7.f0.b(i10, this.f45576e);
        Object obj = this.f45575c[(i10 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.f45576e;
    }
}
