package w7;

import c8.id;
import j$.util.Objects;
public final class k extends d {
    public final transient Object[] f59655c;
    public final transient int d;
    public final transient int f59656e;

    public k(int i7, int i10, Object[] objArr) {
        this.f59655c = objArr;
        this.d = i7;
        this.f59656e = i10;
    }

    @Override
    public final Object get(int i7) {
        id.a(i7, this.f59656e);
        Object obj = this.f59655c[i7 + i7 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f59656e;
    }
}
