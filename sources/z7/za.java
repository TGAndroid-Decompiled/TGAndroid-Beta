package z7;

import c8.le;
public final class za extends ta {
    public final transient Object[] f61815c;
    public final transient int d;
    public final transient int f61816e = 1;

    public za(int i7, Object[] objArr) {
        this.f61815c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        le.a(i7, this.f61816e);
        Object obj = this.f61815c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f61816e;
    }
}
