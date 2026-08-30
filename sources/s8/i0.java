package s8;

import j$.util.Objects;
import k7.b7;
public final class i0 extends v {
    public static final i0 e = new i0(0, new Object[0]);
    public final transient Object[] f44129c;
    public final transient int d;

    public i0(int i10, Object[] objArr) {
        this.f44129c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        b7.c(i10, this.d);
        Object obj = this.f44129c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.f44129c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] o() {
        return this.f44129c;
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
