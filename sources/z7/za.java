package z7;

import c8.he;
public final class za extends ta {
    public final transient Object[] f59874c;
    public final transient int d;
    public final transient int f59875e = 1;

    public za(int i7, Object[] objArr) {
        this.f59874c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        he.a(i7, this.f59875e);
        Object obj = this.f59874c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f59875e;
    }
}
