package s8;

import j$.util.Objects;
import k7.c7;
public final class i0 extends v {
    public static final i0 f47139e = new i0(0, new Object[0]);
    public final transient Object[] f47140c;
    public final transient int d;

    public i0(int i10, Object[] objArr) {
        this.f47140c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        c7.c(i10, this.d);
        Object obj = this.f47140c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.f47140c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] o() {
        return this.f47140c;
    }

    @Override
    public final int p() {
        return this.d;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
