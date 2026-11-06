package y7;

import c8.xd;
public final class c extends l9 {
    public final transient Object[] f58894c;
    public final transient int d;
    public final transient int f58895e = 1;

    public c(int i7, Object[] objArr) {
        this.f58894c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        xd.a(i7, this.f58895e);
        Object obj = this.f58894c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f58895e;
    }
}
