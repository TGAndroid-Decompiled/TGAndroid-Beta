package x6;

import j$.util.Objects;
public final class x extends m {
    public static final x f49070e = new x(0, new Object[0]);
    public final transient Object[] f49071c;
    public final transient int d;

    public x(int i9, Object[] objArr) {
        this.f49071c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        a.e(i9, this.d);
        Object obj = this.f49071c[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f49071c;
        int i9 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
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
        return this.f49071c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
