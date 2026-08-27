package p8;

import j$.util.Objects;

public final class l0 extends z {

    public static final l0 f45555e = new l0(0, new Object[0]);

    public final transient Object[] f45556c;
    public final transient int d;

    public l0(int i10, Object[] objArr) {
        this.f45556c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        h7.f0.b(i10, this.d);
        Object obj = this.f45556c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.f45556c;
        int i11 = this.d;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] o() {
        return this.f45556c;
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
