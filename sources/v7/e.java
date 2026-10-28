package v7;

import j$.util.Objects;
import w7.v;
public final class e extends d {
    public static final e e = new e(0, new Object[0]);
    public final transient Object[] f50124c;
    public final transient int d;

    public e(int i10, Object[] objArr) {
        this.f50124c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        v.a(i10, this.d);
        Object obj = this.f50124c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f50124c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int m() {
        return this.d;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final Object[] o() {
        return this.f50124c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
