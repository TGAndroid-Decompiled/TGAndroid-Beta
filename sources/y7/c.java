package y7;

import c8.yd;
public final class c extends l9 {
    public final transient Object[] f58998c;
    public final transient int d;
    public final transient int f58999e = 1;

    public c(int i7, Object[] objArr) {
        this.f58998c = objArr;
        this.d = i7;
    }

    @Override
    public final Object get(int i7) {
        yd.a(i7, this.f58999e);
        Object obj = this.f58998c[i7 + i7 + this.d];
        obj.getClass();
        return obj;
    }

    @Override
    public final int size() {
        return this.f58999e;
    }
}
