package z7;

import c8.me;
public final class za extends ta {
    public final transient Object[] f61899c;
    public final transient int d;
    public final transient int f61900e = 1;

    public za(int i7, Object[] objArr) {
        this.f61899c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        me.a(i7, this.f61900e);
        Object obj = this.f61899c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f61900e;
    }
}
