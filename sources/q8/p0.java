package q8;

import i7.p6;
import j$.util.Objects;
public final class p0 extends z {
    public final transient Object[] f46482c;
    public final transient int d;
    public final transient int f46483e;

    public p0(int i10, int i11, Object[] objArr) {
        this.f46482c = objArr;
        this.d = i10;
        this.f46483e = i11;
    }

    @Override
    public final Object get(int i10) {
        p6.b(i10, this.f46483e);
        Object obj = this.f46482c[(i10 * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.f46483e;
    }
}
