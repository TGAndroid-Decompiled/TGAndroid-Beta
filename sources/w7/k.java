package w7;

import c8.fd;
import j$.util.Objects;
public final class k extends d {
    public final transient Object[] f57611c;
    public final transient int d;
    public final transient int f57612e;

    public k(int i7, int i10, Object[] objArr) {
        this.f57611c = objArr;
        this.d = i7;
        this.f57612e = i10;
    }

    @Override
    public final Object get(int i7) {
        fd.a(i7, this.f57612e);
        Object obj = this.f57611c[i7 + i7 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f57612e;
    }
}
