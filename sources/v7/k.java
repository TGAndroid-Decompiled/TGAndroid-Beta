package v7;

import j$.util.Objects;
import x7.j5;
public final class k extends d {
    public final transient Object[] f56463c;
    public final transient int d;
    public final transient int f56464e;

    public k(int i3, int i10, Object[] objArr) {
        this.f56463c = objArr;
        this.d = i3;
        this.f56464e = i10;
    }

    @Override
    public final Object get(int i3) {
        j5.a(i3, this.f56464e);
        Object obj = this.f56463c[i3 + i3 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f56464e;
    }
}
