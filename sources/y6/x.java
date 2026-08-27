package y6;

import j$.util.Objects;

public final class x extends m {

    public static final x f49787e = new x(0, new Object[0]);

    public final transient Object[] f49788c;
    public final transient int d;

    public x(int i10, Object[] objArr) {
        this.f49788c = objArr;
        this.d = i10;
    }

    @Override
    public final Object get(int i10) {
        a.e(i10, this.d);
        Object obj = this.f49788c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f49788c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int n() {
        return this.d;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] q() {
        return this.f49788c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
