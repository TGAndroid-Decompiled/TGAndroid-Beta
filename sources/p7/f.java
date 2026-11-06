package p7;

import c8.cb;
import j$.util.Objects;
public final class f extends e {
    public static final f f53372e = new f(0, new Object[0]);
    public final transient Object[] f53373c;
    public final transient int d;

    public f(int i7, Object[] objArr) {
        this.f53373c = objArr;
        this.d = i7;
    }

    @Override
    public final Object[] f() {
        return this.f53373c;
    }

    @Override
    public final Object get(int i7) {
        cb.a(i7, this.d);
        Object obj = this.f53373c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final int j() {
        return this.d;
    }

    @Override
    public final int k(Object[] objArr) {
        Object[] objArr2 = this.f53373c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
