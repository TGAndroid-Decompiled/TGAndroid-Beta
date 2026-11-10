package x7;

import c8.ld;
import j$.util.Objects;
public final class e extends d {
    public static final e f58660e = new e(0, new Object[0]);
    public final transient Object[] f58661c;
    public final transient int d;

    public e(int i7, Object[] objArr) {
        this.f58661c = objArr;
        this.d = i7;
    }

    @Override
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.f58661c;
        int i7 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override
    public final Object get(int i7) {
        ld.a(i7, this.d);
        Object obj = this.f58661c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i() {
        return this.d;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final Object[] k() {
        return this.f58661c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
