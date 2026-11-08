package z7;

import c8.ie;
public final class za extends ta {
    public final transient Object[] f59998c;
    public final transient int d;
    public final transient int f59999e = 1;

    public za(int i7, Object[] objArr) {
        this.f59998c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        ie.a(i7, this.f59999e);
        Object obj = this.f59998c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f59999e;
    }
}
