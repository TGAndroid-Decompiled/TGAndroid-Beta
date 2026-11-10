package z7;

import c8.ie;
public final class za extends ta {
    public final transient Object[] f60005c;
    public final transient int d;
    public final transient int f60006e = 1;

    public za(int i7, Object[] objArr) {
        this.f60005c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        ie.a(i7, this.f60006e);
        Object obj = this.f60005c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f60006e;
    }
}
